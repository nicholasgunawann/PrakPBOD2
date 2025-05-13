/* 
Nama File   : Anabul.java
Deskripsi   : Berisi atribut dan method dalam class abstrak Anabul
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 8 Mei 2025
*/

public abstract class Anabul {
    // Atribut
    protected String nama;

    // Konstruktor
    public Anabul(String nama){
        this.nama = nama;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public abstract void bersuara();
    public abstract void bergerak();
}