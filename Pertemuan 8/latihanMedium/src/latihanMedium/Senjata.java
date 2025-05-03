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
package latihanMedium;

/**
 *
 * @author NICHOLAS G
 */
public class Senjata {
    // Atribut
    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    //Konstruktor
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
    }
    
    // Method 
    public String getBunyi() {
        return bunyi;
    }
    
    public int getPeluru() {
        return peluru;
    }
    
    public boolean isMenusuk() {
        return menusuk;
    }
    
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }
    
    public void setMenusuk(boolean menusuk) {
        this.menusuk = true;
    }
    
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}
