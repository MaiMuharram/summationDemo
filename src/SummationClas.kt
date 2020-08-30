
fun main( ){
    var num1=10
    var num2=20
    var summ= SumTwoNumbers(num1,num2)
    println("$num1 + $num2 = ${summ.sum}")
}

  class SumTwoNumbers ( num1 : Int, num2 : Int){
     var sum:Int
    init{

        sum = num1 + num2;

    }


}