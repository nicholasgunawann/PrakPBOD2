/* 
Nama File   : Tendik.java
Deskripsi   : Berisi atribut dan method dalam class Tendik
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 12 Maret 2024
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class Tendik extends Pegawai {
    private String bidangKerja;

    public Tendik() {
        super();
        this.bidangKerja = "";
    }

    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String bidangKerja) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, "Tendik");
        this.bidangKerja = bidangKerja;
    }

    public String getBidangKerja() { 
        return bidangKerja; 
    }

    public void setBidangKerja(String bidangKerja) { 
        this.bidangKerja = bidangKerja; 
    }

    public LocalDate getBUP() {
        LocalDate bup = tanggalLahir.plusYears(55);
        return LocalDate.of(bup.getYear(), bup.getMonth().plus(1), 1);
    }

    public String getMasaKerja() {
        LocalDate sekarang = LocalDate.now();
        Period period = Period.between(TMT, sekarang);
        int tahun = period.getYears();
        int bulan = period.getMonths();
        return tahun + " tahun " + bulan + " bulan";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang Kerja            : " + bidangKerja);
        System.out.println("BUP (Batas Usia Pensiun): " + formatTanggal(getBUP()));
        long masaKerja = super.hitungMasaKerja();
        double tunjangan = 0.01 * masaKerja * gajiPokok;
        System.out.println("Masa Kerja              : " + getMasaKerja());
        System.out.printf("Tunjangan               : 1%% x %d x Rp %d = Rp %d\n", masaKerja, (int) gajiPokok, (int) tunjangan);
    }
}
