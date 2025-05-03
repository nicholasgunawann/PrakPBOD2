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
package latihanVeryEasy;

/**
 *
 * @author NICHOLAS G
 */
public class Senjata {
    // Atribut 
    private String bunyi;
    private int peluru;
    
    // Konstruktor
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }
    
    public String getBunyi() {
        return bunyi;
    }
    
    public int getPeluru() {
        return peluru;
    }
    
    public void menembak() {
        System.out.println(getBunyi());
        int sisaPeluru = getPeluru() - 1;
        System.out.println("Sisa Peluru: " + sisaPeluru);
    }
    
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }
    
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}
