lazy val root = (project in file("."))
  .enablePlugins(RiddlSbtPlugin)
  .settings(
    version := "0.1",
    scalaVersion := "3.7.4",
    riddlcValidateOnCompile := false
  )
