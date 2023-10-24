package com.green.day14.ch6;

import javax.xml.crypto.Data;

public class Data1 {
        int value;
        int value2;
        int value3;
        private int aaa ; //앞에 private을 붙이면 단순하게 접근이 안된다 data1.aaa=3이 안된다
    //그리고 같은 클래스 안에서만 사용할 수 있다 메소드 앞에도 붙일 수 있다

        public Data1(){ //기본생성자
            //생성자를 단 하나도 안 적을 시 컴파일러가 자동으로 작성해준다
            //생성자가 하나라도 있으면 기본 생산자를 만들어줘야 한다
            //생성자는 리턴타입이 없어서 앞에 아무것도 안써도 된다 리턴타입이 없기 때문에 전부 void라서 void가 생략되어있음
            //다만 앞에 void를 작성하면 메소드로 변한다
            //객체 생성할 때만 하는 메소드
            this(100,200,300); //아래 printMySelf건드는 거 보다 이렇게 하는 게 좋다
            //생성자를 호출해온 것
        }

        public Data1(int a){//생성자도 오버로딩이 가능하다 규칙은 같다
            aaa = 3;
        }

        public Data1(int a, int b, int c){//호출당함
            value = a;
            value2= b;
            value3= c;
        }



        public void printMySelf(){
            Data1 aaa = new Data1();
            aaa.value = 100;
            aaa.value2 = 200;
            aaa.value3 = 300;
            System.out.printf("value :%d, value2 : %d, value3 : %d\n", aaa.value, aaa.value2, aaa.value3);
        }
}

class ConstructorTest{//public 이 아닌 클래스에도 메인 메소드를 만들기 가능
    public static void main(String[] args) {
        Data1 data1 =new Data1();//객체 생성 기본생성자 호출
        data1.value = 10;
        data1.value2 = 20;
        data1.value3 = 30;

        Data1 data1_2 = new Data1(10,20,30); //위의 4줄과 같다 훨씬 줄여쓸 수 있다
        //생성자 호출을 한 것 생성과 동시에 멤버필드를 바꿀 때

        Data1 data1_3 = new Data1();
        data1_3.printMySelf();
    }
}
