/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package ejemplofile;

import java.io.File;

/**
 *
 * @author angel
 */
public class EjemploFile {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File ("prueba.txt");
        
        if(f.exists()){//Con el if el archivo tiene que estar dentro del proyecto si quitas el if t dice donde sta aunq no este dentro del proyecto
            System.out.println ("Nombre: " + f.getName());
            System.out.println ("Directorio padre: " + f.getParent());
            System.out.println ("Ruta relativa: " + f.getPath());
            System.out.println ("Ruta absoluta: " + f.getAbsolutePath());
        }
        else{
            System.out.println ("El fichero no existe");
        }
    }
}
