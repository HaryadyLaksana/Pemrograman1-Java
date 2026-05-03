package Latihan;


//Interface (Lembaga, Tingkat, Universitas, SMA)

interface Lembaga {
    static final String Province = "Banten";
    static final String District = "Tangerang Selatan";
    
    public void setName (String Name);
    public void setAddress ( String Address);
    public void setPhone (String Phone);
    
    public String getName();
    public String getAddress();
    public String getPhone();
}


interface Tingkat {
    public void setLevel (String Level);
    public String getLevel();
}

class University implements Lembaga, Tingkat {
    String Name, Address, Phone, Level;
    
    public University (String Name, String Address, String Phone, String Level) {
        this.Name = Name;
        this.Address = Address;
        this.Phone = Phone;
        this.Level = Level;
    }
    
    public void setName (String Name) {
        this.Name = Name;
    }
    
    public void setAddress (String Address) {
        this.Address = Address;
    }
    
    public void setPhone (String Phone) {
        this.Phone = Phone;
    }
    
    public String getName () {
        return Name;
    }
    
    public String getAddress() {
        return Address;
    }
    
    public String getPhone() {
        return Phone;
    }
    
    public void setLevel (String Level) {
        this.Level = Level;
    }
    
    public String getLevel() {
        return Level;
    }
    
    public String toString() {
        return "Name : " + Name + "\n" +
               "Level : " + Level + "\n" +
               "Address : " + Address + "\n" +
               "Phone : " + Phone + "\n" +
               "District : " + District + "\n" +
               "Province : " + Province; 
    }
   
    }

class SMA implements Lembaga, Tingkat {
    String Name, Address, Phone, Level;
    
    public SMA (String Name, String Address, String Phone, String Level) {
        this.Name = Name;
        this.Address = Address;
        this.Phone = Phone;
        this.Level = Level;
    }
    
    public void setName (String Name) {
        this.Name = Name;
    }
    
    public void setAddress (String Address) {
        this.Address = Address;
    }
    
    public void setPhone (String Phone) {
        this.Phone = Phone;
    }
    
    public String getName() {
        return Name;
    }
    
    public String getAddress() {
        return Address;
    }
    
    public String getPhone() {
        return Phone;
    }
    
    public void setLevel (String Level) {
        this.Level = Level;
    }
    
    public String getLevel() {
        return Level;
    }
    
    public String toString () {
        return "Name : " + Name + "\n" +
               "Level : " + Level + "\n" +
               "Address : " + Address + "\n" +
               "Phone : " + Phone + "\n" +
               "District : " + District + "\n" +
               "Province : " + Province;
    }
}


public class Latihan2 {
    public static void main (String args []) {
        University Unpam;
        Unpam = new University (
            "Universitas Pamulang",
            "Jl. Surya Kencana No. 1",
            "+62 21 7412566",
            "Universitas"
        );

        SMA SMAN2 = new SMA (
            "SMAN 2 Kota Tangerang Selatan",
            "Jl. Raya Puspitek Muncul",
            "+62 21",
            "SLTA"
        );
        
        System.out.println("Informasi Lembaga Pendidikan :\n" + Unpam.toString());
        System.out.println();
        System.out.println("Informasi Lembaga Pendidikan :\n" + SMAN2.toString());
    }
}
