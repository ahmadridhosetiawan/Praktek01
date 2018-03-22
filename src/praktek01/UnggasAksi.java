/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author edong
 */
public class UnggasAksi {
    public static void main(String[] args) {
        Unggas Bebek= new Unggas();
        
        Bebek.nama="Bebek Gendut";
        Bebek.bentukkaki="Tumpul Lebar";
        Bebek.makanan="Dadak";
        Bebek.warnabulu="Coklat";
        Bebek.warnaparuh="Kuning";
        Bebek.caramakan="Memamah Pelan";
        
        
        Bebek.cetakInfo();
        
        Unggas Ayam= new Unggas();
        
        Ayam.nama="Ayam Kurus";
        Ayam.bentukkaki="Tajam";
        Ayam.makanan="Beras";
        Ayam.warnabulu="PutihKuning";
        Ayam.warnaparuh="Kuning";
        Ayam.caramakan="Mematuk cepat";
        
          Ayam.cetakInfo();
        
        Unggas Angsa= new Unggas();
        
        Angsa.nama="Angsa Cantik";
        Angsa.bentukkaki="Tumpul Lebar";
        Angsa.makanan="Nasi";
        Angsa.warnabulu="Putih";
        Angsa.warnaparuh="Kuning";
        Angsa.caramakan="Mematuk Pelan";
          Angsa.cetakInfo();
        
        Unggas Elang= new Unggas();
        
        Elang.nama="Elang Ganteng ";
        Elang.bentukkaki="Tajam";
        Elang.makanan="Tikus";
        Elang.warnabulu="Coklat";
        Elang.warnaparuh="Kuning";
        Elang.caramakan="Mencabik Cabik";
        
          Elang.cetakInfo();
        
        Unggas Gagak= new Unggas();
        
        Gagak.nama="Gagak Jahat";
        Gagak.bentukkaki="Tajam";
        Gagak.makanan="Bangkai";
        Gagak.warnabulu="Hitam";
        Gagak.warnaparuh="Hitam";
        Gagak.caramakan="Mencabik Pelan";
          Gagak.cetakInfo();
    }
}
