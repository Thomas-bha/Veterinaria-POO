
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria;

/**

 */
public class MPersona {

    private int Id;
    private String cedula;
    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;
    
    public int validarCedula(){
    
        //validar longitud
        if(cedula == null || cedula.length() !=10){
            return 1;
        }
        //validar solo numeros
        for(int i = 0; i < cedula.length(); i++){
            if (!Character.isDigit(cedula.charAt(i))){
                return 2;
            }
        }
        //validar logica
        int suma =0;
        for(int i =0; i<9; i++){
            int digito = Character.getNumericValue(cedula.charAt(i));
            if (1%2==0){
                digito *=2;
                if (digito>9){
                    digito -=9;
                }
            }
            suma += digito;
        }
        int verificador = (10 - (suma%10)) %10;
        int ultimoDigito = Character.getNumericValue(cedula.charAt(9));
        
        if(verificador != ultimoDigito){
            return 3;
        }
        return 0; //cedula valida
    }

    
    public MPersona(){}
    
    public MPersona(int Id, String cedula, String nombre, String telefono, String correo, String direccion) {
        this.Id = Id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public int getIdPersona() {
        return Id;
    }

    public void setIdPersona(int idPersona) {
        this.Id = Id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
 

}
