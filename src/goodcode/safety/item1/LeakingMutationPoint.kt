package goodcode.safety.item1

data class User(val name: String)

class UserRepository {
    private val storedUsers: MutableMap<Int, User> =
        mutableMapOf()

    fun loadAll(): MutableMap<Int, User> { // leaking mutation point
        return storedUsers
    }
}

fun main() {
    val userRepository = UserRepository()
    userRepository.loadAll()[1] = User("Honza")
    print(userRepository.loadAll())
}