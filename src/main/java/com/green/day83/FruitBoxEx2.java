package com.green.day83;

import java.util.ArrayList;
import java.util.List;

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitGBoxList = new FruitBox<>();
        FruitBox<Apple> fruitGBoxList2 = new FruitBox<>();
        FruitBox<Grape> fruitGBoxList3 = new FruitBox<>();
        //FruitBox<Toy> fruitGBoxList4 = new FruitBox<>();
    }
}

class FruitBox<T extends Fruit> extends GBoxList<T>{
    List<T> getList() { return list;}
}