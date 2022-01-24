package controllers

import akka.stream.Materializer
import org.mockito.Mockito.when
import org.scalatestplus.play._
import org.specs2.mock.Mockito
import org.scalatest._
import org.scalatestplus.mockito.MockitoSugar
import org.scalatestplus.play._
import play.api.mvc.{Action, AnyContent, DefaultActionBuilder, EssentialAction, Result, Results}
import play.api.test.Helpers.{contentAsString, defaultAwaitTimeout}
import play.api.test.{FakeRequest, Helpers}
import play.mvc.Action

import scala.concurrent.Future


class HelloControllerSpec extends PlaySpec with Mockito {

  "UserService#isAdmin" should {
    "be true when the role is admin" in {
      val controller             = new HelloController(Helpers.stubControllerComponents())
      val result: Future[Result] = controller.get(Option("namae")).apply(FakeRequest())
      val bodyText: String       = contentAsString(result)
      bodyText mustBe "namae"
    }
  }
}
