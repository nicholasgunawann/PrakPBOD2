/* 
Nama File   : Programmer.java
Deskripsi   : Berisi atribut dan method dalam class Progammer
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 25 April 2024
*/

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        this.nama = nama;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}