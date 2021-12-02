fun main(){
    //Printing String
    val name:String = "Maria Nikki Quintos"
    println(name)
    println("Maria Nikki Quintos")

    println("--------------------------------------")

    //Printing Integer
    val b:Int = 10
    val c: String = "10"
    println("Printing Integer (int) type: " + b)
    println("Printing Integer (String) type: " + c)

    println("--------------------------------------")

    //Printing Character
    val d:Char = 'N'
    println("Printing Character: " + d)

    //Printing Escape characters
    val myString = "Nikki here!\n" //Inserting new line
    println("Insert Tab: Nikki\t") //Insert Tab
    println("Insert Backspace: Nikki\b") //Insert Backspace
    println("Insert double quote: \"Nikki\"") //Insert double quote
    println("Insert Backslash: Nikki\\") //Insert Backslash
    println("Inserting Dollar sign: \$300") //Inserting Dollar sign

    println("--------------------------------------")

    //Variable Declaration
    // Var can be re-use
    //Val cannot be re-use
    var myName = "Nikki"
    println("Printing My name using \"var\": " + myName)
    val mySurname = "Quintos"
    println("Printing My Surname using \"val\": " + mySurname)
    //Re-assigning a value to "var"
    myName = "Maria"
    println("Printing the Re-Assigned value to \"var\": " + myName)

}