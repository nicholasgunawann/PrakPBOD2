/* 
Nama File   : Senjata.java
Deskripsi   : Berisi atribut dan method dalam class Senjata
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 28 April 2024
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanTutorial;

/**
 *
 * @author NICHOLAS G
 */
public class Senjata {
    // Atribut
    private String bunyi;
    private boolean menusuk;
    
    // Kosntruktor
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;
    }
    
    //Method
    private void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }
    
    private String getBunyi() {
        return bunyi;
    }
    
    private void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }
    
    private boolean isMenusuk() {
        return menusuk;
    }
    
    public void menembak(int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            System.out.print(getBunyi() + " ");
        }
        System.out.println("");
    }
    
    public void pasangBayonet() {
        setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
    
    public String menusuk() {
        if (isMenusuk()) {
            return "Jleb! ";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }
}