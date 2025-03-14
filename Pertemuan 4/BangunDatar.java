/* 
Nama File   : BangunDatar.java
Deskripsi   : Berisi atribut dan method dalam class BangunDatar
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 12 Maret 2024
*/

public class BangunDatar{
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

    public int getJmlSisi(){
        return this.jmlSisi;
    }

    public String getWarna(){
        return this.warna;
    }

    public String getBorder(){
        return this.border;
    }

    public static int getCounterBangunDatar(){
        return counterBangunDatar;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah sisi: " + this.jmlSisi);
        System.out.println("Warna: " + this.warna);
        System.out.println("Border: " + this.border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Bangun Datar: " + counterBangunDatar);
    }

}
