name := "dfdl-csv"
 
organization := "com.tresys"
 
version := "0.1.0-SNAPSHOT"
 
scalaVersion := "2.12.11"
 
libraryDependencies := Seq(
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "2.6.0" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

crossPaths := false
