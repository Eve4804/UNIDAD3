/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author evely
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int in = 0;
        int segundo = 1;

        System.out.println("Ingresa un numero");

        int numero = entrada.nextInt();

        for (int i = 0; i <= numero; i++) {
            System.out.println("LA SERIE VA ASI: " + in);
            int tercer = in + segundo;
            in = segundo;
            int n =(numero-1)+(numero-2);

        }

    }
}
