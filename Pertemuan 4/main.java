/* 
Nama File   : main.java
Deskripsi   : Main program untuk menguji class
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 12 Maret 2024
*/

public class main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(4, "Merah", "Hitam");
        Lingkaran lingkaran = new Lingkaran(10, "Biru", "Putih");

        System.out.println("===============");
        System.out.println(" Info Persegi");
        System.out.println("===============");
        persegi.printInfo();
        System.out.println("Luas Persegi: " + persegi.getLuas());
        System.out.println("Keliling Persegi: " + persegi.getKeliling());
        System.out.println("Diagonal Persegi:" + persegi.getDiagonal() + "\n");

        System.out.println("================");
        System.out.println(" Info Lingkaran");
        System.out.println("================");
        lingkaran.printInfo();
        System.out.println("Luas Lingkaran: " + lingkaran.getLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.getKeliling() + "\n");

        BangunDatar.printCounterBangunDatar();
    }
}

