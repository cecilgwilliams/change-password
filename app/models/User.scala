package models

case class User(
                 userLoginId: String,
                 currentPassword: String,
                 newPassword: String
                 )
