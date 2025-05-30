/* 
Nama File   : BangunDatarGeneric.java
Deskripsi   : kelas konstruksi generic untuk BangunDatar
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 8 Mei 2025
*/

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T bangunDatar) {
        this.bangunDatar = bangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double luas() {
        return bangunDatar.hitungLuas();
    }

    public double keliling() {
        return bangunDatar.hitungKeliling();
    }
}