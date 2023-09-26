/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroparimpar;

import java.util.Scanner;

public class NumeroParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("INGRESA UN NUMERO");
        int ParImpar = numero.nextInt();
        
        if(ParImpar% 2 == 0){
            System.out.println("EL NUMERO "+ ParImpar+ " ES PAR");
        } else {
            System.out.println("El numero "+ParImpar+ " es impar" );
        }
        numero.close(); 
        
    
    }
    }
    

