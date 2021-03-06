package oop

fun main(args: Array<String>) {
    var firstUser =User("King", "king@gmail.com","123",
        "123" )
    firstUser.register()
    firstUser.login()

    var secondUser=User("eMobilis","emobilis@gmail.com",
        "12345","12345")
    secondUser.login()

    var thirdUser= User("xyz","emobili@gmail.com","123454",
        "123")
}

class User {

    //These are the user properties
    var name:String
    var email:String
    var password:String
    var confirmPassword:String

    //This is the constructor
    constructor(name: String,email :String, password:String, confirmPassword: String){
        this.name =name
        this.email =email
        this.password =password
        this.confirmPassword =confirmPassword


    }

    fun register(){
        if (!password.equals(confirmPassword)){
            println("Passwords don't match")
        }else{
            println("user registered successfully")
        }
    }
    fun login(){
        if(email.equals("emobilis@gmail.com")&& password.equals("12345")){
            println("Login successful")
        }else{
            println("Login failed")
        }
    }
}