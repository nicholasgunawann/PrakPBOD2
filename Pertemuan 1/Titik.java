/* 
Nama File   : Titik.java
Deskripsi   : Berisi atribut dan method dalam class Titik
Pembuat     : 24060123140148 Nicholas Gunawan
Tanggal     : 19 Februari 2024
*/

public class Titik {
    /******** ATRIBUT ********/ 
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /******** METHOD ********/
    // konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // Overloading constructor
    Titik(double x, double y){
        absis = x;
        ordinat = y;
    }

    // mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    // mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y 
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");    
    }

    // getKuadran
    int getKuadran(){
        if ( absis > 0 && ordinat > 0) { 
            return 1;
        } else if ( absis < 0 && ordinat > 0 ) {
            return 2;
        } else if ( absis < 0 && ordinat < 0 ) {
            return 3;
        } else if ( absis > 0 && ordinat < 0 ) {
            return 4;
        } else {
            return 0;
        } 
    }

    // getJarakPusat 
    double getJarakPusat(){
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    // getJarak
    double getJarak(Titik T){
        return Math.abs(Math.sqrt(Math.pow(this.absis - T.absis, 2) + Math.pow(this.ordinat - T.ordinat, 2)));
    }

    // refleksiX
    void refleksiX(){
        ordinat = ordinat * (-1);
    }

    // refleksiY
    void refleksiY(){
        absis = absis * (-1);
    }

    // getRefleksiX
    Titik getRefleksiX(){
        return new Titik(absis, ordinat * (-1));
    }

    // getRefleksiY
    Titik getRefleksiY(){
        return new Titik(absis * (-1), ordinat);
    }

} //end class Titik
