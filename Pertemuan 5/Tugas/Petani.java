/* 
Nama File   : Petani.java
Deskripsi   : Berisi atribut dan method dalam class Petani
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 19 Maret 2024
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani() {
        super();
        this.asal_kota = "";
        counterPetani++;
    }

    public Petani(String nama, String tglMulaiKerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, LocalDate.parse(tglMulaiKerja, java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy")), alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsalKota() {
        return asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + 1; // C = 1
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota : " + getAsalKota());
        System.out.println("Pajak : " + hitungPajak());
    }
}