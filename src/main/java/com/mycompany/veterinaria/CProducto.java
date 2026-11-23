package com.mycompany.veterinaria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CProducto {

    private final MProducto modelo;
    private final VProducto vista;

    public CProducto(MProducto modelo, VProducto vista) {
        this.modelo = modelo;
        this.vista = vista;

        vista.clickBotonFoto(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.seleccionarFoto();
            }
        });

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
        modelo.setIdProducto(Integer.parseInt(vista.getIdProducto()));
        modelo.setNombre(vista.getNombre());
        modelo.setDescripcion(vista.getDescripcion());
        modelo.setCategoria(vista.getCategoria());
        modelo.setPrecio(Double.parseDouble(vista.getPrecio()));
        modelo.setStock(Integer.parseInt(vista.getStock()));

        vista.mostrarMensaje("Datos guardados correctamente",
                "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }
}
