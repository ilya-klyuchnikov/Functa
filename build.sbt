lazy val projectSetting = Seq(
  scalaVersion := "2.13.1",
  name := "functa",
  version := "0.1-SNAPSHOT",
  libraryDependencies += "org.parboiled" %% "parboiled" % "2.2.0",
  Test / testOptions += Tests.Argument("-oD"),
  IntegrationTest / testOptions += Tests.Argument("-oD"),
)

lazy val functa = (project in file("."))
  .configs(IntegrationTest)
  .settings(Defaults.itSettings)
  .settings(projectSetting)
