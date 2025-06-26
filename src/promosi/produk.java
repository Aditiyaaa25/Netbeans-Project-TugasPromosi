/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promosi;

import javax.swing.JOptionPane;

public class produk extends admin{
    // field
    public String id_produk;
    public String nama_produk;
    public String foto;
    public String kategori;
    int harga;
    public String produkterbaik;

    // constructors
    public produk() {}


    // getters and setters
    public String getId_produk() {
        return id_produk;
    }

    public void setId_produk(String id_produk) {
        try {
            if(id_produk.equals(null) || id_produk.equals("")){
                JOptionPane.showMessageDialog(null, "ID Prduk wajib diisi");
                this.id_produk="-";
            }else {
                this.id_produk=id_produk;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        try {
            if(nama_produk.equals(null) || nama_produk.equals("")){
                JOptionPane.showMessageDialog(null, "Nama Produk belum diisi");
                this.nama_produk="-";
            } else {
                this.nama_produk=nama_produk;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        try {
            if(foto.equals(null) || foto.equals("")){
                JOptionPane.showMessageDialog(null, "Foto belum diisi");
                this.foto="-";
            }else {
                this.foto=foto;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        try {
            if(kategori.equals(null) || kategori.equals("")){
                JOptionPane.showMessageDialog(null, "Kategori belum diisi");
                this.kategori="-";
            }else{
                this.kategori=kategori;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        try {
            if(harga<0) {
                JOptionPane.showMessageDialog(null, "Harga tidak boleh minus");
                this.harga=0;
            }else {
                this.harga=harga;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public String getProdukTerbaik() {
        return produkterbaik;
    }

    public void setProdukTerbaik(String produkterbaik) {
        try {
            if(produkterbaik.equals(null) || produkterbaik.equals("")){
                JOptionPane.showMessageDialog(null, "Produk Terbaik belum diisi");
                this.produkterbaik="-";
            } else {
                this.produkterbaik=produkterbaik;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public String infoProduk (){
        String pesan = super.infoAdmin()+
                "ID Produk :"+ getId_produk()+
                "\nNama Produk"+ getNama_produk()+
                "\nFoto :" + getFoto()+
                "\nKategori :" + getKategori()+
                "\nHarga : " +getHarga()+
                "\nProduk Terbaik :" +getProdukTerbaik();
        return pesan;
    }
    
    public void infoProduk2 (){
        String pesan = "ID Produk :"+ getId_produk()+
                "\nNama Produk"+ getNama_produk()+
                "\nFoto :" + getFoto()+
                "\nKategori :" + getKategori()+
                "\nHarga : " +getHarga()+
                "\nProduk Terbaik :" +getProdukTerbaik();
        JOptionPane.showMessageDialog(null, pesan);
    }
}
