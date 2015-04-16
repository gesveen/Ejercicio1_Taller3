/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntocircunferencia;

import puntocircunferencia.LecturaArchivo;
/**
 *
 * @author georgerr
 */
public class Logica {
    LecturaArchivo la = new LecturaArchivo();
    
    int[] numeros = la.ReadFile();
    
    public String CrearSalida(){
        
        String mensaje = "";
        
        int x1, x2, y1, y2, r1, r2;
        
        x1 = numeros[0];
        y1 = numeros[1];
        r1 = numeros[2];
        
        x2 = numeros[3];
        y2 = numeros[4];
        r2 = numeros[5];
        
        for (int i = 6; i < numeros.length; i=i+2) {
            int ptox = numeros[i];
            int ptoy = numeros[i+1];
            
            int ptox1= ptox-x1;
            int ptoy1= ptoy-y1;
                    
            int ptox2= ptox-x2;
            int ptoy2= ptoy-y2;
               
            
            
            
            double ptor1 = Math.sqrt((ptox1*ptox1)+(ptoy1*ptoy1));
            double ptor2 = Math.sqrt((ptox2*ptox2)+(ptoy2*ptoy2));
             
            
            
            if((ptor1<=r1)&&(ptor2<=r2)){
                mensaje += "El punto ("+ptox+", "+ptoy+") -> dentro de ambas circunferencias\n";
            }
            else{
                if(ptor1<=r1){
                    mensaje += "El punto ("+ptox+", "+ptoy+") -> dentro de la circunferencia 1\n";
                }
                else{
                    if(ptor2<=r2){
                        mensaje += "El punto ("+ptox+", "+ptoy+") -> dentro del la circunferencia 2\n";
                    }
                    else{
                        mensaje += "El punto ("+ptox+", "+ptoy+") -> por fuera de ambas circunferencias\n";
                    }
                }
            }
            
            
        }
        
        return mensaje;
    }
    
}
