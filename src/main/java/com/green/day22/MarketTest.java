package com.green.day22;

import java.sql.Connection;
import java.sql.SQLException;

public class MarketTest {
    public static void main(String[] args){
        Myconnection myconnection = new Myconnection();
        Connection conn = null;
        try {
             conn = myconnection.getConn();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            myconnection.close(conn);
        }
    }
}

/*
static 메소드면 Myconnection.close(conn); 대문자 사용?
 myconnection.close(conn); >>> instance메소드 void 메소드 메소드 타입은 conn 의 앞에꺼
 = 이 들어가면 리턴 메소드
 */