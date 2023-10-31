package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class MyConnTest {
    public static void main(String[] args) {

        Connection conn = MyConn.getConn();
        String sql = "INSERT INTO country (country_id, country) values (111,'경현나라')";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            int result = ps.executeUpdate();
            System.out.println("result : "+ result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyConnTest2{
    public static void main(String[] args) {
        BoardEntity be = new BoardEntity();
        be.setTitle("안녕");
        be.setCtnts("처음 해봐");
        be.setWriter("경현이");
        int dao = BoardDao.insboard(be);// 확인하는 용 리턴
        //실행이 제대로 되었다면 1(result) 이란 숫자가 리턴되어 dao에 들어가게 된다.
        //만약 되지 않았다면 0
        System.out.println(dao);
    }
}
