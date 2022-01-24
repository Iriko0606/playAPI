package controllers

import play.api.libs.json.{JsValue, Json}

import javax.inject.Inject
import play.api.mvc._

class HelloController @Inject() (cc: ControllerComponents)
  extends AbstractController(cc) {

  def hello():Action[AnyContent] = Action(Ok("Hello World"))


  def helloJson(): Action[AnyContent] = Action {
    val json: JsValue = Json.obj("hello" -> "world", "language" -> "scala")

    Ok(json)
  }
}
