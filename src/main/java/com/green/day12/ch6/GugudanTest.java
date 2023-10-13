package com.green.day12.ch6;

public class GugudanTest {
    public static void main(String[] args) {
        Gugudan gugudan = new Gugudan();
        gugudan.print(4);//4단 구구단 콘솔에 출력
        gugudan.print(5);

        gugudan.printfromTo(4, 7);//4~7단 출력
        gugudan.printfromTo(3, 4);//3~4단 출력

        gugudan.printfromTo(3, 6,"----");//3~6단 출력


    }
}
