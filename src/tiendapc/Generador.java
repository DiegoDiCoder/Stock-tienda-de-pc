/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendapc;

import java.util.Random;

/**
 *
 * @author diego
 */
public class Generador {
     public static Pieza[] generarProductos(int n){
        Random r=new Random();
        Pieza[] resultado=new Pieza[n];
        
        for(int i=0;i<n;i++){
            Pieza p=new Pieza();
         
            resultado[i]=p;
        }
        return resultado;
    }
}
