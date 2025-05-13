/* 
Nama File   : Kucing.java
Deskripsi   : Berisi atribut dan method dalam class Kucing
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 8 Mei 2025
*/

public class Kucing extends Anabul{
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi meong");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan cara melata");
    }
}