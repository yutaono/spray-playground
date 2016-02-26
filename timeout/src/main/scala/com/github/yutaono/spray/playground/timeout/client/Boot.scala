package com.github.yutaono.spray.playground.timeout.client

import akka.actor.ActorSystem
import akka.io.IO
import akka.pattern.ask
import scala.concurrent.duration._
import spray.can.Http
import spray.client.pipelining._
import spray.util._

import scala.util.{Failure, Success}

object Boot extends App {

  implicit val system = ActorSystem("client-system")
  import system.dispatcher

  val pipeline = sendReceive ~> unmarshal[String]

  val responseF = pipeline {
    Get("http://localhost:8080/2")
  }

  responseF onComplete {
    case Success(res) =>
      println(s"Success! ${res}")
      shutdown()
    case Failure(e) =>
      println(s"Error! ${e}")
      shutdown()
  }

  def shutdown(): Unit = {
    IO(Http).ask(Http.CloseAll)(1.second).await
    system.shutdown()
  }

}
