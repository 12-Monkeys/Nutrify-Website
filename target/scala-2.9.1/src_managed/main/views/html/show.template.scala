
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object show extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Product],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(productForm: Form[Product]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.30*/("""
"""),_display_(Seq[Any](/*4.2*/main("Product form")/*4.22*/ {_display_(Seq[Any](format.raw/*4.24*/("""
    <h1>Product form</h1>
	"""),_display_(Seq[Any](/*6.3*/helper/*6.9*/.form(action = routes.Products.save())/*6.47*/ {_display_(Seq[Any](format.raw/*6.49*/("""
	    <fieldset>
	        """),_display_(Seq[Any](/*8.11*/if(productForm("name").valueOr("").isEmpty())/*8.56*/ {_display_(Seq[Any](format.raw/*8.58*/("""
	           <legend>New product</legend>
	        """)))}/*10.12*/else/*10.17*/{_display_(Seq[Any](format.raw/*10.18*/("""
	           <legend>Product """),_display_(Seq[Any](/*11.30*/productForm("name")/*11.49*/.value)),format.raw/*11.55*/(""" <a class="pull-right" href=""""),_display_(Seq[Any](/*11.85*/routes/*11.91*/.Products.delete(productForm("ean").value.toLong))),format.raw/*11.140*/(""""><i class="icon-remove"></i></a></legend>
	        """)))})),format.raw/*12.11*/("""
	        """),_display_(Seq[Any](/*13.11*/helper/*13.17*/.inputText(productForm("ean")))),format.raw/*13.47*/("""
	        """),_display_(Seq[Any](/*14.11*/helper/*14.17*/.inputText(productForm("name")))),format.raw/*14.48*/("""
	        """),_display_(Seq[Any](/*15.11*/helper/*15.17*/.textarea(productForm("description")))),format.raw/*15.54*/("""
	    </fieldset>
	    <input type="submit" class="btn primary">
	""")))})),format.raw/*18.3*/("""
""")))})))}
    }
    
    def render(productForm:Form[Product]) = apply(productForm)
    
    def f:((Form[Product]) => play.api.templates.Html) = (productForm) => apply(productForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 23 18:58:26 CET 2013
                    SOURCE: /Users/maxime/Sites/nutrify/Nutrify/app/views/show.scala.html
                    HASH: b3674f17de7c947d2cf39c043315b65221d49bc6
                    MATRIX: 761->1|916->29|952->82|980->102|1019->104|1082->133|1095->139|1141->177|1180->179|1242->206|1295->251|1334->253|1405->306|1418->311|1457->312|1523->342|1551->361|1579->367|1645->397|1660->403|1732->452|1817->505|1864->516|1879->522|1931->552|1978->563|1993->569|2046->600|2093->611|2108->617|2167->654|2265->721
                    LINES: 27->1|33->1|34->4|34->4|34->4|36->6|36->6|36->6|36->6|38->8|38->8|38->8|40->10|40->10|40->10|41->11|41->11|41->11|41->11|41->11|41->11|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|48->18
                    -- GENERATED --
                */
            