/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package GUI;

import POJO.NhanVienLogin;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class frmMain extends javax.swing.JFrame {

    static Object getDesktopPane() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Creates new form Menu
     */
    public frmMain() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle("Quản lý Fashion Shop");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        dashBoardMenu = new javax.swing.JMenu();
        mnuThongKe = new javax.swing.JMenuItem();
        mnuProfile = new javax.swing.JMenuItem();
        sanPhamMenu = new javax.swing.JMenu();
        mnuQLSP = new javax.swing.JMenuItem();
        mnuQPLoaiSP = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        hoaDonMenu = new javax.swing.JMenu();
        mnuQLHoaDon = new javax.swing.JMenuItem();
        mnuThanhToan = new javax.swing.JMenuItem();
        khachHangMenu = new javax.swing.JMenu();
        mnuQLKhachHang = new javax.swing.JMenuItem();
        nhanVienMenu = new javax.swing.JMenu();
        mnuQLNhanVien = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuBar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        dashBoardMenu.setMnemonic('f');
        dashBoardMenu.setText("Dashboard");

        mnuThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/statistics.png"))); // NOI18N
        mnuThongKe.setMnemonic('o');
        mnuThongKe.setText("Thống kê");
        mnuThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuThongKeActionPerformed(evt);
            }
        });
        dashBoardMenu.add(mnuThongKe);

        mnuProfile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mnuProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/profile.png"))); // NOI18N
        mnuProfile.setText("Tài khoản");
        mnuProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProfileActionPerformed(evt);
            }
        });
        dashBoardMenu.add(mnuProfile);

        menuBar.add(dashBoardMenu);

        sanPhamMenu.setMnemonic('e');
        sanPhamMenu.setText("Sản phẩm");

        mnuQLSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/product.png"))); // NOI18N
        mnuQLSP.setMnemonic('t');
        mnuQLSP.setText("Quản lý Sản phẩm");
        mnuQLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQLSPActionPerformed(evt);
            }
        });
        sanPhamMenu.add(mnuQLSP);

        mnuQPLoaiSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/product_type.png"))); // NOI18N
        mnuQPLoaiSP.setMnemonic('y');
        mnuQPLoaiSP.setText("Quản lý Loại sản phẩm");
        mnuQPLoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQPLoaiSPActionPerformed(evt);
            }
        });
        sanPhamMenu.add(mnuQPLoaiSP);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/warehouse.png"))); // NOI18N
        jMenuItem1.setText("Nhập kho");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        sanPhamMenu.add(jMenuItem1);

        menuBar.add(sanPhamMenu);

        hoaDonMenu.setText("Hoá đơn");

        mnuQLHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bill.png"))); // NOI18N
        mnuQLHoaDon.setText("Quản lý Hoá đơn");
        mnuQLHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQLHoaDonActionPerformed(evt);
            }
        });
        hoaDonMenu.add(mnuQLHoaDon);

        mnuThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/payment_method.png"))); // NOI18N
        mnuThanhToan.setText("Thanh toán Hoá đơn");
        mnuThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuThanhToanActionPerformed(evt);
            }
        });
        hoaDonMenu.add(mnuThanhToan);

        menuBar.add(hoaDonMenu);

        khachHangMenu.setText("Khách hàng");

        mnuQLKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/customer.png"))); // NOI18N
        mnuQLKhachHang.setText("Quản lý khách hàng");
        mnuQLKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQLKhachHangActionPerformed(evt);
            }
        });
        khachHangMenu.add(mnuQLKhachHang);

        menuBar.add(khachHangMenu);

        nhanVienMenu.setText("Nhân viên");

        mnuQLNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/staff.png"))); // NOI18N
        mnuQLNhanVien.setText("Quản lý nhân viên");
        mnuQLNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQLNhanVienActionPerformed(evt);
            }
        });
        nhanVienMenu.add(mnuQLNhanVien);

        menuBar.add(nhanVienMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void showFrm(JInternalFrame newframe) {
        this.desktopPane.removeAll();
        newframe.setVisible(true);
        newframe.setBounds(0, 0, desktopPane.getWidth(), desktopPane.getHeight());
        this.desktopPane.add(newframe);
    }
    private void mnuThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuThongKeActionPerformed

        frmThongKe frm = new frmThongKe();
        showFrm(frm);
    }//GEN-LAST:event_mnuThongKeActionPerformed

    private void mnuThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuThanhToanActionPerformed

        frmThanhToan frm = new frmThanhToan();
        showFrm(frm);

    }//GEN-LAST:event_mnuThanhToanActionPerformed

    private void mnuQLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQLSPActionPerformed
        frmQLSanPham frm = new frmQLSanPham();
        showFrm(frm);
    }//GEN-LAST:event_mnuQLSPActionPerformed

    private void mnuQPLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQPLoaiSPActionPerformed
        frmQLLoaiSanPham frm = new frmQLLoaiSanPham();
        showFrm(frm);
    }//GEN-LAST:event_mnuQPLoaiSPActionPerformed

    private void mnuQLKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQLKhachHangActionPerformed
        frmQLKhachHang frm = new frmQLKhachHang();
        showFrm(frm);
    }//GEN-LAST:event_mnuQLKhachHangActionPerformed

    private void mnuQLHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQLHoaDonActionPerformed
        frmQLHoaDon frm = new frmQLHoaDon();
        showFrm(frm);
    }//GEN-LAST:event_mnuQLHoaDonActionPerformed

    private void mnuQLNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQLNhanVienActionPerformed
        frmQLNhanVien frm = new frmQLNhanVien();
        showFrm(frm);
    }//GEN-LAST:event_mnuQLNhanVienActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmNhapKho frm = new frmNhapKho();
        showFrm(frm);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

//    private void showFram(JFrame newframe) {
//        this.desktopPane.removeAll();
//        newframe.setVisible(true);
//        newframe.setBounds(0, 0, desktopPane.getWidth(), desktopPane.getHeight());
//        //this.desktopPane.add(newframe);
//    }
    private void mnuProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProfileActionPerformed
        frmTrangCaNhan frm = new frmTrangCaNhan();
        showFrm(frm);
    }//GEN-LAST:event_mnuProfileActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu dashBoardMenu;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu hoaDonMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu khachHangMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnuProfile;
    private javax.swing.JMenuItem mnuQLHoaDon;
    private javax.swing.JMenuItem mnuQLKhachHang;
    private javax.swing.JMenuItem mnuQLNhanVien;
    private javax.swing.JMenuItem mnuQLSP;
    private javax.swing.JMenuItem mnuQPLoaiSP;
    private javax.swing.JMenuItem mnuThanhToan;
    private javax.swing.JMenuItem mnuThongKe;
    private javax.swing.JMenu nhanVienMenu;
    private javax.swing.JMenu sanPhamMenu;
    // End of variables declaration//GEN-END:variables

}
