/* 
Nama File   : Lingkaran.java
Deskripsi   : Berisi atribut dan method dalam class Lingkaran
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 12 Maret 2024
*/

public class Lingkaran extends BangunDatar{
    private double jari;

    public Lingkaran(){
        super();
        this.jari = 0;
    }

    public Lingkaran(double diameter, String warna, String border){
        super(0, warna, border);
        this.jari = diameter/2;
    }

    public double getJari(){
        return this.jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI*this.jari*this.jari;
    }

    public double getKeliling(){
        return 2*Math.PI*this.jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }

    public static void printCounterBangunDatar() {
        BangunDatar.printCounterBangunDatar();
    }

}
