package com.github.yutaono.spray.playground.timeout.server

import akka.actor.ActorSystem
import spray.http.StatusCodes
import spray.routing.SimpleRoutingApp

object Boot extends App with SimpleRoutingApp {

  implicit val system = ActorSystem("my-system")

  startServer(interface = "localhost", port = 8080) {
    pathPrefix(IntNumber) { i =>
      pathEnd {
        get {
          complete {
            println(s"/${i} request")
            println(s"waitinig...${i} secs")
            Thread.sleep(i * 1000)
            StatusCodes.OK
          }
        }
      }
    }
  }

}
