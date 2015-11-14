import org.scalatra.sbt.ScalatraPlugin

lazy val root = (project in file("."))
  .enablePlugins(XwpJetty)
  .settings(ScalatraPlugin.scalatraSettings)

name := "sample-project"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.3.1",
  "org.eclipse.jetty" % "jetty-webapp" % "9.2.10.v20150310" % "container",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
  "org.scalatest" %% "scalatest" % "2.2.5" % "test"
)



