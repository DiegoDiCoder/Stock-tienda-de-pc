/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendapc;

/**
 *
 * @author diego
 */
public class Pieza {
    
    private String id;
    private double precio;
    private String marca;
    public int cantidad;

    public Pieza() {
    }
    
    

    public Pieza(String id, double precio, String marca, int cantidad) {
        this.id = id;
        this.precio = precio;
        this.marca = marca;
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void imprimir(){
        System.out.println(this.id+" precio: "+this.precio+" marca: "+this.marca+" Disponibles: "+this.cantidad );
    }
  
}
