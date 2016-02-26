# spray-playground

## timeout

### client

```
[WARN] [02/26/2016 20:10:17.549] [client-system-akka.actor.default-dispatcher-2] [akka://client-system/user/IO-HTTP/group-0/0] GET request to '/2' timed out after 1 second, closing connection
[WARN] [02/26/2016 20:10:17.559] [client-system-akka.actor.default-dispatcher-6] [akka://client-system/user/IO-HTTP/host-connector-0/0] GET request to /2 timed out in response to GET request to /2 with no retries left, dispatching error...
Error! spray.can.Http$RequestTimeoutException: GET request to /2 timed out
[INFO] [02/26/2016 20:10:17.571] [client-system-akka.actor.default-dispatcher-4] [akka://client-system/user/IO-HTTP/host-connector-0] Message [akka.dispatch.sysmsg.Terminate] from Actor[akka://client-system/user/IO-HTTP/host-connector-0#-1469888489] to Actor[akka://client-system/user/IO-HTTP/host-connector-0#-1469888489] was not delivered. [1] dead letters encountered. This logging can be turned off or adjusted with configuration settings 'akka.log-dead-letters' and 'akka.log-dead-letters-during-shutdown'.

Process finished with exit code 0
```

### server

```
[INFO] [02/26/2016 20:10:06.088] [my-system-akka.actor.default-dispatcher-2] [akka://my-system/user/IO-HTTP/listener-0] Bound to localhost/127.0.0.1:8080
/2 request
waitinig...2 secs
```
