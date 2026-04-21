package Latihan;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        char operator;
        double hasil;
        
        System.out.println("=== PROGRAM KALKULATOR ===");
        
        System.out.print("Masukkan angka pertama : ");
        a = sc.nextInt();
        
        System.out.print("Masukkan operator (+. -, *, /) : ");
        operator = sc.next().charAt(0);
        
        System.out.print("Masukkan angka kedua : ");
        b = sc.nextInt();
        
        switch (operator) {
            case '+':
                hasil = a + b;
                break;
            case '-':
                hasil = a - b;
                break;
            case '*':
                hasil = a * b;
                break;
            case '/':
                if (b != 0) {
                    hasil = (double) a / b;               
                } else {
                    System.out.println("Error: Tidak bisa dibagi dengan nol!");
                    return;
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
                return;
        }
        
        System.out.println("Hasil perhitungan: " + hasil);
    }
}