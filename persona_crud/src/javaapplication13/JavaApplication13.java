/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        //credenciales
        String host = "databasejhoss.cdekvtdvpspo.us-east-1.rds.amazonaws.com";
        String jdbcUrl = "jdbc:mysql://" + host + ":3306/datos?useSSL=false";
        String username = "admin";
        String password = "Dinosaurio1234";

        Connection conexion = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            //conectar la base de datos
            conexion = DriverManager.getConnection(jdbcUrl, username, password);
            if (conexion != null) {
                System.out.println("conexion exitosa");
            }
            
            //ejecutar una consulta
            statement = conexion.createStatement();
            
            //ejecuta la consulta
            resultSet = statement.executeQuery("select * from alumnos");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));  
                System.out.println(resultSet.getString(2)); 
                System.out.println(resultSet.getString(3)); 
            }
            System.out.println(resultSet);
        } catch (Exception e) {
            System.out.println("error en la conexion: " + e);
        } finally {
            if (conexion != null){
               System.out.println("cerrar conexion");
            }
        }
    }
    }
   