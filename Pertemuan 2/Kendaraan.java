/* 
Nama File   : Kendaraan.java
Deskripsi   : Berisi atribut dan method Kendaraan
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 26 Februari 2024
*/

public class Kendaraan {
    /******** ATRIBUT ********/
    private String noPlat, jenis;

    /******** METHOD ********/
    // Konstruktor tanpa parameter
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    // Konstruktor dengan parameter noPlat dan jenis
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Selektor dan mutator untuk masing-masing atribut

    // Mengembalikan nilai atribut noPlat
    public String getnoPlat() {
        return noPlat;
    }

    // Mengeset nilai atribut noPlat
    public void setnoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    // Mengembalikan nilai atribut jenis
    public String getjenis() {
        return jenis;
    }

    // Mengeset nilai atribut jenis
    public void setjenis(String jenis) {
        this.jenis = jenis;
    }
} // end class Kendaraan 

