/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tiketin;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
/**
 *
 * @author 62813
 */
public class HomePage extends javax.swing.JFrame {
    public Connection con; 
    public Statement stm;
    public PreparedStatement pst;
    public ResultSet rs = null;
    private codeC param;
    public String lokasi;
    public String namaFilm;
    
     public void Koneksi(){
            try {
               String url = "jdbc:mysql://localhost:3306/tiketin";
               String user = "root";
               String pass = "";
               Class.forName("com.mysql.cj.jdbc.Driver");
               con= DriverManager.getConnection(url, user, pass);
               stm = con.createStatement();
               System.out.println("Berhasil Konek Home");
            } catch (ClassNotFoundException | SQLException e){
                
            }
        }

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
        Koneksi();
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
        jLabel2 = new javax.swing.JLabel();
        lokasi1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(510, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/user icon.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 50));

        lokasi1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Lokasi", "Jakarta", "Bekasi", "Depok", "Bogor", "Tanggerang" }));
        lokasi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lokasi1ActionPerformed(evt);
            }
        });
        jPanel1.add(lokasi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 12, 380, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Pilih Filim ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/suzume.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 100, 140));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/aveg.jpeg"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 90, 140));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/SIlentvoice (1).jpg"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 100, 150));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/kkn.jpg"))); // NOI18N
        jLabel6.setText("jLabel3");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 100, 150));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/pope.jpg"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 100, 150));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/evil.jpg"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 100, 140));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/icons8_home_32px.png"))); // NOI18N
        jLabel9.setText("Exit");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/icons8_news_26px_1.png"))); // NOI18N
        jLabel10.setText("Riwayat pesanan");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLayeredPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 510, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        //method untuk menentukan pilihan tiket sesuai gambar daan lokasi
   if(lokasi1.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "anda belum memilih lokasi", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
                PilihTiket pilih = new PilihTiket();
               PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/aveg.jpeg")));
               PilihTiket.KKN.setText("Avengers: Endgame");
               PilihTiket.rincianFilm.setText("2019 ‧ Laga/Fiksi ilmiah ‧ 3 j 1 m");
               if(lokasi1.getSelectedIndex()==1){
                      PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/aveg.jpeg")));
                   PilihTiket.namaBioskop1.setText("MAll Jakarta 1");
                    PilihTiket.namaBioskop2.setText("MAll Jakarta 2");
                     pilih.setVisible(true);
                     this.setVisible(false);
               }else if(lokasi1.getSelectedIndex()==2){
                      PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/aveg.jpeg")));
                     PilihTiket.namaBioskop1.setText("MAll bekasi 1");
                    PilihTiket.namaBioskop2.setText("MAll bekasi2");
                     pilih.setVisible(true);
                     this.setVisible(false);
               }else if(lokasi1.getSelectedIndex()==3){
                      PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/aveg.jpeg")));
                     PilihTiket.namaBioskop1.setText("MAll depok 1");
                    PilihTiket.namaBioskop2.setText("MAll depok 2");
                     pilih.setVisible(true);
                     this.setVisible(false);
                }else if(lokasi1.getSelectedIndex()==4){
                       PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/aveg.jpeg")));
                     PilihTiket.namaBioskop1.setText("MAll bogor 1");
                    PilihTiket.namaBioskop2.setText("MAll bogor 2");
                     pilih.setVisible(true);
                     this.setVisible(false);
                }else if(lokasi1.getSelectedIndex()==5){
                       PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/aveg.jpeg")));
                     PilihTiket.namaBioskop1.setText("MAll  tanggerang 1");
                    PilihTiket.namaBioskop2.setText("MAll tanggerang 2");
                     pilih.setVisible(true);
                     this.setVisible(false);
                }
         }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        //ethod untuk menentukan pilihan tiket sesuai gambar daan lokasi
        if(lokasi1.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "anda belum memilih lokasi", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
                    PilihTiket pilih = new PilihTiket();
                   PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/kkn.jpg")));
                   PilihTiket.KKN.setText("KKN di Desa Penari");
                    PilihTiket.rincianFilm.setText("2022  Horror  2 j 1 m");
                     if(lokasi1.getSelectedIndex()==1){
                          PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/kkn.jpg")));
                       PilihTiket.namaBioskop1.setText("MAll Jakarta 1");
                        PilihTiket.namaBioskop2.setText("MAll Jakarta 2");
                         pilih.setVisible(true);
                         this.setVisible(false);
                   }else if(lokasi1.getSelectedIndex()==2){
                          PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/kkn.jpg")));
                         PilihTiket.namaBioskop1.setText("MAll bekasi 1");
                        PilihTiket.namaBioskop2.setText("MAll bekasi2");
                         pilih.setVisible(true);
                         this.setVisible(false);
                   }else if(lokasi1.getSelectedIndex()==3){
                          PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/kkn.jpg")));
                         PilihTiket.namaBioskop1.setText("MAll depok 1");
                        PilihTiket.namaBioskop2.setText("MAll depok 2");
                         pilih.setVisible(true);
                         this.setVisible(false);
                    }else if(lokasi1.getSelectedIndex()==4){
                           PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/kkn.jpg")));
                         PilihTiket.namaBioskop1.setText("MAll bogor 1");
                        PilihTiket.namaBioskop2.setText("MAll bogor 2");
                         pilih.setVisible(true);
                         this.setVisible(false);
                    }else if(lokasi1.getSelectedIndex()==5){
                           PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/kkn.jpg")));
                         PilihTiket.namaBioskop1.setText("MAll  tanggerang 1");
                        PilihTiket.namaBioskop2.setText("MAll tanggerang 2");
                         pilih.setVisible(true);
                         this.setVisible(false);
                    }
      }

    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:       
        //method untuk menentukan pilihan tiket sesuai gambar daan lokasi
 if(lokasi1.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "anda belum memilih lokasi", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
                PilihTiket pilih = new PilihTiket();
                  PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/suzume.jpg")));
                   PilihTiket.KKN.setText("Suzume");
                   PilihTiket.rincianFilm.setText("2022 ‧ Petualangan/Animasi ‧ 2 j 2 m");
                   if(lokasi1.getSelectedIndex()==1){
                         PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/suzume.jpg")));
                      PilihTiket.namaBioskop1.setText("MAll Jakarta 1");
                       PilihTiket.namaBioskop2.setText("MAll Jakarta 2");
                        pilih.setVisible(true);
                        this.setVisible(false);
                  }else if(lokasi1.getSelectedIndex()==2){
                         PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/suzume.jpg")));
                        PilihTiket.namaBioskop1.setText("MAll bekasi 1");
                       PilihTiket.namaBioskop2.setText("MAll bekasi2");
                        pilih.setVisible(true);
                        this.setVisible(false);
                  }else if(lokasi1.getSelectedIndex()==3){
                         PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/suzume.jpg")));
                        PilihTiket.namaBioskop1.setText("MAll depok 1");
                       PilihTiket.namaBioskop2.setText("MAll depok 2");
                        pilih.setVisible(true);
                        this.setVisible(false);
                   }else if(lokasi1.getSelectedIndex()==4){
                          PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/suzume.jpg")));
                        PilihTiket.namaBioskop1.setText("MAll bogor 1");
                       PilihTiket.namaBioskop2.setText("MAll bogor 2");
                        pilih.setVisible(true);
                        this.setVisible(false);
                   }else if(lokasi1.getSelectedIndex()==5){
                          PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/suzume.jpg")));
                        PilihTiket.namaBioskop1.setText("MAll  tanggerang 1");
                       PilihTiket.namaBioskop2.setText("MAll tanggerang 2");
                        pilih.setVisible(true);
                        this.setVisible(false);
                   }
           }  
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
         //method untuk menentukan pilihan tiket sesuai gambar daan lokasi
            if(lokasi1.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "anda belum memilih lokasi", "Error", JOptionPane.ERROR_MESSAGE);
                        PilihTiket pilih = new PilihTiket();
                        PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/evil.jpg")));
                        PilihTiket.KKN.setText("Evil Dead Rise");
                            PilihTiket.rincianFilm.setText("2023 ‧ Horor/Fantasi ‧ 1 j 36 m");
                        if(lokasi1.getSelectedIndex()==1){
                               PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/evil.jpg")));
                            PilihTiket.namaBioskop1.setText("MAll Jakarta 1");
                             PilihTiket.namaBioskop2.setText("MAll Jakarta 2");
                              pilih.setVisible(true);
                              this.setVisible(false);
                        }else if(lokasi1.getSelectedIndex()==2){
                               PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/evil.jpg")));
                              PilihTiket.namaBioskop1.setText("MAll bekasi 1");
                             PilihTiket.namaBioskop2.setText("MAll bekasi2");
                              pilih.setVisible(true);
                              this.setVisible(false);
                        }else if(lokasi1.getSelectedIndex()==3){
                               PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/evil.jpg")));
                              PilihTiket.namaBioskop1.setText("MAll depok 1");
                             PilihTiket.namaBioskop2.setText("MAll depok 2");
                              pilih.setVisible(true);
                              this.setVisible(false);
                         }else if(lokasi1.getSelectedIndex()==4){
                                PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/evil.jpg")));
                              PilihTiket.namaBioskop1.setText("MAll bogor 1");
                             PilihTiket.namaBioskop2.setText("MAll bogor 2");
                              pilih.setVisible(true);
                              this.setVisible(false);
                         }else if(lokasi1.getSelectedIndex()==5){
                                PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/evil.jpg")));
                              PilihTiket.namaBioskop1.setText("MAll  tanggerang 1");
                             PilihTiket.namaBioskop2.setText("MAll tanggerang 2");
                              pilih.setVisible(true);
                              this.setVisible(false);
                         } 
            }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
       //method untuk menentukan pilihan tiket sesuai gambar daan lokasi
