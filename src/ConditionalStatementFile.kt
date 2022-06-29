fun main(args: Array<String>) {
    var age=18
    if (age<18){
        println("Go home")
    }else{
        println("welcome to the party")
    }

    //grading system
    var marks=80

    if(marks<24){
        println("E")
    }else if(marks<50){
        println("D")
    }else if(marks<60){
        println("C")
    }else if (marks<70){
        println("B")
    }else {
        println("A")
    }

    //BETTING SYSTEM
    var bettingNumber=4
    when(bettingNumber){
        1->{
            println("Oops !! You've lost")
        }
        2->{
            println("Oops !! You've lost")
        }
        3->{
            println("Congrats !! You've won")
        }
        4->{
            println("Oops !! You've lost")
        }
        else->{
            println("Please enter a number from 1-4 to bet")
        }
    }

}