/* 
Nama File   : MainKoleksi.java
Deskripsi   : Main program untuk menguji class Koleksi
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 8 Mei 2025
*/

import java.util.Scanner;

public class MainKoleksi {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>(10);
        System.out.println("Menambahkan karakter:");
        char[] karakter = {'N', 'I', 'C', 'H', 'O', 'L', 'A', 'S', '1', '2'};
        for (char c : karakter) {
            koleksiKarakter.add(c);
        }
        koleksiKarakter.showAll();
        System.out.println("Jumlah elemen: " + koleksiKarakter.getSize());
        System.out.println();
        
        System.out.println("Ambil elemen di indeks ke-0:");
        System.out.println("Isi: " + koleksiKarakter.getIsi(0));
        System.out.println();
        
        System.out.println("Ubah elemen di indeks ke-5 menjadi 'Z':");
        koleksiKarakter.setIsi(5, 'Z');
        koleksiKarakter.showAll();
        System.out.println();
        
        System.out.println("Hapus elemen di indeks ke-5:");
        koleksiKarakter.delete(5);
        koleksiKarakter.showAll();
        System.out.println("Jumlah elemen: " + koleksiKarakter.getSize());
        System.out.println();
        
        System.out.println("Set size menjadi 11:");
        koleksiKarakter.setSize(11);
        koleksiKarakter.showAll();
        System.out.println("Jumlah elemen: " + koleksiKarakter.getSize());
        System.out.println();
        
        System.out.println("Set size menjadi 6:");
        koleksiKarakter.setSize(6);
        koleksiKarakter.showAll();
        System.out.println("Jumlah elemen: " + koleksiKarakter.getSize());
    }
}