public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah ASA = new MataKuliah("ASA", "Analisis dan Strategi Algoritma", 3);
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah GKV = new MataKuliah("GKV", "Grafika dan Komputasi Visual", 3);
        MataKuliah RPL = new MataKuliah("RPL", "Rekayasa Perangkat Lunak", 3);
        Dosen D1 = new Dosen("198302032006041002", "Satriyo Adhy, S.Si., M.T.", "Informatika");
        Kendaraan K1 = new Kendaraan("RI 1", "Mobil");
        Mahasiswa M1 = new Mahasiswa("24060123140148", "Nicholas Gunawan", "Informatika", D1, K1);
    
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(ASA);
        M1.addMatkul(PBO);
        M1.addMatkul(GKV);
        M1.addMatkul(RPL);
        System.out.println("\n======Print Mahasiswa=====");
        M1.printMhs();
        System.out.println("\n======Print Detail Mahasiswa=====");
        M1.printDetailMhs();
    
        System.out.println("\nJumlah Mata Kuliah = " + M1.getJumlahMatkul());
        System.out.println("\nJumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    }
}