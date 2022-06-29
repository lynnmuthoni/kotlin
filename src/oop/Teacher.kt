package oop
// Inheritance
fun main(args: Array<String>) {
    var firstStudent= Student("Faith",100)
    firstStudent.viewResults()

    var firstBoardmember=BoardMember("Linet",105)
    firstBoardmember.publishMagazine()
}
open class Teacher(open var name:String,open var age: Int ){
    fun viewResults(){
        println ("Hello $name, you can view results")
    }
    fun publishMagazine(){
        println("Hello $name, you are $age years old and you can publish a magazine")
    }
}
open class Student(name:String, age:Int ):Teacher(name,age){
    fun sitForExams(){
        println("Hello I can sit for exams")
    }
}

class BoardMember(name:String, age:Int):Student(name,age){

}