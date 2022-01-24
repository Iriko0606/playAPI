lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.8"
val scalaTestPlusPlayVersion = "5.0.0"

libraryDependencies ++= Seq(
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % "test",
  specs2 % Test //PlayFrameworkの場合
)
