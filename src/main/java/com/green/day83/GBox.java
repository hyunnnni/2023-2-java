package com.green.day83;

public class GBox<T> {//<아무 알파벳 대문자> : 타입을 임시로 정하는 것
    //제네릭
    private T item;

    public void setItem(T item){
        this.item = item;
    }
    public T getItem(){
        return this.item;
    }
}
