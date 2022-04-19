package alipour.singleton

class Singleton private constructor(var value: String) {

    init {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000)
        } catch (ex: InterruptedException) {
            ex.printStackTrace()
        }

    }

    companion object {
        private var instance: Singleton? = null

        fun getInstance(value: String): Singleton? {
            if (instance == null) {
                instance = Singleton(value)
            }
            return instance
        }
    }

    fun getOutput(){
        println(value)
    }
}