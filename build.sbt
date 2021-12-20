name := "dfdl-csv"
 
organization := "com.owlcyberdefense"
 
version := "0.1.0-SNAPSHOT"
 
scalaVersion := "2.12.15"

ThisBuild / useCoursier := false // needed for retrieveManaged to work.

retrieveManaged := true // populate lib_managed
 
libraryDependencies ++= Seq(
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "3.2.1" % "test",
  "junit" % "junit" % "4.13.2" % "test",
  "com.github.sbt" % "junit-interface" % "0.13.2" % "test"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

crossPaths := false

//
// Use flatter folder structure.
//
// src directory contains all source files (they are distinguished by file types)
// test directory contains all test files.
//
lazy val root = (project in file("."))
      .settings(
        Project.inConfig(Compile)(flattenSettings("src")),
        Project.inConfig(Test)(flattenSettings("test")),
      )

def flattenSettings(name: String) = Seq(
      unmanagedSourceDirectories := Seq(baseDirectory.value / name),
      unmanagedResourceDirectories := unmanagedSourceDirectories.value,
      unmanagedSources / includeFilter := "*.java" | "*.scala",
      unmanagedResources / excludeFilter := (unmanagedSources / includeFilter).value,
 )
