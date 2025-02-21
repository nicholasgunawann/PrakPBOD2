/* 
Nama File   : MTitik.java
Deskripsi   : Main program untuk menguji class Titik
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 19 Februari 2024
*/

public class MTitik {
    public static void main(String[] args){
        // Titik T1 = new Titik(); // Membuat objek titik T1 (0,0)
        // T1.setAbsis(3); // Mengubah absis T1 dengan nilai 3
        // T1.setOrdinat(4); // Mengubah ordinat T1 dengan nilai 4
        // T1.printTitik(); // Mencetak koordinat T1 ke layar
        // T1.geser(3,4); // Menggeser T1 sejauh (3,4)
        // T1.printTitik(); // Menampilkan koordinat T1 setelah digeser 

        // Titik T2 = T1;
        // T2.printTitik();
        // T1.setAbsis(10);
        // T1.setOrdinat(10);
        // T2.printTitik();

        // Titik T1 = new Titik(); // Membuat objek titik T1 (0,0)
        // Titik T2 = new Titik(3,5); // Membuat objek titik T2 (3,5)

        // System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        // System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());

        // Membuat objek Titik
        Titik T1 = new Titik(3, 4);
        Titik T2 = new Titik(6, 8);

        // Menampilkan informasi titik
        T1.printTitik();
        T2.printTitik(); 

        // Menghitung jarak ke pusat
        System.out.println("\nJarak T1 ke pusat: " + T1.getJarakPusat() + "\n");

        // Menghitung jarak antara dua titik
        System.out.println("Jarak antara T1 dan T2: " + T1.getJarak(T2) + "\n");

        // Menampilkan kuadran
        System.out.println("T1 berada di kuadran: " + T1.getKuadran() + "\n");

        // Refleksi terhadap sumbu X dan Y
        T1.refleksiX();
        System.out.println("Setelah refleksi X, T1 menjadi: "); T1.printTitik();

        T1.refleksiY();
        System.out.println("\nSetelah refleksi Y, T1 menjadi: ");
        T1.printTitik();

        // Menggunakan metode getRefleksiX dan getRefleksiY
        Titik refleksiX = T2.getRefleksiX();
        Titik refleksiY = T2.getRefleksiY();
        
        System.out.println("\nRefleksi X dari T2: ");
        refleksiX.printTitik();

        System.out.println("\nRefleksi Y dari T2: ");
        refleksiY.printTitik();
    }

}