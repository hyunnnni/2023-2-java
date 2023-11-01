package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


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
        be.setCtnts("경록이랑 친하게 지내지마");
        be.setWriter("정한이");
        int dao = BoardDao.insboard(be);// 확인하는 용 리턴
        //실행이 제대로 되었다면 1(result) 이란 숫자가 리턴되어 dao에 들어가게 된다.
        //만약 되지 않았다면 0
        System.out.println(dao);
    }

}

class MyConnTest3{
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(1);

        int row = BoardDao.delBoard(entity);
    }
}

class MyConnTest4 {
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();

        entity.setIboard(3);
        entity.setTitle("수정제목");
        entity.setCtnts("수정내용");
        entity.setWriter("수정자");

        int row = BoardDao.updBoard(entity);
        System.out.println("row : " + row);
    }
}

class MyConnTest5{
    public static void main(String[] args) {
        List<BoardEntity> list = BoardDao.selBoardList();
        for(BoardEntity entity : list){
            System.out.println(entity);

        }
    }
}

class MyConnTest6{
    public static void main(String[] args) {


        BoardEntity result = BoardDao.selBoardById(3);
        System.out.println(result);
    }
}

