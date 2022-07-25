fun main() {
    var num1 = 10;
    var num2 = 20;
    var sum = num1 + num2;
    println("$num1 + $num2 = $sum")

    num1 = 1234;

    // 변수를 선언할 때 초기화 없이 강제 형 지정하여 선언하기
    // Kotlin에서는 이 방법을 권장하지 않는다.
    var num3 : Int = 0;

    var nation : String
    nation = "대한민국"

    // final, const 상수형 변수 선언
    val korea = "대한민국"
    //오류 korea = "republic of Korea"

    println("$korea 은 republic of korea")

    for(i in 0 .. 10 step(2)){
        print("${i}값 ")
    }
    for(i in 10 downTo 0 step(2)){
        println("$i")
    }
    var bYes = true
    if(bYes) {
        println("$bYes 는 참")
    } else {
        println("$bYes 는 거짓")
    }
    // 정수형 요소를 포함하는 배열 선언
    val array1 = intArrayOf(10, 20, 30, 40, 50, 60);
    for(arr in array1){
        println("$arr")
    }
    for(arr in array1.reversed()){
        println("$arr")
    }
    // 0 부터 배열의 개수 -1 까지 == until
    for(i in 0 until array1.count()){
        println("${array1[i]}")
    }

    var num4 = 1;
    while(num4 < 10){
        print("${num4++}, ")
    }
}