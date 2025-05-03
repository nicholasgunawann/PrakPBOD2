/* 
Nama File   : KontrolSenjata.java
Deskripsi   : Berisi atribut dan method dalam class KontrolSenjata
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 28 April 2024
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

/**
 *
 * @author NICHOLAS G
 */
public class KontrolSenjata {
    // Atribut
    Senjata senjata;
    
    //Konstruktor
    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }
    
    // Method  
    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru) {
        senjata.setPeluru((senjata.getPeluru() + jumPeluru));
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }
    
    public void menembak( int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (isAdaPeluru() == false) {
            System.out.println("Peluru Habis");
        } else {
            for (int i = 0; i < jumlah; i++) {
                if (isAdaPeluru()) {
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() - 1);
                } else {
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        }
    }
    
    public String menusuk() {
        if (senjata.isMenusuk()) {
            return "Menusuk dengan bayonet!";
        } else {
            return "Tidak dapat menusuk. Bayonet belum terpasang";
        }
    }
    
    public void pasangBayonet() {
        senjata.setMenusuk(true);
    }
}
