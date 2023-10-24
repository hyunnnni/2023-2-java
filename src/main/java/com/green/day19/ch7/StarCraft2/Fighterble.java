package com.green.day19.ch7.StarCraft2;

public interface Fighterble extends Movable, Attackable { //interface는 다중 상속이 가능하다
    //구현부가 없어서 다중상속을 해도 문제가 안된다 그래서 다중상속이 가능하다

}

interface Movable {
    void move (int x, int y);
}

interface Attackable{
    void attack(Unit u);
}

class Unit{
    private int currentHp;
    private int x;
    private int y;
}

class Fighter extends Unit implements Fighterble{ //따로따로 Fighter에 상속한다 Fighter도 다중상속을 받은거다

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void attack(Unit u) {

    }
}
class FighterTest{
    public static void main(String[] args) {
        Movable movable = new Fighter();
        movable.move(10,20);

        Fighter fighter = (Fighter) movable;
        fighter.attack(null);

        Attackable attackable = (Attackable) movable;
        attackable.attack(null);
        //두 클래스 모두 attack이란 메소드를 가지고 있으니 어떤걸로 형변환해도 메소드를 호출할 수 있다.


    }
}