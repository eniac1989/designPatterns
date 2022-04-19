package alipour

import alipour.builderPattern.User

fun main() {

    val user= User.UserBuilder("Paniz","Alipour")
        .age(30)
        .address("Ekbatan")
        .phone("223344")
        .build()

    System.out.println(user)


}