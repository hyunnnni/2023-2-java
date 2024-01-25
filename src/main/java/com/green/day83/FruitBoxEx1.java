package com.green.day83;

import java.util.ArrayList;
import java.util.List;

public class FruitBoxEx1 {
    public static void main(String[] args) {
        GBoxList<Fruit> fruitGBoxList = new GBoxList<>();
        fruitGBoxList.add(new Fruit());
        fruitGBoxList.add(new Apple());
        fruitGBoxList.add(new Grape());//상속관계인 클래스까진 다 들어가게 된다.
        System.out.println(fruitGBoxList);

        GBoxList<Apple> appleGBoxList = new GBoxList<>();
        fruitGBoxList.add(new Apple());

        GBoxList<Toy> toyGBoxList = new GBoxList<>();
        toyGBoxList.add(new Toy());


    }
}
class Fruit {
    public String toString(){
        return "fruit";
    }
}

class Apple extends Fruit {
    public String toString(){
        return "apple";
    }
}

class Grape extends Fruit {
    public String toString(){
        return "grape";
    }
}

class Toy {
    public String toString(){
        return "Toy";
    }
}
class GBoxList<T>{
    protected List<T>list = new ArrayList<>();

    public void add(T item){
        list.add(item);
    }
    T get(int idx){
        return list.get(idx);
    }
    int size(){
        return list.size();
    }

    @Override
    public String toString(){
        return list.toString();
    }
}