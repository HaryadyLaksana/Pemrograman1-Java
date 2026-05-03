package Latihan;

//Input Menggunakan JOption yang memunculkan kotak dialog kepada user

import javax.swing.JOptionPane;

public class Latihan3 {
    public static void main (String [] args) {
        String nama = "";
        
        nama = JOptionPane.showInputDialog("Masukkan Nama Anda : " );
        
        String pesan =" Assalamualaikum " + nama + " !! " ;
        
        JOptionPane.showMessageDialog(null, pesan);
    }
}
