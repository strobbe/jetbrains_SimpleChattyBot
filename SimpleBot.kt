package bot

import java.util.Scanner

val scanner = Scanner(System.`in`) // Do not change this line

fun main() {
    greet("InnuendoBot", "2009") // change it as you need
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is $assistantName.")
    println("I was created in $birthYear.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = scanner.nextLine()
    println("What a great name you have, $name!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Say me remainders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = scanner.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test() {
    println("Let's test your programming knowledge.")
    println("What language are we studying?")
    println("1. Ruby")
    println("2. Java")
    println("3. C++")
    println("4. Kotlin")

    val answer = 4

    for (i in 1..1000) {
        // Would rather use a while loop, but that hasn't been covered yet.
        if (scanner.nextInt() == answer) return else println("Please, try again.")
    }
}

fun end() {
    println("Congratulations, have a nice day!") // Do not change this text
}
