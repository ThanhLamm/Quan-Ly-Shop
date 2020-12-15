/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Utils.Auth;
import Utils.DateHelper;
import Utils.ImageHelp;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import model.NhanVien;

/**
 *
 * @author Thinkpad
 */
public class TTCNDialog extends javax.swing.JDialog {

  /**
   * Creates new form themDVDialog
   */
  public TTCNDialog(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    customUI();
    initComponents();
    init();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the
   * Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    buttonGroup1 = new javax.swing.ButtonGroup();
    buttonGroup2 = new javax.swing.ButtonGroup();
    jPanel2 = new javax.swing.JPanel();
    jPanel1 = new javax.swing.JPanel();
    txtDiaChi = new javax.swing.JTextField();
    txtMatKhau = new javax.swing.JTextField();
    txtTenNV = new javax.swing.JTextField();
    txtMaNV = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    btnXacNhan = new javax.swing.JButton();
    txtNgaySinh = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    txtEmail = new javax.swing.JTextField();
    lblAnh = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    rdoQuanLy = new javax.swing.JRadioButton();
    rdoNV = new javax.swing.JRadioButton();
    jLabel7 = new javax.swing.JLabel();
    txtNgayVaoLam = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setUndecorated(true);

    jPanel2.setBackground(new java.awt.Color(241, 255, 246));
    jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 204), 3, true));

    jPanel1.setBackground(new java.awt.Color(241, 255, 246));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    txtDiaChi.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    txtDiaChi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
    txtDiaChi.setFocusable(false);
    txtDiaChi.setOpaque(false);
    jPanel1.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 230, -1));

    txtMatKhau.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    txtMatKhau.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
    txtMatKhau.setFocusable(false);
    txtMatKhau.setOpaque(false);
    jPanel1.add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 230, -1));

    txtTenNV.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    txtTenNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
    txtTenNV.setFocusable(false);
    txtTenNV.setOpaque(false);
    jPanel1.add(txtTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 230, -1));

    txtMaNV.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    txtMaNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
    txtMaNV.setFocusable(false);
    txtMaNV.setOpaque(false);
    jPanel1.add(txtMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 230, -1));

    jLabel1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    jLabel1.setText("Mã nhân viên:");
    jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

    jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    jLabel2.setText("Tên nhân viên:");
    jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

    jLabel3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    jLabel3.setText("Mật khẩu:");
    jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

    jLabel4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    jLabel4.setText("Ngày sinh:");
    jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

    jLabel5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    jLabel5.setText("Địa chỉ:");
    jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

    btnXacNhan.setBackground(new java.awt.Color(0, 255, 255));
    btnXacNhan.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    btnXacNhan.setText("OK");
    btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnXacNhanActionPerformed(evt);
      }
    });
    jPanel1.add(btnXacNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, -1, -1));

    txtNgaySinh.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    txtNgaySinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
    txtNgaySinh.setFocusable(false);
    txtNgaySinh.setOpaque(false);
    jPanel1.add(txtNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 230, -1));

    jLabel6.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    jLabel6.setText("Email:");
    jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

    txtEmail.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
    txtEmail.setFocusable(false);
    txtEmail.setOpaque(false);
    jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 230, -1));

    lblAnh.setBackground(new java.awt.Color(237, 240, 240));
    lblAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/images.jpg"))); // NOI18N
    lblAnh.setToolTipText("images.img");
    lblAnh.setOpaque(true);
    jPanel1.add(lblAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 180, 210));

    jLabel8.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    jLabel8.setText("Vai trò:");
    jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

    buttonGroup2.add(rdoQuanLy);
    rdoQuanLy.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    rdoQuanLy.setText("Quản lý");
    rdoQuanLy.setEnabled(false);
    rdoQuanLy.setOpaque(false);
    jPanel1.add(rdoQuanLy, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, -1, -1));

    buttonGroup2.add(rdoNV);
    rdoNV.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    rdoNV.setText("Nhân viên");
    rdoNV.setEnabled(false);
    rdoNV.setOpaque(false);
    jPanel1.add(rdoNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, -1, -1));

    jLabel7.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    jLabel7.setText("Ngày vào làm:");
    jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

    txtNgayVaoLam.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    txtNgayVaoLam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
    txtNgayVaoLam.setFocusable(false);
    txtNgayVaoLam.setOpaque(false);
    jPanel1.add(txtNgayVaoLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 230, -1));

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(28, 28, 28))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
    // TODO add your handling code here:
    setVisible(false);
  }//GEN-LAST:event_btnXacNhanActionPerformed

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
        if ("Windows".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(TTCNDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(TTCNDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(TTCNDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(TTCNDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        TTCNDialog dialog = new TTCNDialog(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnXacNhan;
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.ButtonGroup buttonGroup2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JLabel lblAnh;
  private javax.swing.JRadioButton rdoNV;
  private javax.swing.JRadioButton rdoQuanLy;
  private javax.swing.JTextField txtDiaChi;
  private javax.swing.JTextField txtEmail;
  private javax.swing.JTextField txtMaNV;
  private javax.swing.JTextField txtMatKhau;
  private javax.swing.JTextField txtNgaySinh;
  private javax.swing.JTextField txtNgayVaoLam;
  private javax.swing.JTextField txtTenNV;
  // End of variables declaration//GEN-END:variables
  void customUI() {
    //custom UI
    try {
      for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Windows".equals(info.getName())) {
          UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  void init() {
    this.setLocationRelativeTo(null);
    fillForm();
  }
  
  void fillForm() {
    NhanVien nv = Auth.user;
    txtTenNV.setText(nv.getTenNV());
    txtMaNV.setText(nv.getMaNV());
    txtMatKhau.setText(nv.getMatKhau());
    txtNgaySinh.setText(DateHelper.toString(nv.getNgaySinh(), "dd-MM-yyyy"));
    txtDiaChi.setText(nv.getDiaChi());
    txtEmail.setText(nv.getEmail());
    txtNgayVaoLam.setText(DateHelper.toString(nv.getNgayVaoLam(), "dd-MM-yyyy"));
    lblAnh.setToolTipText(nv.getHinhAnh());
    ImageIcon icon = ImageHelp.read(nv.getHinhAnh());
    Image scaleIcon = icon.getImage().getScaledInstance(lblAnh.getWidth(), lblAnh.getHeight(), Image.SCALE_DEFAULT);
    lblAnh.setIcon(new javax.swing.ImageIcon(scaleIcon));
    if(nv.isVaiTro()) {
      rdoQuanLy.setSelected(true);
    } else {
      rdoNV.setSelected(true);
    }
  }
}
