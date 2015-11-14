
import com.faldizeres.scala.sample.SampleWebService
import org.scalatra._
import javax.servlet.ServletContext

/**
 * Created by FlaID on 11/13/2015.
 */

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new SampleWebService, "/*")
  }
}
