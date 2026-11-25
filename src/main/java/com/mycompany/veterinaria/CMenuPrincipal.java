package com.mycompany.veterinaria;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class CMenuPrincipal implements ActionListener {
    private VMenuPrincipal vista;
    private ArrayList<MCliente> listaClientes;
    private ArrayList<MVeterinario> listaVeterinarios;

    public CMenuPrincipal(VMenuPrincipal vista) {
        this.vista = vista;
        listaClientes = new ArrayList<>();
        listaVeterinarios = new ArrayList<>();

        vista.salir.addActionListener(this);
        vista.ingresoClientes.addActionListener(this);
        vista.eliminarClientes.addActionListener(this);
        vista.listarClientesIndividual.addActionListener(this);
        vista.listarClientesGeneral.addActionListener(this);
        vista.acercaDe.addActionListener(this);
        
        //Veterinarios
        vista.ingresoVeterinarios.addActionListener(this);
        vista.listarVeterinariosGeneral.addActionListener(this);
        //Mascota
        vista.ingresoMascota.addActionListener(this);
        //AtencionAmbulatoria
        vista.ingresoAtenciones.addActionListener(this);
        //Producto
        vista.ingresoProducto.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) // METODO PARA IMPLEMENTAR ActionListener
    {
        // MENU ARCHIVO
        if (e.getSource() == vista.salir) {
            System.exit(0);
        }

        // MENU CLIENTES
        if (e.getSource() == vista.ingresoClientes) {
            MCliente modeloCliente = new MCliente();
            VCliente vistaCliente = new VCliente();
            new CCliente(modeloCliente, vistaCliente, listaClientes);
        }

        if (e.getSource() == vista.eliminarClientes) {

        }

        if (e.getSource() == vista.listarClientesIndividual) {

        }

        if (e.getSource() == vista.listarClientesGeneral) {
            new CCliente(listaClientes).listarClientes(vista);
        }

        if (e.getSource() == vista.ingresoVeterinarios) {
            MVeterinario modeloVeterinario = new MVeterinario();
            VVeterinario vistaVeterinario = new VVeterinario();
            new CVeterinario(modeloVeterinario, vistaVeterinario, listaVeterinarios);
        }

        if (e.getSource() == vista.listarVeterinariosGeneral) {
            VVeterinario.mostrarVeterinarios(vista, listaVeterinarios);
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
        if (e.getSource() == vista.ingresoProducto) {
            MProducto modeloProducto = new MProducto();
            VProducto vistaProducto = new VProducto();
            new CProducto(modeloProducto, vistaProducto);
        }
        // MENU ACERCA DE...
        if (e.getSource() == vista.acercaDe) {
            String mensajeAcercaDe = "*** Veterinaria POO ***\n"
                    + "Desarrollado por: Thomas Loor \n"
                    + "UPS - 2026";
            JOptionPane.showMessageDialog(vista, mensajeAcercaDe,
                    "Acerca de", JOptionPane.INFORMATION_MESSAGE); // 0: Alerta 1: Información
        }

    }}
