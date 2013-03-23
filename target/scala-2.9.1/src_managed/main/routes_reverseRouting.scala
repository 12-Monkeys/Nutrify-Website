// @SOURCE:/Users/maxime/Sites/nutrify/Nutrify/conf/routes
// @HASH:8bb4e2093ca227e83061d603e5575373558629f0
// @DATE:Sat Mar 23 20:44:00 CET 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:13
class ReverseMobile {
    


 
// @LINE:13
def index() = {
   Call("GET", "/app/")
}
                                                        

                      
    
}
                            

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseProducts {
    


 
// @LINE:20
def showJson(ean:Long) = {
   Call("GET", "/products/" + implicitly[PathBindable[Long]].unbind("ean", ean) + "/json")
}
                                                        
 
// @LINE:22
def delete(ean:Long) = {
   Call("GET", "/products/delete/" + implicitly[PathBindable[Long]].unbind("ean", ean))
}
                                                        
 
// @LINE:16
def list() = {
   Call("GET", "/products/")
}
                                                        
 
// @LINE:19
def show(ean:Long) = {
   Call("GET", "/products/" + implicitly[PathBindable[Long]].unbind("ean", ean))
}
                                                        
 
// @LINE:21
def save() = {
   Call("POST", "/products/")
}
                                                        
 
// @LINE:18
def showBlank() = {
   Call("GET", "/products/new")
}
                                                        
 
// @LINE:17
def listJson() = {
   Call("GET", "/products/json")
}
                                                        

                      
    
}
                            

// @LINE:12
// @LINE:6
class ReverseApplication {
    


 
// @LINE:12
def about() = {
   Call("GET", "/about")
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:9
class ReverseAssets {
    


 
// @LINE:9
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:13
class ReverseMobile {
    


 
// @LINE:13
def index = JavascriptReverseRoute(
   "controllers.Mobile.index",
   """
      function() {
      return _wA({method:"GET", url:"/app/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseProducts {
    


 
// @LINE:20
def showJson = JavascriptReverseRoute(
   "controllers.Products.showJson",
   """
      function(ean) {
      return _wA({method:"GET", url:"/products/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("ean", ean) + "/json"})
      }
   """
)
                                                        
 
// @LINE:22
def delete = JavascriptReverseRoute(
   "controllers.Products.delete",
   """
      function(ean) {
      return _wA({method:"GET", url:"/products/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("ean", ean)})
      }
   """
)
                                                        
 
// @LINE:16
def list = JavascriptReverseRoute(
   "controllers.Products.list",
   """
      function() {
      return _wA({method:"GET", url:"/products/"})
      }
   """
)
                                                        
 
// @LINE:19
def show = JavascriptReverseRoute(
   "controllers.Products.show",
   """
      function(ean) {
      return _wA({method:"GET", url:"/products/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("ean", ean)})
      }
   """
)
                                                        
 
// @LINE:21
def save = JavascriptReverseRoute(
   "controllers.Products.save",
   """
      function() {
      return _wA({method:"POST", url:"/products/"})
      }
   """
)
                                                        
 
// @LINE:18
def showBlank = JavascriptReverseRoute(
   "controllers.Products.showBlank",
   """
      function() {
      return _wA({method:"GET", url:"/products/new"})
      }
   """
)
                                                        
 
// @LINE:17
def listJson = JavascriptReverseRoute(
   "controllers.Products.listJson",
   """
      function() {
      return _wA({method:"GET", url:"/products/json"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:12
// @LINE:6
class ReverseApplication {
    


 
// @LINE:12
def about = JavascriptReverseRoute(
   "controllers.Application.about",
   """
      function() {
      return _wA({method:"GET", url:"/about"})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:9
class ReverseAssets {
    


 
// @LINE:9
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:13
class ReverseMobile {
    


 
// @LINE:13
def index() = new play.api.mvc.HandlerRef(
   controllers.Mobile.index(), HandlerDef(this, "controllers.Mobile", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseProducts {
    


 
// @LINE:20
def showJson(ean:Long) = new play.api.mvc.HandlerRef(
   controllers.Products.showJson(ean), HandlerDef(this, "controllers.Products", "showJson", Seq(classOf[Long]))
)
                              
 
// @LINE:22
def delete(ean:Long) = new play.api.mvc.HandlerRef(
   controllers.Products.delete(ean), HandlerDef(this, "controllers.Products", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:16
def list() = new play.api.mvc.HandlerRef(
   controllers.Products.list(), HandlerDef(this, "controllers.Products", "list", Seq())
)
                              
 
// @LINE:19
def show(ean:Long) = new play.api.mvc.HandlerRef(
   controllers.Products.show(ean), HandlerDef(this, "controllers.Products", "show", Seq(classOf[Long]))
)
                              
 
// @LINE:21
def save() = new play.api.mvc.HandlerRef(
   controllers.Products.save(), HandlerDef(this, "controllers.Products", "save", Seq())
)
                              
 
// @LINE:18
def showBlank() = new play.api.mvc.HandlerRef(
   controllers.Products.showBlank(), HandlerDef(this, "controllers.Products", "showBlank", Seq())
)
                              
 
// @LINE:17
def listJson() = new play.api.mvc.HandlerRef(
   controllers.Products.listJson(), HandlerDef(this, "controllers.Products", "listJson", Seq())
)
                              

                      
    
}
                            

// @LINE:12
// @LINE:6
class ReverseApplication {
    


 
// @LINE:12
def about() = new play.api.mvc.HandlerRef(
   controllers.Application.about(), HandlerDef(this, "controllers.Application", "about", Seq())
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:9
class ReverseAssets {
    


 
// @LINE:9
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                