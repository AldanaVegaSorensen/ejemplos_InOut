package TP0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class punto1_1 {
    static final String nombreArchivoEntrada = "src/ejemplos_InOut/entrada.txt";
    static final String nombreArchivoSalida = "src/TP0/sinEspacios.txt";
    
    public static void main(String[] args) {
        
        String linea = null;

        try {
            
            FileReader lectorArchivo = new FileReader(nombreArchivoEntrada);
            FileWriter escritorArchivo = new FileWriter(nombreArchivoSalida);

            BufferedReader bufferLectura = new BufferedReader(lectorArchivo);
            BufferedWriter bufferEscritura = new BufferedWriter(escritorArchivo);

           
            while ((linea = bufferLectura.readLine()) != null) {
                //System.out.println(linea);
                bufferEscritura.write(linea.replaceAll("\\s",""));
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