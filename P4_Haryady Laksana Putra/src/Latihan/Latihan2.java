/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double makan, transport, belanja, total;
        double pMakan, pTransport, pBelanja;
        
        System.out.print("Masukkan makan: ");
        makan = input.nextDouble();
        
        System.out.print("Masukkan transport: ");
        transport = input.nextDouble();
        
        System.out.print("Masukkan belanja: ");
        belanja = input.nextDouble();
        
        total = makan + transport + belanja;
        
        pMakan = (makan / total) * 100;
        pTransport = (transport / total) *100;
        pBelanja = (belanja / total) * 100;
        
        System.out.println("\nTotal = " + total);
        System.out.println("Persentase Makan = " + pMakan + "%");
        System.out.println("Persentase Transport = " + pTransport + "%");
        System.out.println("Persentase Belanja = " + pBelanja + "%");
        
    }
}
