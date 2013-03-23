
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
object listJson extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Iterable[Product],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(products: Iterable[Product]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.31*/("""
"""),_display_(Seq[Any](/*2.2*/main("Products catalogue")/*2.28*/ {_display_(Seq[Any](format.raw/*2.30*/("""
    <h1>All products</h1>
    """),_display_(Seq[Any](/*4.6*/if(!products.iterator().hasNext())/*4.40*/ {_display_(Seq[Any](format.raw/*4.42*/("""
        <p>No products found.</p>
    """)))}/*6.7*/else/*6.12*/{_display_(Seq[Any](format.raw/*6.13*/("""
        <p><small><em>"""),_display_(Seq[Any](/*7.24*/Product/*7.31*/.products().count())),format.raw/*7.50*/(""" product(s) found.</em></small></p>
	    <dl>
	        """),_display_(Seq[Any](/*9.11*/for(product <- products.iterator()) yield /*9.46*/ {_display_(Seq[Any](format.raw/*9.48*/("""
	            <dt>
	                <a href=""""),_display_(Seq[Any](/*11.28*/routes/*11.34*/.Products.show(product.ean))),format.raw/*11.61*/("""">
	                    """),_display_(Seq[Any](/*12.23*/product/*12.30*/.ean)),format.raw/*12.34*/(""" - """),_display_(Seq[Any](/*12.38*/product/*12.45*/.name)),format.raw/*12.50*/("""
	                </a>
	            </dt>
	        <dd>"""),_display_(Seq[Any](/*15.15*/product/*15.22*/.description)),format.raw/*15.34*/("""</dd>
	        """)))})),format.raw/*16.11*/("""
	    </dl>
	""")))})),format.raw/*18.3*/("""
    <a href=""""),_display_(Seq[Any](/*19.15*/routes/*19.21*/.Products.showBlank())),format.raw/*19.42*/("""" class="btn"><i class="icon-plus"></i> New product</a>
""")))})))}
    }
    
    def render(products:Iterable[Product]) = apply(products)
    
    def f:((Iterable[Product]) => play.api.templates.Html) = (products) => apply(products)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 23 20:44:10 CET 2013
                    SOURCE: /Users/maxime/Sites/nutrify/Nutrify/app/views/listJson.scala.html
                    HASH: 85ca85bf70bb05ffb46178a421d10a9bf20fbc7a
                    MATRIX: 769->1|875->30|911->32|945->58|984->60|1050->92|1092->126|1131->128|1188->169|1200->174|1238->175|1297->199|1312->206|1352->225|1443->281|1493->316|1532->318|1614->364|1629->370|1678->397|1739->422|1755->429|1781->433|1821->437|1837->444|1864->449|1956->505|1972->512|2006->524|2054->540|2099->554|2150->569|2165->575|2208->596
                    LINES: 27->1|30->1|31->2|31->2|31->2|33->4|33->4|33->4|35->6|35->6|35->6|36->7|36->7|36->7|38->9|38->9|38->9|40->11|40->11|40->11|41->12|41->12|41->12|41->12|41->12|41->12|44->15|44->15|44->15|45->16|47->18|48->19|48->19|48->19
                    -- GENERATED --
                */
            