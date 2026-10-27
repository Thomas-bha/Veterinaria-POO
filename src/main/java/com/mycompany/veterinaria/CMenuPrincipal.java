package com.mycompany.veterinaria;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CMenuPrincipal implements ActionListener {    private VMenuPrincipal vista;

    public CMenuPrincipal(VMenuPrincipal vista) {
        this.vista = vista;

        vista.salir.addActionListener(this);
        vista.ingresoClientes.addActionListener(this);
        vista.eliminarClientes.addActionListener(this);
        vista.listarClientesIndividual.addActionListener(this);
        vista.listarClientesGeneral.addActionListener(this);
        vista.acercaDe.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) // METODO PARA IMPLEMENTAR ActionListener
    {
        // MENU ARCHIVO
        if (e.getSource() == vista.salir) {
            System.exit(0);
        }

        // MENU CLIENTES
        if (e.getSource() == vista.ingresoClientes) {
            // INSTNACIA UN MODELO
            MCliente modeloCliente = new MCliente();
            // INSTANCIA UNA VISTA
            VCliente vistaCliente =new VCliente();
            // INSTANCIA UN CONTROLADOR RECIBIENDO LOS DOS
            CCliente controladorCliente =new CCliente(modeloCliente, vistaCliente);
        }

        if (e.getSource() == vista.eliminarClientes) {

        }

        if (e.getSource() == vista.listarClientesIndividual) {

        }

        if (e.getSource() == vista.listarClientesGeneral) {

        }

        // MENU ACERCA DE...
        if (e.getSource() == vista.acercaDe) {
            String mensajeAcercaDe = "*** Veterianaria POO ***\n"
                    + "Desarrollado por: Thomas Loor \n"
                    + "UPS - 2026";
            JOptionPane.showMessageDialog(vista, mensajeAcercaDe,
                    "Acerca de", JOptionPane.INFORMATION_MESSAGE); // 0: Alerta 1: Información
        }

    }}

