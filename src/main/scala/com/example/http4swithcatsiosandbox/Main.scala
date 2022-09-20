package com.example.http4swithcatsiosandbox

import cats.effect.{IO, IOApp}

object Main extends IOApp.Simple {
  def run:IO[Unit] = Http4swithcatsiosandboxServer.run
}
