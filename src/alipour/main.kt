package alipour

fun main() {

    val user=BuilderPattern.UserBuilder("Paniz","Alipour")
        .age(30)
        .address("Ekbatan")
        .phone("223344")
        .build()

    System.out.println(user)


}