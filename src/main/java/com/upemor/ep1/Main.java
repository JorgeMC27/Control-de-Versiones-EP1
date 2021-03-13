package com.upemor.ep1;

import java.util.Scanner;

/**
 @author JORGE
 **/
public class Main {
    public static void main(String[] args) {
        
      
        System.out.println("Precione [1] para agregar un registro");
        System.out.println("Precione [2] para eliminar un registro");
        System.out.println("Precione [3] para actualizar un registro");
        System.out.println("Precione [4] para hacer una busqueda");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        int opcion2 = sc.nextInt();

        switch(opcion){
            case 1:
                System.out.println("si funciona mi switch 1");
                System.out.println("Desea volver al menu principal precione [0]?");
                sc = new Scanner(System.in);
                opcion2 = sc.nextInt();
                break;
            case 2:
                System.out.println("si funciona mi switch 2");
                System.out.println("Desea volver al menu principal precione [0]?");
                sc = new Scanner(System.in);
                opcion2 = sc.nextInt();
                break;
            case 3:
                System.out.println("si funciona mi switch 3");
                System.out.println("Desea volver al menu principal precione [0]?");
                sc = new Scanner(System.in);
                opcion2 = sc.nextInt();
                break;       
            case 4:
                System.out.println("si funciona mi switch 4");
                System.out.println("Desea volver al menu principal precione [0]?");
                sc = new Scanner(System.in);        
                opcion2 = sc.nextInt();    
                break;        
            }
    }
        
}
