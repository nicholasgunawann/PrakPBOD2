/* 
Nama File   : Mahasiswa.java
Deskripsi   : Berisi atribut dan method Mahasiswa
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 26 Februari 2024
*/

import java.util.ArrayList;

public class Mahasiswa {
    /******** ATRIBUT ********/
    private String NIM, nama, prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /******** METHOD ********/
    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.NIM = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String NIM, String nama, String prodi, Dosen dosenWali, Kendaraan kendaraan) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
        this.dosenWali = dosenWali;
        this.kendaraan = kendaraan;
    }

    // Selektor dan mutator untuk masing-masing atribut

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatkul (MataKuliah newMatkul) {
        listMatkul.add(newMatkul);
    }

    public int getJumlahSKS() {
        int total = 0;
        for (MataKuliah matkul : listMatkul){
            total = total + matkul.getsks();
        }
        return total;
    }

    public int getJumlahMatkul() {
        return listMatkul.size();
    }

    public void printMhs(){
        System.out.println("NIM : " + getNIM());
        System.out.println("Nama : " + getNama());
        System.out.println("Prodi : " + getProdi());
    }

    public void printDetailMhs() {
        System.out.println("NIM: " + NIM);
        System.out.println("\nNama: " + nama);
        System.out.println("\nProdi: " + prodi);
        System.out.println("\nMata Kuliah yang Diambil: ");
        int i;
        for (i = 0; i < listMatkul.size(); i++) {
            System.out.println(listMatkul.get(i).getNamaMatkul());
        }
        System.out.println("\nDosen Wali : " + getDosenWali().getNama() + " (NIP : " + getDosenWali().getNIP() + ", Program Studi : " + getDosenWali().getProdi() + ")");
        System.out.println("\nKendaraan yang dimiliki : " + getKendaraan().getjenis() + " (" + getKendaraan().getnoPlat() + ")");
    }
} // end class Mahasiswa

