/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07.actividad4;

/**
 *
 * @author User
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        banco_29 persona1 = new banco_29();
        persona1.ingresarCantidad(2000);
        persona1.ingresarMonto(200);
        persona1.depositar();
        persona1.consultarSaldo();
    }
    
}
