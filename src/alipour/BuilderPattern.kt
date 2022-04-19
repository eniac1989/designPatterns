package alipour

class BuilderPattern private constructor(builder: UserBuilder) {

    //All getter, and NO setter to provde immutability
    val firstName: String // required
    val lastName: String // required
    val age: Int // optional
    val phone: String? // optional
    val address: String? // optional

    init {
        this.firstName = builder.firstName
        this.lastName = builder.lastName
        this.age = builder.age
        this.phone = builder.phone
        this.address = builder.address
    }

    override fun toString(): String {
        return "User: " + this.firstName + ", " + this.lastName + ", " + this.age + ", " + this.phone + ", " + this.address
    }

    class UserBuilder(internal val firstName: String, internal val lastName: String) {
        internal var age: Int = 0
        internal var phone: String? = null
        internal var address: String? = null

        fun age(age: Int): UserBuilder {
            this.age = age
            return this
        }

        fun phone(phone: String): UserBuilder {
            this.phone = phone
            return this
        }

        fun address(address: String): UserBuilder {
            this.address = address
            return this
        }

        //Return the finally consrcuted User object
        fun build(): BuilderPattern {
            val user = BuilderPattern(this)
            validateUserObject(user)
            return user
        }

        private fun validateUserObject(user: BuilderPattern) {
            //Do some basic validations to check
            //if user object does not break any assumption of system
        }
    }
}
