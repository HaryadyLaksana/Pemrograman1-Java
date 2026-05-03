package Latihan;

//Abstract Class (Makhluk Hidup, Manusia, kucing)

    abstract class LivingThing {
        public void breath () {
            System.out.println("Bernafas melalui hidung.");
        }
        
        public void eat() {
            System.out.println("Makan melalui mulut.");
        }
        
        public abstract void walk();
    }
    
    class Human extends LivingThing {
        public void walk() {
            System.out.println("Berjalan dengan 2 kaki.");
        }
    }
    
    class Cat extends LivingThing {
        public void walk() {
            System.out.println("Berjalan dengan 4 kaki.");
        }
    }
    
    public class Latihan1 {
        public static void main (String args[]) {
            Human Manusia = new Human();
            Cat Kucing = new Cat();
            
            System.out.println("Manusia :");
            Manusia.breath();
            Manusia.eat();
            Manusia.walk();
            
            System.out.println();
            
            System.out.println("Kucing :");
            Kucing.breath();
            Kucing.eat();
            Kucing.walk();
        }
    }
