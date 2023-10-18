package com.green.day15.ch7;

public class Parent {//모든 객체는 오브젝트를 상속 받는다. 오브젝트는 최상위 객체 그래서 클래스명 뒤 extends Object가 생략되어있다
    //그래서 모든 클래스는 오브젝트에 있는 기본 메소드들을 사용할 수 있다
    public Parent(){
        super(); //Object를 지칭 부모의 기본 생성자를 호출하는 것
        //그래서 ()에 빨간 줄이 뜬다거나 자식 클래스명에 전체 빨간 줄이 뜨면 기본생성자가 없다는 것이다.
        //그럼 부모 클래스에 기본생성자를 만들어주거나 자식 클래스에서 부모 클래스에 있는 다른 생성자와 타입을 맞춰 적어준다.
    }
    int age;

}

class Child extends Parent {//int age가 있는 class Parent를 상속받았다
    void play(){
        System.out.println("놀쟈~");
    }
}
class Child2 extends Parent {//상속받아서 사용도 할 수 있다 개수는 상관없다 여러 개 할 수 있다. extends = 확장 (상속받을 수 있는
    //parent를 child2로 확장하겠다 수직관계
    //같은 class를 상속받았지만 Child와 Child2는 전혀 다르다
    //Parent 뒤에 Child 적는 다중상속은 안된다 다른 언어 C++같은 경우에는 가능하다

    public Child2(){
        super();//자동으로 생성되어있고 생략되어있다. 바로 위의 부모를 지칭한다. 부모의 주소값을 저장한다 상수라 변경안됨
        //this는 자기 자신의 주소값을 저장하는 것
        age = 100;//뭔갈 하고 싶을 때 super를 무조건 먼저 맨 위에 적어야 한다
    }
    void jump(){
        System.out.printf("%d살의 아이가 점프를 하였다.", age);
    }
}

class Main {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.age = 10; //Child가 parent를 상속받아서 parent안에 int age를 이용할 수 있다.
        c1.play();

        Parent p = new Child();
        //Child2 c22 = c1; 위는 가능하나 이거 안된다. 부모 클래스타입은 자식 클래스타입의 주소값을 넣을 수 있지만 그 반대는 또 안된다.
        //다양성
        Child2 c2 = new Child2();
        c2.age = 7;//원본이 건드려지진 않는다
        c2.jump();
    }
}
