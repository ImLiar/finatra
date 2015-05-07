organization := "com.twitter"

name := "finatra"

version := "0.15.3G"

scalaVersion := "2.10.4"

resolvers += Classpaths.typesafeReleases

resolvers ++= Seq("Twitter" at "http://maven.twttr.com")

scalacOptions ++= (
  Opts.compile.deprecation
    :: Opts.compile.unchecked
    :: Opts.compile.optimise
    :: "-feature"
    :: "-language:implicitConversions"
    :: "-language:postfixOps"
    :: "-Xlog-reflective-calls"
    :: "-Ywarn-adapted-args"
    :: Opts.compile.encoding("UTF-8").toList) ::: "-target:jvm-1.6" :: Nil

libraryDependencies ++= Seq(
  "com.twitter" %% "twitter-server" % "1.7.3",
  "com.twitter" %% "finagle-stats" % "6.20.0",
  "commons-codec" % "commons-codec" % "1.9",
  "commons-io" % "commons-io" % "2.4",
  "com.fasterxml.jackson.core" % "jackson-core" % "2.4.0",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.4.0",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.4.0",
  "com.github.spullara.mustache.java" % "compiler" % "0.8.14"
)

publishTo := Some(Resolver.file("file", new File("/home/liar/glopart-libs/mvn/releases")))