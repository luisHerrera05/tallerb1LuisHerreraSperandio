/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

/**
 *
 * @author luiseduardoherrerasperandio
 */
import java.time.LocalDate;
import java.time.Period;

public class persona {
    private LocalDate fechaNacimiento;

    public persona() {

    }

    public persona(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
        

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String diasVida () {
        LocalDate fechaActual = LocalDate.now();
        Period vida = Period.between(fechaNacimiento, fechaActual);

        int años = vida.getYears();
        int meses = vida.getMonths();
        int dias = vida.getDays();

        return "Tienes " + años + " años, " + meses + " meses y " + dias + " dias de vida.";
    }

    
    public String toString() {
        return "Persona [Dias de vida = " + diasVida() + "]";
    }
}
