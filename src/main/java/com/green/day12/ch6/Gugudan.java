package com.green.day12.ch6;

public class Gugudan {

    void print (int n){
        for(int i =  1; i <= 9; i++){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
        System.out.println();
    }

    void printfromTo(int n1, int n2){
        for(int i = n1; i<=n2; i++){
            print(i);
        }
    }

    void printfromTo(int n1, int n2, String n3){
        for (int i = n1; i<=n2; i++){
            print(i);
        }
        System.out.println(n3);
    }
}
