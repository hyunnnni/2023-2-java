package com.green.day19.ch7.Starcraft;


import java.util.ArrayList;
import java.util.List;

class StarcraftGame{
    public static void main(String[] args) {
        Unit unit = new Marine();
        unit.move(10, 20);
        Unit unit1 = new Tank();
        unit1.move(30, 40);

        List<Unit> units = new ArrayList<>();
        units.add(unit);
        units.add(unit1);
        units.add(new Marine());
    }
}

class StarcraftGame2{
    public static void main(String[] args) {
        List<Unit> units = new ArrayList<>();
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Tank());
        units.add(new Tank());


        Marine m1 = new Marine();//이렇게 객체생성을 해서 데려와도 되고
        //같은 클래스 안에 만들어도 되고 앞에 아무것도 없다면 static메소드이다
        //Unit클래스에서 만들어서 import해도 된다
        m1.moveAll(units,30, 50);

        moveAll2(units,30, 50);

        Unit unit1 = units.get(units.size()-1);

        Tank t1 = (Tank)unit1;
        t1.changeMode();

    }
    public static void moveAll2(List<Unit> units,int x, int y){
        //선생님이 하신 거,,,짱이다,,,
        for(Unit unit : units){
            unit.move(x,y);
        }
    }

}
public abstract class Unit {
    protected int x;
    protected int y;

    public abstract void move(int x, int y);//static을 붙일 수 없다 붙이면 메모리에 바로 올라가는데
    //추상메소드는 내용이 없으니 붙일 수 없다

    public void changeMode(){
        System.out.println("dd");
    }
    public void stop(){
        System.out.println("현재 위치에 정지");
    }

    public void setX(int x){//private의 값을 바꿀 수 있는 방법은 생성자와 setter가 있는데
      //메소드에서는 생성자를 호출할 수가 없으니 setter를 사용해서 값을 바꿔야한다.
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

}

class Marine extends Unit{
    @Override
    public void move(int x, int y){
        setX(x);
        this.y = y; //둘 중 선택해서 값을 넣어주면 된다.
        System.out.printf("마린이 좌표 X: %d, Y: %d로 이동\n", x, y);
    }

    public void moveAll(List<Unit> units, int x, int y){

        for (int i = 0; i < units.size(); i++) {
            units.get(i).move(x,y);

        }
    }
    public void steamPack(){
        System.out.println("스팀팩 시전!!");
    }
}

class Tank extends Unit{
    private boolean siegeMode;

    @Override
    public void move(int x, int y){
        this.x = x;
        this.y = y;
        System.out.printf("탱크 좌표 X: %d, Y: %d로 이동\n", x, y);
    }

    // siegeMode = false일 때 "시즈모드가 풀렸습니다"가 나오고 값이 true로 바뀌어야한다
    // siegeMode = true일 때 "시즈모드가 되었습니다"가 나오고 값이 false로 바뀌어야한다
    //그리고 메소드가 호출될 때마다 그 값이 바뀌어야 한다

    public void changeMode(){
        siegeMode = !(siegeMode);//토글

        System.out.println(siegeMode ? "시즈모드가 되었습니다":"시즈모드가 풀렸습니다.");

    }
}
