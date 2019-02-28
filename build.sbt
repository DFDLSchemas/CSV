organization := "com.tresys"

name := "dfdl-csv"

version := "0.0.1"

crossPaths := false

scalaVersion := "2.11.12"

testOptions in ThisBuild += Tests.Argument(TestFrameworks.JUnit, "-v")

libraryDependencies in ThisBuild := Seq(
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "2.3.0" % "test"
)

scmInfo := Some(
  ScmInfo(
    browseUrl = url("https://github.com/DFDLSchemas/CSV"),
    connection = "scm:git:https://github.com/DFDLSchemas/CSV.git")
  )

homepage in ThisBuild := Some(url("https://github.com/DFDLSchemas/CSV"))


