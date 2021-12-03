import java.lang.IllegalArgumentException

fun main(){
//    try {
//        var a = 0
//        var x = 7 / a
//
//        val v = "HI THERE"
//        v.toInt()
//
//    } catch (e: ArithmeticException) {
//        println("Arthimetic Exception: " + e.message)
//    } catch (e: Exception) {
//        println(e.message)
//    } finally {
//        println("with errors")
//    }
//
//    //THROW
//    try {
//        println("Before exception")
//        throw Exception("Something went wrong here")
//        println("After exception")
//    }
//    catch(e: Exception){
//        println(e)
//
//    }
//    finally{
//        println("You can't ignore me")
//    }
//
//    val greet = "Hi there"
//
//    if(greet.length < 10){
//        throw IllegalArgumentException("Invalid String")
//    }

    try{
        val exmp = "12345"
        val cast = exmp.toDouble()
        println("Type Casting: $cast")
    }catch (e: Exception){
        println(e.message)
    }

}