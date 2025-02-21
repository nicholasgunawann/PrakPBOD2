/* 
Nama File   : Garis.java
Deskripsi   : Berisi atribut dan method dalam class Garis
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 19 Februari 2024
*/

public class Garis {
    /******** ATRIBUT ********/ 
    Titik titikAwal, titikAkhir;
    static int counterGaris = 0;

    /******** METHOD ********/
    // konstruktor tanpa parameter
    public Garis(){
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // konstruktor dengan parameter
    Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Mengembalikan nilai counterGaris
    static int getCounterGaris(){
        return counterGaris;
    }

    //  mengembalikan nilai titik awal
    Titik getTitikAwal(){
        return titikAwal;
    }

    // mengeset nilai titik awal
    void setTitikAwal(){
        this.titikAwal = titikAwal;
    }

    // mengembalikan nilai titik akhir
    Titik getTitikAkhir(){
        return titikAkhir;
    }

    // mengeset nilai titik akhir
    void setTitikAkhir(){
        this.titikAkhir = titikAkhir;
    }

    // Panjang garis
    double getPanjang(){
        return titikAwal.getJarak(titikAkhir);
    }

    // Gradien garis
    double getGradien(){
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // Titik Tengah garis
    Titik getTitikTengah(){
        double XTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double YTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(XTengah, YTengah);
    }

    // Mengecek sejajar atau tidak
    boolean isSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }

    // Mengecek tegak lurus atau tidak
    boolean isTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == -1;
    }

    // Menampilkan informasi garis
    void printGaris() {
        System.out.println("Garis dari " + "(" + titikAwal.getAbsis() + "," + titikAwal.getOrdinat() + ") ke (" + titikAkhir.getAbsis() + "," + titikAkhir.getOrdinat() + ")");
    }

    // Menampilkan persamaan garis dalam bentuk string y = mx + c
    void printPersamaanGaris(){
        System.out.println("y = " + getGradien() + "x + " + (titikAwal.getOrdinat() - getGradien() * titikAwal.getAbsis()));
    }

}