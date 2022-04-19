package alipour.adapter

/**
 * @author Paniz Alipour
 */
class MovableAdapterImpl(var luxuaryCars: Movable?) : MovableAdapter {


    override fun getSpeed(): Double? {
        return luxuaryCars?.getSpeed()?.let { convertMPHtoKMPH(it) }
    }

    private fun convertMPHtoKMPH(mph:Double):Double?{
        return mph * 1.60934
    }
}