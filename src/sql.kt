fun main(args: Array<String>) {

    var number: Int
    var sum: Int = 0

    for (i in 1..6) {
        print("Enter an integer: ")
        number = readln()!!.toInt()
        sum =   sum + number
        print("somme : $sum  ")
    }
}
