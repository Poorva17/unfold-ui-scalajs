package theme

import com.github.ahnfelt.react4s._

object OperationTitleCss
    extends CssClass(
      S.position.relative(),
      S.left.px(0),
      S.top.px(50),
      S.padding.px(20),
      S.fontFamily("Verdana"),
      S.fontSize.px(16),
      S.color(Palette.text),
    )

object TopBarCss
    extends CssClass(
      S.borderTop("5px solid " + Palette.blue),
      S.backgroundColor(Palette.background),
      S.boxShadow("0 2px 5px rgba(0, 0, 0, 0.3)"),
      S.boxSizing.borderBox(),
      S.position.absolute(),
      S.left.px(0),
      S.top.px(0),
      S.right.px(0),
      S.height.px(50),
    )

object BrandTextCss
    extends CssClass(
      S.display.inlineBlock(),
      S.paddingTop.px(8),
      S.fontFamily("Verdana")
    )

object BrandTitleCss
    extends CssClass(
      BrandTextCss,
      S.color(Palette.blue),
      S.paddingLeft.px(50),
      S.fontSize.px(20),
    )

object BrandTaglineCss
    extends CssClass(
      BrandTextCss,
      S.paddingLeft.px(50),
    )

object AnchorCss
    extends CssClass(
      LinkCss,
      S.fontFamily("Verdana"),
      S.fontSize.px(16),
      S.position("absolute"),
      S.top.px(15),
      S.right.px(10),
    )

object TodoListCss extends CssClass (
      S.position.fixed(),
      S.top.px(100)
)