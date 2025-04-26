/* 
Nama File   : Burung.java
Deskripsi   : Berisi atribut dan method dalam class Burung
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 25 April 2024
*/

public class Burung extends Anabul {
    public Burung(String nama){
        super(nama);
    }

    @Override
    public void gerak(){
        System.out.println("Bergerak dengan cara terbang");
    }

    public void suara(){
        System.out.println("Memiliki suara 'cuit'");
    }
}