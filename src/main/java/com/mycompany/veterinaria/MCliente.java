/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria;

import java.time.LocalDate;

/**
 *
 * @author UPS
 */
public class MCliente extends MPersona {


    
    private LocalDate fechaRegistro;


    public MCliente(){}
    
    public MCliente(LocalDate fechaRegistro, int idPersona, String cedula, String nombre, String telefono, String correo, String direccion) {
        super(idPersona, cedula, nombre, telefono, correo, direccion);
        this.fechaRegistro = fechaRegistro;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }


    
        
}
