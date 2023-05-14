/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciostream1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public abstract class Persona_Archivo {
    
       public static void GuardarRegistros(ArrayList<Persona> listaPersonas) {
        try {                  
            Stream<String> registros = Files.lines(Paths.get("C:\\Users\\LENOVO\\OneDrive\\Escritorio\\archivo.txt"));
            registros.map(registro -> {
                String[] campo = registro.split(" ");
                
                return new Persona(campo[0], campo[1], campo[2]);
            }).forEach(listaPersonas::add); 
            
           
        } catch(Exception E) {
            System.out.println("E = " + E);
        }
    }

}
