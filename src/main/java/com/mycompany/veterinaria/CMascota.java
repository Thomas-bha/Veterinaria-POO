package com.mycompany.veterinaria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CMascota {

    private final MMascota modelo;
    private final VMascota vista;

    public CMascota(MMascota modelo, VMascota vista) {
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
        modelo.setIdMascota(vista.getIdMascota());
        modelo.setNombre(vista.getNombre());
        modelo.setPeso(vista.getPeso());
        modelo.setEspecie(vista.getEspecie());
        modelo.setRaza(vista.getRaza());
        modelo.setSexo(vista.getSexo());
        modelo.setFechaNacimiento(vista.getFechaNacimiento());

        MCliente cliente = new MCliente();
        cliente.setNombre(vista.getNombreCliente());
        modelo.setCliente(cliente);

        vista.mostrarMensaje("Guardado correctamente");
    }
}