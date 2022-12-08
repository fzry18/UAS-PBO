/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ACER
 */
public class DatabaseUtil {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/pa_topup";
    static final String username = "root";
    static final String password = "";
    static Connection con;
    static Statement stmt;
    static ResultSet rs;
    
    public static Connection connect (){
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          con = DriverManager.getConnection(DB_URL, username,password);
          stmt = con.createStatement();

      } catch (Exception e ){
          System.out.println("Koneksi Gagal");
      }
      
      return con;
    }
    
    
    
}
