/* 
Nama File   : Main.java
Deskripsi   : Main program untuk menguji class
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 19 Maret 2024
*/

public class Main {
    public static void main(String[] args) {
        BangunDatar P1 = new Persegi(10, "Hitam", "Putih");
        Persegi P2 = new Persegi(5, "Putih", "Hitam");
        BangunDatar L1 = new Lingkaran(7, "Merah" , "Putih");
        Lingkaran L2 = new Lingkaran (14, "Putih", "Merah");

        System.out.println("===============");
        System.out.println(" Info Persegi");
        System.out.println("===============");
        P1.printInfo();
        System.out.println("Luas Persegi: " + P1.getLuas());
        System.out.println("Keliling Persegi: " + P1.getKeliling());

        System.out.println("\n================");
        System.out.println(" Info Lingkaran");
        System.out.println("================");
        L1.printInfo();
        System.out.println("Luas Lingkaran: " + L1.getLuas());
        System.out.println("Keliling Lingkaran: " + L1.getKeliling() + "\n");

        System.out.println("Apakah P1 dan P2 sama ? " + P1.isEqualLuas(P2));

        System.out.println("Apakah P1 dan L1 memiliki keliling yang sama ? " + L1.isEqualKeliling(P1));

        System.out.println("\nJari-jari L2 sebelum zoomIn: " + L2.getJari());
        L2.zoomIn();
        System.out.println("Jari-jari L2 setelah zoomIn: " + L2.getJari());
    }
}
