/* 
Nama File   : MManusia.java
Deskripsi   : Main program untuk menguji class
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 19 Maret 2024
*/

public class MManusia {
    public static void main(String[] args) {
        PNS p1 = new PNS("Satriyo", "01-04-2006", "Jl. Seroja", 1500000, "19830203200641002");
        Pengusaha pe1 = new Pengusaha("Adhy", "01-01-2000", "Jl. Air", 5500000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", "09-01-1977", "Jl. Bunga 9 Tembalang", 5000000, "Wonogiri");
        PNS p2 = new PNS("Panji", "01-04-2010", " ",10000000, "19804212010041002");

        p2.setAlamat("Jl. Panorama 111 Tembalang");

        System.out.println("=== Hitung Objek ===");
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        System.out.println("\n=== Hitung Pajak ===");
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());

        System.out.println("\n=== Hitung Masa Kerja ===");
        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());

        System.out.println("\n=== Cetak Info ===");
        p1.cetakInfo();
        System.out.println();
        pe1.cetakInfo();
        System.out.println();
        pt1.cetakInfo();
    }
}