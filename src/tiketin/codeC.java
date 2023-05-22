/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiketin;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

/**
 *
 * @author huawei
 */
public class codeC {
    String url = "";
    String usernem = "root";
    String pass = "";
    private int jumlahKursi = 0;
    private int hargaTiket[] = {45000,50000,35000,50000,40000};
    private int totalHarga;
    private int pilihFilm;
    private int hargaFilm;
    private List<String> dataKursi = new ArrayList<>();    
    private String a  = "";
    
    public void setConnec(){
            
    };
    
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
    
    public void setTotalHarga(){
      
    }
    
    public int getTotalHarga(){
      totalHarga = jumlahKursi * 45000 ;   
      return totalHarga;
    }
    
    public void setSelectKursi(JToggleButton kursi,JLabel text){
     
      
    }

}

interface autoConnec {
    public String Connec();
}


