/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiketin;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

/**
 *
 * @author huawei
 */
public class codeC implements kursi{
//    private String url = "jdbc:mysql://localhost:3306/tiketin";
//    private String user = "root";
//    private  String pass = "";
    private int jumlahKursi = 0;
    private int hargaTiket[] = {45000,50000,35000,50000,40000};
    private int totalHarga;
    private int pilihFilm;
    private int hargaFilm;
    private List<String> dataKursi = new ArrayList<>();    
    private String a  = "";
    
    public Connection con; 
    public Statement stm;
    public PreparedStatement pst;
    public ResultSet rs = null;
    
     public void Koneksi(){
            try {
               String url = "jdbc:mysql://localhost:3306/tiketin";
               String user = "root";
               String pass = "";
               Class.forName("com.mysql.cj.jdbc.Driver");
               con= DriverManager.getConnection(url, user, pass);
               stm = con.createStatement();
            }       catch (ClassNotFoundException | SQLException e){
                System.out.println(e);
            }
        }
     
     String no;
     public void setNoKursi(String nomorKursi){
       dataKursi.add(nomorKursi);
       no = nomorKursi;
     }
     
     private PreparedStatement ps;
     public void setALLConec(){
        try{
          stm = con.createStatement();
          String query = "INSERT INTO data_penonton (LOKASI, NOMOR_TEATER, JUDUL_FILM, JAM_TAYANG, TANGGAL, NOMOR_KURSI) VALUES (?,?,?,?,?,?)";
                
                ps = con.prepareStatement(query);
                for (String nomorKursi : list){
                ps.setString(1, getLokasi());
                ps.setInt(2, 1);
                ps.setString(3, getFilm());
                ps.setString(4, getJam());
                ps.setString(5, getTanggal());
                ps.setString(6, nomorKursi);
                ps.executeUpdate();
                System.out.println("Inter, Sukses terhubung ke database PostgreSQL");  
                }
                list.clear();
      }catch(SQLException ex){
            System.out.println("Inter C all, Gagal terhubung ke database PostgreSQL");
            ex.printStackTrace();
      }
    }
    
    public int getJumlahKursi(){
      return jumlahKursi;
    }
    
    public void setPesanBerapaKursi(JToggleButton kursi){

      if(kursi.getBackground() == Color.green){
        jumlahKursi++;
      }else{
        jumlahKursi--;
      }      
    }
    
    public int getTotalHarga(){
      totalHarga = jumlahKursi * 45000 ;   
      return totalHarga;
    } 
    
