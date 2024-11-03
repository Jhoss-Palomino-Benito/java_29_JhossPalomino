/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultas;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class conexion {
    String host = "team05.cdekvtdvpspo.us-east-1.rds.amazonaws.com";
    String jdbcUrl = "jdbc:mysql://" + host + ":3306/consultation?useSSL=false";
    String username = "admin";
    String password = "equipo05";
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
