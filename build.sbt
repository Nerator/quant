import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "ru.dovzhikov",
      scalaVersion := "2.12.4",
      version      := "0.2.0"
    )),
    name := "quant",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      parserComb
    )
  )

// set the prompt (for this build) to include the project id.
// shellPrompt in ThisBuild := { state => name.value + "> " }