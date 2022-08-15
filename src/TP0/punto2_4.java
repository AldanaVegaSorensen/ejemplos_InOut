package TP0;

import java.util.Random;
import java.util.Scanner;

public class punto2_4 {
    static final int MAX_VALOR = 100000;
    static Scanner scanner = new Scanner(System.in);


    private static int generarNumeroAleatorio(){//Número entre 1 y MAX_VALOR
        Random random = new Random();
        int num = random.nextInt(MAX_VALOR);
        return num;
    }


    private static void juego(int numero){
        System.out.println("Ingrese un número");
        int ingresado = scanner.nextInt();
        while(ingresado!=numero){
            if(numero<ingresado){
                System.out.println("Ingrese un número menor");
            }else{
                System.out.println("Ingrese un número mayor");
            }
            ingresado = scanner.nextInt();
        }
        System.out.println("Adivinaste");
    }
    
    public static void main(String[] args) {
        
        int numero = generarNumeroAleatorio();
        juego(numero);
    }
}
