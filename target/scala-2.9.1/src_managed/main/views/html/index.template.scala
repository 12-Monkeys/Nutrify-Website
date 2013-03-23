
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.19*/("""
"""),_display_(Seq[Any](/*4.2*/main("Nutrify - Home")/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""
    <header class="jumbotron subhead" id="overview">
    <div class="row">
	    <div class="span12 well center">
	      <h2>Welcome to Nutrify!</h2>
	  </div>
	  </div>
    </header>
    <section>
        <h1>Nutrify</h1>
        <p>The easiest way to fetch nutritional information on your favorite products (iOS & Android)</p>
    </section>
""")))})))}
    }
    
    def render(message:String) = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 23 18:58:25 CET 2013
                    SOURCE: /Users/maxime/Sites/nutrify/Nutrify/app/views/index.scala.html
                    HASH: 5e7d3a0fa09f1a7df0c135fe93d6245baeb1d37d
                    MATRIX: 755->1|899->18|935->71|965->93|1004->95
                    LINES: 27->1|33->1|34->4|34->4|34->4
                    -- GENERATED --
                */
            