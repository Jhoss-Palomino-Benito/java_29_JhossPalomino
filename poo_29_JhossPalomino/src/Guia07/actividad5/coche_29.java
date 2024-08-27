/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07.actividad5;

import java.util.Scanner;

public class coche_29 {

    Scanner scan = new Scanner(System.in);
    String marca;
    String modelo;
    int año;

    public coche_29(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void Marca() {
        System.out.println("¿De que marca es su auto?");
        marca = scan.nextLine();
    }

    public void Modelo() {
        System.out.println("¿Cual es el modelo su auto?");
        modelo = scan.nextLine();
    }

    public void Año() {
        System.out.println("¿De que año es su auto?");
        año = scan.nextInt();
    }

    public void Datos(){
        System.out.println("Se registro un auto " + modelo + " de la marca " + marca + " hecho en el año " + año);
    }
}
