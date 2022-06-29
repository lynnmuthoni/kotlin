fun main(args: Array<String>) {
    motto()
    userVerification("kingwanyama", "kingwanyama@gmail.com")
    average(34.0,78,78.0f)
   println (addition(99,78.0))
    login("king")
    login("kingwanyama@gmail.com","king@123 ")
}
fun motto(){
    println("Hello, this is our motto")
}

fun userVerification(username:String, email:String){
    println("Your username is $username and your email is $email")
}

fun average (x:Double, y:Int, z:Float){
    var result = (x+y+z)/3.0
    println("Hello there your average is $result" )
}
fun addition(x:Int, y:Double):Double{
    var answer =x+y
    return answer
}
fun login(name:String){
    println("Hello, your name is $name")
}
fun login(email:String,password:String){
    println("Hello, your email is $email and your password is $password")
}