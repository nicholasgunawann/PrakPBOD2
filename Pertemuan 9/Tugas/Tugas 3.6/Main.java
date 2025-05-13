/* 
Nama File   : MainKoleksi.java
Deskripsi   : Main program untuk menguji class 
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 8 Mei 2025
*/

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        KoleksiAnabul daftarHewan = new KoleksiAnabul();
        
        String[][] List = {
            {"Adit", "Sopo", "Jarwo", "Denis"},        
            {"Plankton", "Patrick", "Spongebob"},      
            {"Upin", "Ipin", "Ros"}                   
        };
        
        Random acak = new Random();
        
        for (int i = 0; i < 10; i++) {
            int jenis = acak.nextInt(3);
            String nama = List[jenis][acak.nextInt(List[jenis].length)];
            
            Anabul hewan;
            
            if (jenis == 0) {
                hewan = new Kucing(nama);
                System.out.printf("Hewan ke-%d: Kucing bernama %s berhasil ditambahkan%n", i+1, nama);
            } else if (jenis == 1) {
                hewan = new Anjing(nama);
                System.out.printf("Hewan ke-%d: Anjing bernama %s berhasil ditambahkan%n", i+1, nama);
            } else {
                hewan = new Burung(nama);
                System.out.printf("Hewan ke-%d: Burung bernama %s berhasil ditambahkan%n", i+1, nama);
            }
            
            daftarHewan.add(hewan);
        }
        
        daftarHewan.showAll();
    }
}