if(lokasi1.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "anda belum memilih lokasi", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
                PilihTiket pilih = new PilihTiket();
                 PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/pope.jpg")));
                  PilihTiket.KKN.setText("The Pope's Exorcist");
                     PilihTiket.rincianFilm.setText("2023 ‧ Horor ‧ 1 j 43 m");
                   if(lokasi1.getSelectedIndex()==1){
                        PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/pope.jpg")));
                     PilihTiket.namaBioskop1.setText("MAll Jakarta 1");
                      PilihTiket.namaBioskop2.setText("MAll Jakarta 2");
                       pilih.setVisible(true);
                       this.setVisible(false);
                 }else if(lokasi1.getSelectedIndex()==2){
                        PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/pope.jpg")));
                       PilihTiket.namaBioskop1.setText("MAll bekasi 1");
                      PilihTiket.namaBioskop2.setText("MAll bekasi2");
                       pilih.setVisible(true);
                       this.setVisible(false);
                 }else if(lokasi1.getSelectedIndex()==3){
                        PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/pope.jpg")));
                       PilihTiket.namaBioskop1.setText("MAll depok 1");
                      PilihTiket.namaBioskop2.setText("MAll depok 2");
                       pilih.setVisible(true);
                       this.setVisible(false);
                  }else if(lokasi1.getSelectedIndex()==4){
                         PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/pope.jpg")));
                       PilihTiket.namaBioskop1.setText("MAll bogor 1");
                      PilihTiket.namaBioskop2.setText("MAll bogor 2");
                       pilih.setVisible(true);
                       this.setVisible(false);
                  }else if(lokasi1.getSelectedIndex()==5){
                         PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/pope.jpg")));
                       PilihTiket.namaBioskop1.setText("MAll  tanggerang 1");
                      PilihTiket.namaBioskop2.setText("MAll tanggerang 2");
                       pilih.setVisible(true);
                       this.setVisible(false);
                  }
          }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        // namaa file gambar silent voice itu setelah S huruf i besar dan setelahnya l kecil
        if(lokasi1.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "anda belum memilih lokasi", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
                PilihTiket pilih = new PilihTiket();
                 PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/SIlentvoice (1).jpg")));
                  PilihTiket.KKN.setText("A Silent Voice");
                  PilihTiket.rincianFilm.setText("2016 ‧ Roman/Drama ‧ 2 j 9 m");
                  if(lokasi1.getSelectedIndex()==1){
                        PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/SIlentvoice (1).jpg")));
                     PilihTiket.namaBioskop1.setText("MAll Jakarta 1");
                      PilihTiket.namaBioskop2.setText("MAll Jakarta 2");
                       pilih.setVisible(true);
                       this.setVisible(false);
                 }else if(lokasi1.getSelectedIndex()==2){
                        PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/SIlentvoice (1).jpg")));
                       PilihTiket.namaBioskop1.setText("MAll bekasi 1");
                      PilihTiket.namaBioskop2.setText("MAll bekasi2");
                       pilih.setVisible(true);
                       this.setVisible(false);
                 }else if(lokasi1.getSelectedIndex()==3){
                        PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/SIlentvoice (1).jpg")));
                       PilihTiket.namaBioskop1.setText("MAll depok 1");
                      PilihTiket.namaBioskop2.setText("MAll depok 2");
                       pilih.setVisible(true);
                       this.setVisible(false);
                  }else if(lokasi1.getSelectedIndex()==4){
                         PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/SIlentvoice (1).jpg")));
                       PilihTiket.namaBioskop1.setText("MAll bogor 1");
                      PilihTiket.namaBioskop2.setText("MAll bogor 2");
                       pilih.setVisible(true);
                       this.setVisible(false);
                  }else if(lokasi1.getSelectedIndex()==5){
                         PilihTiket.avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/SIlentvoice (1).jpg")));
                       PilihTiket.namaBioskop1.setText("MAll  tanggerang 1");
                      PilihTiket.namaBioskop2.setText("MAll tanggerang 2");
                       pilih.setVisible(true);
                       this.setVisible(false);
                  }
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
      RiwayatTransaksi riwayat = new RiwayatTransaksi();
      riwayat.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        UserPage user = new UserPage();
        user.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void lokasi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lokasi1ActionPerformed
        // TODO add your handling code here:
                            
        if(lokasi1.getSelectedIndex()==1){
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
        }else if(lokasi1.getSelectedIndex()==2){
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(false);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
        }else if(lokasi1.getSelectedIndex()==3){
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
        }else if(lokasi1.getSelectedIndex()==4){
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(false);
            jLabel6.setVisible(true);
            jLabel7.setVisible(false);
            jLabel8.setVisible(true);
        }else if(lokasi1.getSelectedIndex()==5){
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);           
        }
        
        
    }//GEN-LAST:event_lokasi1ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JComboBox<String> lokasi1;
    // End of variables declaration//GEN-END:variables
}
