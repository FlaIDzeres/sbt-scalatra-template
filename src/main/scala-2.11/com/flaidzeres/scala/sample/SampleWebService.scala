package com.flaidzeres.scala.sample

import org.scalatra._

/**
 * Created by FlaIDzeres on 11/13/2015.
 */
class SampleWebService extends ScalatraServlet {
  get("/hi") {
    "Hello!"
  }
}
