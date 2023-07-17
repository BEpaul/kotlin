fun main(args: Array<String>) {

    // 3. String template
//    val name = "Joyce"
//    println("my name is $name")
//    println("is this true? ${1==0}")

//    array()
//    forAndWhile()
    nullcheck()
}

// 1. 함수
fun helloWorld() : Unit {
    println("Hello World!")
}

fun add(a: Int, b: Int): Int {
    return a+b
}

// 2. val vs var
fun hi() {
    val a : Int = 10
    var b : Int = 9
//    a = 100
    b = 100
    val c = 100
    var e : Int
    e = 11

}

// 4. 조건식
fun maxBy (a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxBy2 (a: Int, b: Int) = if (a>b) a else b

fun checkNum (score: Int) {
    when (score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
        else -> println("I don't know")
    }

    var b = when(score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    when (score) {
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

// Expression vs Statement

// Array vs List
// Array

// List -> 1. List 2. MutableList
fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)
    val array2 = arrayOf(1, "d", 3.4f)
    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    println(arrayList)

    array[0] = 3

}

// 6. For / While

fun forAndWhile() {
    val students = arrayListOf("joyce", "james", "jenny", "hyuk")
    for (name in students) {
        println(name)
    }

    for((index, name) in students.withIndex()) {
        println("${index+1}번째 학생: ${name}")
    }

    var sum: Int = 0
    for (i in 1..10 step 2) {
        sum += i
    }

    for (i in 10 downTo 1) {
        sum += i
    }

    for (i in 1 until 100) {
        sum += i
    }
    println(sum)

    var index = 0
    while (index < 10) {
        println("current index: ${index}")
        index++
    }
}

// 7. Nullable / NonNull
fun nullcheck() {
    // NPE: Null Pointer Exception
    var name : String = "joyce"
    var nullName : String? = null

    var nameInUpperCase = name.toUpperCase()
    var nullNameInUpperCase = nullName?.toUpperCase()

    // ?:
    val lastName : String? = "Kim"
    val fullName : String = name + " " + (lastName?: "NO lastName")

    println(fullName)

    // !!

}

fun ignoreNulls(str: String?) {
    val mNotNull : String = str!!
    val upper = mNotNull.toUpperCase()

    val email : String? = "rhrlwld@gmail.com"
    email?.let {
        println("my email is ${email}")
    }
}