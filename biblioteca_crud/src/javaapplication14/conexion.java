/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class conexion {
    String host = "databasejhoss.cdekvtdvpspo.us-east-1.rds.amazonaws.com";
    String jdbcUrl = "jdbc:mysql://" + host + ":3306/libreria?useSSL=false";
    String username = "admin";
    String password = "Dinosaurio1234";
    Connection con;
    
    public conexion(){
        try {
             con = DriverManager.getConnection(jdbcUrl, username, password);
             if (con != null){
                 System.out.println("Conexion exitosa");
             }
        } catch (Exception e) {
            System.out.println("Error en la conexion: " + e);
        }
    }
    
    public Connection getConection(){
       return con;
    }
}
