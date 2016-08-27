name := "http4s-blank"
organization := "com.joescii"
version := "0.0.1"

scalaVersion := "2.11.8" // Also supports 2.10.x
lazy val http4sVersion = "0.14.3"
libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-dsl" % http4sVersion,
  "org.http4s" %% "http4s-blaze-server" % http4sVersion,
  "org.http4s" %% "http4s-blaze-client" % http4sVersion
)

