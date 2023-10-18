package com.green.day14.ch6;

public class Car2 { //초기화 방법에 대한 설명
    String color="gg";//1.명시자 이거도 실행됐다가
    String gearType;
    int door;
    {
        color = "ggg";
    }//2.초기화 블록 이건 무조건 객체생성때마다 계속 실행된다

    public void printMySelf(){
        System.out.printf("color = %s, gearType = %s, door = %d\n", color ,gearType,door );
    }

    public Car2(){

    }
    public Car2(Car2 c1){//3.생성자로 인한 초기화 마지막으로 실행됨으로 이게 적용됨
        color = c1.color;
        gearType = c1.gearType;
        door = c1.door;
    }
}

class Car2Test {
    public static void main (String[] args){
        Car2 c1 = new Car2();
        c1.color = "black";
        c1.gearType = "manual";
        c1.door = 5;

        Car2 c2 = new Car2(c1);

        c1.printMySelf();
        c2.printMySelf();
    }
}