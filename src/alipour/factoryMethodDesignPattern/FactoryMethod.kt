package alipour.factoryMethodDesignPattern

/**
 * @author Paniz Alipour
 */
class FactoryMethod {

    fun getPolygon(numberOfSides: Int): Polygon? {

        return when (numberOfSides) {
            3 -> Triangle()
            4 -> Square()
            5 -> Pentagon()
            7 -> Heptagon()
            8 -> Octagon()
            else -> null
        }
    }
}