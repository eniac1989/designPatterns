package alipour

import alipour.adapter.BugattiVeyron
import alipour.adapter.MovableAdapterImpl
import alipour.builderPattern.User
import alipour.factoryMethodDesignPattern.FactoryMethod
import alipour.singleton.Singleton

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

    val singleton = Singleton.getInstance("Hi")
    singleton?.getOutput()

    val bugattiVeyron = BugattiVeyron()
    val movableAdapter = MovableAdapterImpl(bugattiVeyron)
    println("Speed in KMP: "+movableAdapter.getSpeed())
}