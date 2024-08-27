/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07.actividad2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class computadora_29 {
    String usuario;
    String contraseña;
    Scanner rg = new Scanner(System.in);
    
    public void encender(){
        System.out.println("La pc esta encendiendo");
        System.out.println("Actualmente esta en la consola");
    }
    
    public void iniciarSesion() {
        System.out.println("Ingrese usuario");
        usuario = rg.nextLine();
        System.out.println("Ingrese contraseña");
        String contraseñaIngresada = rg.nextLine();
        System.out.println("bienvenido de nuevo " + usuario);
        this.usuario = usuario;
    }
    
    public void Escritorio() {
        System.out.println("1. navegador web" + "\n" +
                           "2. buscaminas" + "\n"  +
                           "3. salir");
        int accion = rg.nextInt();
        if (accion == 1){
            System.out.println("actualmente no esta conectado a internet");
        }
        else if (accion == 2) {
            System.out.println("En proceso...");        
        }
        else if (accion == 3) {
            System.out.println("adios" + usuario);
        } 
        else {
            System.out.println("no valido");
        }
    }
}
