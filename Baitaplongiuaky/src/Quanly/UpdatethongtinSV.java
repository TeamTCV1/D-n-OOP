package Quanly;

import KetNoiSQL.JDBCConnection;
import Thuoctinh.Sinhvien;
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
public class UpdatethongtinSV {

    public List<Sinhvien> getAllsinhvien() {
        List<Sinhvien> sinhviens = new ArrayList<Sinhvien>();
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM du_lieu.sinh_vien";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Sinhvien sinhvien = new Sinhvien();
                sinhvien.setIdSV(rs.getInt("ID"));
                sinhvien.setName(rs.getString("Họ và tên"));
                sinhvien.setLop(rs.getString("Lớp"));
                sinhvien.setKhoa(rs.getString("Khóa"));
                sinhvien.setGioiTinh(rs.getString("Giới tính"));
                sinhvien.setNamSinh(rs.getString("Năm sinh"));
                sinhvien.setAddress(rs.getString("Địa chỉ"));
                sinhvien.setEmail(rs.getString("Email"));
                sinhvien.setPhone(rs.getString("SDT"));
                sinhviens.add(sinhvien);

            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sinhviens;
    }

    public void addSinhvien(Sinhvien sinhvien) {
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "INSERT INTO du_lieu.sinh_vien (ID, `Họ và tên`, `Lớp`, `Khóa`, `Giới tính`, `Năm sinh`, `Địa chỉ`, `Email`, `SDT`) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, sinhvien.getIdSV());
            preparedStatement.setString(2, sinhvien.getName());
            preparedStatement.setString(3, sinhvien.getLop());
            preparedStatement.setString(4, sinhvien.getKhoa());
            preparedStatement.setString(5, sinhvien.getGioiTinh());
            preparedStatement.setString(6, sinhvien.getNamSinh());
            preparedStatement.setString(7, sinhvien.getAddress());
            preparedStatement.setString(8, sinhvien.getEmail());
            preparedStatement.setString(9, sinhvien.getPhone());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateSinhvien(Sinhvien sinhvien) {
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Update du_lieu.sinh_vien Set `Họ và tên` = ?, `Lớp` = ?, `Khóa` = ?, `Giới tính` = ?, `Năm sinh` = ?, `Địa chỉ` = ?, `Email` = ?, `SDT` = ? Where ID = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, sinhvien.getName());
            preparedStatement.setString(2, sinhvien.getLop());
            preparedStatement.setString(3, sinhvien.getKhoa());
            preparedStatement.setString(4, sinhvien.getGioiTinh());
            preparedStatement.setString(5, sinhvien.getNamSinh());
            preparedStatement.setString(6, sinhvien.getAddress());
            preparedStatement.setString(7, sinhvien.getEmail());
            preparedStatement.setString(8, sinhvien.getPhone());
            preparedStatement.setInt(9, sinhvien.getIdSV());

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delSinhvien(int id) {
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Delete From du_lieu.sinh_vien where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinSV.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Sinhvien getSinhvienbyID(int id) {
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM du_lieu.sinh_vien where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Sinhvien sinhvien = new Sinhvien();
                sinhvien.setIdSV(rs.getInt("ID"));
                sinhvien.setName(rs.getString("Họ và tên"));
                sinhvien.setLop(rs.getString("Lớp"));
                sinhvien.setKhoa(rs.getString("Khóa"));
                sinhvien.setGioiTinh(rs.getString("Giới tính"));
                sinhvien.setNamSinh(rs.getString("Năm sinh"));
                sinhvien.setAddress(rs.getString("Địa chỉ"));
                sinhvien.setEmail(rs.getString("Email"));
                sinhvien.setPhone(rs.getString("SDT"));
                return sinhvien;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void addUserSinhvien(Sinhvien sinhvien) {
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "INSERT INTO du_lieu.login (ID, Username, Password, Usertype, Nickname) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, sinhvien.getIdSV());
            preparedStatement.setString(2, sinhvien.getUserName());
            preparedStatement.setString(3, sinhvien.getPassWord());
            preparedStatement.setString(4, sinhvien.getUserType());
            preparedStatement.setString(5, sinhvien.getName());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delUserSinhvien(int id) {
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Delete From du_lieu.login where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Sinhvien> getFindsinhvien(int id) {
        List<Sinhvien> sinhviens = new ArrayList<Sinhvien>();
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM du_lieu.sinh_vien where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Sinhvien sinhvien = new Sinhvien();
                sinhvien.setIdSV(rs.getInt("ID"));
                sinhvien.setName(rs.getString("Họ và tên"));
                sinhvien.setLop(rs.getString("Lớp"));
                sinhvien.setKhoa(rs.getString("Khóa"));
                sinhvien.setGioiTinh(rs.getString("Giới tính"));
                sinhvien.setNamSinh(rs.getString("Năm sinh"));
                sinhvien.setAddress(rs.getString("Địa chỉ"));
                sinhvien.setEmail(rs.getString("Email"));
                sinhvien.setPhone(rs.getString("SDT"));
                sinhviens.add(sinhvien);

            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdatethongtinSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sinhviens;
    }
}
