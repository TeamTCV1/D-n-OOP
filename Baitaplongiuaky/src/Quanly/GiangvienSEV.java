package Quanly;

import Thuoctinh.Giangvien;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class GiangvienSEV {
    private UpdatethongtinGV updatethongtinGV;
    
    public GiangvienSEV() {
        updatethongtinGV = new UpdatethongtinGV();
    }
    
    public List<Giangvien> getAllgiangvien() {
        return updatethongtinGV.getAllgiangvien();
    }
    
    public void addGiangvien(Giangvien giangvien) {
        updatethongtinGV.addGiangvien(giangvien);
    }
    
    public void updateGiangvien(Giangvien giangvien) {
        updatethongtinGV.updateGiangvien(giangvien);
    }
    
    public void delGiangvien(int id) {
        updatethongtinGV.delGiangvien(id);
    }
    
    public Giangvien getGiangvienbyID(int id){
        return updatethongtinGV.getGiangvienbyID(id);
    }
    
    public void addUserGiangvien(Giangvien giangvien) {
        updatethongtinGV.addUserGiangvien(giangvien);
    }
    
    public void delUserSinhvien(int id) {
        updatethongtinGV.delUserGiangvien(id);
    }
}
