package ejemplofile;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *
 * @author angel
 */
public class FileReaderFIleWriter {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "prueba.txt";
        
        
        fileWriter(nombre);
        fileReader(nombre);
    }
    
    private static void fileWriter(String nombre){//crea un fichero dentro de la carpeta donde estas en este caso en el proyecto
        String cadena = "Hola bro que tal estas";
        
        try{
            FileWriter fw = new FileWriter(nombre);
            
            fw.write(cadena);
            fw.close();
        }
        catch(IOException e){
            System.out.println("Error en la escritura");
        }
    }
    
    private static void fileReader(String nombre){
        try {
            FileReader fr = new FileReader(nombre);
            
            int valor = fr.read();
            while (valor != -1){
                System.out.println(valor);
                valor = fr.read();
            }
            fr.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        }
        catch (Exception ex) {
            System.out.println("Error en la lectura del fichero");
        }
    }
}
