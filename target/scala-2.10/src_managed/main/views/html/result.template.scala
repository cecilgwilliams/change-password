
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
object result extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(result: String):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.18*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Password Reset")/*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/("""

    <h1>Password Reset Result:</h1>

    <h2>"""),_display_(Seq[Any](/*9.10*/result)),format.raw/*9.16*/("""</h2>

""")))})),format.raw/*11.2*/("""
"""))}
    }
    
    def render(result:String): play.api.templates.Html = apply(result)
    
    def f:((String) => play.api.templates.Html) = (result) => apply(result)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 23 12:52:43 CDT 2013
                    SOURCE: /Volumes/MacProHD/cecil/change-password/app/views/result.scala.html
                    HASH: 021df5b891b4d92a1601394e8bb71c4d6a757094
                    MATRIX: 506->1|615->17|643->36|679->38|709->60|748->62|831->110|858->116|897->124
                    LINES: 19->1|23->1|25->4|26->5|26->5|26->5|30->9|30->9|32->11
                    -- GENERATED --
                */
            