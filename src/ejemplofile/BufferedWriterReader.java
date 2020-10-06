/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author angel
 */
public class BufferedWriterReader {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "prueba1.txt";
        
        bufferedWriter(nombre);
        bufferedReader(nombre);
    }
    
    private static void bufferedWriter(String nombre){//crea un fichero dentro de la carpeta donde estas en este caso en el proyecto
        String cadena = "Hola bro que tal estas";
        
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter(nombre));
            
            bw.write(cadena);
            bw.close();
        }
        catch(IOException e){
            System.out.println("Error en la escritura");
        }
    }
    
    private static void bufferedReader(String nombre){
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombre));

            
            int valor = br.read();
            while (valor != -1){
                System.out.println(valor);
                valor = br.read();
            }
            br.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        }
        catch (Exception ex) {
            System.out.println("Error en la lectura del fichero");
        }
    }
}
