/* 
Nama File   : Dosen.java
Deskripsi   : Berisi atribut dan method dalam class Dosen
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 12 Maret 2024
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen() {
        super();
        this.fakultas = "";
    }


    public Dosen(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, String jabatan) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, jabatan);
        this.fakultas = fakultas;
    }

    public String getFakultas() { 
        return fakultas; 
    }

    public void setFakultas(String fakultas) { 
        this.fakultas = fakultas; 
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas                : " + fakultas);
    }
}
