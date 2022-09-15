ThisBuild / organization := "io.chrisdavenport"
ThisBuild / organizationName := "Christopher Davenport"
ThisBuild / licenses := Seq(License.MIT)

ThisBuild / scalaVersion := "3.2.0"
ThisBuild / testFrameworks += new TestFramework("munit.Framework")

enablePlugins(NoPublishPlugin)


val catsV = "2.7.0"
val catsEffectV = "3.3.12"
val fs2V = "3.2.7"
val doobieV = "1.0.0-RC2"
val munitCatsEffectV = "1.0.7"

name := "minimal-npm-sjs-cli-example"

libraryDependencies ++= Seq(
  "org.typelevel"               %%% "cats-core"                  % catsV,
  "org.typelevel"               %%% "cats-effect"                % catsEffectV,

  "co.fs2"                      %%% "fs2-core"                   % fs2V,
  "co.fs2"                      %%% "fs2-io"                     % fs2V,

  "org.typelevel"               %%% "munit-cats-effect-3"        % munitCatsEffectV         % Test,

)

// JS Configuration
enablePlugins(ScalaJSPlugin)
scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule)}
scalaJSUseMainModuleInitializer := true

// NPM Configuration
enablePlugins(NpmPackagePlugin)
npmPackageAuthor := "Christopher Davenport"
npmPackageDescription := "minimal-npm-sjs-cli-example is a minimal cli application publishing to npm"
npmPackageKeywords := Seq(
  "cli",
  "npm",
  "sjs"
)
npmPackageBinaryEnable := true
npmPackageStage := org.scalajs.sbtplugin.Stage.FullOpt
npmPackageAdditionalNpmConfig := {
  Map(
    "bin" -> _root_.io.circe.Json.obj(
      "minimal-npm-sjs-cli-example" -> _root_.io.circe.Json.fromString("main.js")
    )
  )
}


// Build Stuff For Automated Releases
// Only release on tags named v...
ThisBuild / githubWorkflowTargetTags += "v*"
ThisBuild / githubWorkflowPublishTargetBranches := Seq(
  RefPredicate.StartsWith(Ref.Tag("v")),
)