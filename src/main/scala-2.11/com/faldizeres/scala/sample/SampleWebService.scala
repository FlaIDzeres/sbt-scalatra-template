package com.faldizeres.scala.sample

import org.scalatra._

/**
 * Created by FlaID on 11/13/2015.
 */
class SampleWebService extends ScalatraServlet {
  get("/hi") {
    "Hello!"
  }
}
