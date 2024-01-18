package com.green.day68.ch14;

import com.green.day8.ch5.A_ArrayToStringMission;

public class MyArrayList {
    private int[] arr;
    public MyArrayList() {
        arr = new int[0];
    }
    public void add(int num){
        int[] arr2 = new int[arr.length+1];
        for (int i = 0; i < arr.length+1; i++) {

            arr2[i] = arr[i];

        }
        arr2[arr.length] = num;
        arr = arr2;
    }



    @Override
    public String toString(){
        return String.format("int[] : %", arr);
    }
}
