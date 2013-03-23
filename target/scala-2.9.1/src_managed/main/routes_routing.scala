// @SOURCE:/Users/maxime/Sites/nutrify/Nutrify/conf/routes
// @HASH:2f4c54cbe1525b59f501ebc059133e9e9669f0e8
// @DATE:Sat Mar 23 18:58:21 CET 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    

// @LINE:12
val controllers_Application_about2 = Route("GET", PathPattern(List(StaticPart("/about"))))
                    

// @LINE:13
val controllers_Mobile_index3 = Route("GET", PathPattern(List(StaticPart("/app/"))))
                    

// @LINE:16
val controllers_Products_list4 = Route("GET", PathPattern(List(StaticPart("/products/"))))
                    

// @LINE:17
val controllers_Products_showBlank5 = Route("GET", PathPattern(List(StaticPart("/products/new"))))
                    

// @LINE:18
val controllers_Products_show6 = Route("GET", PathPattern(List(StaticPart("/products/"),DynamicPart("ean", """[^/]+"""))))
                    

// @LINE:19
val controllers_Products_save7 = Route("POST", PathPattern(List(StaticPart("/products/"))))
                    

// @LINE:20
val controllers_Products_delete8 = Route("GET", PathPattern(List(StaticPart("/products/delete/"),DynamicPart("ean", """[^/]+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""","""/about""","""controllers.Application.about()"""),("""GET""","""/app/""","""controllers.Mobile.index()"""),("""GET""","""/products/""","""controllers.Products.list()"""),("""GET""","""/products/new""","""controllers.Products.showBlank()"""),("""GET""","""/products/$ean<[^/]+>""","""controllers.Products.show(ean:Long)"""),("""POST""","""/products/""","""controllers.Products.save()"""),("""GET""","""/products/delete/$ean<[^/]+>""","""controllers.Products.delete(ean:Long)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:12
case controllers_Application_about2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.about(), HandlerDef(this, "controllers.Application", "about", Nil))
   }
}
                    

// @LINE:13
case controllers_Mobile_index3(params) => {
   call { 
        invokeHandler(_root_.controllers.Mobile.index(), HandlerDef(this, "controllers.Mobile", "index", Nil))
   }
}
                    

// @LINE:16
case controllers_Products_list4(params) => {
   call { 
        invokeHandler(_root_.controllers.Products.list(), HandlerDef(this, "controllers.Products", "list", Nil))
   }
}
                    

// @LINE:17
case controllers_Products_showBlank5(params) => {
   call { 
        invokeHandler(_root_.controllers.Products.showBlank(), HandlerDef(this, "controllers.Products", "showBlank", Nil))
   }
}
                    

// @LINE:18
case controllers_Products_show6(params) => {
   call(params.fromPath[Long]("ean", None)) { (ean) =>
        invokeHandler(_root_.controllers.Products.show(ean), HandlerDef(this, "controllers.Products", "show", Seq(classOf[Long])))
   }
}
                    

// @LINE:19
case controllers_Products_save7(params) => {
   call { 
        invokeHandler(_root_.controllers.Products.save(), HandlerDef(this, "controllers.Products", "save", Nil))
   }
}
                    

// @LINE:20
case controllers_Products_delete8(params) => {
   call(params.fromPath[Long]("ean", None)) { (ean) =>
        invokeHandler(_root_.controllers.Products.delete(ean), HandlerDef(this, "controllers.Products", "delete", Seq(classOf[Long])))
   }
}
                    
}
    
}
                