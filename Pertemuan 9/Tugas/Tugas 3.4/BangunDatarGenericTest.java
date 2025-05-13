/* 
Nama File   : BangunDatarGenericTest.java
Deskripsi   : main class untuk generic bangun datar
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 8 Mei 2025
*/

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        // Persegi
        Persegi persegi = new Persegi(6);
        BangunDatarGeneric<Persegi> gen1 = new BangunDatarGeneric<>();
        gen1.set(persegi);
        System.out.println("Luas persegi: " + gen1.luas());
        System.out.println("Keliling persegi: " + gen1.keliling());
        System.out.println("Tipe Generic: " + gen1.get().getClass().getName());
        System.out.println();

        // Persegi Panjang
        PersegiPanjang persegipanjang = new PersegiPanjang(6, 4);
        BangunDatarGeneric<PersegiPanjang> gen2 = new BangunDatarGeneric<>();
        gen2.set(persegipanjang);
        System.out.println("Luas persegi panjang: " + gen2.luas());
        System.out.println("Keliling persegi panjang: " + gen2.keliling());
        System.out.println("Tipe Generic: " + gen2.get().getClass().getName());
        System.out.println();

        // Segitiga 
        Segitiga segitiga = new Segitiga(3, 4, 3, 4, 5); 
        BangunDatarGeneric<Segitiga> gen3 = new BangunDatarGeneric<>();
        gen3.set(segitiga);
        System.out.println("Luas segitiga: " + gen3.luas());
        System.out.println("Keliling segitiga: " + gen3.keliling());
        System.out.println("Tipe Generic: " + gen3.get().getClass().getName());
    }
}
