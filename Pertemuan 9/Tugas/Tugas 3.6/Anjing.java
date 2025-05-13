/* 
Nama File   : Anjing.java
Deskripsi   : Berisi atribut dan method dalam class Anjing
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 8 Mei 2025
*/

public class Anjing extends Anabul{
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara guk-guk");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan cara melata");
    }
}