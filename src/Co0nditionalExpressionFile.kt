fun main(args: Array<String>) {
    var marks=70
    var results=
    if(marks<50){
       "E"
    }else if(marks<60){
        "D"
    }else if(marks<70){
        "C"
    }else if (marks<80){
        "B"
    }else {
       "A"
    }
    println(results)
    var bettingNumber = 0
    var bettingResult = when (bettingNumber){
        1->{
            "Oops you've lost"
        }
        2->{
            "Oops you've lost"
        }
        3->{
            "Oops you've lost"
        }
        else->{
            "Please enter a number from 1-3 to bet"
        }
    }
    println(bettingResult)
}