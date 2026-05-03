package Latihan;

//Mengubah input nilai desimal menjadi persen dengan Number Format

import java.text.NumberFormat;
import java.util.Scanner;

public class Latihan5 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        double nilai;
        
        System.out.print("Masukkan Nilai Desimal : ");
        nilai = input.nextDouble();
        
        NumberFormat persen = NumberFormat.getPercentInstance();
        
        System.out.println("Nilai Persen : " + persen.format(nilai));
    }
}
