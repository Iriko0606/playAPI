package controllers

import javax.inject.Inject
import javax.inject.Singleton
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents, Request}

@Singleton
class HelloController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def get(name:Option[String]): Action[AnyContent] =
    Action {implicit request: Request[AnyContent] =>
      Ok(name.getOrElse("please give me your name"))
    }
}
