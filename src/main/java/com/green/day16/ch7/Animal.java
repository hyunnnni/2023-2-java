package com.green.day16.ch7;

public class Animal {
     public void crying(){
         System.out.println("동물이 운다");
     }
}

class AnimalTest2{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bulldog bulldog = new Bulldog();
        Animal ani = new Animal();

        System.out.println(ani instanceof Bulldog);

        callCrying(dog);
        callCrying(cat);
        callCrying(bulldog);



        /*System.out.println(bulldog instanceof Dog);
        Dog dog2 = bulldog;
        System.out.println(bulldog instanceof Bulldog);
        Bulldog bulldog2 = bulldog;
        System.out.println(bulldog instanceof Animal);
        Animal ani2 = bulldog;

        Animal ani = bulldog;
        System.out.println(ani instanceof Cat);// instanceof는
        // 앞에 뭐가 있는지는 모르겠지만 instanceof 뒤 타입이 형변환이 되냐 안되냐를 묻는 것
        // 앞은 클래스명 뒤는 타입으로 적어야딤
        //상속관계가 아니라 형제관계라 안됨
        //Cat cat2 = (Cat)ani; 에러가 터진다*/


    }
    /*private static void callCrying(Dog dog){
        dog.crying();
    }
    private static void callCrying(Cat cat){
        cat.crying();
    }
    private static void callCrying(Bulldog bulldog){
        bulldog.crying();
    }

    아래처럼 한 번에 작성 가능하다
     */

    private static void callCrying(Animal ani) {
        if(ani instanceof Bulldog ){
            Bulldog bull = (Bulldog)ani;
            bull.jump(); //jump메소드는 static이 아니라서 static메소드인 여기에 데려올 수 없다
            //그래서 객체생성을 하는데 들어오는 타입은 Animal이라 강제형변환을 해서 bull에 넣어주고 Bulldog에 접근해 jump메소드를 데려온다
        }
        ani.crying();
    }
}

class AnimalTest{
    public static void main(String[] args) {
        //1. 부모타입은 자식 객체 주소값을 담을 수 있다.
        Dog d1 = new Bulldog();
        Animal anil = new Bulldog();
        Bulldog bull = (Bulldog)anil;
        Animal anil2 = new Dog();
        Animal anil3 = new Cat();

        //2. 자식타입은 부모 객체 주소값을 담을 수 없다.
        //Bulldog bull = new Dog(); 안된다
        //강제형변환 해도 안된다

        //3.타입은 알고 있는 메소드만 호출할 수 있고 호출이 된다면 객체 기준이다.
        //부모도 알고 자식도 아는 경우 오버라이딩이 된 경우다
        Bulldog bull3 = new Bulldog();
        bull3.crying();//Bulldog부터 탐색해 같은 이름의 메소드를 호출 만약 없다면 상속해준 부모 클래스로 가서 데려온다.
        bull3.jump();

        Dog dog2 = new Bulldog();
        //dog2.jump() Dog가 알고 있는 메소드만 호출 Dog는 Bulldog의 부모클래스이므로 Bulldog의 메소드를 알 수 없다
        dog2.crying();//알고있다면 객체 기준으로 먼저 탐색한다 Animal에 crying메소드가 있으니 dog도 Bulldog도 다 이 메소드를 알고있다
    }
}

class Dog extends Animal{

    @Override
    public void crying(){
        System.out.println("멍! 멍!");
    }
}

class Bulldog extends Dog{

    public void jump(){
        System.out.println("점푸");
    }
    @Override
    public void crying(){
        System.out.println("불독이 왈! 왈!");
    }
}
class Cat extends Animal{
    @Override
    public void crying(){
        System.out.println("야옹 야옹");
    }
}