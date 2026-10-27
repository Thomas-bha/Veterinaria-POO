
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria;

import java.time.LocalDate;

import com.mycompany.veterinaria.MCliente;

import java.time.LocalDate;

/**

 */
public class MMascota {
    private String nombre;
    private float peso;
    private String idMascota;
    private String especie;
    private String raza;
    private String sexo;
    private LocalDate fechaNacimiento;
    private MCliente cliente;

    float kilosLibras(){
        
        float conversion;
        
        conversion=peso*2.20462f;
        return conversion;
        
 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(String idMascota) {
        this.idMascota = idMascota;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public MCliente getCliente() {
        return cliente;
    }

    public void setCliente(MCliente cliente) {
        this.cliente = cliente;
    }
    
    
    
}