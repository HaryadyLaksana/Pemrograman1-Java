package Latihan;

//Latihan format angka mata uang Indonesia (Rp)

import java.text.NumberFormat;
import java.util.Locale;

public class Latihan4 {
    public static void main (String [] args) {
        double angka = 1500000.75;
        
        Locale indonesia = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(indonesia);
        
        System.out.println(" Format Rupiah : " + formatRupiah.format(angka));
        
    }
}
