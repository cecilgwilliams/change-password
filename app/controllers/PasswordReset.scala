package controllers

import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models.User
import service.LdapService

object PasswordReset extends Controller {
  
  def index =  Action {
    Ok(views.html.reset(userForm))
  }

  val ldapService = new LdapService

  def reset = Action {
    implicit request =>
      userForm.bindFromRequest().fold(
        errors => BadRequest(views.html.error()),
        user => {
          val result: String = ldapService.resetPassword(user)
          if (result == "success") {
            Ok(views.html.success())
          }
          else {
            Ok(views.html.failure())
          }
        }
      )
  }

  val userForm = Form(
    mapping(
      "userLoginId" -> text,
      "currentPassword" -> text,
      "newPassword" -> text
    )((userLoginId, currentPassword, newPassword) => User(userLoginId, currentPassword, newPassword))
      ((user: User) => Some(user.userLoginId, "", ""))
  )
}