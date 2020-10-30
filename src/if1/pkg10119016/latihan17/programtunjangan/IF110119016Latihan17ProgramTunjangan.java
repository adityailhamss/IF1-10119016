/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119016.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan cara 
 * menghitung program tunjangan
 */
public class IF110119016Latihan17ProgramTunjangan {

   
    public static void main(String[] args) {
        // Deklarasi Variabel
        String menikah;
        int gajipokok,totalgaji,tunjangan;
        
        
        // membuat scanner baru
        Scanner pt = new Scanner (System.in);
        
        // Tampilkan output ke user
        System.out.println("=============Program Tunjangan==============");
        System.out.print("Berapa Gaji Pokok anda perbulan ? : Rp. " );
        gajipokok = pt.nextInt();
        System.out.print("Status Anda? (Menikah/Belum)      : ");
        menikah = pt.next();
        
        switch(menikah){
            case "menikah" :
            tunjangan = (int) (0.35*gajipokok);
            totalgaji = tunjangan + gajipokok;
            System.out.print("=========Hasil Perhitungan Gaji Anda========\n");
            System.out.println("Gaji Pokok : Rp. " + gajipokok);
            System.out.println("Tunjangan  : Rp. " + tunjangan);
            System.out.println("Total Gaji : Rp. " + totalgaji);
            break;
            default :
               tunjangan = 0;
        }
  
    }
}