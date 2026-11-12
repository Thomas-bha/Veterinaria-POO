package com.mycompany.veterinaria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CVeterinario {

    private final MVeterinario modelo;
    private final VVeterinario vista;

    public CVeterinario(MVeterinario modelo, VVeterinario vista) {
        this.modelo = modelo;
        this.vista = vista;

        vista.clickBotonGrabar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                grabarDatos();
            }
        });

        vista.clickBotonCerrar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
            }
        });
    }

    private void grabarDatos() {
        modelo.setIdPersona(vista.getIdPersona());
        modelo.setCedula(vista.getCedula());
        modelo.setNombre(vista.getNombre());
        modelo.setTelefono(vista.getTelefono());
        modelo.setCorreo(vista.getCorreo());
        modelo.setDireccion(vista.getDireccion());
        modelo.setEspecialidad(vista.getEspecialidad());
        modelo.setNumeroLicencia(vista.getNumeroLicencia());
        modelo.setEstado(vista.isEstado());

        vista.mostrarMensaje("Guardado correctamente");
    }
}
