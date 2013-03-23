// @SOURCE:/Users/maxime/Sites/nutrify/Nutrify/conf/routes
// @HASH:2f4c54cbe1525b59f501ebc059133e9e9669f0e8
// @DATE:Sat Mar 23 18:58:21 CET 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


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
                            

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseProducts {
    


 
// @LINE:20
def delete(ean:Long) = {
   Call("GET", "/products/delete/" + implicitly[PathBindable[Long]].unbind("ean", ean))
}
                                                        
 
// @LINE:16
def list() = {
   Call("GET", "/products/")
}
                                                        
 
// @LINE:18
def show(ean:Long) = {
   Call("GET", "/products/" + implicitly[PathBindable[Long]].unbind("ean", ean))
}
                                                        
 
// @LINE:19
def save() = {
   Call("POST", "/products/")
}
                                                        
 
// @LINE:17
def showBlank() = {
   Call("GET", "/products/new")
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
                            

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseProducts {
    


 
// @LINE:20
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
                                                        
 
// @LINE:18
def show = JavascriptReverseRoute(
   "controllers.Products.show",
   """
      function(ean) {
      return _wA({method:"GET", url:"/products/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("ean", ean)})
      }
   """
)
                                                        
 
// @LINE:19
def save = JavascriptReverseRoute(
   "controllers.Products.save",
   """
      function() {
      return _wA({method:"POST", url:"/products/"})
      }
   """
)
                                                        
 
// @LINE:17
def showBlank = JavascriptReverseRoute(
   "controllers.Products.showBlank",
   """
      function() {
      return _wA({method:"GET", url:"/products/new"})
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
                            

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseProducts {
    


 
// @LINE:20
def delete(ean:Long) = new play.api.mvc.HandlerRef(
   controllers.Products.delete(ean), HandlerDef(this, "controllers.Products", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:16
def list() = new play.api.mvc.HandlerRef(
   controllers.Products.list(), HandlerDef(this, "controllers.Products", "list", Seq())
)
                              
 
// @LINE:18
def show(ean:Long) = new play.api.mvc.HandlerRef(
   controllers.Products.show(ean), HandlerDef(this, "controllers.Products", "show", Seq(classOf[Long]))
)
                              
 
// @LINE:19
def save() = new play.api.mvc.HandlerRef(
   controllers.Products.save(), HandlerDef(this, "controllers.Products", "save", Seq())
)
                              
 
// @LINE:17
def showBlank() = new play.api.mvc.HandlerRef(
   controllers.Products.showBlank(), HandlerDef(this, "controllers.Products", "showBlank", Seq())
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
                    
                