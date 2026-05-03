package Latihan;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String namaPengguna;
        int saldoAwal = 0;
        int diskon, kredit, debit;
        
        System.out.print("Masukkan nama lengkap anda: ");
        namaPengguna = sc.nextLine();
        
        if (!namaPengguna.isEmpty()) {
            System.out.println("\n=== INFORMASI AKUN ===");
            System.out.println("Halo, " + namaPengguna);
            System.out.println("Sakdo awal Anda saat ini: Rp " + saldoAwal);
        } else {
            System.out.println("Nama tidak boleh kosong!");
        
        }
    }
    
}
