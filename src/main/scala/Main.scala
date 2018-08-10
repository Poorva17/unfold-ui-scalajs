import com.github.ahnfelt.react4s.{Component, E}
import facade.NpmReactBridge

object Main {
    def main(arguments : Array[String]) : Unit = {
      val component = E.div(
        Component(HeaderComponent),
        Component(TodoListComponent, "Todo List")
      )
        NpmReactBridge.renderToDomById(component, "main")
    }

//  def main(args: Array[String]): Unit = {
//    println("Hello world!")
//  }

}
