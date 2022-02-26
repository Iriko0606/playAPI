lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.8"
val scalaTestPlusPlayVersion = "5.0.0"

libraryDependencies ++= Seq(
  guice,
  evolutions,
  jdbc,
  specs2 % Test,
  "mysql" % "mysql-connector-java" % "8.0.27",
  "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % "test",
  "com.h2database" % "h2" % "1.4.197"
)
