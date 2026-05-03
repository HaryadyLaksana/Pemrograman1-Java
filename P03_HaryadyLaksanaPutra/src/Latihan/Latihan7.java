package Latihan;

//Menggunan format angka internasional seperti angka, mata uang, dan persen.
import java.text.*;
import java.util.*;

public class Latihan7 {
    public static void main (String [] args) {
        double angka = 83243463.342245;
        double angkaPecahan = 0.902235643;
        
        NumberFormat NumberFormatterUS = NumberFormat.getNumberInstance(Locale.US);
        NumberFormat CurrFormatterUS = NumberFormat.getCurrencyInstance(Locale.US);  
        NumberFormat PercentFormatterUS = NumberFormat.getPercentInstance(Locale.US);
        
        String NumberStrKOREA = NumberFormatterUS.format (angka);
        String CurrStrKOREA = CurrFormatterUS.format (angka);
        String PercentStrKOREA = PercentFormatterUS.format (angkaPecahan);
        
        System.out.println("double Angka = " + angka + "berformat number : " + NumberStrKOREA);
        System.out.println("double Angka = " + angka + "berformat currency : " + CurrStrKOREA);
        System.out.println("double Angka = " + angka + "berformat persen : " + PercentStrKOREA);
        
        System.out.println();
        System.out.println();
        
        NumberFormat NumberFormatterGERMANY = NumberFormat.getNumberInstance(Locale.GERMANY);
        NumberFormat CurrFormatterGERMANY = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        NumberFormat PercentFormatterGERMANY = NumberFormat.getPercentInstance(Locale.GERMANY);
        
        String NumberStrGERMANY = NumberFormatterGERMANY.format (angka);
        String CurrStrGERMANY = CurrFormatterGERMANY.format (angka);
        String PercentStrGERMANY = PercentFormatterGERMANY.format (angkaPecahan);
        
        System.out.println("double Angka = " + angka + "berformat number : " + NumberStrGERMANY);
        System.out.println("double Angka = " + angka + "berformat currency : " + CurrStrGERMANY);
        System.out.println("double Angka = " + angka + "berformat persen : " + PercentStrGERMANY);
        
    }
}
