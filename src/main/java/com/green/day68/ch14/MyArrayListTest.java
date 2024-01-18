package com.green.day68.ch14;

import com.green.day18.ch7.MyArrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(15);
        list.add(30);
        list.add(35);

        list.forEach(i -> System.out.println("i : " + i));
        System.out.println("---------------");
        list.removeIf2((i) -> i%2 == 0);
        list.forEach(i -> System.out.println("i : " + i));
        System.out.println("-----------------");
    }
}
