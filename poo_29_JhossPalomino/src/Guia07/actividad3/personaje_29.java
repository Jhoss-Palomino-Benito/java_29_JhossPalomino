/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07.actividad3;

import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class personaje_29 {
    String nombre;
    int edad;
    String habilidad;
    
    public String nombre(){
      return JOptionPane.showInputDialog("¿Cual es tu nombre?");
    }
    
    public int edad(){
      return Integer.parseInt(JOptionPane.showInputDialog("¿Cual es su edad?"));
    }
    
    public String habilidad(){
      return JOptionPane.showInputDialog("¿Cual es tu habilidad?");
    }
    
    public void datos(){
      JOptionPane.showMessageDialog(null, "nombre: " + nombre() + "\n"
                                    + "edad: " + edad() + "\n"
                                    + "habilidad: " + habilidad());
    }
}
