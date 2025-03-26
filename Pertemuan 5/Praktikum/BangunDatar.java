/* 
Nama File   : BangunDatar.java
Deskripsi   : Berisi atribut dan method dalam class BangunDatar
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 19 Maret 2024
*/

public abstract  class BangunDatar {
    protected int jmlSisi;
    protected String warna, border;
    private static int counterBangunDatar = 0;

    public BangunDatar(){
        this.jmlSisi = 0;
        this.warna = "";
        this.border = "";
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi() {
        return jmlSisi;
    }
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }
    public String getWarna() {
        return warna;
    }
    public String getBorder() {
        return border;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek Bangun Datar: " + counterBangunDatar);
    }
    
    public abstract double getLuas();

    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }
}