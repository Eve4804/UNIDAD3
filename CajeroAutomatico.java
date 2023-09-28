/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajeroautomatico;

import java.util.Scanner;

public class CajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Bienvenido al Cajero Automático");
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Depositar Dinero");
        System.out.println("3. Retirar Dinero");
        int opcion = op.nextInt();
        switch (opcion) {
            case 1:
                double saldo = 5000.00;
                System.out.println("Su saldo es de: " + saldo);
                break;
            case 2:
                double saldoi = 5000.00;
                System.out.println("Ingresa la cantidad del deposito");
                double deposito = op.nextDouble();
                saldoi += deposito;
                System.out.println("Tu saldo actual es de: " + saldoi);
                break;
            case 3:
                double saldoin = 5000.00;
                System.out.println("Ingresa la cantidad que quieres retirar");
                double retiro = op.nextDouble();
                saldoin -= retiro;
                if (retiro <= saldoin) {
                    System.out.println("El retiro fue exitoso, tu saldo actial es de: " + saldoin);
                } else {
                    System.out.println("Fondos insuficientes");

                }
                break;
            default:
                System.out.println("Opcion no valida. Por favor selecciona una opcion valida");

        }
       op.close();
    }

}
