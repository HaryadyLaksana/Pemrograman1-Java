package Latihan;

//Input keyboard dengan BufferedReader dan IOException

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Latihan2 {
    public static void main(String [] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
        
        String nama = "";
        
        System.out.print("Masukkan Nama Anda : ");
        
        try {
            nama = dataIn.readLine();
            
        } catch (IOException e) {
            System.out.println("Error! ");
        }
        System.out.println("Halo " + nama + "!");
    }
}
