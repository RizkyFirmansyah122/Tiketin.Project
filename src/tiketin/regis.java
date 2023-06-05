package tiketin;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 62813
 */
public class regis extends javax.swing.JFrame {
        public Connection con;
    public Statement stm;
    public PreparedStatement pst;
    public ResultSet rs = null;
    
    public class Koneksi{
        public Koneksi(){
            try {
               String url = "jdbc:mysql://localhost:3306/tiketin";
               String user = "root";
               String pass = "";
               Class.forName("com.mysql.cj.jdbc.Driver");
               con= DriverManager.getConnection(url, user, pass);
               stm = con.createStatement();
               
            }       catch (ClassNotFoundException | SQLException e){
                }
        }
    }
    
    /**
     * Creates new form regis
     */
    public regis() {
        initComponents();
       new Koneksi();
    }
     public boolean checkRegist(String username)
            {
                try {
                     String sqlcom = "select * from data_login";
                     rs = con.createStatement().executeQuery(sqlcom);
                    while(rs.next()){
                        if(username.equals(rs.getString("username"))){
                            return true;
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
                return false;
            }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userRegis = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passRegis = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telpRegis1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Username");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 80, 30));
        jPanel2.add(userRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 240, -1));

        jLabel3.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 80, 30));
        jPanel2.add(passRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 240, -1));

        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sudah Memiliki Akun? Login Sekarang");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 230, -1));
        jPanel2.add(telpRegis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 240, -1));

        jLabel5.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Nomor Telpon");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 100, -1));

        jButton1.setText("Daftar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 473, 80, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/login&regis.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        Login pindah = new Login();
        pindah.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    /**
 * Metode ini dipanggil ketika tombol jButton1 di klik.
 * Metode ini menangani logika penggunaan tombol tersebut.
 *
 * @param evt Objek ActionEvent yang mewakili event yang terjadi.
 */
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           if (checkRegist(userRegis.getText())) {
            JOptionPane.showMessageDialog(null, "Anda belum mengisi username", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (passRegis.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Anda belum mengisi password", "ERROR", JOptionPane.ERROR_MESSAGE);
            if (passRegis.getText().length() < 8) {
                JOptionPane.showMessageDialog(null, "Password Minimal Harus Memiliki 8 Karakter", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (telpRegis1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Anda belum mengisi nomor telepon", "ERROR", JOptionPane.ERROR_MESSAGE);
            if (telpRegis1.getText().length() <= 10) {
                JOptionPane.showMessageDialog(null, "Nomor Telepon Minimal Harus Memiliki 10 Karakter", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            String sql = "insert into login_user (username, password, no_telpon) values (?, ?, ?)";
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, userRegis.getText());
                pst.setString(2, passRegis.getText());
                pst.setString(3, telpRegis1.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan!");
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Password anda harus berupa angka", "Error",JOptionPane.ERROR_MESSAGE);
            }

            Login pindah = new Login();
            pindah.setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(regis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new regis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField passRegis;
    private javax.swing.JTextField telpRegis1;
    private javax.swing.JTextField userRegis;
    // End of variables declaration//GEN-END:variables
}
