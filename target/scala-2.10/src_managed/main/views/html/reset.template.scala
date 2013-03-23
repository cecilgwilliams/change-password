
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object reset extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[User],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(userForm: Form[User]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Password Reset")/*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/("""

<body bgcolor="#999999" xmlns="http://www.w3.org/1999/html">

<h1>Password Reset</h1>

<h2>Please enter your information</h2>

<table>

    <tr>
        <td>


            """),_display_(Seq[Any](/*19.14*/form(routes.PasswordReset.reset)/*19.46*/ {_display_(Seq[Any](format.raw/*19.48*/("""

            """),_display_(Seq[Any](/*21.14*/inputText(userForm("userLoginId")))),format.raw/*21.48*/("""
            """),_display_(Seq[Any](/*22.14*/inputPassword(userForm("currentPassword")))),format.raw/*22.56*/("""
            """),_display_(Seq[Any](/*23.14*/inputPassword(userForm("newPassword")))),format.raw/*23.52*/("""

            <input type="submit" value="Reset">

            """)))})),format.raw/*27.14*/("""

        </td>

        <td>

            1. Passwords must be a minimum of 8 characters long.
            </br>
            </br>
            2. Passwords must contain characters from three of the following four categories:
            </br>
            - Uppercase characters (A-Z)
            </br>
            - Lowercase characters (a-z)
            </br>
            - Base 10 digits (0-9)
            </br>
            - Non alphanumeric (such as !, ?, & etc.)
            </br>
            </br>
            3. Passwords cannot contain all or part of the user's account name.
            </br>
            </br>
            4. The 9 most recent passwords cannot be recycled.
            </br>
            (The previous 8 stored in history plus the current password.)
            </br>
            </br>
            5. Passwords cannot be based upon dictionary words.
            </br>
            </br>
            6. Passwords cannot be changed more than once every 3 days.
            </br>

        </td>

    </tr>

</table>

</body>

""")))})),format.raw/*69.2*/("""
"""))}
    }
    
    def render(userForm:Form[User]): play.api.templates.Html = apply(userForm)
    
    def f:((Form[User]) => play.api.templates.Html) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 23 12:52:43 CDT 2013
                    SOURCE: /Volumes/MacProHD/cecil/change-password/app/views/reset.scala.html
                    HASH: c288ccce2df5dc02a0c16469f68835fb386cb176
                    MATRIX: 509->1|624->23|652->42|688->44|718->66|757->68|968->243|1009->275|1049->277|1100->292|1156->326|1206->340|1270->382|1320->396|1380->434|1476->498|2556->1547
                    LINES: 19->1|23->1|25->4|26->5|26->5|26->5|40->19|40->19|40->19|42->21|42->21|43->22|43->22|44->23|44->23|48->27|90->69
                    -- GENERATED --
                */
            