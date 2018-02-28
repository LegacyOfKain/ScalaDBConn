name := "hello"

version := "1.0"

scalaVersion := "2.12.4"


resolvers:= Seq("DataNucleus Indexed Repository for Oracle Jar" at "http://www.datanucleus.org/downloads/maven2/")

libraryDependencies += "oracle" % "ojdbc6" % "11.2.0.3"

updateOptions := updateOptions.value.withGigahorse(false)