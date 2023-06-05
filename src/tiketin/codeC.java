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
public class codeC extends getDatas implements kursi{
    private int jumlahKursi = 0;
    private int hargaTiket[] = {45000,50000,35000,50000,40000};
    private int totalHarga;
    private int pilihFilm;
    private int hargaFilm;
    private List<String> dataKursi = new ArrayList<>();    
    private String a  = "";
    private boolean aa =  false, bb = false, cc = false,dd = false, ee = false;  
   
    public Connection con = null; 
    public Statement stm = null;
    public PreparedStatement pst = null;
    public ResultSet rs = null;
    
    private List<String>home = new ArrayList<>();
    private List<String>pilihTik = new ArrayList<>();
    private List<String>randm = new ArrayList<>();

    public codeC(String tanggal, String lokasi, String film, String jam) {
        super(tanggal, lokasi, film, jam);
    }
  
    public codeC(){}
    
     public void Koneksi(){
            try {
               String url = "jdbc:mysql://localhost:3306/tiketin";
               String user = "root";
               String pass = "";
               Class.forName("com.mysql.cj.jdbc.Driver");
               con = DriverManager.getConnection(url, user, pass);
               stm = con.createStatement();
               
            }       catch (ClassNotFoundException | SQLException e){
                System.out.println(e);
            }
        }
     
    public void setCloseReset(){
          try {
               con.close();
               stm.close();
            }  catch (SQLException ex){
                System.out.println(ex);
            }
     }
     
     String no;
     
     public void setNoKursi(String nomorKursi){
       dataKursi.add(nomorKursi);
       no = nomorKursi;
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
    
    public void setAllStr(){
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
        
        
        
         boolean a =  false, b = false, c = false,d = false, e = false;
        
//         String ff = "";
        try{      
                  String query = "SELECT  lokasi, nama_film, pilih_hari, jam_tayang FROM home_page";
                  rs = stm.executeQuery(query);
                    while(rs.next() ){
                         a = rs.getString("lokasi").equalsIgnoreCase(  getLokasi() );
                         b = rs.getString("nama_film").equalsIgnoreCase( getFilm() );
                         c = rs.getString("pilih_hari").equalsIgnoreCase(   getTanggal());
                         d = rs.getString("jam_tayang").equalsIgnoreCase(      getJam());                       
                         boolean aa = a && b && c && d;    
                            if(aa == true){
                                 truA = aa;    
                            }  
                    }
//                   stm.close();
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
        if(getFilm() != null){
          return true;
        }
        return truA;
    }
    
   public void setEnableKursi(JToggleButton kursi){
   boolean a =  false, b = false, c = false,d = false, e = false;
//   System.out.print(getTanggal());     
//   System.out.print(getLokasi());     
//   System.out.print(getFilm());     
//   System.out.print(getJam());     
//   System.out.println();     
         for(int i = 0; i < list.size(); i++){
                if(kursi.getText().equalsIgnoreCase(list.get(i) ) && truA  ){
//                    System.out.print(kursi.getText() + " " +  list.get(i) +"\n");
                    kursi.setEnabled(false);
                } else{
                     
                }
         }       
   }
   
   public void clearArray(){
       list.clear();
   }
}

class getDatas{
    public String tanggal;
    public String lokasi;
    public String film;
    public String jam;
    
    public getDatas(String tanggal, String lokasi,String film,String jam){
        this.tanggal = tanggal;
        this.lokasi = lokasi;
        this.film = film;
        this.jam = jam;
    }
    
    public getDatas(){}
    
     public String getJam(){
        return jam;
    }

    public String getTanggal(){
        return tanggal;
    }
    
    public String getFilm(){
        return film;
    }
    
    public String getLokasi(){
        return lokasi;
    }
}

interface kursi{
    void setEnableKursi(JToggleButton kursi);
    int getJumlahKursi();
}

interface autoConnec {
    public String Connec();
}


