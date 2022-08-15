package TP0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class punto1_2 {
    public static void main(String[] args) {
       
        String nombreArchivoEntrada = "src/ejemplos_InOut/entrada.txt";
        String nombreArchivoSalida = "src/TP0/lineasImpares.txt";
        
        String linea = null;

        try {
            
            FileReader lectorArchivo = new FileReader(nombreArchivoEntrada);
           
            FileWriter escritorArchivo = new FileWriter(nombreArchivoSalida);

            BufferedReader bufferLectura = new BufferedReader(lectorArchivo);
            BufferedWriter bufferEscritura = new BufferedWriter(escritorArchivo);

            int num = 1;
            while ((linea = bufferLectura.readLine()) != null) {
                if(num%2 !=0){
                    //System.out.println(linea);
                    bufferEscritura.write(linea+"\n");
                }
                num++;
            }

            
            bufferLectura.close();
            bufferEscritura.close();
        }
        catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage() + "\nSignifica que el archivo del "
                    + "que queriamos leer no existe.");
        }
        catch (IOException ex) {
            System.err.println("Error leyendo o escribiendo en algun archivo.");
        }
    }
}
