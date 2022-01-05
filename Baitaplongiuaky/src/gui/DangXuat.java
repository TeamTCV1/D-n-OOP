package gui;

import javax.swing.JFrame;

public class DangXuat {

    public static void logOut(JFrame context, Dangnhap loginScreen) {
        Luuthongtindangnhap.isLoggedin = false;
        context.setVisible(false);
        loginScreen.setVisible(true);
    }
}
