# sbt-scalatra-template
Empty template for start work with scalatra on jetty server

[Sbt doc](http://www.scala-sbt.org/0.13/tutorial/index.html)

[Scalatra home](http://www.scalatra.org/)

* scala - 2.11.7
* sbt - 0.13.8


* scalatra - 2.3.1
* jetty - 9.2.10.v20150310
* servlet-api - 3.1.0
* scalatest - 2.2.5

For start server execute 'container:start' in sbt console, stop 'container:stop'. 
After server started use url for get result.

[localhost:8080/hi](localhost:8080/hi)

```scala
class SampleWebService extends ScalatraServlet {
  get("/hi") {
    "Hello!"
  }
}
```

If you want get jar, execute 'assembly', after that you get jar in your target directory. 

You can run it 'java -jar $JarName'

If you have questions, let me know.


