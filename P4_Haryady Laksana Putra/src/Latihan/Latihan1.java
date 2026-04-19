/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double realisasi, kehadiran, tugas, uts, uas;
        double b_kehadiran, b_tugas, b_uts, b_uas, total;
        
        System.out.print("Masukkan Realisasi: ");
        realisasi = input.nextDouble();
        
        System.out.print("Masukkan Kehadiran: ");
        kehadiran = input.nextDouble();
        
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = input.nextDouble();
        
        System.out.print("Masukkan NIlai UTS: ");
        uts = input.nextDouble();
        
        System.out.print("Masukkan Nilai UAS: ");
        uas = input.nextDouble();
        
        b_kehadiran = (kehadiran / realisasi) * 10;
        b_tugas = (tugas * 20) / 100;
        b_uts = (uts * 30) / 100;
        b_uas = (uas * 40) / 100;
        
        total = b_kehadiran + b_tugas + b_uts + b_uas;
        
        System.out.println("\n=== HASIL ===");
        System.out.println("Realisasi   : " + realisasi);
        System.out.println("Kehaduran   : " + kehadiran);
        System.out.println("Tugas       : " + tugas);
        System.out.println("UTS         : " + uts);
        System.out.println("UAS         : " + uas);
        System.out.println("Total Nilai : " + total);
        
    }
    
}
