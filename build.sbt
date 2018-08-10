
enablePlugins(ScalaJSBundlerPlugin)

name := "unfold-ui-demo"
organization := "com.github.ahnfelt"
version := "0.1-SNAPSHOT"

resolvers += Resolver.sonatypeRepo("snapshots")
libraryDependencies += "com.github.ahnfelt" %%% "react4s" % "0.9.14-SNAPSHOT"
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.2"

scalaVersion := "2.12.6"

scalaJSUseMainModuleInitializer := true

npmDependencies in Compile ++= Seq(
  "react" -> "16.4.1",
  "react-dom" -> "16.4.1",
  "@material-ui/core" -> "1.4.3"
)

version in webpack := "4.8.1"
version in startWebpackDevServer := "3.1.4"

webpackDevServerExtraArgs in fastOptJS ++= Seq(
  "--content-base",
  baseDirectory.value.getAbsolutePath
)