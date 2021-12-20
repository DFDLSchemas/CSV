name := "dfdl-csv"
 
organization := "com.tresys"
 
version := "0.1.0-SNAPSHOT"
 
scalaVersion := "2.12.15"

ThisBuild / useCoursier := false

// Populate lib_managed with all managed dependencies. 
// This is just here because it is interesting to look at all the 
// stuff that gets pulled in. 
retrieveManaged := true
 
libraryDependencies ++= Seq(
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "3.2.1" ,
  "junit" % "junit" % "4.13.2",
  "com.github.sbt" % "junit-interface" % "0.13.2"
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
