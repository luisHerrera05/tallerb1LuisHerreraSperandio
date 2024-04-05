/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class triangulo {
    private double lado;

    public triangulo() {
    }
  
    public int calcularAREa(int base,int altura){
    
      return 2/(base*altura);
    
    }
    public double perimetro(int ladoA,int ladoB,int ladoC){
    
      return ladoA+ladoB+ladoC;
    
   
    }
    public double hipotenusa(int catetoADyacente,int catetoOpuesto){
    
      return Math.sqrt(catetoADyacente+catetoOpuesto);
    
   
    }

    @Override
    public String toString() {
        return "triangulo{" + "lado=" + lado + '}';
    }
    
    
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    
}
