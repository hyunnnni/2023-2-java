package com.green.day14.ch6;

public class Document {
    static int cnt = 0;
    String name;

    public Document (){

        this("제목없음"+ ++cnt); //static변수를 사용해서 따로 저장됨을 이용해 한 번 사용할 때마다 cnt의 수가 1씩 증가
        //그래서 이 생성자가 사용될 때만 cnt의 값이 증가한다 ,
    }

    public Document(String a){
        name = a;
        System.out.printf("문서 %s이(가) 생성되었습니다.\n", name);
    }
}

class DocumentTest{
    public static void main(String[] args) {
        Document d1 = new Document(); //문서제목없음1이 생성되었습니다.
        Document d2 = new Document("자바.txt");//문서 자바.txt가 생성되었습니다
        Document d3 = new Document();//문서 제목없음2가 생성되었습니다
        Document d4 = new Document();//문서 자바.txt가 생성되었습니다
        Document d5 = new Document();//문서 자바.txt가 생성되었습니다


    }
}