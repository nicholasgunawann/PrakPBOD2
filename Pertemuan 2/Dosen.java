/* 
Nama File   : Dosen.java
Deskripsi   : Berisi atribut dan method Dosen
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 26 Februari 2024
*/

public class Dosen {
    /******** ATRIBUT ********/
    private String NIP, nama, prodi;

    /******** METHOD ********/
    // Konstruktor tanpa parameter
    public Dosen() {
        this.NIP = "";
        this.nama = "";
        this.prodi = "";
    }

    // Konstruktor dengan parameter NIP, nama, dan prodi
    public Dosen (String NIP, String nama, String prodi) {
        this.NIP = NIP;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Selektor dan mutator untuk masing-masing atribut

    // Mengembalikan nilai atribut NIP
    public String getNIP() {
        return NIP;
    }

    // Mengeset nilai atribut NIP
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    // Mengembalikan nilai atribut nama
    public String getNama() {
        return nama;
    }

    // Mengeset nilai atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mengembalikan nilai atribut prodi
    public String getProdi() {
        return prodi;
    }

    // Mengeset nilai atribut prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
} // end class Dosen
