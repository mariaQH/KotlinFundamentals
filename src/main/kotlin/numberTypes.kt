fun main(){
    val numberByte: Byte = 1
    println(numberByte::class.simpleName)

    val numberShort = 12345678
    println(numberShort::class.simpleName)

    val integer = 22
    println(integer::class.simpleName)

    val numberLong = 8000000000000000000
    println(numberLong::class.simpleName)

    val numberFloat = 5.045F
    println(numberFloat::class.simpleName)

    val numberDouble = 3.00
    println(numberDouble::class.simpleName)

    //TYPE CASTING ACTIVITY
    //Converting Double to Float
    println(numberDouble.toFloat())
    //Int to Double
    println(integer.toDouble())
    //Byte to Short
    println(numberByte.toShort())
    //Int to Long
    println(integer.toLong())
    println(numberLong.toFloat())

}