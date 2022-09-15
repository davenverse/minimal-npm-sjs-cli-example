ThisBuild / resolvers ++= Resolver.sonatypeOssRepos("snapshots")
addSbtPlugin("org.typelevel" % "sbt-typelevel-no-publish" % "0.4.12")
addSbtPlugin("com.dwijnand" % "sbt-dynver" % "4.1.1")
// addSbtPlugin("org.typelevel" % "sbt-typelevel-versioning" % "0.4.9")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.11.0")
val v = "0.1.1+14-21b94ebb-SNAPSHOT"
addSbtPlugin("io.chrisdavenport" % "sbt-npm-package" % v)
addSbtPlugin("io.chrisdavenport" % "sbt-npm-package-github-actions" % v)