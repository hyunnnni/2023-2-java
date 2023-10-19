package com.green.day16.ch7;

public class Singleton {//p.351
    private Singleton(){}

    private static Singleton singleton; //Singleton의 주소값을 넣을 수 있는 singleton이란 변수선언 멤버필드다
    //근데 아래 메소드에 static이 있으니 이 멤버필드를 쓸려면 이 멤버필드에도 static을 적어 메모리로 먼저 올려준다.
    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}

class SingletonTest{
    public static void main(String[] args){
        //Singleton s1 = new Singleton(); 생성자 앞에 private를 붙여서 안됨
        Singleton s1 = Singleton.getInstance();//처음 메소드 사용시 생성됐던 주소값이 대입된다 이때는 singleton이 메소드에서 null이었으니깐
        //if문에 걸러져서 새로운 주소값이 생성되어 대입되고 그 값이 리턴되어 s1에 대입된 것이다.
        Singleton s2 = Singleton.getInstance();//근데 두번째 생성이 될 때 이미 singleton에는 주소값 하나가 들어가 있으니 if문에 걸러지지
        //않는다. 그래서 if문은 건너뛰고 맨 처음 생성되었던 주소값을 가지고 리턴 후 s2에 대입된다.
    }
}