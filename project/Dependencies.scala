import sbt._

object Dependencies {
  lazy val scalatest = "org.scalatest" %% "scalatest" % "3.2.9"

  def depLib(dep: ModuleID*): Seq[ModuleID] = dep map (_ % Compile)

  def depTest(dep: ModuleID*): Seq[ModuleID] = dep map (_ % Test)
}
