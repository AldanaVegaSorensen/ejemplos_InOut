package TP0;

import java.util.Scanner;

public class punto2_3 {
    
    private static void numerosPrimos(int numero){
        int cantPrimos=0;
        for(int i = 2; i<=numero; i++){
            if(esPrimo(i)){
                //System.out.print(i+" ");
                cantPrimos++;
            }
        }
        System.out.println("Hay "+cantPrimos+" números primos entre 1 y "+numero);
    }

    public static boolean esPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
          if (numero % contador == 0)
            primo = false;
          contador++;
        }
        return primo;
      }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int numero = scanner.nextInt(); 
        System.out.println("Número ingresado: "+numero);
        numerosPrimos(numero);
    }

}
