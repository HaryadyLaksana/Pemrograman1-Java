package Tugas;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String [] args) {
        
        Scanner input = new Scanner(System.in);
        int angka1, angka2, hasil;
        
        System.out.println("\n=== Program Penjumlahan Angka ===");
        
        System.out.print("Masukkan Angka Pertama: ");
        angka1 = input.nextInt();
        System.out.print("Masukkan Angka Kedua: " );
        angka2 = input.nextInt();
        
        hasil = angka1 + angka2;
        
        System.out.println("Hasil Penjumlahan Angka: " + hasil);
    }    
}
