/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promosi;

import javax.swing.JOptionPane;
/**
 *
 * @author acer
 */
public class promosi extends admin {
    public String id_promosi; 
    public String judul_promosi;
    public String priode;
    public String keterangan;
    
    public promosi (){
    }
    
    public promosi (String id_promosi, String judul_promosi, String priode, String keterangan){
        this.id_promosi = id_promosi;
        this.judul_promosi = judul_promosi;
        this.priode = priode;
        this.keterangan = keterangan;
    }
    
    
    // getter dan setter
    public String getId_promosi (){
        return id_promosi;
    }
    
    public void setId_promosi(String id_promosi){
        try {
            if(id_promosi.equals(null) || id_promosi.equals("")){
                JOptionPane.showMessageDialog(null, "ID Promosi belum diisi");
                this.id_promosi="-";
            }else {
                this.id_promosi=id_promosi;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }
    
    public String getJudul_promosi (){
        return judul_promosi;
    }
    
    public void setJudul_promosi(String judul_promosi){
        try {
            if(judul_promosi.equals(null) || judul_promosi.equals("")){
                JOptionPane.showMessageDialog(null, "Judul Promosi belum diisi");
                this.judul_promosi="-";
            }else{
                this.judul_promosi=judul_promosi;
            }
            
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null , salah.getMessage());
        }
    }
    
    public String getPriode (){
        return priode;
    }
    
    public void setPriode (String priode){
        try {
            if(priode.equals(null) || priode.equals("")){
                JOptionPane.showMessageDialog(null, "Priode belum diisi");
                this.priode="-";
            } else {
                this.priode=priode;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }
    
    public String getKeterangan(){
        return keterangan;
    }
    
    public void setKeterangan (String keterangan){
        try {
            if(keterangan.equals(null) || keterangan.equals("")){
                JOptionPane.showMessageDialog(null,"Keterangan belum diisi");
                this.keterangan="-";
            }else {
                this.keterangan=keterangan;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }
    
    public String infoPromosi(){
        String pesan = super.infoAdmin()+
                "ID Promosi :"+getId_promosi()+
                "\nJudul Promosi :"+getJudul_promosi()+
                "\nPriode :"+getPriode()+
                "\nKeterangan :"+getKeterangan();
        return pesan;
    }
    
    public void infoPromosi2(){
        String pesan = "ID Promosi :"+getId_promosi()+
                "\nJudul Promosi :"+getJudul_promosi()+
                "\nPriode :"+getPriode()+
                "\nKeterangan :"+getKeterangan();
        JOptionPane.showMessageDialog(null, pesan);
    }
}


