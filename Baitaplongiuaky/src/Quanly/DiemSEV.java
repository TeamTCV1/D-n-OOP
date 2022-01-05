package Quanly;

import KetNoiSQL.JDBCConnection;
import Thuoctinh.Bangdiem;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DiemSEV {

    public List<Bangdiem> getAll() {
        List<Bangdiem> bangdiems = new ArrayList<Bangdiem>();
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM du_lieu.bang_diem";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Bangdiem bangdiem = new Bangdiem();
                bangdiem.setId(rs.getInt("ID"));
                bangdiem.setMon1(rs.getString("Môn 1"));
                bangdiem.setMon2(rs.getString("Môn 2"));
                bangdiem.setMon3(rs.getString("Môn 3"));
                bangdiem.setHvt(rs.getString("Họ và tên"));
                bangdiems.add(bangdiem);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bangdiems;
    }

    public void addDiem(Bangdiem bangdiem) {
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "INSERT INTO du_lieu.bang_diem (ID, `Họ và tên`, `Môn 1`, `Môn 2`, `Môn 3`) VALUES (? , ?, ?, ?, ?);";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, bangdiem.getId());
            preparedStatement.setString(2, bangdiem.getHvt());
            preparedStatement.setString(3, bangdiem.getMon1());
            preparedStatement.setString(4, bangdiem.getMon2());
            preparedStatement.setString(5, bangdiem.getMon3());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateBangdiem(Bangdiem bangdiem) {
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "UPDATE du_lieu.bang_diem SET  `Họ và tên` = ?, "
                + "`Môn 1` = ?, `Môn 2` = ?, `Môn 3` = ? WHERE ID = ?;";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, bangdiem.getHvt());
            preparedStatement.setString(2, bangdiem.getMon1());
            preparedStatement.setString(3, bangdiem.getMon2());
            preparedStatement.setString(4, bangdiem.getMon3());
            preparedStatement.setInt(5, bangdiem.getId());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delDiem(int id) {
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Delete From du_lieu.bang_diem where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Bangdiem getDiembyID(int id){
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM du_lieu.bang_diem where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                Bangdiem bangdiem = new Bangdiem();
                bangdiem.setId(rs.getInt("ID"));
                bangdiem.setHvt(rs.getString("Họ và tên"));
                bangdiem.setMon1(rs.getString("Môn 1"));
                bangdiem.setMon2(rs.getString("Môn 2"));
                bangdiem.setMon3(rs.getString("Môn 3"));
                return bangdiem;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
