/* 
Nama File   : Kucing.java
Deskripsi   : Berisi atribut dan method dalam class Kucing
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 25 April 2024
*/

public class Kucing extends Anabul {
    public Kucing(String nama){
        super(nama);
    }

    @Override
    public void gerak(){
        System.out.println("Bergerak dengan cara melata");
    }

    public void suara(){
        System.out.println("Memiliki suara 'meong'");
    }
}