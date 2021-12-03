fun main(){
    //Arithmetic Operators
    val numByte = Byte.MAX_VALUE
    val numShort = Short.MAX_VALUE
    val numInteger = Integer.MAX_VALUE
    val numFloat = Float.MAX_VALUE
    val numDouble = Double.MAX_VALUE

    var mulResult = numByte * numShort
    println(mulResult::class.simpleName)

    mulResult = numByte + numInteger
    println(mulResult::class.simpleName)

    var numByteN = 7
    val numShortN = 16
    val numIntegerN = 32
    val numLongN = 64
    val numFloatN = 1.23F
    val numDoubleN = 3.00

    var result = numByteN + numShortN
    println("$numByteN + $numShortN = $result")

    result = numShortN % numByteN
    println("$numShortN % $numByteN = $result")

    result = numShortN / numByteN
    println("$numShortN / $numByteN = $result")

    result = numShortN * numByteN
    println("$numShortN * $numByteN = $result")

    result = numShortN - numByteN
    println("$numShortN - $numByteN = $result")

    //Incrementing and Decrementing
    println("Increment: ${numByteN++}")
    println("Decrement: ${numByteN--}")

    //Augmented Assignment Operator
    var i = 1
    var j = 10
    i = i + 1
    println("Augmented Assignment operator: $i")

    i += 5
    println("Augmented Assignment operator for addition: $i")

    i *= 3
    println("Augmented Assignment operator for multiplication: $i")

    j /= 2
    println("Augmented Assignment operator for division: $j")

    j -= 5
    println("Augmented Assignment operator for subtraction: $j")

    j %= 3
    println("Augmented Assignment operator for modulo: $j")

    var dad = 55
    var son = 30
    println((dad - son * 2))
    println(Math.abs(dad - son * 2))

    val number = 1705

    if(number % 100 == 0){
        println(number/100)
    }else{
        println(number /100 + 1)
    }



    //Logical Operators
    //Comparison Operators
    //Assignment Operators
    //Unary Operators
    //Boolean Operators
}