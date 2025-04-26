/* 
Nama File   : TestPolimorfisme.java
Deskripsi   : Main program untuk menguji class
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 25 April 2024
*/

import java.util.ArrayList;

public class TestPolimorfisme {
    
    public static void main(String[] args) {

        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

/* Jawaban Nomor 2
Manfaat Polimorfisme pada kasus ini memberikan fleksibilitas terutama dalam bentuk inclusion polymorphism, yaitu kemampuan menggunakan superclass (Pegawai) sebagai tipe referensi untuk objek subclass (Manajer dan Programmer). 
Manfaat secara spesifik pada kasus ini yaitu :
- Reusabilitas dan Skalabilitas: Kita cukup menggunakan satu struktur data (misalnya ArrayList<Pegawai>) untuk menyimpan berbagai jenis objek (Programmer, Manajer, dll).
- Kemudahan dalam pemanggilan metode: Cukup memanggil emp.tampilData() tanpa mengetahui secara eksplisit jenis objek, karena Java akan mengeksekusi metode override sesuai tipe objek sebenarnya (dynamic binding).
- Kode lebih bersih dan maintainable: Tidak perlu pengecekan manual tipe objek (instanceof) atau casting tipe setiap kali ingin memanggil metode spesifik.
*/

/* Jawaban Nomor 3 
Jika tidak menggunakan inclusion polymorphism, maka setiap subclass (Programmer, Manajer) harus ditangani secara eksplisit dalam program utama dan akan ada beberapa masalah yang muncul, seperti : 
- Kelebihan kode: Perlu mendeklarasikan variabel dan memanggil metode untuk setiap tipe objek secara terpisah.
- Tidak fleksibel: Jika menambah jenis pegawai baru (misalnya Desainer, Admin), harus menambah kode baru lagi di main.
- Sulit di-maintain: Jika jumlah jenis pegawai bertambah, kode di main() akan semakin kompleks dan panjang.
*/
