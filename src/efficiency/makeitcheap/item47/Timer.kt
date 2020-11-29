package efficiency.makeitcheap.item47

//inline class Minutes(val minutes: Int) {
//    fun toMillis(): Millis = Millis(minutes * 60 * 1000)
//}
//
//inline class Millis(val milliseconds: Int)

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