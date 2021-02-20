/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Tanggal     : 20 Februari 2021
 * Deskripsi   : Nomor soal 1
 */
package uas.if2.pkg10119059.irgidwiputra.pkg1;

import java.util.Scanner;

/**
 *
 * @author Corazon
 */
public class UASIF210119059IRGIDWIPUTRA1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double nilai;
        char indeks = 0;
        
        System.out.print("Masukkan Nilai Akhir Anda : ");
        nilai = input.nextDouble();
        if (nilai >= 80 && nilai <=100){
            indeks = 'A';
        } else if (nilai >= 68 && nilai <=80) {
            indeks = 'B';
        } else if (nilai >= 56 && nilai <=68) {
            indeks = 'C';
        } else if (nilai >= 45 && nilai <=56) {
            indeks = 'D';
        } else if (nilai >= 0 && nilai <=45) {
            indeks = 'E';
        }
        System.out.println("Indeks Anda Adalah : " +indeks);
        
    }
    
}
