package TP0;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class punto1_5 {
    static final int CANTNUMEROS = 10;
    static final int MAX_VALOR = 1000;
    static final String NOMBRE_ARCHIVO = "src/TP0/numerosAleatorios.txt";    

    private static void generarArchivo(){
    	try{
    		BufferedWriter buff = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO));
    		Random generador = new Random();
            //Set<Integer> generados = new HashSet<>();
            int [] generados = new int [CANTNUMEROS];
    		for (int i = 0; i < CANTNUMEROS ; i++){
    			int num = generador.nextInt(MAX_VALOR);
                
                
                /*if(!generados.contains(num)){
                    buff.write( num +"\n");
                }*/

                if(!verificarRepetido(generados, num)){
                    buff.write( num +"\n");
                }
    			//System.out.println(num);
    		}
    		buff.close();
    	}
    	catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage() + "\nSignifica que el archivo del "
                    + "que queriamos leer no existe.");
        }
        catch (IOException ex) {
            System.err.println("Error leyendo o escribiendo en algun archivo.");
        }
    }
   
    private static boolean verificarRepetido(int [] generados, int numero){
        boolean repetido = false;
        int i=0;
        while(i<CANTNUMEROS && !repetido){
            if(generados[i]==numero){
                repetido=true;
            }
            i++;
        }
        return repetido;
    }
    public static void main(String[] args) {
    	
    	generarArchivo();
    }
}
