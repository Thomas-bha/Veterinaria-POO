/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria;

import java.time.LocalDate;

/**

 */
public class MHospitalizacion {
    private int idHospitalizacion;
    private LocalDate fechaIngreso;
    private LocalDate fechaAlta;
    private MMascota mascota;
    private MVeterinario veterinario;
    private String motivo;
    private String diagnostico;
    private String tratamiento;
    private String estado;
    private double costo;

    public int getIdHospitalizacion() {
        return idHospitalizacion;
    }

    public void setIdHospitalizacion(int idHospitalizacion) {
        this.idHospitalizacion = idHospitalizacion;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public MMascota getMascota() {
        return mascota;
    }

    public void setMascota(MMascota mascota) {
        this.mascota = mascota;
    }

    public MVeterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(MVeterinario veterinario) {
        this.veterinario = veterinario;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }


}
