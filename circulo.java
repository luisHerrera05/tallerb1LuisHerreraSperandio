/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class circulo {
    private double diametro;

    public circulo() {
    }
    
    
    public double area(int diametro){

  return Math.pow(diametro, 2);
 
 }

    
    public double perimetro(double radio){
    
      return 2*(3.1416*radio);
    
   
    }
    
    

 
    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "circulo{" + "diametro=" + diametro + '}';
    }
    
    
}
