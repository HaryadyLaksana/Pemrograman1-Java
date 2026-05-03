package Latihan;

import java.util.Scanner;

public class Latihan1 {
    
    static float hitungBatasKehadiran(float totalPertemuan) {
        return totalPertemuan * 0.75f;
    }

    static String tentukanGrade(float nilai) {
        if (nilai >= 80) return "A";
        else if (nilai >= 70) return "B";
        else if (nilai >= 60) return "C";
        else if (nilai >= 55) return "D";
        else return "E";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Total Pertemuan : ");
        float totalPertemuan = sc.nextFloat();
        
        System.out.print("Jumlah Kehadiran : ");
        float hadir = sc.nextFloat();
        
        System.out.print("Nilai Akhir : ");
        float nilai = sc.nextFloat();
        
        float batasMinimal = hitungBatasKehadiran(totalPertemuan);
        
        System.out.println("\n=== HASIL PENILAIAN ===");
        
        if (hadir >= batasMinimal) {
            String grade = tentukanGrade(nilai);
            System.out.println("Status : LULUS");
            System.out.println("Grade  : " + grade);    
        }
        sc.close();
    }
}
