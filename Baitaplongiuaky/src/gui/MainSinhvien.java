/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Administrator
 */
public class MainSinhvien extends javax.swing.JFrame {

    /**
     * Creates new form Sinhvien
     */
    public MainSinhvien() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMDangxuat = new javax.swing.JMenuItem();
        jMthoat = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMxemdiem = new javax.swing.JMenuItem();
        jMXemthongtin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        jMenu1.setText("File");

        jMDangxuat.setText("Đăng xuất");
        jMDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMDangxuatActionPerformed(evt);
            }
        });
        jMenu1.add(jMDangxuat);

        jMthoat.setText("Thoát");
        jMthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMthoatActionPerformed(evt);
            }
        });
        jMenu1.add(jMthoat);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Thông tin");

        jMxemdiem.setText("Xem điểm");
        jMxemdiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMxemdiemActionPerformed(evt);
            }
        });
        jMenu2.add(jMxemdiem);

        jMXemthongtin.setText("Xem thông tin");
        jMXemthongtin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMXemthongtinActionPerformed(evt);
            }
        });
        jMenu2.add(jMXemthongtin);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(491, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(321, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMDangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMDangxuatActionPerformed
        Dangnhap dangnhap = new Dangnhap();
        DangXuat.logOut(this, dangnhap);
    }//GEN-LAST:event_jMDangxuatActionPerformed

    private void jMthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMthoatActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jMthoatActionPerformed

    private void jMxemdiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMxemdiemActionPerformed
        new Xemdiem().setVisible(true);
    }//GEN-LAST:event_jMxemdiemActionPerformed

    private void jMXemthongtinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMXemthongtinActionPerformed
        new XemthongtinSV().setVisible(true);
    }//GEN-LAST:event_jMXemthongtinActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainSinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainSinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainSinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainSinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSinhvien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMDangxuat;
    private javax.swing.JMenuItem jMXemthongtin;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMthoat;
    private javax.swing.JMenuItem jMxemdiem;
    // End of variables declaration//GEN-END:variables
}
