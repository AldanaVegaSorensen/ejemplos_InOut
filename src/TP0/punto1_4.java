package TP0;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import utiles.Aleatorio;

public class punto1_4 {
    static final int CANTCARACTERES = 10;
    static final String NOMBRE_ARCHIVO = "src/TP0/cadenasAleatorias.txt";    
    static final String CARACTERES_STRING = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    
    
    private static void generarArchivo(){
    	try{
    		BufferedWriter buff = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO));
            Aleatorio a = new Aleatorio();
            int posicion;
    		for (int i = 0; i < CANTCARACTERES ; i++){
    			posicion = a.intAleatorio(0, CARACTERES_STRING.length());
                char caracter =CARACTERES_STRING.charAt(posicion);
    			buff.write(caracter);
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
   

    public static void main(String[] args) {
    	
    	generarArchivo();
    }
}
