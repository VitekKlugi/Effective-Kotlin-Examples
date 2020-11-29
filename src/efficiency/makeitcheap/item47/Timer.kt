package efficiency.makeitcheap.item47

//inline class Minutes(val minutes: Int) {
//    fun toMillis(): Millis = Millis(minutes * 60 * 1000)
//}
//
//inline class Millis(val milliseconds: Int)
//
//inline val Int.min
//    get() = Minutes(this)
//
//inline val Int.ms
//    get() = Millis(this)
//
//val hour = 60.min

interface User {
    fun decideAboutTime(): Int // Minutes
    fun wakeUp()
}

interface Timer {
    fun callAfter(timeMillis: Int /*Millis*/, callback: () -> Unit)
}

fun setUpUserWakeUpUser(user: User, timer: Timer) {
    val time: Int /*Minutes*/ = user.decideAboutTime()
    timer.callAfter(time) {
        user.wakeUp()
    }
}

