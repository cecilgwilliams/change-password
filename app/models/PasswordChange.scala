package models

import javax.naming.ldap.{ExtendedResponse, ExtendedRequest}
import com.sun.jndi.ldap.{BerEncoder, Ber}
import scala.Array


class PasswordChange extends ExtendedRequest {

  final var OID: String = "1.3.6.1.4.1.4203.1.11.1"

  private final var user: String = null
  private final var currentPassword: String = null
  private final var newPassword: String = null

  def this(user: String, currentPassword: String, newPassword: String) {
    this()
    this.user = user
    this.currentPassword = currentPassword
    this.newPassword = newPassword
  }

  def getID: String = {
    OID
  }

  def getEncodedValue: Array[Byte] = {
    val encoder: BerEncoder = new BerEncoder
    encoder.beginSeq(Ber.ASN_SEQUENCE | Ber.ASN_CONSTRUCTOR)
    try {
      encoder.encodeString(user, Ber.ASN_CONTEXT | 0, true)
      encoder.encodeString(currentPassword, Ber.ASN_CONTEXT | 1, true)
      encoder.encodeString(newPassword, Ber.ASN_CONTEXT | 2, true)
      encoder.endSeq
    }
    catch {
      case e: Exception => {
        throw new RuntimeException("Error encoding password change", e)
      }
    }
    encoder.getTrimmedBuf
  }

  def createExtendedResponse(id: String, berValue: Array[Byte], offset: Int, length: Int): ExtendedResponse = {
    null
  }
}
