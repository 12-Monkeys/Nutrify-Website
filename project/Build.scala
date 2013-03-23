import sbt._
import Keys._
import PlayProject._
import com.github.play2war.plugin._

object ApplicationBuild extends Build {

    val appName         = "Nutrify"
    val appVersion      = "0.1"

    val appDependencies = Seq(
      // Add your project dependencies here,
      "uk.co.panaxiom" %% "play-jongo" % "0.3",
      "com.github.play2war.ext" %% "redirect-playlogger" % "1.0.1"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here
      resolvers += Resolver.url("My GitHub Play Repository", url("http://alexanderjarvis.github.com/releases/"))(Resolver.ivyStylePatterns),
      Play2WarKeys.servletVersion := "2.5"
    ).settings(Play2WarPlugin.play2WarSettings: _*)

}
