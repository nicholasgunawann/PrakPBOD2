/*
File        : AngkaSialException.java
Deskripsi   : Eksepsi buatan sendiri, menolak masukan angka 13!
Author      : Nicholas Gunawan
Tanggal     : 5 Maret 2025
*/

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("Jangan memasukkan angka 13 karena angka sial !!!");
    }
}
