/*
File        : AngkaSialException.java
Deskripsi   : Program penggunaan exception buatan sendiri 
              Pengenalan klausa 'throw' dan 'throws'
Author      : Nicholas Gunawan
Tanggal     : 5 Maret 2025
*/

public class AngkaSial{

    public void CobaAngkaSial(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.CobaAngkaSial(10);
            as.CobaAngkaSial(13);
            as.CobaAngkaSial(12);
        } catch(AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/* Bagian System.out.println(angka + " bukan angka sial"); tidak dieksekusi ketika eksepsi terjadi.
karena program sudah melempar eksepsi sebelum sampai kesana. Tetapi jika angka lain (10 atau 12) maka akan tereksekusi.

/* Bagian } catch(AngkaSialException ase) { akan dieksekusi, tetapi hanya jika eksepsi terjadi.
Jika tidak terjadi eksepsi, maka tidak akan dijalankan. Blok catch hanya akan dieksekusi jika eksepsi terjadi, dalam code di atas ketika angka 13 dimasukkan.



