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
public class pengunjung extends admin{
    
    //filed atau variable global
    public String id_member;
    public String nama_member;
    public String alamat;
    public String no_telp;

    public pengunjung(){} 
    
    
    
    
    // getter dan setter untuk masing masin field
    
    public String getId_member(){
        return id_member;
    }
    
    public void setId_member (String id_member){
        try {
            if(id_member.equals(null) || id_member.equals("")){
                JOptionPane.showMessageDialog(null, "ID Member belum diisi");
                this.id_member="-";
            }else {
                this.id_member=id_member;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }
    
    public String getNama_member(){
        return nama_member;
    }
    
    public void setNama_member (String nama_member){
        try {
            if(nama_member.equals(null) || nama_member.equals("")){
                JOptionPane.showMessageDialog(null, "Nama Member belum diisi");
                this.nama_member="-";
            } else {
                this.nama_member=nama_member;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        try {
            if(alamat.equals(null) || alamat.equals("")){
                JOptionPane.showMessageDialog(null, "Alamat belum diisi");
                this.alamat="-";
            } else {
                this.alamat=alamat;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
     }
    
    public String getNo_telp(){
        return no_telp;
    }
    
    public void setNo_telp (String no_telp){
        try {
            if(no_telp.equals(null) || no_telp.equals("")){
                JOptionPane.showMessageDialog(null, "No Telp belum diisi");
                this.no_telp="-";
            } else {
                this.no_telp=no_telp;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }
    
    public String infoPengunjung(){
        String pesan = super.infoAdmin()+
                "ID Member :"+ getId_member ()+
                "\nNama Member :"+getNama_member()+
                "\nAlamat :"+getAlamat()+
                "\nNo Telp :"+getNo_telp();
        return pesan;
    }
    
    public void infoPengunjung2(){
        String pesan = "Id Member :"+getId_member()+
                "\nNama Member :"+getNama_member()+
                "\nAlamat :"+getAlamat()+
                "\nNo Telp :"+getNo_telp();
        
        
        JOptionPane.showMessageDialog(null, pesan);
      
    }
}