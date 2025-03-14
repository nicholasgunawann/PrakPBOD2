/* 
Nama File   : Persegi.java
Deskripsi   : Berisi atribut dan method dalam class Persegi
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 12 Maret 2024
*/

public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(){
        super();
        this.sisi = 0;
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi(){
        return this.sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return this.sisi * this.sisi;
    }

    public double getKeliling(){
        return 4 * this.sisi;
    }

    public double getDiagonal(){
        return Math.sqrt(2) * this.sisi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi : " + getSisi());
    }

    public static void printCounterBangunDatar() {
        BangunDatar.printCounterBangunDatar();
    }



}