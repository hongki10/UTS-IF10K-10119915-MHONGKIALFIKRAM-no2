/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10k.pkg10119915.mhongkialfikram.no2;

import java.util.Scanner;

/**
 * @author 
 * Nama  :M.Hongki Alfikram
 * Kelas :IF10-K
 * NIM   :10119915 
 */

public class utsif10kpkg10119915mhongkialfikram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

        System.out.println("==== Program Penarikan Uang ====");
        System.out.print("Masukan saldo Awal : ");
        Tabungan tabungan = new Tabungan(input.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        int jumlah = input.nextInt();
        System.out.println("Saldo anda sekarang : "+tabungan.ambilUang(jumlah));
    }

}