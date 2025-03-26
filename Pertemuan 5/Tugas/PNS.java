/* 
Nama File   : PNS.java
Deskripsi   : Berisi atribut dan method dalam class PNS
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 19 Maret 2024
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS() {
        super();
        this.nip = "";
        counterPNS++;
    }

    public PNS(String nama, String tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, LocalDate.parse(tglMulaiKerja, java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy")), alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() {
        return nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(getTglMulaiKerja(), LocalDate.now()) + 8; // A = 8
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP : " + getNip());
        System.out.println("Pajak : " + hitungPajak());
    }
}