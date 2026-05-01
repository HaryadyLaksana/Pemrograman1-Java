package Latihan;

//Menggunakan metode format number seperti angka, mata uang, dan persen.
import java.text.*;


public class Latihan6 {
    public static void main(String [] args) {
        double angka = 83243463.342245;
        double angkaPecahan = 0.902235643;
        
        NumberFormat NumberFormatter = NumberFormat.getNumberInstance(); 
        NumberFormat CurrFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat PercentFormatter = NumberFormat.getPercentInstance();
        
        String NumberStr = NumberFormatter.format(angka);
        String CurrStr = CurrFormatter.format (angka);
        String PercentStr = PercentFormatter.format (angkaPecahan);
        
        System.out.println("double Angka = " + angka + " berformat number : " + NumberStr);
        System.out.println("double Angka = " + angka + " berformat number : " + CurrStr);
        System.out.println("double Angka = " + angka + " berformat number : " + PercentStr);
        
        System.out.println();
        System.out.println();
        
        NumberFormatter.setMaximumIntegerDigits(10);
        CurrFormatter.setMaximumIntegerDigits(10);
        PercentFormatter.setMaximumIntegerDigits(10);
        
        NumberFormatter.setMinimumIntegerDigits(1);
        CurrFormatter.setMinimumIntegerDigits(1);
        PercentFormatter.setMinimumIntegerDigits(1);
        
        NumberFormatter.setMaximumFractionDigits(5);
        CurrFormatter.setMaximumFractionDigits(2);
        PercentFormatter.setMaximumFractionDigits(4);
        
        NumberFormatter.setMinimumFractionDigits(2);
        CurrFormatter.setMinimumFractionDigits(2);
        PercentFormatter.setMinimumFractionDigits(6);
        
        System.out.println("double Angka = " + angka + " berformat number : " + NumberFormatter.format(angka));
        System.out.println("double Angka = " + angka + " berformat currency : " + CurrFormatter.format(angka));
        System.out.println("double Angka = " + angka + " berformat percent : " + PercentFormatter.format(angkaPecahan));
    }
}
