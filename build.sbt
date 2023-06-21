name := "dfdl-csv"
 
organization := "com.owlcyberdefense"
 
version := "0.1.0-SNAPSHOT"
 
scalaVersion := "2.12.18"

// to test against IBM DFDL uncomment this line
// IBMDFDLCrossTesterPlugin.settings

useCoursier := false // needed for retrieveManaged to work.

retrieveManaged := true // populate lib_managed
 
libraryDependencies ++= Seq(
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "3.5.0" % "test",
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
Compile / unmanagedSourceDirectories := Seq(baseDirectory.value / "src")
Compile / unmanagedResourceDirectories := (Compile / unmanagedSourceDirectories).value
Compile / unmanagedSources / includeFilter := "*.java" | "*.scala"
Compile / unmanagedResources / excludeFilter := (Compile / unmanagedSources / includeFilter).value

Test / unmanagedSourceDirectories := Seq(baseDirectory.value / "test")
Test / unmanagedResourceDirectories := (Test / unmanagedSourceDirectories).value
Test / unmanagedSources / includeFilter := "*.java" | "*.scala"
Test / unmanagedResources / excludeFilter := (Test / unmanagedSources / includeFilter).value
