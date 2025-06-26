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
public class admin {
    
    //field atau variable global
    public String id_admin;
    public String nama_admin;
    public String username;
    public String password;

    
    
    // overload contructor lebih dari 1
    public admin(){
    }//contructor 1
    
   
    

    
    //set dan get
    public String getId_admin() {
        return id_admin;
    }

    public void setId_admin(String id_admin) {
        try {
            if(id_admin.equals(null) || id_admin.equals("")){
                JOptionPane.showMessageDialog(null, "ID Admin belum diisi");
                this.id_admin="-";
            } else {
                this.id_admin=id_admin;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }
       

    public String getNama_admin() {
        return nama_admin;
    }

    public void setNama_admin(String nama_admin) {
        try {
            if(nama_admin.equals(null) || nama_admin.equals("")){
                JOptionPane.showMessageDialog(null, "Nama Admin wajib diisi");
                this.nama_admin=("-");
            }else {
                this.nama_admin=nama_admin;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        try {
            if(username.equals(null) || username.equals("")){
                JOptionPane.showMessageDialog(null, "Username wajib diisi");
                this.username="-";
            }else{
                this.username=username;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        try {
            if(password.equals(null) || password.equals("")){
                JOptionPane.showMessageDialog(null, "Password Wajib diisi");
                this.password="-";
            }else{
                this.password=password;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }
    
    
    public String infoAdmin (){
        String pesan ="ID Admin"+getId_admin()+
                "\nNama Admin"+getNama_admin()+
                "\nUsername"+getUsername()+
                "\nPassword"+getPassword();
        return pesan;
    }

    public void infoAdmin2 (){
        String pesan ="ID Admin"+getId_admin()+
                "\nNama Admin"+getNama_admin()+
                "\nUsername"+getUsername()+
                "\nPassword"+getPassword();
        JOptionPane.showMessageDialog(null, pesan);
    }
}
