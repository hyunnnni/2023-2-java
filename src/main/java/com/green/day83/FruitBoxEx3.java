package com.green.day83;

public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitGBoxList = new FruitBox<>();
        fruitGBoxList.add(new Apple());
        fruitGBoxList.add(new Apple());
        fruitGBoxList.add(new Grape());

        Juice j1 = Juicer.makeJuice(fruitGBoxList);
        System.out.println("j1 : " + j1);

        FruitBox<Fruit> AppleGBoxList = new FruitBox<>();
        fruitGBoxList.add(new Apple());
        fruitGBoxList.add(new Apple());

        Juice j2 = Juicer.makeJuice(AppleGBoxList);
        System.out.println("j2 :" + j2);

        /*FruitBox<Toy> toyFruitList = new FruitBox();
        toyFruitList.add(new Toy());
        toyFruitList.add(new Toy());

        Juice j3 = Juicer.makeJuice(toyFruitList);
        System.out.println("j3 : " + j3);*/
    }
}

class Juice{
    private String name;

    Juice(String name){
        this.name = name + "Juice";
    }
    public String toString(){
        return this.name;
    }
}

class Juicer{//제네릭은 컴파일 시 타입이 정해지고 실행이 될 때 지정이 되는건데 스태틱은 따로 올라가야하기에
    //제네릭으로 스태틱 타입을 지정할 수 없다
    static Juice makeJuice(FruitBox<? extends Fruit> box){//그래서 스태틱은 단독으로 사용하게 ? : 와일드카드를 사용한다
        //그리고 extends를 걸어서 상한을 걸어준다
        //와일드 카드는 super 사용 가능 부모의 객체까지 담아줄 수 있다
        String temp = "";
        for(Fruit f : box.getList()){
            temp += f +" ";
        }
        return new Juice(temp);
    }

}