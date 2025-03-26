/* 
Nama File   : Manusia.java
Deskripsi   : Berisi atribut dan method dalam class Manusia
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 19 Maret 2024
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Manusia {
    protected String nama, alamat;
    protected LocalDate tgl_mulai_kerja;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia() {
        this.nama = "";
        this.tgl_mulai_kerja = LocalDate.now();
        this.alamat = "";
        this.pendapatan = 0;
        counterMns++;
    }

    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTglMulaiKerja() {
        return tgl_mulai_kerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public abstract int hitungMasaKerja();

    public void cetakInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Mulai Kerja : " + tgl_mulai_kerja);
        System.out.println("Alamat : " + alamat);
        System.out.println("Pendapatan : " + pendapatan);
    }
}