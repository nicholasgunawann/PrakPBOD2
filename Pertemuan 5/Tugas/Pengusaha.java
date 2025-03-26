/* 
Nama File   : Pengusaha.java
Deskripsi   : Berisi atribut dan method dalam class Pengusaha
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 19 Maret 2024
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha() {
        super();
        this.npwp = "";
        counterPengusaha++;
    }

    public Pengusaha(String nama, String tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, LocalDate.parse(tglMulaiKerja, java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy")), alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() {
        return npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(getTglMulaiKerja(), LocalDate.now()) + 4; // B = 4
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP : " + getNpwp());
        System.out.println("Pajak : " + hitungPajak());
    }
}