package interoperability

import com.github.ahnfelt.react4s.JsComponent

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("@material-ui/core", JSImport.Namespace)
object MaterialUI extends js.Object {
  val Card: js.Dynamic = js.native
}

object Card extends JsComponent(MaterialUI.Card)