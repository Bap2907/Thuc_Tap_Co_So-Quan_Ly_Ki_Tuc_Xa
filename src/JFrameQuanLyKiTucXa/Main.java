package JFrameQuanLyKiTucXa;

import Connector.KetNoiSQL;
import JFrameQuanLyKiTucXa.Login;
import JFrameQuanLyKiTucXa.QuanLyNhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
//import dao.HopDongKTXDAO;
import dao.QuanLySinhVienDAO;
//import dao.ThongTinDichVuDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ThongTinSinhVien;


public class Main extends javax.swing.JFrame {
    Connector.KetNoiSQL connect = new Connector.KetNoiSQL();
    private String email;
    public Main(String email) {
        this.email = email;
        initComponents();
        //setSize(1450,720); 
        //Cho giao diện nằm giữa màn hình
        setLocationRelativeTo(null);
    }
    public void setnameuser(String email) {
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from nhanvien where email='" + email + "'";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                txtnameuser.setText(rs.getString("tenNV"));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Trangchu = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        trangchu = new javax.swing.JLabel();
        quanlysv = new javax.swing.JLabel();
        quanlynv = new javax.swing.JLabel();
        quanlyphong = new javax.swing.JLabel();
        hopdongktx = new javax.swing.JLabel();
        cackhoanphi = new javax.swing.JLabel();
        thongke = new javax.swing.JLabel();
        thongtintaikhoan = new javax.swing.JLabel();
        cailaimatkhau = new javax.swing.JLabel();
        dangxuat = new javax.swing.JLabel();
        dangxuat1 = new javax.swing.JLabel();
        txtnameuser = new javax.swing.JLabel();
        NameKTX = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Contents = new javax.swing.JPanel();

        trangChu1 = new JFrameQuanLyKiTucXa.TrangChu();
        quanLySinhVien1 = new JFrameQuanLyKiTucXa.QuanLySinhVien();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Trangchu.setBackground(new java.awt.Color(255, 255, 255));

        Menu.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UserName:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Menu:");

        trangchu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        trangchu.setForeground(new java.awt.Color(255, 255, 255));
        trangchu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trangchu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trangchu.png"))); // NOI18N
        trangchu.setText("Trang chủ");
        trangchu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trangchu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trangchuMouseClicked(evt);
            }
        });

        quanlysv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quanlysv.setForeground(new java.awt.Color(255, 255, 255));
        quanlysv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quanlysv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/quanlysinhvien.png"))); // NOI18N
        quanlysv.setText("Quản lý sinh viên");
        quanlysv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quanlysv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quanlysvMouseClicked(evt);
            }
        });

        quanlynv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quanlynv.setForeground(new java.awt.Color(255, 255, 255));
        quanlynv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quanlynv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/quanlynhanvien.png"))); // NOI18N
        quanlynv.setText("Quản lý nhân viên");
        quanlynv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quanlynv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quanlynvMouseClicked(evt);
            }
        });

        quanlyphong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quanlyphong.setForeground(new java.awt.Color(255, 255, 255));
        quanlyphong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quanlyphong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/quanlyphong.png"))); // NOI18N
        quanlyphong.setText("Quản lý phòng");
        quanlyphong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quanlyphong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quanlyphongMouseClicked(evt);
            }
        });

        hopdongktx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hopdongktx.setForeground(new java.awt.Color(255, 255, 255));
        hopdongktx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hopdongktx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hopdongktx.png"))); // NOI18N
        hopdongktx.setText("Hợp đồng KTX");
        hopdongktx.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hopdongktx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hopdongktxMouseClicked(evt);
            }
        });

        cackhoanphi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cackhoanphi.setForeground(new java.awt.Color(255, 255, 255));
        cackhoanphi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cackhoanphi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cackhoanphi.png"))); // NOI18N
        cackhoanphi.setText("Các khoản phí");
        cackhoanphi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cackhoanphi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cackhoanphiMouseClicked(evt);
            }
        });

        thongke.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        thongke.setForeground(new java.awt.Color(255, 255, 255));
        thongke.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thongke.png"))); // NOI18N
        thongke.setText("Thống kê");
        thongke.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        thongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thongkeMouseClicked(evt);
            }
        });

        thongtintaikhoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        thongtintaikhoan.setForeground(new java.awt.Color(255, 255, 255));
        thongtintaikhoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thongtintaikhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thongtintaikhoan.png"))); // NOI18N
        thongtintaikhoan.setText("Thông tin tài khoản");
        thongtintaikhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        thongtintaikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thongtintaikhoanMouseClicked(evt);
            }
        });

        cailaimatkhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cailaimatkhau.setForeground(new java.awt.Color(255, 255, 255));
        cailaimatkhau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cailaimatkhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cailaimatkhau.png"))); // NOI18N
        cailaimatkhau.setText("Cài lại mật khẩu");
        cailaimatkhau.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cailaimatkhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cailaimatkhauMouseClicked(evt);
            }
        });

        dangxuat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dangxuat.setForeground(new java.awt.Color(255, 255, 255));
        dangxuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dangxuat.png"))); // NOI18N
        dangxuat.setText("Đăng xuất");
        dangxuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dangxuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dangxuatMouseClicked(evt);
            }
        });

        dangxuat1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dangxuat1.setForeground(new java.awt.Color(255, 255, 255));
        dangxuat1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dangxuat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo Học Viện Công Nghệ Bưu Chính Viễn Thông - PTIT(Simple).png"))); // NOI18N
        dangxuat1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dangxuat1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dangxuat1MouseClicked(evt);
            }
        });

        txtnameuser.setForeground(new java.awt.Color(255, 255, 255));
        txtnameuser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtnameuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_name.png"))); // NOI18N
        txtnameuser.setText("username");

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(trangchu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(quanlynv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(quanlysv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(hopdongktx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cackhoanphi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(thongke, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(thongtintaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
            .addComponent(cailaimatkhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dangxuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnameuser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
            .addComponent(dangxuat1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addComponent(quanlyphong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(dangxuat1)
                .addGap(18, 18, 18)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnameuser, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(quanlysv)
                .addGap(27, 27, 27)
                .addComponent(quanlynv)
                .addGap(26, 26, 26)
                .addComponent(quanlyphong, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hopdongktx, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cackhoanphi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(thongke, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(thongtintaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cailaimatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        NameKTX.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("QUẢN LÝ KÝ TÚC XÁ HỌC VIỆN CÔNG NGHỆ BƯU CHÍNH VIỄN THÔNG");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Posts and Telecommunications Institute of Technology");

        javax.swing.GroupLayout NameKTXLayout = new javax.swing.GroupLayout(NameKTX);
        NameKTX.setLayout(NameKTXLayout);
        NameKTXLayout.setHorizontalGroup(
            NameKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NameKTXLayout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addGroup(NameKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NameKTXLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NameKTXLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235))))
        );
        NameKTXLayout.setVerticalGroup(
            NameKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NameKTXLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4))
        );

        Contents.setBackground(new java.awt.Color(255, 255, 255));
        Contents.setLayout(new java.awt.CardLayout());

        trangChu1.setBackground(new java.awt.Color(255, 255, 255));
        Contents.add(trangChu1, "card2");
        Contents.add(quanLySinhVien1, "card3");

        javax.swing.GroupLayout TrangchuLayout = new javax.swing.GroupLayout(Trangchu);
        Trangchu.setLayout(TrangchuLayout);
        TrangchuLayout.setHorizontalGroup(
            TrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrangchuLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameKTX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addGroup(TrangchuLayout.createSequentialGroup()
                        .addGap(1110, 1110, 1110)
                        .addComponent(Contents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 12, Short.MAX_VALUE))

                    .addComponent(Contents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))

        );
        TrangchuLayout.setVerticalGroup(
            TrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TrangchuLayout.createSequentialGroup()
                .addComponent(NameKTX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(Contents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Contents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))

        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Trangchu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Trangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dangxuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dangxuatMouseClicked
        int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn đăng xuất hay không !", "Thông báo đăng nhập", JOptionPane.YES_NO_OPTION);
        if (test == JOptionPane.YES_OPTION) {
            dispose();
            Login login = new Login();
            login.show();
        }
    }//GEN-LAST:event_dangxuatMouseClicked

    private void cailaimatkhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cailaimatkhauMouseClicked

    }//GEN-LAST:event_cailaimatkhauMouseClicked

    private void thongtintaikhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongtintaikhoanMouseClicked

    }//GEN-LAST:event_thongtintaikhoanMouseClicked

    private void thongkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongkeMouseClicked

    }//GEN-LAST:event_thongkeMouseClicked

    private void cackhoanphiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cackhoanphiMouseClicked

    }//GEN-LAST:event_cackhoanphiMouseClicked

    private void hopdongktxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hopdongktxMouseClicked

    }//GEN-LAST:event_hopdongktxMouseClicked

    private void quanlyphongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quanlyphongMouseClicked

    }//GEN-LAST:event_quanlyphongMouseClicked

    private void trangchuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trangchuMouseClicked
        trangChu1.setVisible(true);
        quanLySinhVien1.setVisible(false);
    }//GEN-LAST:event_trangchuMouseClicked

    private void dangxuat1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dangxuat1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dangxuat1MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contents;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel NameKTX;
    private javax.swing.JPanel Trangchu;
    private javax.swing.JLabel cackhoanphi;
    private javax.swing.JLabel cailaimatkhau;
    private javax.swing.JLabel dangxuat;
    private javax.swing.JLabel dangxuat1;
    private javax.swing.JLabel hopdongktx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private JFrameQuanLyKiTucXa.QuanLySinhVien quanLySinhVien1;
    private javax.swing.JLabel quanlynv;
    private javax.swing.JLabel quanlyphong;
    private javax.swing.JLabel quanlysv;
    private javax.swing.JLabel thongke;
    private javax.swing.JLabel thongtintaikhoan;
    private JFrameQuanLyKiTucXa.TrangChu trangChu1;
    private javax.swing.JLabel trangchu;
    private javax.swing.JLabel txtnameuser;
    // End of variables declaration//GEN-END:variables
}
