package com.mycompany.veterinaria;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CCliente {

    private MCliente modelo;
    private VCliente vista;
    private ArrayList<MCliente> listaClientes;

    public CCliente(MCliente modelo, VCliente vista, ArrayList<MCliente> listaClientes) {
        this.modelo = modelo;
        this.vista = vista;
        this.listaClientes = listaClientes;

        vista.clickBotonGrabar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resultado = modelo.validarCedula(vista.getCedula());
                if (resultado != 0) {
                    vista.mostrarMensaje(resultado, "Validación", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                grabarDatos();
                vista.mostrarMensaje(0, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                vista.dispose();
            }
        });

        vista.clickBotonCerrar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
            }
        });
    }

    public CCliente(ArrayList<MCliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public void listarClientes(Component ventanaPadre) {
        VCliente.mostrarClientes(ventanaPadre, listaClientes);
    }

    private void grabarDatos() {
        modelo.setCedula(vista.getCedula());
        modelo.setNombre(vista.getNombre());
        modelo.setDireccion(vista.getDireccion());
        modelo.setCorreo(vista.getCorreo());
        modelo.setTelefono(vista.getTelefono());
        modelo.setFechaRegistro(LocalDate.now());
        listaClientes.add(modelo);
        vista.setCedula("");
        vista.setNombre("");
        vista.setDireccion("");
        vista.setCorreo("");
        vista.setTelefono("");
        vista.setRegistro("");
        vista.setId("");
    }
}
