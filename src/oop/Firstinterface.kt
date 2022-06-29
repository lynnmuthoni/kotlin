package oop

fun main(args: Array<String>) {
    var firstSchool= School()
    firstSchool.motto()
        println("Hello, this is our motto")

}

interface  Firstinterface {
    var age:Int
    fun login():String
    fun motto(){
        println("hello, This is our motto")
    }
}

class School():Firstinterface{
    override var age: Int=100
    override fun login(): String {
        var loginStatement = "Yeah, I can login"
        return loginStatement
    }

}