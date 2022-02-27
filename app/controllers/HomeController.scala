package controllers

import akka.util._
import play.api.http._

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class HomeController @Inject() (cc: ControllerComponents)
    extends AbstractController(cc) {
  def index(name: Option[String], value: Option[String]) = Action { request =>
    val s_name: String = name.getOrElse("")
    val s_value: String = value.getOrElse("")
    val sessions = request.session.data
    val message = "<pre>" + sessions + "</pre>"
    val res =
      Ok("<title>Hello!</title><h1>Hello!</h1>" + message).as("text/html")
    if (name != "") {
      res.withSession(request.session + (s_name -> s_value))
    } else {
      res
    }
  }
}
