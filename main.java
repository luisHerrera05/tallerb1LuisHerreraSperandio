/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

import java.time.LocalDate;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class main {
    public static void main (String [] args){
    
    System.out.println("_______cuadrado_______");
    
    
    cuadrado cuaDrado = new cuadrado ();
    
    
    System.out.println(cuaDrado.calcularAREa(3));
    System.out.println(cuaDrado.calcularPerimetro(3));
    
       System.out.println("_______circulo_______");
    
    
    circulo cirCulo = new circulo ();
    
    
    System.out.println(cirCulo.area(3));
    System.out.println(cirCulo.perimetro(3));
    
     System.out.println("_______triangulo_______");
    
    
    triangulo triangle = new triangulo ();
    

    System.out.println(triangle.calcularAREa(4,3));
    System.out.println(triangle.perimetro(5,4,6));
    System.out.println(triangle.hipotenusa(3,4));
    
    System.out.println("_______mi edad es_______");
    
    LocalDate fechaNacimiento = LocalDate.of(2004, 8, 05);
        persona p = new persona (fechaNacimiento);
    System.out.println(p.toString());
    
    
    }
    
}
