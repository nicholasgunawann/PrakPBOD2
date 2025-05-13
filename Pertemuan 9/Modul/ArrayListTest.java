/* 
Nama File   : ArrayListTest.java
Deskripsi   : Program penggunaan objek ArrayList sebagai collection class
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 8 Mei 2025
*/

import java.util.ArrayList;

public class ArrayListTest{
    public static void main(String[] args) {
        // inisialisasi ArrayList yang hanya dapat berisi objek String
        ArrayList<String> strings = new ArrayList<String>();

        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");

        // menghapus elemen
        strings.remove("praktikum");
        
        // iterasi pada keseluruhan ArrayList
        for(String s : strings){
            System.out.print(s+" ");
        }
    }
}