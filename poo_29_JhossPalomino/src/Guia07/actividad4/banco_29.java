package Guia07.actividad4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class banco_29 {

    double cantidad;
    double monto;

    public void ingresarCantidad(double cantidad) {
        this.cantidad = cantidad;
        this.monto = monto;
        System.out.println("ingreso: " + cantidad + " en el banco");
    }
    
    public void ingresarMonto(double monto) {
        System.out.println("el monto es: " + monto);
    }

    public void depositar() {
        cantidad = cantidad + monto;
    }

    public void retirar() {
        if (monto <= cantidad) {
            cantidad = cantidad - monto;
            System.out.println("retirado con exito");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void consultarSaldo() {
        System.out.println("usted tiene: " + cantidad);
    }
}