    private String lokasi,film,jam,nomorKursi,tanggal;
    
    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }
    
    public String getTanggal(){
        return tanggal;
    }
    
    public void setNomorKursi(String nomorKursi){
        this.nomorKursi = nomorKursi;
    }
    
    public String getNomorKursi(){
        return nomorKursi;
    }
    
    public void setJam(String jam){
        this.jam = jam;
    }
    
    public String getJam(){
        return jam;
    }
    
    public void setFilm(String film){
        this.film = film;
    }
    
    public String getFilm(){
        return film;
    }
    
    public void setLokasi(String lokasi){
        this.lokasi = lokasi;
    }
    
    public String getLokasi(){
        return lokasi;
    }
    
    private List<String> list = new ArrayList<>();
    public void setMisahString(String kursi){
        
        String b = "";
        for(int i = 0; i < kursi.length(); i++){
            
            if(kursi.charAt(i) != ',' && kursi.charAt(i) != ' '){
               b += kursi.charAt(i);
               
                if(b.length() == 2){
                   list.add(b);
                   setNoKursi(b);
                   b = "";
                }
            }          
        } 
    }
    
    public void dataKursi(){
        String ff = "";
        try{      
                  String query = "SELECT pilih_bangku FROM home_page WHERE pilih_hari = " +"'" +getTanggal()
                                                                      + "' AND lokasi = '" +getLokasi()
                                                                      + "' AND nama_film = '" +getFilm()
                                                                      + "' AND jam_tayang = '" +getJam()+ "'" ;
                  rs = stm.executeQuery(query);
                    while(rs.next() ){
                         String pisah = ""+rs.getString("pilih_bangku");
                         setMisahString(pisah);   
                    }      
        }catch(SQLException ex){
              System.out.println("Inter C 2, Gagal terhubung ke database PostgreSQL");
              ex.printStackTrace();
        }
    }
    
    private boolean aa =  false, bb = false, cc = false,dd = false, ee = false;  
    public void setAllStr(){
         boolean a =  false, b = false, c = false,d = false, e = false;
        
         String ff = "";
        try{      
                  String query = "SELECT  lokasi, nama_film, pilih_hari, jam_tayang FROM home_page";
                  rs = stm.executeQuery(query);
                    while(rs.next() ){
                         a = rs.getString("lokasi").equalsIgnoreCase(  getLokasi() );
                         b = rs.getString("nama_film").equalsIgnoreCase( getFilm() );
                         c = rs.getString("pilih_hari").equalsIgnoreCase(   getTanggal());
                         d = rs.getString("jam_tayang").equalsIgnoreCase(      getJam());
                         
//                         System.out.println(getLokasi() + " " + getFilm() + " " + getTanggal() + " " + getJam());
//                         System.out.println( a +" "+ b + " " +c + " " + d + " GAss");
                         
                         boolean aa= a && b && c && d;    
                         if(aa == true){
                           truA = aa;    
                         }  
                    }
                    
        }catch(SQLException ex){
              System.out.println("Inter C 2, Gagal terhubung ke database PostgreSQL");
              ex.printStackTrace();
        }
    }
    
    private boolean truA = false;
    public void setAllTrue(boolean all){
        truA = all;
    }
    
    public boolean allTrue(){
        return truA;
    }
    
    public void setGaje(JToggleButton kursi){
        try{      
                  String query = "SELECT lokasi, judul_film, nomor_kursi, jam_tayang, tanggal FROM data_penonton";
                  rs = stm.executeQuery(query);
                  boolean a =  false, b = false, c = false,d = false, e = false;
                    while(rs.next() ){
                         a = rs.getString("lokasi").equalsIgnoreCase(getLokasi());
                         b = rs.getString("judul_film").equalsIgnoreCase(getFilm());
                         c = rs.getString("nomor_kursi").equalsIgnoreCase(kursi.getText());
                         d = rs.getString("jam_tayang").equalsIgnoreCase(getJam());
                         e = rs.getString("tanggal").equalsIgnoreCase(getTanggal());
                        
                         if(a &&  b && c && d && e){
                            kursi.setEnabled(false);
                         }else{

                        }
                    }
        }catch(SQLException ex){
              System.out.println("Inter C 2, Gagal terhubung ke database PostgreSQL");
              ex.printStackTrace();
        }
    }
    
    public void setEnableKursi(JToggleButton kursi){
         boolean a =  false, b = false, c = false,d = false, e = false;
        
         String ff = "";      
//         setAllStr(); // Jangan DI buka!!
          for(int i = 0; i < list.size(); i++){
             System.out.println("Masuk Ke Enable");
          if(kursi.getText().equalsIgnoreCase(list.get(i) ) && truA  ){
              System.out.println("Masuk Ke Enable");
              kursi.setEnabled(false);
          }           
         }      
    }
    
   public void setEnab(JToggleButton kursi){
   boolean a =  false, b = false, c = false,d = false, e = false;
        
         for(int i = 0; i < list.size(); i++){
             System.out.println("Masuk Ke Enable");
          if(kursi.getText().equalsIgnoreCase(list.get(i) ) && truA  ){
              System.out.println("Masuk Ke Enable");
              kursi.setEnabled(false);
          }           
         }       
   
   }
        
        
    
    
}

interface kursi{
    void setEnableKursi(JToggleButton kursi);
    int getJumlahKursi();
}


interface autoConnec {
    public String Connec();
}


