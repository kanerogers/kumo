import spray.json._ 
import spray.http._
import spray.client.pipelining._
import akka.actor._

case class CreateServerRequest(
  name: String,
  imageRef: String,
  flavorRef: String,
  key_name: String
)

object KumoJsonProtocol extends DefaultJsonProtocol {
  implicit val kumoFormat = jsonFormat4(CreateServerRequest)
}

import KumoJsonProtocol._

implicit val system = ActorSystem()
