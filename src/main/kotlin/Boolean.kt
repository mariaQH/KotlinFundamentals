fun main(){
    val isNotChristmas = false
    val isChristmas = true

    //Negation
    println(!isNotChristmas)
    println(!isChristmas)

    //Logical AND and OR
    val t = true
    val f = false

    // true AND true
    println("t.and(t): "+t.and(t))
    // true

    // true AND false
    println("t.and(f): "+t.and(f))
    // false

    // false AND true
    println("f.and(t): "+f.and(t))
    // false

    // false AND false
    println("f.and(f): "+f.and(f))
    // false

    // true OR true
    println("t.or(t): "+t.or(t))
    // true

    // true OR false
    println("t.or(f): "+t.or(f))
    // true

    // false OR true
    println("f.or(t): "+f.or(t))
    // true

    // false OR false
    println("f.or(f): "+f.or(f))
    // false

    // NOT true
    println("not(t): "+t.not())
    // false

    // NOT false
    println("not(f): "+f.not())
    // true

    //XOR Operators
    // true XOR true
    println("t.xor(t): "+t.xor(t))
    // false

    // true XOR false
    println("t.xor(f): "+t.xor(f))
    // true

    // false XOR true
    println("f.xor(t): "+f.xor(t))
    // true

    // false XOR false
    println("f.xor(f): "+f.xor(f))
    // false
}