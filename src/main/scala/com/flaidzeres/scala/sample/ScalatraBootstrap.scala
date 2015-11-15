package com.flaidzeres.scala.sample

import javax.servlet.ServletContext

import org.scalatra._

/**
 * Created by FlaIDzeres on 11/13/2015.
 */

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new SampleWebService, "/*")
  }
}
