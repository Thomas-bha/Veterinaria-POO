/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria;

import java.time.LocalDate;

/**

 */
public class MAtencionAmbulatoria {
    
    private int idAtencion;
    private LocalDate fecha;
    private MMascota mascota;
    private MVeterinario veterinario;
    private String motivoConsulta;
    private String diagnostico;
    private String tratamiento;
    private double costo;

    public int getIdAtencion() {
        return idAtencion;
    }

    public void setIdAtencion(int idAtencion) {
        this.idAtencion = idAtencion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
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

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
    
}
