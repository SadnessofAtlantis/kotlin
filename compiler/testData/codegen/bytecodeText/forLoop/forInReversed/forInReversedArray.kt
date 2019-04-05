// IGNORE_BACKEND: JVM
// Non-IR backend does not optimize for-loop over reversed arrays.
import kotlin.test.*

fun box(): String {
    val arr = intArrayOf(1, 2, 3, 4)
    var sum = 0
    for (i in arr.reversed()) {
        sum = sum * 10 + i
    }
    assertEquals(4321, sum)

    return "OK"
}

// 0 reversed
// 0 iterator
