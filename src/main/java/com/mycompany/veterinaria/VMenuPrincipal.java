
package com.mycompany.veterinaria;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class VMenuPrincipal extends JFrame {

    // Clase que muestra el menú principal
    private JMenuBar menu;       // Barra de menú

    private JMenu menuArchivo;   // Menú Archivo
    private JMenu menuClientes;  // Menú Clientes
    private JMenu menuListarClientes; // Submenu Listar Clientes
    private JMenu menuListarVeterinarios; // Submenu Listar Clientes
    private JMenu menuVeterinarios;    // Menú Veterinarios
    private JMenu menuAyuda;     // Menú Ayuda

    public JMenuItem salir;
    public JMenuItem ingresoClientes;
    public JMenuItem ingresoVeterinarios;
    public JMenuItem eliminarClientes;
    public JMenuItem eliminarVeterinarios;
    public JMenuItem modificarVeterinarios;    // Modificar Veterinarios
    public JMenuItem modificarClientes;    // Modificar Veterinarios
    public JMenuItem listarClientesIndividual;
    public JMenuItem listarVeterinariosIndividual;
    public JMenuItem listarClientesGeneral;
    public JMenuItem listarVeterinariosGeneral;
    public JMenuItem acercaDe;

    public VMenuPrincipal() {
        // Prepara menú
        menu = new JMenuBar();

        // ARCHIVO
        menuArchivo = new JMenu("Archivo");
        salir = new JMenuItem("Salir");
        salir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
                ActionEvent.ALT_MASK));
        menuArchivo.add(salir);

        // CLIENTES
        menuClientes = new JMenu("Clientes");
        ingresoClientes = new JMenuItem("Ingresar");
        eliminarClientes = new JMenuItem("Eliminar");
        modificarClientes = new JMenuItem("Modificar");
        menuListarClientes = new JMenu("Listados");
        listarClientesIndividual = new JMenuItem("Individual");
        listarClientesGeneral = new JMenuItem("General");
        menuClientes.add(ingresoClientes);
        menuClientes.add(eliminarClientes);
        menuListarClientes.add(listarClientesIndividual);
        menuClientes.add(modificarClientes);
        menuListarClientes.add(listarClientesGeneral);
        menuClientes.add(menuListarClientes);

        // Veterinarios
        menuVeterinarios = new JMenu("Veterinarios");
        ingresoVeterinarios = new JMenuItem("Ingresar");
        eliminarVeterinarios = new JMenuItem("Eliminar");
        menuListarVeterinarios = new JMenu("Listados");
        modificarVeterinarios = new JMenuItem("Modificar");
        listarVeterinariosIndividual = new JMenuItem("Individual");
        listarVeterinariosGeneral = new JMenuItem("General");
        menuVeterinarios.add(ingresoVeterinarios);
        menuVeterinarios.add(eliminarVeterinarios);
        menuVeterinarios.add(modificarVeterinarios);
        menuListarVeterinarios.add(listarVeterinariosIndividual);
        menuListarVeterinarios.add(listarVeterinariosGeneral);
        menuVeterinarios.add(menuListarVeterinarios);

        // AYUDA
        menuAyuda = new JMenu("Ayuda");
        acercaDe = new JMenuItem("Acerca de...");
        menuAyuda.add(acercaDe);

        // BARRA DE MENU
        menu.add(menuArchivo);
        menu.add(menuClientes);
        menu.add(menuVeterinarios);
        menu.add(menuAyuda);

        // CONFIGURACIONES GENERALES DEL FORMULARIO
        super.setLayout(null); // SIN LAYOUT
        super.setTitle("Veterinaria POO"); // TITULO VENTANA
        super.setSize(800, 600); // TAMAÑO "MINIMIZADO"
        super.setExtendedState(JFrame.MAXIMIZED_BOTH);
        super.setJMenuBar(menu); // BARRA DE MENU
        super.setLocationRelativeTo(null); // CENTRAR
        super.setDefaultCloseOperation(EXIT_ON_CLOSE); // CERRAR CON X
        super.setVisible(true); // VISIBILIZA     

    } // FIN CONSTRUCTOR
}