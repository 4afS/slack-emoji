import Dependencies._

ThisBuild / scalaVersion     := "3.0.1"
ThisBuild / version          := "0.1.0"
ThisBuild / organization     := "io.slack_emoji"

lazy val `generate_image` = Project("generate_image", file("generate_image"))
  .settings(
//    libraryDependencies += scalaTest % Test
  )
