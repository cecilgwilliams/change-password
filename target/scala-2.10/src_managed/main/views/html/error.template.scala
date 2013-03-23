
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
object error extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*2.1*/("""
"""),_display_(Seq[Any](/*3.2*/main("Password Reset")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

<body bgcolor="#FF0000">

<h1>An Unexpected Error Has Occurred</h1>

<body/>

""")))})),format.raw/*11.2*/("""
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 23 12:52:42 CDT 2013
                    SOURCE: /Volumes/MacProHD/cecil/change-password/app/views/error.scala.html
                    HASH: 316adfd8e449a43698d30e4e00be3d6d86a2568f
                    MATRIX: 585->17|621->19|651->41|690->43|802->124
                    LINES: 23->2|24->3|24->3|24->3|32->11
                    -- GENERATED --
                */
            