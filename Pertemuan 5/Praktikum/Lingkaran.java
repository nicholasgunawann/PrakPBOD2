/* 
Nama File   : Lingkaran.java
Deskripsi   : Berisi atribut dan method dalam class Lingkaran
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 19 Maret 2024
*/

public class Lingkaran extends BangunDatar implements IResize {
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

    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jari = jari * percent/100;
    }


}