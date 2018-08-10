import com.github.ahnfelt.react4s._
import theme.{AnchorCss, BrandTaglineCss, BrandTitleCss, TopBarCss}

case class HeaderComponent() extends Component[NoEmit] {
  override def render(get: Get): Node = {
    E.div(
      E.div(
        TopBarCss,
        E.span(
          BrandTitleCss,
          Text("Unfold UI")
        ),
        E.span(
          BrandTaglineCss,
          Text("React component in scala.js")
        )
      ),
      E.a(
        AnchorCss,
        A.href("https://github.com/tmtsoftware/esw-prototype"),
        Text("Github")
      )
    )
  }
}
