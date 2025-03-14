/* 
Nama File   : main2.java
Deskripsi   : Main program untuk menguji class
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 12 Maret 2024
*/

import java.time.LocalDate;

public class main2 {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("12345", "001", "Dr. Budi Santoso, S.H., M.Hum.", LocalDate.parse("1965-01-01"), LocalDate.parse("1989-12-10"), 10000000, "Fakultas Hukum");
        DosenTamu dosenTamu = new DosenTamu("67890", "002", "Tuti Handayani, S.E., M.M.", LocalDate.parse("1980-01-01"), LocalDate.parse("2010-01-01"), 7000000, "Fakultas Ekonomika dan Bisnis", 18);
        DosenTamu dosenTamu2 = new DosenTamu("34567", "003", "Joki Wadodo, S.T., M.T.", LocalDate.parse("1960-09-02"), LocalDate.parse("1988-02-04"), 8000000, "Fakultas Teknik", -1);
        Tendik tendik = new Tendik("54321", "Siti Nurhaliza, A.Md.Kom.", LocalDate.parse("1975-01-01"), LocalDate.parse("2012-02-01"), 5000000, "Akademik");

        System.out.println("=== Dosen Tetap ===");
        dosenTetap.printInfo();

        System.out.println("\n=== Dosen Tamu ===");
        dosenTamu.printInfo();

        System.out.println("\n=== Dosen Tamu ===");
        dosenTamu2.printInfo();

        System.out.println("\n=== Tendik ===");
        tendik.printInfo();
    }
}