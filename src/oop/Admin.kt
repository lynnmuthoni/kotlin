package oop

fun main(args: Array<String>) {
    var firstAdmin= Admin("king",566678.00, "king@gmail.com")
    firstAdmin.registerUser()
    println(firstAdmin.salary)
    firstAdmin.setIdNumber("123454")
    println(firstAdmin.getIdNumber())
}

 class Admin {

    var name:String
    var salary:Double
    var email:String
    private var phoneNumber: String = ""
   private var idNumber:String=""

    constructor(name:String, salary:Double, email:String){
        this.name=name
        this.salary=salary
        this.email =email
    }

    fun registerUser(){
        println("Yeah I can register a user")
    }

    fun suspendEmployee(){
        println("Yeah i can suspend an employee")
    }
    fun setPhoneNumber(phoneNumber:String){
        this.phoneNumber=phoneNumber
    }
    fun getPhoneNumber():String{
        return this.phoneNumber
    }

    fun setIdNumber(IdNumber:String){
        this.idNumber= IdNumber
    }
    fun getIdNumber():String{
        return this.idNumber
    }

}