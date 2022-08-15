package TP0;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import utiles.Aleatorio;

public class punto1_3 {
    static final int CANTNUMEROS = 100;
    static final int MAX_VALOR = 100;
    static final int MIN_VALOR = -100;
    static final String NOMBRE_ARCHIVO = "src/TP0/numerosReales.txt";    


    private static void generarArchivo(){
    	try{
    		BufferedWriter buff = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO));
    		for (int i = 0; i < CANTNUMEROS ; i++){
    			Aleatorio a = new Aleatorio();
                double num = a.doubleAleatorio(MIN_VALOR, MAX_VALOR);
    			buff.write( num +"\n");
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
