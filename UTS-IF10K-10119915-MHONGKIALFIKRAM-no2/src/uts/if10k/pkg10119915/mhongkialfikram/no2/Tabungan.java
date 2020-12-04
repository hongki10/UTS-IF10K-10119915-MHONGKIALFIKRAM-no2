/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10k.pkg10119915.mhongkialfikram.no2;

/**
 * @author 
 * Nama  :M.Hongki Alfikram
 * Kelas :IF10-K
 * NIM   :10119915 
 */

public class Tabungan {
      private int saldo;

    public Tabungan (int saldo){
        this.saldo = saldo;
    }

    public int ambilUang(int jumlah){
        return this.saldo - jumlah;
    }
}