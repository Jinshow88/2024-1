package com.green.day22;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// member 테이블 용 Data Access Object
public class MemberDao {
    private Myconnection myConn;

    public MemberDao() {
        myConn = new Myconnection();
    }

    public int execute(String sql) {
        int result = 0;
        Connection conn = null;
        Statement stat = null;
        try {
            conn = myConn.getConn();
            stat = conn.createStatement();

            // 영향받은 행 갯수
            result = stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            myConn.close(stat, conn);
        }
        return result;
    }

    // insert 문법
    public int insMember(final MemberEntity entity) {
        String sql = String.format("INSERT INTO member" +
                        "(mem_id, mem_name," +
                        " mem_number, addr," +
                        " phone1, phone2," +
                        " height, debut_date)" +
                        "VALUES " +
                        "('%s', '%s'," +
                        " '%d', '%s'," +
                        " '%s', '%s'," +
                        " '%d', '%s')",
                entity.getMemId(), entity.getMemName(),
                entity.getMemNumber(), entity.getAddr(),
                entity.getPhone1(), entity.getPhone2(),
                entity.getHeight(), entity.getDebutDate());

        System.out.println(sql);
        return execute(sql);
    }

    public List<MemberEntity> selMemberList() { // 부분이 아닌 전체를 가져오겟다는 뜻
        List<MemberEntity> list = new ArrayList<>();
        String sql = "SELECT mem_id, mem_name, debut_date FROM member ORDER BY debut_date DESC";
        System.out.println(sql);
//        Connection conn = null;
//        Statement stat = null;
//        ResultSet rs = null;
        try {Connection conn = myConn.getConn();
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
//            conn = myConn.getConn();

            while (rs.next()){
                String memId = rs.getString("mem_id");
                String memName = rs.getString("mem_name");
                String debutDate = rs.getString("debut_date");

                MemberEntity member = new MemberEntity();
                list.add(member);
                member.setMemId(memId);
                member.setMemName(memName);
                member.setDebutDate(debutDate);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
//            myConn.close(rs, stat, conn);

        }
//
//    public List<MemberEntity> selMemberList(String mem_id, String mem_name, String debut_date){
//        String selMemberList = String.format(SELECT)
        return list;
    }


    public int updMember(MemberEntity entity) {
        String mid = "";
        if (entity.getMemName() != null && entity.getMemName().length() > 0) {
            mid += String.format(", mem_name = '%s'", entity.getMemName());
        }
        if (entity.getMemNumber() > 0) {
            mid += String.format(", mem_number = %d", entity.getMemNumber());
        }
        if (entity.getAddr() != null && entity.getAddr().length() > 0) {
            mid += String.format(", addr = '%s'", entity.getAddr());
        }
        if (entity.getPhone1() != null && entity.getPhone1().length() > 0) {
            mid += String.format(", phone1 = '%s'", entity.getPhone1());
        }
        if (entity.getPhone2() != null && entity.getPhone2().length() > 0) {
            mid += String.format(", phone2 = '%s'", entity.getPhone2());
        }
        if (entity.getHeight() > 0) {
            mid += String.format(", height = %d", entity.getHeight());
        }


        System.out.println(mid);
        mid = mid.substring(2);
        System.out.println(mid);

        String sql = String.format("UPDATE member SET %s WHERE  mem_id = '%s'", mid, entity.getMemId());

        System.out.println(sql);
        return execute(sql);
    }
//    DELETE FROM member
//    WHERE member_id = 'main';

    public int delMember(MemberEntity entity) {
        String sql = String.format("DELETE FROM member WHERE member_id = '%s'", entity.getMemId());
        System.out.println(sql);
        Connection conn = null;
        Statement stat = null;
        int result = 0;

        try {
            conn = myConn.getConn();
            stat = conn.createStatement();

            // 영향받은 행 갯수
            result = stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            myConn.close(stat, conn);
        }
        return result;
    }


}

class SelListMemberTest{
    public static void main(String[]args){
        MemberDao dao = new MemberDao();
        List<MemberEntity>list = dao.selMemberList();
        for(MemberEntity member : list){
            System.out.println(member);
        }
    }
}





class delMemberTest {
    public static void main(String[] args) {
        MemberDao dao = new MemberDao();

        MemberEntity member = new MemberEntity();
        member.setMemId("NJS");

        int affectedRow = dao.updMember(member);
        System.out.printf("affectedRow : %d\n", affectedRow);

    }
}

class MemberDaoUpdateTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setMemId("NJS");
        memberEntity.setMemNumber(6);
        memberEntity.setAddr("제주");
        memberEntity.setPhone1("011");

        int affectedRow = memberDao.updMember(memberEntity);
        System.out.printf("affectedRow : %d\n", affectedRow);
    }
}

class MemberDAOTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();

        MemberEntity memberEntity = new MemberEntity();

        memberEntity.setMemId("NJS");
        memberEntity.setMemName("뉴진스");
        memberEntity.setMemNumber(4);
        memberEntity.setAddr("대구");
        memberEntity.setPhone1("053");
        memberEntity.setPhone2("77777777");
        memberEntity.setHeight(166);
        memberEntity.setDebutDate("2022-10-01");

        int affectedRow = memberDao.insMember(memberEntity);
        System.out.printf("affectedRow : %d\n", affectedRow);
    }
}


//insMember 메소드 호출
        /*
        메소드가 어디있는지 확인 >>> MemberDao에 있는 것을 확인
        static 메소드 인지 확인 >>> 호출 방법이 달라진다.(static 메소드가 아니면 객체화를 해야한다
        선언부를 확인하니 리턴 타입은 int, 파라미터는 MemberEntity객체 주소값 필요한것을 확인
        MeberDao 객체 주소값 도트연산자를 이용하여 메소드 선언부에 맞추어 호출을 한다.
         */



