
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
object navigation extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply/*1.2*/():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""
<div class="navbar navbar-fixed-top">
   <div class="navbar-inner">
     <div class="container">
       <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
         <span class="icon-bar"></span>
         <span class="icon-bar"></span>
         <span class="icon-bar"></span>
       </a>
       <a class="brand" href="/#">Nutrify</a>
       <div class="nav-collapse collapse" id="main-menu">
        <ul class="nav" id="main-menu-left">
          <li><a href="/products/">Products</a></li>
          <li><a href="/products/new">Add</a></li>
          <li><a href="/app/">Mobile</a>
        </ul>
        <ul class="nav pull-right" id="main-menu-right">
            <form class="navbar-search">
                <input type="text" class="search-query span3" placeholder="Search"><i class="icon-search"></i>
            </form>
           <li class="divider-vertical"></li>
           <li><a href="/about">About</a></li>
        </ul>
       </div>
     </div>
   </div>
</div>"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 23 18:58:26 CET 2013
                    SOURCE: /Users/maxime/Sites/nutrify/Nutrify/app/views/navigation.scala.html
                    HASH: f5885848aaf00061330c85ff1726a9f8d90e8421
                    MATRIX: 753->1|831->3
                    LINES: 27->1|30->1
                    -- GENERATED --
                */
            