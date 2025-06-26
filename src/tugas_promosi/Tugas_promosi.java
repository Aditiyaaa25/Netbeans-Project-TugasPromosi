/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_promosi;

import promosi.admin;
import promosi.pengunjung;
import promosi.produk;
import promosi.promosi;
import Frame.FrameAdmin;
import Frame.FramePengunjung;
import Frame.FrameProduk;
import Frame.FramePromosi;
import Frame.Dashboard;

/**
 *
 * @author acer
 */
public class Tugas_promosi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        admin objAdmin = new admin();
//        objAdmin.setId_admin("2310010");
//        objAdmin.setNama_admin("Aditiya");
//        objAdmin.setUsername("Dintsy");
//        objAdmin.setPassword("010101");
        
//        System.out.println("ID :"+objKu.getId_admin());
//        System.out.println("Nama :"+objKu.getNama_admin());
//        System.out.println("Username :"+objKu.getUsername());
//        System.out.println("Password :"+objKu.getPassword());

//        FrameAdmin form1 = new FrameAdmin();
//        form1.setVisible(true);
        
//        produk
//        produk p2 = new produk ("IP001", "Khongguan", "Khongguan.jpg", "Makanan Ringan", 55000, "Ya");
//        //p2.setId_produk("IP001");
        //p2.setNama_produk("Khongguan");
        //p2.setFoto("Khonguan");
        //p2.setKategori("Makanan Ringan");
        //p2.setHarga(55000);
        //p2.setProdukTerbaik("Ya");
        
//        System.out.println("ID Produk      : " + p2.getId_produk());
//        System.out.println("Nama Produk    : " + p2.getNama_produk());
//        System.out.println("Foto           : " + p2.getFoto());
//        System.out.println("Kategori       : " + p2.getKategori());
//        System.out.println("Harga          : Rp" + p2.getHarga());
//        System.out.println("Produk Terbaik : " + p2.getProdukTerbaik());

//        FrameProduk form2 = new FrameProduk();
//        form2.setVisible(true);
        
//      pengunjung 
//        pengunjung Mmber = new pengunjung ("0928", "Fiqri", "Jl.Perdagangan", "0813-5265-7153");
        //Mmber.setId_member("0928");
        //Mmber.setNama_member("Fiqri");
        //Mmber.setAlamat("JL.Perdagangan");
        //Mmber.setNo_telp("0813-1234-5678");
        
//        System.out.println("ID Member     : " + Mmber.getId_member());
//        System.out.println("Nama Member    : " + Mmber.getNama_member());
//        System.out.println("Alamat           : " + Mmber.getAlamat());
//        System.out.println("NO TELP       : " + Mmber.getNo_telp());

//        FramePengunjung form3 = new FramePengunjung();
//        form3.setVisible(true);
        
//      promosi
        promosi gaMen = new promosi ("1990", "Nitro 5", "2019", "Baik Sekali");
        //gaMen.setId_promosi("1990");
        //gaMen.setJudul_promosi("Nitro 5");
        //gaMen.setPriode("2019");
        //gaMen.setKeterangan("Baik Sekali");
        
//        System.out.println("ID Promosi     : " + gaMen.getId_promosi());
//        System.out.println("Judul Promosi   : " + gaMen.getJudul_promosi());
//        System.out.println("Priode         : " + gaMen.getPriode());
//        System.out.println("Keterangan     : " + gaMen.getKeterangan());   
        
//        FramePromosi form4 = new FramePromosi();
//        form4.setVisible(true);


          Dashboard form5 = new Dashboard();
          form5.setVisible(true);
          
          
          
          promosi objPromosi = new promosi();
          objPromosi.setId_admin("112233");
          objPromosi.setNama_admin("Dintsy");
          objPromosi.setUsername("Adit");
          objPromosi.setPassword("131415");
          objPromosi.setId_promosi("123456");
          objPromosi.setJudul_promosi("OatSide");
          objPromosi.setPriode("2025");
          objPromosi.setKeterangan("Promosi Ganteng");
         
//          produk objProduk = new produk ();
//          objProduk.setId_admin("112233");
//          objProduk.setNama_admin("Dintsy");
//          objProduk.setUsername("Adit");
//          objProduk.setPassword("131415");
//          objProduk.setId_produk("101010");
//          objProduk.setNama_produk("Aditiya Fiqri Kusnaedy");
//          objProduk.setFoto("-");
//          objProduk.setKategori("Nulis");
//          objProduk.setHarga(10000);
//          objProduk.setProdukTerbaik("Sari Gandum");
          
          
         
          System.out.println(objPromosi.infoPromosi());
    }
}