/* 
Nama File   : Burung.java
Deskripsi   : Berisi atribut dan method dalam class Burung
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 8 Mei 2025
*/

public class Burung extends Anabul{
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi cuit");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan cara terbang");
    }
}