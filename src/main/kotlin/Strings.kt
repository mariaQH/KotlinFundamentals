fun main(){
    //Simple string printing
    //Extract, combine, concatenate
    val sentence:String = "Happy Birthday! Justin!"

    //String functions
    println(sentence.get(0))//H
    println(sentence[1])//a
    println(sentence.subSequence(16, sentence.length))//Justin!
    println(sentence.substring(16, sentence.length))//Justin!
    println(sentence.length)//23
    println(sentence.plus(" God Bless!"))//Happy Birthday! Justin! God Bless!
    println(sentence.drop(6))//Birthday! Justin!
    println(sentence.dropLast(17))//Happy
    println(sentence.contains("Happy"))//True
    println(sentence.reversed())//True
    println(sentence.lowercase())
    println(sentence.uppercase())

    if(sentence == "Happy Birthday! Justin!"){
        println("Strings are the same")
    }
    else{
        println("String are not the same")
    }

    //String templates (String concatenation)
    val firstName = "Maria Nikki"
    val middleName = "Hacar"
    val lastName = "Quintos"

    println("My Name is: $firstName $middleName $lastName")
    println("My Name is: $firstName ${middleName.get(0)}. $lastName")

    val myAge = 22
    println("My age 10 years from now is: ${myAge+10}")


    //Practice
    val nickName = "nikki"
    val product = 100
    val amount = 10

    println("Hey ${nickName.uppercase().get(0) + nickName.substring(1)} " +
            "pay me ${product*amount} for the $product products you purchased")
    //Hey Nikki pay me 1000 for the 100 products you purchased


    val name = "Nikki is my name"
    val number = 123
    println(number.toString())
    println(name.split(" ").reversed().joinToString(" "))








}