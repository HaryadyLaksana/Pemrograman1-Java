package Latihan;


//Menggunakan konsep Class,Object,Method,Getter,Setter,Array,Perulangan(for)

public class Latihan1 {
    private double tinggi;
    private double alas;
    
    public void settinggi (double tinggi) {
        this.tinggi = tinggi;
        }
        
        public void setalas (double alas) {
            this.alas = alas;
        }
        
        public double gettinggi () {
            return tinggi;
        }
        
        public double getalas () {
            return alas;
        }
        
        public double getluas () {
            return (this.tinggi * this.alas * 0.5);
        }
        
        public static void main (String args []) {
            Latihan1 S[] = new Latihan1 [2];
            Byte i;
            
            S[0] = new Latihan1();
            S[1] = new Latihan1();
            
            S[0].settinggi (12.0);
            S[1].setalas (8.0);
            
            S[1].settinggi (11.23);
            S[1].setalas (7.7);
            
            for (i=0; i<2; i++) {
                System.out.println("Segitiga ke-" + (i+1));
                System.out.println("Tinggi =  " + S[i].gettinggi());
                System.out.println("Alas = " + S[i].getalas());
                System.out.println("Luas Segitiga = " + S[i].getluas());
                System.out.println();
            }
            
            
        }
    }

