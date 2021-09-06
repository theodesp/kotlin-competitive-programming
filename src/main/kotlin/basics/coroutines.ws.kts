import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis


suspend fun longCalc(start: Int): Int {
    delay(1000L)
    return start + 1
}