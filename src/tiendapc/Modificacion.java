/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendapc;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Modificacion {
    Pieza[] mercancia;

    public Modificacion(Pieza[] mercancia) {
        this.mercancia = mercancia;
    }

    public Pieza[] getMercancia() {
        return mercancia;
    }

    public void setMercancia(Pieza[] mercancia) {
        this.mercancia = mercancia;
    }
    
      public int busqueda(String id){
        int i=0;
        boolean encontrado=false;
        
        while (i<mercancia.length|| encontrado==false){
            
            if(mercancia[i].getId().compareTo(id)==0){
               encontrado=true;
               mercancia[i].imprimir();
            }
             i++;
            }
        return i;
    }
    
    public void ordenarAlfabeto(Pieza[] stock){
        
        for (int j = 0; j < stock.length ; j++) {
            for (int i = 0; i < stock.length - j; i++) {
                if (stock[i].getId().compareTo(stock[i+1].getId())>0) {
                    Pieza aux=new Pieza();
                    aux = stock[i];
                    stock[i] = stock[i + 1];
                    stock[i + 1] = aux;
                }
            }
        }
    }
    
    public void reabastecimiento(Pieza[] m_nueva){
        ArrayList<Pieza> s1=new ArrayList<Pieza>();
        int i=m_nueva.length-1;
        int x=0;
        
        while (i>=0){
            
         if (mercancia[i].getId().compareTo(m_nueva[i].getId())==0){
            x=mercancia[i].getCantidad() + m_nueva[i].getCantidad();
             mercancia[i].setCantidad(x);
         }   else{
             s1.add(m_nueva[i]);   
         }
        i--;
        } 
        Pieza[] resultado=new Pieza[s1.size()];
        s1.toArray(resultado);
        Pieza[] NuevoStock= new Pieza[mercancia.length+resultado.length];
        System.arraycopy( mercancia, 0, NuevoStock, 0, mercancia.length );
        System.arraycopy( resultado, 0, NuevoStock, mercancia.length, resultado.length );
        this.ordenarAlfabeto(NuevoStock);
        
    }
   public Pieza[] Ventas(int n_compras, int pos){
     
       ArrayList<Pieza> compra=new ArrayList<Pieza>();
       
      mercancia[pos].setCantidad(mercancia[pos].getCantidad()-n_compras);
       System.out.println("Compra exitosa");
       int i=0;
       if (mercancia[pos].getCantidad()!=mercancia[pos].getCantidad()){
           compra.add(mercancia[i]);
           i++;
       }
      Pieza[] resultado=new Pieza[compra.size()];
        compra.toArray(resultado);
       return resultado;
       
    
}
}
