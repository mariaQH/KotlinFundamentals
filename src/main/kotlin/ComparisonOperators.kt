fun main(){
    val numberOne = 10
    val numberTwo = 100
    val numberThree = 99
    println("10 > 100: ${numberOne > numberTwo}")
    println("10 < 100: ${numberOne < numberTwo}")
    println("10 == 100: ${numberOne == numberTwo}")

    if(numberOne > numberTwo){
        println("One is Greater than Two")
    }
    else{
        println("Two is Greater than One")
    }

    if(numberTwo.and(numberThree) > numberOne){
        println("$numberThree and $numberTwo is greater than $numberOne")
    }
    else{
        println("$numberThree and $numberTwo is less than $numberOne")
    }
}