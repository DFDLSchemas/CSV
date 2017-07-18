scalaVersion in ThisBuild := "2.11.8"

organization := "com.tresys"

name := "dfdl-csv"

version := "0.0.2"

crossPaths := false

testOptions in ThisBuild += Tests.Argument(TestFrameworks.JUnit, "-v")

resolvers in ThisBuild ++= Seq(
  "NCSA Sonatype Releases" at "https://opensource.ncsa.illinois.edu/nexus/content/repositories/releases",
  "NCSA Sonatype Snapshots" at "https://opensource.ncsa.illinois.edu/nexus/content/repositories/snapshots"
)

libraryDependencies in ThisBuild := Seq(
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "edu.illinois.ncsa" %% "daffodil-tdml" % "2.0.0-SNAPSHOT" % "test"
)

retrieveManaged := true

exportJars in ThisBuild := true

exportJars in Test in ThisBuild := true

publishArtifact in Test := true

