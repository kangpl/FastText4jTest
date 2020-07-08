name := "testSent2Vec"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
    "org.slf4j" % "slf4j-log4j12" % "1.7.24",
    "log4j" % "log4j" % "1.2.17",
    "com.google.guava" % "guava" % "19.0",
    "commons-cli" % "commons-cli" % "1.4",
    "org.nd4j" % "nd4j-native-platform" % "1.0.0-beta7",
)

scalaSource := baseDirectory.value / "src/main/resources"

javaOptions ++= Seq("-Xms512M", "-Xmx20480M", "-XX:+CMSClassUnloadingEnabled")
