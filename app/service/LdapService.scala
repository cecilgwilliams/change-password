package service

import java.lang.String
import javax.naming.ldap.LdapContext
import javax.naming.directory.DirContext
import org.springframework.ldap.core._
import models.{PasswordChange, User}
import org.springframework.security.ldap.ppolicy.PasswordPolicyAwareContextSource
import java.util

class LdapService {

  val cfg = play.Play.application().configuration()

  def resetPassword(user: User): String = {

    val contextSource: PasswordPolicyAwareContextSource = new PasswordPolicyAwareContextSource(cfg.getString("ldap.url"))
    contextSource.setPooled(false)
    contextSource.setUserDn(cfg.getString("ldap.userDn"))
    contextSource.setPassword(cfg.getString("ldap.password"))
    contextSource.afterPropertiesSet()

    val envParams: util.HashMap[String, String] = new util.HashMap[String, String]
    envParams.put("com.sun.jndi.ldap.connect.timeout", "3000")
    envParams.put("com.sun.jndi.ldap.read.timeout", "3000")
    envParams.put("java.naming.security.authentication", "simple")
    contextSource.setBaseEnvironmentProperties(envParams)

    var dirContext: DirContext = null

    try {
      dirContext = contextSource.getReadWriteContext
      if (dirContext != null) {
        val ldapCtx: LdapContext = dirContext.asInstanceOf[LdapContext]
        ldapCtx.extendedOperation(new PasswordChange(buildDn(user).encode, user.currentPassword, user.newPassword))
        "success"
      } else {
        "failed"
      }
    }
    catch {
      //catch specific ldap errors here
//      case e: AuthenticationException => return "bad password"
      case e: Exception => {
        e.printStackTrace()
        return "failed"
      }
    }

  }

  private def buildDn(user: User): DistinguishedName = {
    val username: String = user.userLoginId
    val dn: DistinguishedName = new DistinguishedName(cfg.getString("ldap.userbase"))
    dn.add("cn", username)
    dn
  }
}
