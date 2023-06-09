/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tiketin;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

/**
 *
 * @author 62813
 */
public class PilihTiket extends javax.swing.JFrame {
    public Connection con; 
    public Statement stm;
    public PreparedStatement pst;
    public ResultSet rs = null;
    public codeC param;
    public String waktu;
    public String tanggal;
    
     public void Koneksi(){
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
    /**
     * Creates new form fvjh
     */
    public PilihTiket() {
        initComponents();
        avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource( HomePage.urlGambar)));
        KKN.setText(HomePage.nameFilm);
        resetButton();
        setTanggalan();
        setSelectWarna();
        Koneksi();
    }
    
    private boolean filmTidakBerlangsung = false;
     public void setTanggalan(){
      JToggleButton[] allJ = {jToggleButton1,jToggleButton2,jToggleButton3,jToggleButton4,jToggleButton5,jToggleButton6};   
      LocalDate today = LocalDate.now();
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
       
        for(int i = 0; i < allJ.length; i++){
	  LocalDate hh = today.plusDays(i);	
          String hari = hh.format(formatter);
	  allJ[i].setText(hari);
      }
    }
     
     
     private boolean boleh = false;
     int tombolke = 0;
 
    public void setJam(java.awt.event.ActionEvent evt){
        
        JToggleButton[] allJ = {jToggleButton1,jToggleButton2,jToggleButton3,jToggleButton4,jToggleButton5,jToggleButton6
         ,jam,jam2,jam4,jam5,jam6,jam7,jam8,jam9,jam10,jam11
        }; 
        

            setSelectWarna();
            JToggleButton jam = (JToggleButton) evt.getSource();            
            LocalTime jamMulai = LocalTime.parse(jam.getText());
            Duration selisih = Duration.between(jamMulai, LocalTime.now());
            long toJam = selisih.toHours();
            long toMenit = selisih.toMinutesPart();
            pilihBangku bangku = new pilihBangku();

            if(toJam <= 0 && toMenit <= 0 || !jToggleButton1.isSelected()){
                  boleh = true;
            }else if (toJam >= 0 && toMenit >= 0 && jToggleButton1.isSelected()) {
                 JOptionPane.showMessageDialog(null, "Maaf Film Sedang Berlangsung :(", "Film berlangsung mulai", JOptionPane.YES_OPTION);
                  boleh = false;  
            }
        
    } 
    
    public void setSelectWarna(){
        JToggleButton[] allJ = {jToggleButton1,jToggleButton2,jToggleButton3,jToggleButton4,jToggleButton5,jToggleButton6
         ,jam,jam2,jam4,jam5,jam6,jam7,jam8,jam9,jam10,jam11
        }; 
        
            

        for(int i = 0; i < allJ.length; i++){
          if(allJ[i].isSelected()){
            allJ[i].setBackground(Color.green);
                if(i < 6){
                   tanggal = allJ[i].getText();
                }else{
                   waktu = jam.getText();
                }
          }else{
            allJ[i].setBackground(Color.white);
          }
        }
    }
    
     public void cekTopup(){
        boolean cekTopup = false;
        List<AbstractButton> listToogleButton = Collections.list(pilihJamBioskop1.getElements());
        for (AbstractButton button : listToogleButton) {
            tombolke++;
            if(button.isSelected()){ 
                cekTopup = true;
                break;
            }
        }
//        System.out.println(tombolke);
//        System.out.println(cekTopup);
        
    }
     
     public void resetButton(){
       JToggleButton[] allJ = {jToggleButton1,jToggleButton2,jToggleButton3,jToggleButton4,jToggleButton5,jToggleButton6
         ,jam,jam2,jam4,jam5,jam6,jam7,jam8,jam9,jam10,jam11
        }; 
        boleh = false;
        for(int i = 0; i < allJ.length; i++){
          allJ[i].setBackground(Color.white);
        }
       
     }
    
    public void setResetAutoDate(){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pilihHari1 = new javax.swing.ButtonGroup();
        pilihJamBioskop1 = new javax.swing.ButtonGroup();
        gambar_1 = new javax.swing.JPanel();
        avangers = new javax.swing.JLabel();
        KKN = new javax.swing.JLabel();
        rincianFilm = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        namaBioskop1 = new javax.swing.JLabel();
        jam = new javax.swing.JToggleButton();
        jam2 = new javax.swing.JToggleButton();
        jam4 = new javax.swing.JToggleButton();
        jam5 = new javax.swing.JToggleButton();
        jam6 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        namaBioskop2 = new javax.swing.JLabel();
        jam7 = new javax.swing.JToggleButton();
        jam8 = new javax.swing.JToggleButton();
        jam9 = new javax.swing.JToggleButton();
        jam10 = new javax.swing.JToggleButton();
        jam11 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jToggleButton3 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gambar_1.setBackground(new java.awt.Color(0, 153, 153));
        gambar_1.setPreferredSize(new java.awt.Dimension(400, 645));

        //HomePage hom = new HomePage();
        avangers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/kkn.jpg")));

        KKN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        KKN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        KKN.setText("Avengers: Infinity War");

        rincianFilm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rincianFilm.setText("2018  Laga/Fiksi ilmiah durasi 2 j 29 m");

        pilihHari1.add(jToggleButton1);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        pilihHari1.add(jToggleButton2);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        pilihHari1.add(jToggleButton4);
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        pilihHari1.add(jToggleButton5);
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        pilihHari1.add(jToggleButton6);
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        namaBioskop1.setText("AEON MALL JGC CGV - Studio 2");

        pilihJamBioskop1.add(jam);
        jam.setText("12:15");
        jam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jamActionPerformed(evt);
            }
        });

        pilihJamBioskop1.add(jam2);
        jam2.setText("15:10");
        jam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam2ActionPerformed(evt);
            }
        });

        pilihJamBioskop1.add(jam4);
        jam4.setText("17:15");
        jam4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam4ActionPerformed(evt);
            }
        });

        pilihJamBioskop1.add(jam5);
        jam5.setText("14:10");
        jam5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam5ActionPerformed(evt);
            }
        });

        pilihJamBioskop1.add(jam6);
        jam6.setText("16:10");
        jam6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(namaBioskop1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jam, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jam5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jam2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jam6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jam4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(namaBioskop1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jam5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jam2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jam6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jam4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));

        namaBioskop2.setText("Transmart XXI -  Studio 3");

        pilihJamBioskop1.add(jam7);
        jam7.setText("12:00");
        jam7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam7ActionPerformed(evt);
            }
        });

        pilihJamBioskop1.add(jam8);
        jam8.setText("16:00");
        jam8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam8ActionPerformed(evt);
            }
        });

        pilihJamBioskop1.add(jam9);
        jam9.setText("20:00");
        jam9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam9ActionPerformed(evt);
            }
        });

        pilihJamBioskop1.add(jam10);
        jam10.setText("14:00");
        jam10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam10ActionPerformed(evt);
            }
        });

        pilihJamBioskop1.add(jam11);
        jam11.setText("18:00");
        jam11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(namaBioskop2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jam10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(jam11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jam7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jam8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addComponent(jam9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(namaBioskop2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jam7)
                            .addComponent(jam8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jam11)
                            .addComponent(jam10)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jam9)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setText("Pilih Bangku");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketin/icons8_home_32px.png"))); // NOI18N
        jLabel9.setText("Home");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        pilihHari1.add(jToggleButton3);
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gambar_1Layout = new javax.swing.GroupLayout(gambar_1);
        gambar_1.setLayout(gambar_1Layout);
        gambar_1Layout.setHorizontalGroup(
            gambar_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gambar_1Layout.createSequentialGroup()
                .addGroup(gambar_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gambar_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(rincianFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(gambar_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gambar_1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(KKN, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(gambar_1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(avangers))))
                    .addGroup(gambar_1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gambar_1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gambar_1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(gambar_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gambar_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gambar_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        gambar_1Layout.setVerticalGroup(
            gambar_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gambar_1Layout.createSequentialGroup()
                .addGroup(gambar_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gambar_1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(avangers, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gambar_1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KKN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rincianFilm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gambar_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(gambar_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gambar_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gambar_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gambar_1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
      setSelectWarna();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jam7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam7ActionPerformed
        setJam(evt);
    }//GEN-LAST:event_jam7ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        HomePage home = new HomePage();
        home.setVisible(true);
        this.setVisible(false);
//        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JToggleButton[] allJ = {jToggleButton1,jToggleButton2,jToggleButton3,jToggleButton4,jToggleButton5,jToggleButton6
         ,jam,jam2,jam4,jam5,jam6,jam7,jam8,jam9,jam10,jam11
        };
        if(evt.getSource() == jButton1 && boleh){ 
                pilihBangku pilih = new pilihBangku();
                if(tombolke > 0 && tombolke <= 5){
            
                    pilih.ruangStudio.setText(namaBioskop1.getText());
                }else{
                    pilih.ruangStudio.setText(namaBioskop2.getText());
                }
                
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(pilihBangku.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                pilih.setVisible(true);
                this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        setSelectWarna();
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
       setSelectWarna();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
         setSelectWarna();
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
       setSelectWarna();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
         setSelectWarna();
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jamActionPerformed
       setJam(evt);
       cekTopup();
    }//GEN-LAST:event_jamActionPerformed

    private void jam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam2ActionPerformed
        setJam(evt);
        cekTopup();
    }//GEN-LAST:event_jam2ActionPerformed

    private void jam4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam4ActionPerformed
        setJam(evt);
        cekTopup();
    }//GEN-LAST:event_jam4ActionPerformed

    private void jam5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam5ActionPerformed
        setJam(evt);
        cekTopup();
    }//GEN-LAST:event_jam5ActionPerformed

    private void jam6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam6ActionPerformed
       setJam(evt);
       cekTopup();
    }//GEN-LAST:event_jam6ActionPerformed

    private void jam8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam8ActionPerformed
       setJam(evt);
       cekTopup();
    }//GEN-LAST:event_jam8ActionPerformed

    private void jam10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam10ActionPerformed
       setJam(evt);
       cekTopup();
    }//GEN-LAST:event_jam10ActionPerformed

    private void jam11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam11ActionPerformed
       setJam(evt);
       cekTopup();
    }//GEN-LAST:event_jam11ActionPerformed

    private void jam9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam9ActionPerformed
        setJam(evt);
        cekTopup();
    }//GEN-LAST:event_jam9ActionPerformed

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
            java.util.logging.Logger.getLogger(PilihTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihTiket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel KKN;
    public static javax.swing.JLabel avangers;
    private javax.swing.JPanel gambar_1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jam;
    private javax.swing.JToggleButton jam10;
    private javax.swing.JToggleButton jam11;
    private javax.swing.JToggleButton jam2;
    private javax.swing.JToggleButton jam4;
    private javax.swing.JToggleButton jam5;
    private javax.swing.JToggleButton jam6;
    private javax.swing.JToggleButton jam7;
    private javax.swing.JToggleButton jam8;
    private javax.swing.JToggleButton jam9;
    public static javax.swing.JLabel namaBioskop1;
    public static javax.swing.JLabel namaBioskop2;
    public static javax.swing.ButtonGroup pilihHari1;
    public static javax.swing.ButtonGroup pilihJamBioskop1;
    public static javax.swing.JLabel rincianFilm;
    // End of variables declaration//GEN-END:variables
}
