name := """Particles"""

scalaVersion := "2.12.2"

val akkaVersion = "2.5.0"

fork := true

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion withSources(),
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion withSources(),
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

