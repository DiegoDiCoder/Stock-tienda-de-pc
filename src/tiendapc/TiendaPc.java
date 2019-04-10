/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendapc;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class TiendaPc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pieza p1=new Pieza("gtx1050",200,"Nvidia",3);
        Pieza p2=new Pieza("gtx960",180,"Nvidia",8);
        Pieza n1=new Pieza("gtx1050",200,"Nvidia",1);
        Pieza n2=new Pieza("gtx960",150,"Nvidia",3);
        Pieza[] SO={p1,p2};
        Pieza[] SN={n1,n2};   
        
        Modificacion p=new Modificacion(SO);
        System.out.println("Productoa buscar: ");
        Scanner reader = new Scanner(System.in);
        String x="gtx960";     
        p.busqueda(x);
        p.Ventas(2, p.busqueda(x));
        p.busqueda(x);
        
        
        
    }
}
