/* 
Nama File   : Pegawai.java
Deskripsi   : Berisi atribut dan method dalam class Pegawai
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 25 April 2024
*/

public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok: " + gajiPokok);
    }
}