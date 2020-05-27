package goodcode.safety.item4

interface Car
class SkodaOctavia: Car
class AudiA6: Car

val DEFULT_CAR: Car = SkodaOctavia()

interface CarFactory {
    fun produceCar()= DEFULT_CAR
}

class AudiFactory: CarFactory {
    override fun produceCar(): Car {
        return AudiA6()
    }
}
