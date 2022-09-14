package io.chrisdavenport.minimalnpmsjscliexample

import cats.effect._

object Main extends IOApp {

  def run(args: List[String]): IO[ExitCode] = {
    IO(println("I am a minimal npm cli example project!"))
  }.as(ExitCode.Success)

}