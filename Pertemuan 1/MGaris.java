/* 
Nama File   : MGaris.java
Deskripsi   : Main program untuk menguji class Garis
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 19 Februari 2024
*/

public class MGaris {
    public static void main(String[] args) {
        // Membuat objek titik
        Titik t1 = new Titik(0, 0);
        Titik t2 = new Titik(1, 1);
        Titik t3 = new Titik(2, 2);
        Titik t4 = new Titik(6, 6);

        // Membuat objek garis
        Garis g1 = new Garis(t1, t2);
        Garis g2 = new Garis(t3, t4);

        // Mengetes method
        System.out.println("===== Garis 1 =====");
        g1.printGaris();
        System.out.println("Panjang garis: " + g1.getPanjang()); 
        System.out.println("Gradien garis: " + g1.getGradien());
        
        System.out.println("\n===== Garis 2 =====");
        g2.printGaris();
        System.out.println("Panjang garis: " + g2.getPanjang());
        System.out.println("Gradien garis: " + g2.getGradien());

        // isSejajar
        System.out.println("\nApakah kedua garis sejajar? " + g1.isSejajar(g2));

        // isTegakLurus
        System.out.println("\nApakah kedua garis tegak lurus? " + g1.isTegakLurus(g2));

        // Titik Tengah
        Titik tengah = g1.getTitikTengah();
        System.out.println("\nTitik tengah garis 1: (" + tengah.getAbsis() + "," + tengah.getOrdinat() + ")");

        // counterGaris
        System.out.println("\nJumlah objek garis: " + Garis.getCounterGaris());
    }
}