/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan63.gradiengarislurus;


/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan program menghitung gradien
 */
public class PBO210118084Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat koordinat = new Koordinat (2,10,5,7);
        System.out.println("koordinat"+koordinat.hitungGradien());
       
        Koordinat koordinat2 = new Koordinat();
        System.out.println(""+koordinat2.hitungGradien());
}

}
