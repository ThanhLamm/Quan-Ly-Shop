/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author Thinkpad
 */
public class DangNhapDialog extends javax.swing.JDialog {

  /**
   * Creates new form Login
   */
  public DangNhapDialog(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    innit();

  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the
   * Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    txtTK = new javax.swing.JTextField();
    jSeparator2 = new javax.swing.JSeparator();
    txtMK = new javax.swing.JPasswordField();
    jSeparator4 = new javax.swing.JSeparator();
    bait = new javax.swing.JTextField();
    jPanel2 = new javax.swing.JPanel();
    jLabel7 = new javax.swing.JLabel();
    exit = new javax.swing.JLabel();
    rdoHienThi = new javax.swing.JRadioButton();
    lblKetThuc = new javax.swing.JLabel();
    lblDangNhap = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setUndecorated(true);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setForeground(new java.awt.Color(255, 255, 255));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    txtTK.setBackground(new java.awt.Color(253, 232, 252));
    txtTK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    txtTK.setForeground(new java.awt.Color(204, 204, 204));
    txtTK.setText("Nhập tài khoản");
    txtTK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(253, 232, 252)));
    txtTK.setOpaque(false);
    txtTK.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        txtTKFocusGained(evt);
      }
    });
    jPanel1.add(txtTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 280, 40));

    jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
    jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 340, 10));

    txtMK.setBackground(new java.awt.Color(253, 232, 252));
    txtMK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    txtMK.setForeground(new java.awt.Color(204, 204, 204));
    txtMK.setText("Nhập mật khẩu");
    txtMK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(253, 232, 252)));
    txtMK.setOpaque(false);
    txtMK.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        txtMKFocusGained(evt);
      }
    });
    jPanel1.add(txtMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 280, 40));

    jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
    jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 340, 10));

    bait.setBackground(new java.awt.Color(253, 232, 252));
    bait.setForeground(new java.awt.Color(253, 232, 252));
    bait.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(253, 232, 252)));
    bait.setCaretColor(new java.awt.Color(253, 232, 252));
    bait.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    jPanel1.add(bait, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, -1));

    jPanel2.setBackground(new java.awt.Color(204, 204, 204));
    jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseDragged(java.awt.event.MouseEvent evt) {
        jPanel2MouseDragged(evt);
      }
    });
    jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        jPanel2MousePressed(evt);
      }
    });

    jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fav.png"))); // NOI18N
    jLabel7.setText("Đăng nhập");

    exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exit.png"))); // NOI18N
    exit.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        exitMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        exitMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        exitMouseExited(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 644, Short.MAX_VALUE)
        .addComponent(exit)
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(exit)
    );

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 20));

    rdoHienThi.setBackground(new java.awt.Color(222, 222, 222));
    rdoHienThi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    rdoHienThi.setForeground(new java.awt.Color(102, 102, 102));
    rdoHienThi.setText("Hiển thị mật khẩu");
    rdoHienThi.setContentAreaFilled(false);
    rdoHienThi.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rdoHienThiActionPerformed(evt);
      }
    });
    jPanel1.add(rdoHienThi, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));

    lblKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ketthuc.png"))); // NOI18N
    lblKetThuc.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lblKetThucMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lblKetThucMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lblKetThucMouseExited(evt);
      }
    });
    jPanel1.add(lblKetThuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, -1, -1));

    lblDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/dangnhap.png"))); // NOI18N
    lblDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lblDangNhapMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lblDangNhapMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lblDangNhapMouseExited(evt);
      }
    });
    jPanel1.add(lblDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 130, 60));

    jLabel4.setBackground(new java.awt.Color(102, 102, 102));
    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    jLabel4.setText("Mật khẩu");
    jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));

    jLabel6.setBackground(new java.awt.Color(102, 102, 102));
    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    jLabel6.setText("Tài khoản");
    jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

    jLabel3.setBackground(new java.awt.Color(102, 102, 102));
    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
    jLabel3.setText("ĐĂNG NHẬP");
    jLabel3.setToolTipText("");
    jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hello2.png"))); // NOI18N
    jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -40, 660, -1));

    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cat.png"))); // NOI18N
    jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hello.png"))); // NOI18N
    jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 390, -1));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 540));

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void txtTKFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTKFocusGained
    // TODO add your handling code here:
    txtTK.setText("");
    txtTK.setForeground(new java.awt.Color(102, 102, 102));
  }//GEN-LAST:event_txtTKFocusGained

  private void txtMKFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMKFocusGained
    // TODO add your handling code here:
    txtMK.setText("");
    txtMK.setForeground(new java.awt.Color(102, 102, 102));
  }//GEN-LAST:event_txtMKFocusGained

  private void lblDangNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangNhapMouseClicked
    // TODO add your handling code here:
    login();
  }//GEN-LAST:event_lblDangNhapMouseClicked

  private void lblKetThucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKetThucMouseClicked
    // TODO add your handling code here:
    int o = JOptionPane.showConfirmDialog(this, "Bạn muốn thoát ?", "Thông báo", JOptionPane.YES_NO_OPTION);
    if(o==0) {
      System.exit(0);
    }
  }//GEN-LAST:event_lblKetThucMouseClicked

  private void rdoHienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoHienThiActionPerformed
    // TODO add your handling code here:
    boolean check = rdoHienThi.isSelected();
    if(check) {
      txtMK.setEchoChar((char) 0);
    } else {
      txtMK.setEchoChar('*');
    }
  }//GEN-LAST:event_rdoHienThiActionPerformed

  private void lblKetThucMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKetThucMouseEntered
    // TODO add your handling code here:
    lblKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ketthuc2.png")));
  }//GEN-LAST:event_lblKetThucMouseEntered

  private void lblKetThucMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKetThucMouseExited
    // TODO add your handling code here:
    lblKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ketthuc.png")));
  }//GEN-LAST:event_lblKetThucMouseExited

  private void lblDangNhapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangNhapMouseEntered
    // TODO add your handling code here:
    lblDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/dangnhap2.png")));
  }//GEN-LAST:event_lblDangNhapMouseEntered

  private void lblDangNhapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangNhapMouseExited
    // TODO add your handling code here:
    lblDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/dangnhap.png")));
  }//GEN-LAST:event_lblDangNhapMouseExited

  private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
    // TODO add your handling code here:
    System.exit(0);
  }//GEN-LAST:event_exitMouseClicked

  private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
    // TODO add your handling code here:
    exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exit-20.png")));
  }//GEN-LAST:event_exitMouseEntered

  private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
    // TODO add your handling code here:
    exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exit.png")));
  }//GEN-LAST:event_exitMouseExited

  int xx,xy;
  private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
    // TODO add your handling code here:
    xx = evt.getX();
    xy = evt.getY();
  }//GEN-LAST:event_jPanel2MousePressed

  private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
    // TODO add your handling code here:
    int x = evt.getXOnScreen();
    int y = evt.getYOnScreen();
    this.setLocation(x-xx,y-xy);
  }//GEN-LAST:event_jPanel2MouseDragged

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
      java.util.logging.Logger.getLogger(DangNhapDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(DangNhapDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(DangNhapDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(DangNhapDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        DangNhapDialog dialog = new DangNhapDialog(new javax.swing.JFrame(), true);
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
  private javax.swing.JTextField bait;
  private javax.swing.JLabel exit;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JSeparator jSeparator2;
  private javax.swing.JSeparator jSeparator4;
  private javax.swing.JLabel lblDangNhap;
  private javax.swing.JLabel lblKetThuc;
  private javax.swing.JRadioButton rdoHienThi;
  private javax.swing.JPasswordField txtMK;
  private javax.swing.JTextField txtTK;
  // End of variables declaration//GEN-END:variables

void innit() {
    this.setLocationRelativeTo(null);
    bait.requestFocus();
  }

  private void login() {
    this.setVisible(false);
    TrangChuFrame frame = new TrangChuFrame();
    frame.show(true);
    JOptionPane.showMessageDialog(this, "Đăng nhập thành công !");
    
  }

}
