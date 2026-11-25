package com.mycompany.veterinaria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CVeterinario {

    private final MVeterinario modelo;
    private final VVeterinario vista;
    private final ArrayList<MVeterinario> listaVeterinarios;

    public CVeterinario(MVeterinario modelo, VVeterinario vista) {
        this(modelo, vista, new ArrayList<MVeterinario>());
    }

    public CVeterinario(
            MVeterinario modelo,
            VVeterinario vista,
            ArrayList<MVeterinario> listaVeterinarios) {
        this.modelo = modelo;
        this.vista = vista;
        this.listaVeterinarios = listaVeterinarios;

        vista.clickBotonGrabar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resultado = modelo.validarCedula(vista.getCedula());
                boolean datosValidos = true;
                if (resultado != 0) {
                    vista.mostrarMensaje(resultado, "Validación", JOptionPane.ERROR_MESSAGE);
                    datosValidos = false;
                }

                int idPersona = 0;
                try {
                    idPersona = vista.getIdPersona();
                } catch (NumberFormatException ex) {
                    vista.mostrarMensaje("El ID debe ser un número entero", "Validación", JOptionPane.ERROR_MESSAGE);
                    datosValidos = false;
                }

                if (datosValidos) {
                    grabarDatos(idPersona);
                    vista.mostrarMensaje(0, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    vista.dispose();
                }
            }
        });

        vista.clickBotonCerrar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
            }
        });
    }

    private void grabarDatos(int idPersona) {
        modelo.setIdPersona(idPersona);
        modelo.setCedula(vista.getCedula());
        modelo.setNombre(vista.getNombre());
        modelo.setTelefono(vista.getTelefono());
        modelo.setCorreo(vista.getCorreo());
        modelo.setDireccion(vista.getDireccion());
        modelo.setEspecialidad(vista.getEspecialidad());
        modelo.setNumeroLicencia(vista.getNumeroLicencia());
        modelo.setEstado(vista.isEstado());
        listaVeterinarios.add(modelo);
    }
}
