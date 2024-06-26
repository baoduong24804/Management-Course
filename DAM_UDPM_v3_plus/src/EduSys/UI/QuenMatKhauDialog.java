package EduSys.UI;

import EduSys.DAO.NhanVienDAO;
import EduSys.Entity.NhanVien;
import EduSys.Utils.Auth;
import EduSys.Utils.MsgBox;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFrame;
import org.apache.log4j.PropertyConfigurator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
/**
 *
 * @author anhba
 */
public class QuenMatKhauDialog extends javax.swing.JDialog {

    public static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(QuenMatKhauDialog.class);

    /**
     * Creates new form QuenMatKhauDialog
     */
    public QuenMatKhauDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //  setSize(1000, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        PropertyConfigurator.configure("src/EduSys/Log/log4j.properties");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtGmail = new javax.swing.JTextField();
        btnLayLaiTK = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        chbXacNhan = new javax.swing.JCheckBox();
        txtTaiKhoan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnTroLai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.setEnabled(false);

        txtGmail.setText("ngoczig11@gmail.com");
        txtGmail.setMinimumSize(new java.awt.Dimension(64, 24));
        txtGmail.setPreferredSize(new java.awt.Dimension(64, 24));

        btnLayLaiTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Image/Mail.png"))); // NOI18N
        btnLayLaiTK.setText("Lấy lại tài khoản");
        btnLayLaiTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLayLaiTKActionPerformed(evt);
            }
        });

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Image/Delete.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tài khoản");

        chbXacNhan.setText("Xác nhận lấy lại tài khoản");

        txtTaiKhoan.setText("tybao");
        txtTaiKhoan.setMinimumSize(new java.awt.Dimension(64, 24));
        txtTaiKhoan.setPreferredSize(new java.awt.Dimension(64, 24));
        txtTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaiKhoanActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Gmail");

        btnTroLai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTroLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Image/Left.png"))); // NOI18N
        btnTroLai.setText("Trở lại");
        btnTroLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLayLaiTK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThoat))
                    .addComponent(chbXacNhan)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnTroLai)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbXacNhan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLayLaiTK)
                    .addComponent(btnThoat))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLayLaiTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLayLaiTKActionPerformed
        // TODO add your handling code here:
        layLaiTK();
    }//GEN-LAST:event_btnLayLaiTKActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        ketThuc();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnTroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroLaiActionPerformed
        // TODO add your handling code here:
        openDangNhap();
    }//GEN-LAST:event_btnTroLaiActionPerformed

    private void txtTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaiKhoanActionPerformed

    private void openDangNhap() {
        this.dispose();
        new DangNhapJDialog(null, true).setVisible(true);

    }

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
            java.util.logging.Logger.getLogger(QuenMatKhauDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhauDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhauDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhauDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuenMatKhauDialog dialog = new QuenMatKhauDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        //   System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    NhanVienDAO nvdao = new NhanVienDAO();
    Random ranDom = new Random();

    void ketThuc() {
        this.dispose();
    }

    String gmail = "";
    String tk = "";

    void layLaiTK() {
        if (!chbXacNhan.isSelected()) {
            MsgBox.alert(null, "Hãy chắc rằng bạn muốn lấy lại tài khoản");
            return;
        }
        if (txtGmail.getText().trim().isEmpty() || txtTaiKhoan.getText().trim().isEmpty()) {
            return;
        }

        gmail = txtGmail.getText().trim();
        tk = txtTaiKhoan.getText().trim();

        List<NhanVien> nvList = nvdao.select();
        if (nvList.size() <= 0) {
            return;
        }
        for (NhanVien nhanVien : nvList) {
            if (nhanVien.getMaNV().equalsIgnoreCase(tk)) {

                if (nhanVien.getGmail().trim().equalsIgnoreCase(gmail)) {
                    send();
                    MsgBox.alert(null, "Đã gửi mật khẩu mới");
                    logger.info("Tài khoản ["+txtTaiKhoan.getText().trim()+" vừa lấy tại tài khoản");
                }

            }

        }

        //   send();
    }

    void send() {
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", 587);
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        String tk = "anhbao5cm@gmail.com";
        String mk = "knjspdspewcyjmpz";

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(tk, mk);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(tk));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(gmail)// Gmail nguời nhận
            );
            message.setSubject("Quên mật khẩu");// Tiêu đề tin nhắn
            int rdpass = ranDom.nextInt(9000) + 1000;
            nvdao.forgotpass(rdpass, this.tk);
            message.setText("Tài khoản và mật khẩu mới:\n Tài khoản: " + txtTaiKhoan.getText().trim() + "\n Mật khẩu: " + rdpass);// Nội dung tin nhắn

            Transport.send(message);

            MsgBox.alert(null, "Đã gửi mật khẩu mới về Gmail");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLayLaiTK;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTroLai;
    private javax.swing.JCheckBox chbXacNhan;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtGmail;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
