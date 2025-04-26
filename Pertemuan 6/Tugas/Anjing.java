/* 
Nama File   : Anjing.java
Deskripsi   : Berisi atribut dan method dalam class Anjing
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 25 April 2024
*/

public class Anjing extends Anabul {
    public Anjing(String nama){
        super(nama);
    }

    @Override 
    public void gerak(){
        System.out.println("Bergerak dengan cara melata");
    }

    public void suara(){
        System.out.println("Memiliki suara 'guk-guk'");
    }
}