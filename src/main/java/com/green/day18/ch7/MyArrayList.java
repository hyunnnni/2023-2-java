package com.green.day18.ch7;


import java.util.Arrays;

class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);//[ 10, 20, 30 ]

        list.add(1,40);
        System.out.println(list);//[ 10, 40, 20, 30]





    }
}
public class MyArrayList {
    private int[] arr;

    public MyArrayList(){
        arr = new int[0];
    }

    public void add(int a){
        int[] arr2 = new int[arr.length+1];

        for (int j = 0; j <arr.length; j++) {
           arr2[j] = arr[j];
        }
        arr2[arr.length] = a;
        arr = arr2;
    }

    @Override
    public String toString(){
        if(arr.length == 0){
            return "[]";
        }
            String r = "[" + arr[0];
            for (int i = 1; i < arr.length; i++) {
                r += ", " + arr[i]; //arr[i]의 값이 나온 후 앞의 문자열과 + 되면서 뒤의 값도 문자열로 바뀐다
                //그 후 r에 + 해준다
            }
            r += "]";
            return String.format(r);//그 후 문자열을 리턴해준다

    }

    public void add(int a, int b){//내가 한 거 새치기해서 값을 방에 넣는 거
        int[] arr2 = new int[arr.length+1];


        for (int i = 0; i < arr2.length; i++) {
            if(i == a){
                continue;
            }else if(i > a){
                arr2[i] = arr[i-1];
                continue;
            }
            arr2[i] = arr[i];
        }
        arr2[a] = b;
        arr = arr2;
    }

    /*public void add(int a, int b){//선생님이 하신 거
        int[] arr2 = new int [ arr.length+1];
        arr2[a] = b;
        for (int i = 0; i < arr.length; i++) {
            arr2[i<a ? i :i+1] = arr[i];
        }
        arr= arr2;
    }


    public void add(int a, int b){
        int[] arr2 = new int[arr.length+1];
        arr2[a] = b;
        for (int i = 0; i < a; i++) {
            arr2[i] = arr[i];
        }
        for (int i = a; i < arr.length; i++) {
            arr2[i+1] = arr[i];
        }
        arr = arr2;
    }*/
}
