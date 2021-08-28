import Dependencies._

ThisBuild / scalaVersion := "3.0.1"
ThisBuild / version := "0.1.0"
ThisBuild / organization := "io.slack_emoji"

lazy val generate_image = project.in(file("generate_image"))
  .settings(
    scalacOptions ++= customScalacOptions,
    libraryDependencies ++= Seq(
      scalatest
    )
  )

val customScalacOptions = Seq(
  "-encoding", "utf8",
  "-deprecation",
  "-unchecked",
  "-feature",
  "-language:existentials",
  "-language:experimental.macros",
  "-language:higherKinds",
  "-language:implicitConversions"
)
