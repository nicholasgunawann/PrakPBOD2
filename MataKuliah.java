/* 
Nama File   : MataKuliah.java
Deskripsi   : Berisi atribut dan method MataKuliah
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 26 Februari 2024
*/

public class MataKuliah {
    /******** ATRIBUT ********/
    private String idMatkul, namaMatkul;
    private int sks;

    /******** METHOD ********/
    // Konstruktor tanpa parameter
    public MataKuliah(){
        this.idMatkul = "";
        this.namaMatkul = "";
        this.sks = 0;
    }

    // Konstruktor dengan parameter idMatkul, namaMatkul, dan sks
    public MataKuliah(String idMatkul, String namaMatkul, int sks) {
        this.idMatkul = idMatkul;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
    }

    // Selektor dan mutator untuk masing-masing atribut
    
    // Mengembalikan nilai atribut idMatkul
    public String getIdMatkul() {
        return idMatkul;
    }

    // Mengeset nilai atribut idMatkul
    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    // Mengembalikan nilai atribut namaMatkul
    public String getNamaMatkul() {
        return namaMatkul;
    }

    // Mengeset nilai atribut namaMatkul
    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    // Mengembalikan nilai atribut sks
    public int getsks() {
        return sks;
    }

    // Mengeset nilai atribut sks
    public void setsks(int sks) {
        this.sks = sks;
    }
} // end class MataKuliah
