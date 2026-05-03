package Siswa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    
    private static Connection koneksi;
    
    public static Connection getKoneksi() {
        try {
            String url = "jdbc:mysql://localhost:3306/db_bimba";
            String user = "root";
            String pass = "";
            
           Class.forName("com.mysql.cj.jdbc.Driver");
           koneksi = DriverManager.getConnection(url, user, pass);
           
           System.out.println("Koneksi Berhasil");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Koneksi Gagal: " + e.getMessage());
            return null;
        }
        return koneksi;
    }
}
