package com.flaidzeres.scala.sample

import org.eclipse.jetty.server.Server
import org.eclipse.jetty.webapp.WebAppContext
import org.scalatra.servlet.ScalatraListener

/**
 * Created by FlaIDzeres on 11/15/2015.
 */
object JettyEmbedded extends App {
  val server = new Server(8080)
  val context = new WebAppContext("/", "/")
  context.addEventListener(new ScalatraListener)
  context.setInitParameter(
    ScalatraListener.LifeCycleKey,
    "com.flaidzeres.scala.sample.ScalatraBootstrap"
  )
  context.setServer(server)
  server.setHandler(context)
  server.start()
  server.join()
}
