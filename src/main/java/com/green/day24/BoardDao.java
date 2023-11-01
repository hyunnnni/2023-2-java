package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//Data access object 모든 테이블과 맞을 수 있는 객체
public class BoardDao {//insert
    public static int insboard(BoardEntity entity){ //title, ctnts, writer
       int result = 0;
       String sql = /*String.format(*/"INSERT INTO board (title, ctnts, writer) "+
                       "values" + "(?,?,?)"; //insert하는 거

                       /*"('%s','%s','%s')"
               , entity.getTitle(), entity.getCtnts(), entity.getWriter());*/
        Connection con=  null;
        PreparedStatement ps =null;

       try{
           con = MyConn.getConn();
           ps =con.prepareStatement(sql);//? 를 사용하면 '"를 자동으로
           //적어준다.준비된 ps란 변수에 con은 준비할 값을 넣을 것이다.
           ps.setString(1,entity.getTitle());
           ps.setString(2,entity.getCtnts());
           ps.setString(3,entity.getWriter()); //??? 각 자리에 값을 넣어준다
           //인식해서 문자열로 바꿔 ''를 붙여서 각 자리에 넣어준다
           result = ps.executeUpdate();//영향받은 행수 쿼리문 실행하자
       }catch (Exception e){
           e.printStackTrace();
       }finally{

           MyConn.close(con, ps);
       }
       return result;
    }

    public static int delBoard(BoardEntity entity){//delete
        int result =0;
        String sql = "delete from board " +
                "where iboard = ?";
        Connection con = null;
        PreparedStatement ps = null;

        try{
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);

            ps.setInt(1, entity.getIboard());
            result = ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MyConn.close(con, ps);
        }
        return result;
    }
    public static int updBoard(BoardEntity entity){//update
        int result =0;
        String sql = "update board " +
                "set title = ?, ctnts = ?, writer = ? , updated_at = now() " +
                "where iboard = ?";
        Connection con = null;
        PreparedStatement ps = null;

        try{
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            ps.setInt(4, entity.getIboard());
            result = ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MyConn.close(con, ps);
        }
        return result;
    }

    public static List<BoardEntity> selBoardList(){ //select
        List<BoardEntity> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null; //셀렉을 했을 때 결과물이 담기는 것
        String sql = "select iboard, title, writer, created_at " +
                "from board";
        try{
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(); //select는 무조건 Query!

            while(rs.next()){//레코드가 있는지 1행부터 체크, 레코드가 있는 수 만큼 반복
                //레코드가 있다면 true가 되고 또 그 다음 레코드를 체크한다 그 다음 레코드가 없다면 false가 뜨면서 while문이 종료된다
                //if는 한 줄만 체크하고 싶을 때 사용
                BoardEntity entity = new BoardEntity();
                int iboard = rs.getInt("iboard");
                String title = rs.getString("title");
                String writer = rs.getString("writer");
                String createdAt = rs.getString("created_at");
                entity.setIboard(iboard);
                entity.setTitle(title);
                entity.setWriter(writer);
                entity.setCreatedAt(createdAt);
                list.add(entity);



            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MyConn.close(con, ps, rs);
        }
        return list;
    }
    public static BoardEntity selBoardById(int pk){
        BoardEntity entity = new BoardEntity();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql  = "select iboard, title, ctnts, writer, created_at, updated_at " + //*을 써도 된다
                "from board where iboard = ?";

        try{
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, pk);
            rs = ps.executeQuery();//읽어오는 것 가져올 수 있는 쿼리의 경우의 수는 2개 1개가 넘어오거나 0개 넘어오거나

        if(rs.next()) {//0개가 넘어오면 오류가 있을 수 있으니 무조건 if나 while로 감싸준다
            entity.setIboard(pk);
            entity.setTitle(rs.getString("title"));
            entity.setWriter(rs.getString("writer"));
            entity.setCtnts(rs.getString("ctnts"));
            entity.setCreatedAt(rs.getString("created_at"));
            entity.setUpdatedAt(rs.getString("updated_at"));
            return entity;
        }

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            MyConn.close(con, ps, rs);
        }
        return null;
    }


}


