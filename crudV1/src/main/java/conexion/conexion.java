/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class conexion {
    String hostname = "localhost";
    String jdbcUrl = "jdbc:mysql://" + hostname + ":33060/dbuser";
    String user = "root";
    String password = "dinosaurio1234";
    
    Connection con;
    
    public conexion(){
        try {
            con = DriverManager.getConnection(jdbcUrl,user,password);
            System.out.println("exito en la conexion");
        } catch (SQLException e) {
            System.out.println("error con la clase conexion: " + e);
        }
    }
    
    public Connection getConexion(){
         return con;
    }
}
