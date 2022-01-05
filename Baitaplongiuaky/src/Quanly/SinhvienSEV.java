/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quanly;

import Thuoctinh.Sinhvien;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class SinhvienSEV {
    private UpdatethongtinSV updatethongtinsv;
    
    public SinhvienSEV() {
        updatethongtinsv = new UpdatethongtinSV();
    }
    public List<Sinhvien> getAllsinhvien() {
        return updatethongtinsv.getAllsinhvien();
    }
    
    public void addSinhvien(Sinhvien sinhvien) {
        updatethongtinsv.addSinhvien(sinhvien);
    }
    
    public void updateSinhvien(Sinhvien sinhvien) {
        updatethongtinsv.updateSinhvien(sinhvien);
    }
    
    public void delSinhvien(int id) {
        updatethongtinsv.delSinhvien(id);
    }
    
    public Sinhvien getSinhvienbyID(int id){
        return updatethongtinsv.getSinhvienbyID(id);
    }
    
    public void addUserSinhvien(Sinhvien sinhvien) {
        updatethongtinsv.addUserSinhvien(sinhvien);
    }
    
    public void delUserSinhvien(int id) {
        updatethongtinsv.delUserSinhvien(id);
    }
    
    public List<Sinhvien> getFindsinhvien(int id) {
        return updatethongtinsv.getFindsinhvien(id);
    }
}
