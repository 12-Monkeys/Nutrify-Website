
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*8.103*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/bootstrap-responsive.min.css"))),format.raw/*9.114*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/main.css"))),format.raw/*10.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/("""">
    </head>
    <body>
        """),_display_(Seq[Any](/*14.10*/navigation())),format.raw/*14.22*/("""
        <div class="container">
	        """),_display_(Seq[Any](/*16.11*/if(flash.containsKey("success"))/*16.43*/{_display_(Seq[Any](format.raw/*16.44*/("""
	           <div class="row">
	               <div class="alert alert-success span12">
	                   """),_display_(Seq[Any](/*19.22*/flash/*19.27*/.get("success"))),format.raw/*19.42*/("""
	               </div>
	           </div>
	        """)))})),format.raw/*22.11*/("""
	        """),_display_(Seq[Any](/*23.11*/if(flash.containsKey("error"))/*23.41*/{_display_(Seq[Any](format.raw/*23.42*/("""
	           <div class="row">
	               <div class="alert alert-error span12">
	                   """),_display_(Seq[Any](/*26.22*/flash/*26.27*/.get("error"))),format.raw/*26.40*/("""
	               </div>
	           </div>  
	        """)))})),format.raw/*29.11*/("""
	        """),_display_(Seq[Any](/*30.11*/if(flash.containsKey("warning"))/*30.43*/{_display_(Seq[Any](format.raw/*30.44*/("""
               <div class="row">
                   <div class="alert alert-warning span12">
                       """),_display_(Seq[Any](/*33.25*/flash/*33.30*/.get("warning"))),format.raw/*33.45*/("""
                   </div>
               </div>  
            """)))})),format.raw/*36.14*/("""
            <div class="row">
              <div class="span12">
                """),_display_(Seq[Any](/*39.18*/content)),format.raw/*39.25*/("""
              </div>
            </div>
          <div class="row">
            <div class="span12">
              <hr>
            </div>
          </div>
	      <footer id="about">
	       <div class="row">
	         <div class="span12">
				<p class="pull-right"><i class="icon-arrow-up"></i><a href="#">Back to top</a></p>
				<p class="links">
				    Made by <a target="_blank" href="https://github.com/tarraschk">Maxime Alay-Eddine</a> & <a target="_blank" href="https://github.com/adrienthiery">Adrien Thiery</a> - <a target="_blank" href="http://www.12monkeys.io/">http://www.12Monkeys.io</a>.<br/>
				    Code licensed under the <a target="_blank" href="http://www.apache.org/licenses/LICENSE-2.0">Apache License v2.0</a>.<br/>
				    Work based on <a target="_blank" href="http://www.playframework.org/">Playframework</a>, <a target="_blank" href="http://jquery.com/">jQuery</a> and <a target="_blank" href="http://twitter.github.com/bootstrap/">Bootstrap</a>. Icons from <a target="_blank" href="http://glyphicons.com/">Glyphicons</a>. Web fonts from <a target="_blank" href="http://www.google.com/webfonts">Google</a>.
				</p>
			  </div>
	       </div>
	      </footer>
        </div>
        <script src=""""),_display_(Seq[Any](/*60.23*/routes/*60.29*/.Assets.at("javascripts/jquery.min.js"))),format.raw/*60.68*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*61.23*/routes/*61.29*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*61.71*/("""" type="text/javascript"></script>
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html) = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 23 20:44:10 CET 2013
                    SOURCE: /Users/maxime/Sites/nutrify/Nutrify/app/views/main.scala.html
                    HASH: 32d195c5524a47068d177a36ab37c6e79d5e19aa
                    MATRIX: 759->1|866->31|954->84|980->89|1077->151|1091->157|1156->200|1247->256|1261->262|1337->316|1429->372|1444->378|1500->412|1597->473|1612->479|1666->511|1737->546|1771->558|1850->601|1891->633|1930->634|2075->743|2089->748|2126->763|2211->816|2258->827|2297->857|2336->858|2479->965|2493->970|2528->983|2615->1038|2662->1049|2703->1081|2742->1082|2896->1200|2910->1205|2947->1220|3043->1284|3162->1367|3191->1374|4452->2599|4467->2605|4528->2644|4621->2701|4636->2707|4700->2749
                    LINES: 27->1|30->1|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|43->14|43->14|45->16|45->16|45->16|48->19|48->19|48->19|51->22|52->23|52->23|52->23|55->26|55->26|55->26|58->29|59->30|59->30|59->30|62->33|62->33|62->33|65->36|68->39|68->39|89->60|89->60|89->60|90->61|90->61|90->61
                    -- GENERATED --
                */
            