/* 
Nama File   : Anabul.java
Deskripsi   : Berisi atribut dan method dalam class Anabul
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 25 April 2024
*/

abstract class Anabul {
    protected String nama;

    public Anabul(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    
    public abstract void gerak();
    public abstract void suara();
}