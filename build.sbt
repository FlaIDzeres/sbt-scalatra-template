import org.scalatra.sbt.ScalatraPlugin

lazy val `sbt-scalatra-template` = (project in file("."))
  .enablePlugins(XwpJetty)
  .settings(ScalatraPlugin.scalatraFullSettings)

name := "sample-project"

version := "1.0"

scalaVersion := "2.11.7"

mainClass := Some("com.flaidzeres.scala.sample.JettyEmbedded")

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.3.1",
  "org.eclipse.jetty" % "jetty-webapp" % "9.2.10.v20150310",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
  "ch.qos.logback" % "logback-classic" % "1.1.3",
  "org.scalatest" %% "scalatest" % "2.2.5" % "test"
)

