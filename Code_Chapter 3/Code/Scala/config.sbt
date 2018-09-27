name := "Spark for Beginners"

version := "1.0"

scalaVersion := "2.11.8"

scalacOptions += "-deprecation"

val sparkVersion = "2.0.0-SNAPSHOT"

resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion
)