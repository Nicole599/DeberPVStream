/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciostream1;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class EjercicioStream1 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Persona> ListaPersona = new ArrayList<>();
    public static void main(String[] args) {
        // TODO code application logic here
        Persona_Archivo.GuardarRegistros(ListaPersona);
        
        new PersonaR().setVisible(true);
         
    }
    
}
