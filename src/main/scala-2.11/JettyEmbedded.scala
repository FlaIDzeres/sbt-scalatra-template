import org.eclipse.jetty.server.Server
import org.eclipse.jetty.webapp.WebAppContext

/**
  * Created by FlaID on 11/15/2015.
  */
object JettyEmbedded extends App {
  val server = new Server(8080)
  val context: WebAppContext = new WebAppContext("src/main/webapp", "/")
  context.setServer(server)
  server.setHandler(context)
  try {
    server.start()
    server.join()
  } catch {
    case e: Exception =>
      e.printStackTrace()
      System.exit(1)
  }
}
