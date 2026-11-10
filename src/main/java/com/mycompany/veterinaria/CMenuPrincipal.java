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
        
        //Mascota
        vista.ingresoMascota.addActionListener(this);
        //AtencionAmbulatoria
        vista.ingresoAtenciones.addActionListener(this);
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

                // MENU MASCOTA
        if (e.getSource() == vista.ingresoMascota) {
            // INSTNACIA UN MODELO
            MMascota modeloMascota = new MMascota();
            // INSTANCIA UNA VISTA
            VMascota vistaMascota =new VMascota();
            // INSTANCIA UN CONTROLADOR RECIBIENDO LOS DOS
            CMascota controladorMascota =new CMascota(modeloMascota, vistaMascota);
        }
                // MENU ATENCIONES
        if (e.getSource() == vista.ingresoAtenciones) {
            // INSTNACIA UN MODELO
            MAtencionAmbulatoria modeloAtenciones = new MAtencionAmbulatoria();
            // INSTANCIA UNA VISTA
            VAtencionAmbulatoria vistaAtenciones =new VAtencionAmbulatoria();
            // INSTANCIA UN CONTROLADOR RECIBIENDO LOS DOS
            CAtencionAmbulatoria controladorAtenciones =new CAtencionAmbulatoria(modeloAtenciones, vistaAtenciones);
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

