package Quanly;

import KetNoiSQL.JDBCConnection;
import Thuoctinh.Giangvien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class UpdatethongtinGV {

    public List<Giangvien> getAllgiangvien() {
        List<Giangvien> giangviens = new ArrayList<Giangvien>();
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM du_lieu.giang_vien;";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Giangvien giangvien = new Giangvien();
                giangvien.setIdGV(rs.getInt("ID"));
                giangvien.setName(rs.getString("Họ và tên"));
                giangvien.setChuyenNganh(rs.getString("Chuyên ngành"));
                giangvien.setGioiTinh(rs.getString("Giới tính"));
                giangvien.setNamSinh(rs.getString("Năm sinh"));
                giangvien.setAddress(rs.getString("Địa chỉ"));
                giangvien.setEmail(rs.getString("Email"));
                giangvien.setPhone(rs.getString("SDT"));
                giangviens.add(giangvien);

            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinGV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return giangviens;
    }

    public void addGiangvien(Giangvien giangvien) {
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "INSERT INTO du_lieu.giang_vien (ID, `Họ và tên`, `Năm sinh`, `Địa chỉ`, "
                + "`Giới tính`, `Chuyên ngành`, `Email`, `SDT`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, giangvien.getIdGV());
            preparedStatement.setString(2, giangvien.getName());
            preparedStatement.setString(3, giangvien.getNamSinh());
            preparedStatement.setString(4, giangvien.getAddress());
            preparedStatement.setString(5, giangvien.getGioiTinh());
            preparedStatement.setString(6, giangvien.getChuyenNganh());
            preparedStatement.setString(7, giangvien.getEmail());
            preparedStatement.setString(8, giangvien.getPhone());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinGV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateGiangvien(Giangvien giangvien) {
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "UPDATE du_lieu.giang_vien SET `Họ và tên` = ?, `Năm sinh` = ?, `Địa chỉ` = ?, "
                + "`Giới tính` = ?, `Chuyên ngành` = ?, `Email` = ?, `SDT` = ? Where ID = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, giangvien.getName());
            preparedStatement.setString(2, giangvien.getNamSinh());
            preparedStatement.setString(3, giangvien.getAddress());
            preparedStatement.setString(4, giangvien.getGioiTinh());
            preparedStatement.setString(5, giangvien.getChuyenNganh());
            preparedStatement.setString(6, giangvien.getEmail());
            preparedStatement.setString(7, giangvien.getPhone());
            preparedStatement.setInt(8, giangvien.getIdGV());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinGV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delGiangvien(int id) {
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Delete From du_lieu.giang_vien where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinGV.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Giangvien getGiangvienbyID(int id) {
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM du_lieu.giang_vien where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Giangvien giangvien = new Giangvien();
                giangvien.setIdGV(rs.getInt("ID"));
                giangvien.setName(rs.getString("Họ và tên"));
                giangvien.setNamSinh(rs.getString("Năm sinh"));
                giangvien.setAddress(rs.getString("Địa chỉ"));
                giangvien.setGioiTinh(rs.getString("Giới tính"));
                giangvien.setChuyenNganh(rs.getString("Chuyên ngành"));
                giangvien.setEmail(rs.getString("Email"));
                giangvien.setPhone(rs.getString("SDT"));
                return giangvien;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinGV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void addUserGiangvien(Giangvien giangvien) {
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "INSERT INTO du_lieu.login (ID, Username, Password, Usertype, Nickname) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, giangvien.getIdGV());
            preparedStatement.setString(2, giangvien.getUserName());
            preparedStatement.setString(3, giangvien.getPassWord());
            preparedStatement.setString(4, giangvien.getUserType());
            preparedStatement.setString(5, giangvien.getName());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinGV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delUserGiangvien(int id) {
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Delete From du_lieu.login where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinGV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
