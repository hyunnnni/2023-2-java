package com.green.day19.ch7;

public class AnonymousClassTest {//익명클래스
    public static void main(String[] args) {

        Runnable2 run = new RunrobotImpl();
        Runnable2 run2 = new Runnable2() { //익명클래스 Runnable2를 객체 생성한 게 아니라
            //위의 코드와 같은 내용이다 바로 넣어준 것 //일회성
            @Override
            public void run() {
                System.out.println("하하하");
            }
        };

    }
}

class RunrobotImpl implements Runnable2{//interface 를 상속받은 클래스에는 이름 끝에 Impl을 붙이곤 한다
    @Override
    public void run(){
        System.out.println("로봇이 달린다.");
    }

}

interface Runnable2{
    void run();
}
