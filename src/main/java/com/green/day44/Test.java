package com.green.day44;

public class Test {//SwaggerConfiguration의 풀이해서 쓴 것
    public static void main(String[] args) {
        MyInfo mi = new MyInfo()
                .title("ddd")
                .description("인스타 클론 코딩");

        System.out.println(mi);

        MyInfo mi2 = mi.title("ggg");
        System.out.println(mi == mi2);
        System.out.println(mi);

        MyOpenAPI moa = new MyOpenAPI().info(mi);

        System.out.println(moa);
    }
}
