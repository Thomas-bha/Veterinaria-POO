/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria;

/**

 */
public class MVeterinario extends MPersona {

    private String especialidad;
    private String numeroLicencia;
    private boolean estado;

    public MVeterinario(String especialidad, String numeroLicencia, boolean estado, int idPersona, String cedula, String nombre, String telefono, String correo, String direccion) {
        super(idPersona, cedula, nombre, telefono, correo, direccion);
        this.especialidad = especialidad;
        this.numeroLicencia = numeroLicencia;
        this.estado = estado;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    

 

    
}
