/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntocircunferencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author georgerr
 */
public class LecturaArchivo {
    
    
    public static int [] ReadFile (){
        String archivo = "../PuntoCircunferencia/src/puntocircunferencia/datos.txt";
        
        FileReader entrada = null;
        BufferedReader str;
        
        int numeros [] = null;
                
        try {
            entrada = new FileReader(archivo);
            str = new BufferedReader(entrada);
            String c= "";
            int [] arreglo; 
            
            String cadena = "";
            
            while ((c = str.readLine()) != null){
                
                StringTokenizer st = new StringTokenizer(c," ();,");
                
                while (st.hasMoreTokens()){
                    
                    cadena += st.nextToken() + " ";
                    
                                       
                }
                
                
            }
            
            
            String[] temp = cadena.split(" ");
            int n = temp.length;
            numeros = new int[n];
            for (int i = 0; i < n; i++) {

                numeros[i] = Integer.parseInt(temp[i]);

            }
            
            
            
            
            
            
            
//            for (int i = 0; i < arreglo.length; i++){
//            
//            arreglo [i] = Integer.parseInt(numeros[i]);
//            
//            }
//            
//            return arreglo;

        } catch (IOException ex) {
            System.out.println(ex);
        } finally {

            if (entrada != null) {
                try {
                    entrada.close();
                } catch (IOException ex) {
                }
            }

        }
        
        return numeros;
    
    }
    
    
    
    
    
    
}
