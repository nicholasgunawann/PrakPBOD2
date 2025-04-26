/* 
Nama File   : main.java
Deskripsi   : Main program untuk menguji class
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 25 April 2024
*/      

public class main {
    public static void main(String[] args) {

        Kucing k = new Kucing("Tommy");
        Anjing a = new Anjing("Bobby");
        Burung b = new Burung("Leony");

        Anabul[] anabuls = {k,a,b};

        for(Anabul Anabul : anabuls){
            System.out.println("Nama: " + Anabul.getNama());
            Anabul.gerak();
            Anabul.suara();
            System.out.println();
        }
    }
}
