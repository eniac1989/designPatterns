package alipour

import alipour.builderPattern.User
import alipour.factoryMethodDesignPattern.FactoryMethod

fun main() {

    val user = User.UserBuilder("Paniz", "Alipour")
        .age(30)
        .address("Ekbatan")
        .phone("223344")
        .build()

    System.out.println(user)

    val polygonFactory = FactoryMethod()
    val polygon = polygonFactory.getPolygon(8)
    polygon?.getType()

}