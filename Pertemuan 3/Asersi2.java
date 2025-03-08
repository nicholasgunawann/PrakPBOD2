/*
File        : Asersi2.java
Deskripsi   : Program untuk demo asersi, yang akan menolak input 
              jari-jari lingkaran yang bernilai nol.
Author      : Nicholas Gunawan
Tanggal     : 5 Maret 2025
*/

// class Lingkaran
class Lingkaran{
    private double jariJari;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0) : "Jari-jari tidak boleh nol!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

// Program Asersi2 punya kesalahan karena asersi pada jariJari tidak efektif. Nilai jariJari sudah 0, sehingga asersi tidak berfungsi.



