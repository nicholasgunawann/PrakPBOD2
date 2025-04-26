/* 
Nama File   : Manajer.java
Deskripsi   : Berisi atribut dan method dalam class Manajer
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 25 April 2024
*/

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        this.nama = nama;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}