package com.green.day14.ch6;

public class Car {
    String color;
    String gearType; //변속기 종류 auto(자동, manual(수동
    int door;//문의 개수

   /* public Car(){//기본생성자 다른 생성자를 만들 때 필수적으로 만들어야 됨
        this("White");
    }

    public Car(String b){
        color = b;
        gearType = "auto";
        door = 4;
    }*/
    //이렇게 또는 아래처럼 사용해도 된다

    public Car(){//3. 2의 생성자를 데려와서 컬러만 바꿔준다 car1으로 빠진다
        this ("white");
    }
    public Car(String color){//2.여기로 생성자를 불러와서 값을 넣고 car2로 빠지거나
        this(color, "auto", 4);
    }
    public Car(String color,String gearType, int door){//1.여기서 만든 생성자를
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    public void printMySelf(){//static을 쓰게 되면 메소드, 인스턴스 변수를 쓸 수 없기때문에
        System.out.printf("color = %s, gearType = %s, door = %d\n", color ,gearType,door );//인스턴스 변수
        //같은 클래스 안에 있으니 앞에 this.이 생략 되어있음 바로 데려올 수 있다
    }
}

class CarTest{
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("blue");//생성할 때만 호출해옴

        car1.printMySelf();
        car2.printMySelf();
    }
}
