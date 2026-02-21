lazy val root = (project in file("."))
  .enablePlugins(RiddlSbtPlugin)
  .settings(
    version := "0.1",
    scalaVersion := "3.7.4",
    riddlcVersion := "1.13.0",
    riddlcValidateOnCompile := false
  )
