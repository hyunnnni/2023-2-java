package com.green.day68.ch14;

@FunctionalInterface //람다식으로 이용하기 전에는 메소드가 두 개 이상이면 안된다. 한 개만 있는지 검증하기 위한 애노테이션
interface Myfunction{
    void run();//(int i) 일 때 람다식 () 생략가능하며 i로만 적어도 됨 타입은 파라미터가 알고 있기 때문에
}
public class LambdaEx1 {
    public static void main(String[] args) {//인터페이스 이용법 3가지

        Myfunction mf0 = () -> { System.out.println("mf0 - run !!");};//람다식 == 자바스크립트(애로우펑션)
        //현재 메소드가 하나만 있기 때문에 따로 run을 지칭하지 않고 오버라이딩이 가능
        //() 는 파라미터가 만약 하나라면 생략이 가능하다
        //{} 는 한 문장일 때는 생략가능 여러 줄은 생략 불가능 ; 기준
        // 아래의 문장을 다 줄인 것이 람다식 간단하게 사용할 수 있어 편하기에 사용한다

        Myfunction mf1 = new Myfunction() {//implement한 것 익명클래스 1회용 한 번 사용하면 없어짐
            //그때그때 쓰기 때문에 내용 변경이 가능
            @Override
            public void run() {
                System.out.println("fm2 - run !! ");
            }
        };

        Myfunction mf2 = new MyFunctionClass();// 위와 같은 내용인데 계속 사용이 가능함
        //대신 이름 고민과 새로운 내용을 만들고 싶을지 새클래스를 만들어야함
    }
}

class MyFunctionClass implements Myfunction{
    public void run(){
        System.out.println("class name - run !! ");
    }
}