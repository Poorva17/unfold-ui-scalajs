import com.github.ahnfelt.react4s._
import interoperability.Card
import theme.TodoListCss

case class TodoListComponent(title: P[String]) extends Component[NoEmit] {

  val text  = State("")
  val items = State(List[String]())

  override def render(get: Get): ElementOrComponent = {
    Card(
      TodoListCss,
      E.h3(Text(get(title))),
      renderTodoList(get(items)),
      E.form(
        E.input(A.onChangeText(text.set), A.value(get(text))),
        E.button(Text("Add" + (get(items).length + 1))),
        A.onSubmit { e =>
          e.preventDefault()
          items.modify(_ :+ get(text))
          text.set("")
        }
      )
    )
  }

  def renderTodoList(items: List[String]): Element = {
    E.ul(
      Tags(
        items.map(item => E.li(Text(item)))
      )
    )
  }

}
