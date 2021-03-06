// KJS_WITH_FULL_RUNTIME
// TODO: muted automatically, investigate should it be ran for JVM_IR or not
// IGNORE_BACKEND: JVM_IR

// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME


const val MinI = Int.MIN_VALUE
const val MinL = Long.MIN_VALUE
const val MinUI = UInt.MIN_VALUE
const val MinUL = ULong.MIN_VALUE

fun box(): String {
    val list1 = ArrayList<Int>()
    for (i in 0..MinI step 3) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<Int>()) {
        return "Wrong elements for 0..MinI step 3: $list1"
    }

    val list2 = ArrayList<Long>()
    for (i in 0L..MinL step 3) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<Long>()) {
        return "Wrong elements for 0L..MinL step 3: $list2"
    }

    val list3 = ArrayList<UInt>()
    for (i in 1u..MinUI step 3) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<UInt>()) {
        return "Wrong elements for 1u..MinUI step 3: $list3"
    }

    val list4 = ArrayList<ULong>()
    for (i in 1uL..MinUL step 3) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<ULong>()) {
        return "Wrong elements for 1uL..MinUL step 3: $list4"
    }

    return "OK"
}
