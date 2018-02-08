scalaVersion in ThisBuild := "2.11.8"

organization := "com.tresys"

name := "dfdl-csv"

version := "0.0.1"

crossPaths := false

testOptions in ThisBuild += Tests.Argument(TestFrameworks.JUnit, "-v")

libraryDependencies in ThisBuild := Seq(
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.apache.daffodil" %% "daffodil-tdml" % "2.1.0" % "test"
)

retrieveManaged := true

exportJars in ThisBuild := true

exportJars in Test in ThisBuild := true

publishArtifact in Test := true

