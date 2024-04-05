/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;


public class cuadrado {
    private int lado;

    public cuadrado() {
        this.lado=lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int calcularAREa(int lado){
    
      return lado*lado;
    
   
    }
     public int calcularPerimetro(int lado){
    
      return lado*4;
    
   
    }
    
    @Override
    public String toString() {
        return "cuadrado{" + "lado=" + lado + '}';
    }
   
}
