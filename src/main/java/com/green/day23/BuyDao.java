package com.green.day23;

import com.green.day22.Myconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BuyDao {
    private Myconnection myconn;

    public BuyDao() {
        myconn = new Myconnection();
    }

    public int insBuy(BuyEntity entity) {
        String sql = " INSERT INTO member " + " " +
                "( mem_id, prod_name, group_name, price, amount) " +
                "VALUES " +
                " (?, ?, ?, ?, ?) ";
        try (Connection conn = myconn.getConn();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, entity.getMemId());
            ps.setString(2, entity.getProdName());
            ps.setString(3, entity.getGroupName());
            ps.setInt(4, entity.getPrice());
            ps.setInt(5, entity.getAmount());

            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int updBuy(BuyEntity entity) {//num 컬럼 제외 모든 컬럼 수정

        String sql = "UPDATE buy SET mem_id = ?, prod_name = ?, group_name = ?, price = ?, amount = ?" +
                " WHERE num = ?";

        try (Connection conn = myconn.getConn();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, entity.getMemId());
            ps.setString(2, entity.getProdName());
            ps.setString(3, entity.getGroupName());
            ps.setInt(4, entity.getPrice());
            ps.setInt(5, entity.getAmount());
            ps.setInt(6, entity.getNum());

            System.out.println(ps);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    return 0;
    }

    public int delBuy(int num){


        String sql = "DELETE FROM buy" +
                "WHERE num = ?";
        try (Connection conn = myconn.getConn();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, num);

            System.out.println(ps);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public List<BuySelVo> selBuyGroupByMemId(){
        List<BuySelVo> list= new ArrayList<>();
        String sql = "SELECT mem_id,COUNT(mem_id) AS buy_count FROM buy GROUP BY mem_id";
        try (Connection conn = myconn.getConn();
             PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){

            while (rs.next()){
                BuySelVo buySelVo= new BuySelVo(rs.getString("mem_id"),rs.getInt("buy_count"));
                list.add(buySelVo);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }




}


class BuyDaoTest {
    public static void main(String[] args) {
        BuyDao buyDao = new BuyDao();//MyConnection객체 주소값 갖게 된다.
        BuyEntity entity = new BuyEntity();
        entity.setMemId("RED");
        entity.setProdName("구두");
        entity.setGroupName("패션");
        entity.setPrice(300);
        entity.setAmount(3);

        int affectedRow = buyDao.insBuy(entity);
        System.out.printf("affectedRow : %d\n", affectedRow);

    }
}


class updBuyTest{
    public static void main(String[] args){
        BuyDao buyDao = new BuyDao();
        BuyEntity entity = new BuyEntity();
        entity.setMemId("TTL");
        entity.setProdName("아아");
        entity.setGroupName("ㅇ?");
        entity.setPrice(22);
        entity.setAmount(1);
        entity.setNum(1);

        int affectedRow = buyDao.updBuy(entity);
        System.out.printf("affectedRow : %d\n", affectedRow);
    }
}