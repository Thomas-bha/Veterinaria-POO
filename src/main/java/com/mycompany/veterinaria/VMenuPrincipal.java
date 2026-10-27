
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
    private JMenu menuVentas; //Menu Ventas
    private JMenu menuProducto; //Menu Producto
    private JMenu menuMascota; //Menu Mascotas
    private JMenu menuAtenciones; //Menu Atenciones
    private JMenu menuHospitalizaciones; //Menu Hospitalizaciones
    private JMenu menuListarProducto; //Menu Listar Producto
    private JMenu menuListarAtenciones; //Menu Listar Atenciones
    private JMenu menuListarMascota; //Menu Listar Mascota
    private JMenu menuListarHospitalizaciones; //Menu Listar Hospitalizaciones
    private JMenu menuListarVentas; //Menu Listar Ventas
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
    public JMenuItem listarVeterinariosGeneral;
    public JMenuItem listarClientesGeneral;
    public JMenuItem listarVentasGeneral;
    public JMenuItem ingresoVentas;
    public JMenuItem eliminarVentas;
    public JMenuItem modificarVentas;    // Modificar Ventas
    public JMenuItem listarVentasIndividual;
    public JMenuItem listarVentas;
    public JMenuItem listarHospitalizacionesGeneral;
    public JMenuItem ingresoHospitalizaciones;
    public JMenuItem eliminarHospitalizaciones;
    public JMenuItem modificarHospitalizaciones;    // Modificar Hospitalizaciones
    public JMenuItem listarHospitalizacionesIndividual;
    public JMenuItem listarHospitalizaciones;
    public JMenuItem listarMascotaGeneral;
    public JMenuItem ingresoMascota;
    public JMenuItem eliminarMascota;
    public JMenuItem modificarMascota;    // Modificar Mascota
    public JMenuItem listarMascotaIndividual;
    public JMenuItem listarMascota;
    public JMenuItem listarAtencionesGeneral;
    public JMenuItem ingresoAtenciones;
    public JMenuItem eliminarAtenciones;
    public JMenuItem modificarAtenciones;    // Modificar Atenciones
    public JMenuItem listarAtencionesIndividual;
    public JMenuItem listarAtenciones;
    public JMenuItem listarProductoGeneral;
    public JMenuItem ingresoProducto;
    public JMenuItem eliminarProducto;
    public JMenuItem modificarProducto;    // Modificar Producto
    public JMenuItem listarProductoIndividual;
    public JMenuItem listarProducto;
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
        
        //ventas
        menuVentas = new JMenu("ventas");
        ingresoVentas= new JMenuItem("Ingresar");
        eliminarVentas= new JMenuItem("Eliminar");
        menuListarVentas= new JMenu("Listados");
        modificarVentas= new JMenuItem("Modificar");
        listarVentasIndividual = new JMenuItem("Individual");
        listarVentasGeneral = new JMenuItem("General");
        menuVentas.add(ingresoVentas);
        menuVentas.add(eliminarVentas);
        menuVentas.add(modificarVentas);
        menuListarVentas.add(listarVentasIndividual);
        menuListarVentas.add(listarVentasGeneral);
        menuVentas.add(menuListarVentas);        
        //Producto
        menuProducto = new JMenu("Producto");
        ingresoProducto = new JMenuItem("Ingresar");
        eliminarProducto = new JMenuItem("Eliminar");
        menuListarProducto = new JMenu("Listados");
        modificarProducto = new JMenuItem("Modificar");
        listarProductoIndividual = new JMenuItem("Individual");
        listarProductoGeneral = new JMenuItem("General");
        menuProducto.add(ingresoProducto);
        menuProducto.add(eliminarProducto);
        menuProducto.add(modificarProducto);
        menuListarProducto.add(listarProductoIndividual);
        menuListarProducto.add(listarProductoGeneral);
        menuProducto.add(menuListarProducto);
        //Hospitalizaciones
        menuHospitalizaciones = new JMenu("Hospitalizaciones");
        ingresoHospitalizaciones = new JMenuItem("Ingresar");
        eliminarHospitalizaciones = new JMenuItem("Eliminar");
        menuListarHospitalizaciones = new JMenu("Listados");
        modificarHospitalizaciones = new JMenuItem("Modificar");
        listarHospitalizacionesIndividual = new JMenuItem("Individual");
        listarHospitalizacionesGeneral = new JMenuItem("General");
        menuHospitalizaciones.add(ingresoHospitalizaciones);
        menuHospitalizaciones.add(eliminarHospitalizaciones);
        menuHospitalizaciones.add(modificarHospitalizaciones);
        menuListarHospitalizaciones.add(listarHospitalizacionesIndividual);
        menuListarHospitalizaciones.add(listarHospitalizacionesGeneral);
        menuHospitalizaciones.add(menuListarHospitalizaciones);
        //Atenciones
        menuAtenciones = new JMenu("Atenciones");
        ingresoAtenciones = new JMenuItem("Ingresar");
        eliminarAtenciones = new JMenuItem("Eliminar");
        menuListarAtenciones = new JMenu("Listados");
        modificarAtenciones = new JMenuItem("Modificar");
        listarAtencionesIndividual = new JMenuItem("Individual");
        listarAtencionesGeneral = new JMenuItem("General");
        menuAtenciones.add(ingresoAtenciones);
        menuAtenciones.add(eliminarAtenciones);
        menuAtenciones.add(modificarAtenciones);
        menuListarAtenciones.add(listarAtencionesIndividual);
        menuListarAtenciones.add(listarAtencionesGeneral);
        menuAtenciones.add(menuListarAtenciones);
        
        //Mascota
        menuMascota = new JMenu("Mascotas");
        ingresoMascota = new JMenuItem("Ingresar");
        eliminarMascota = new JMenuItem("Eliminar");
        menuListarMascota = new JMenu("Listados");
        modificarMascota = new JMenuItem("Modificar");
        listarMascotaIndividual = new JMenuItem("Individual");
        listarMascotaGeneral = new JMenuItem("General");
        menuMascota.add(ingresoMascota);
        menuMascota.add(eliminarMascota);
        menuMascota.add(modificarMascota);
        menuListarMascota.add(listarMascotaIndividual);
        menuListarMascota.add(listarMascotaGeneral);
        menuMascota.add(menuListarMascota);
        // AYUDA
        menuAyuda = new JMenu("Ayuda");
        acercaDe = new JMenuItem("Acerca de...");
        menuAyuda.add(acercaDe);

        // BARRA DE MENU
        menu.add(menuArchivo);
        menu.add(menuClientes);
        menu.add(menuVeterinarios);
        menu.add(menuMascota);
        menu.add(menuVentas);
        menu.add(menuProducto);
        menu.add(menuAtenciones);
        menu.add(menuHospitalizaciones);
        menu.add(menuAyuda);

        // CONFIGURACIONES GENERALES DEL FORMULARIO
        super.setLayout(null); // SIN LAYOUT
        super.setTitle("Veterinaria POO"); // TITULO VENTANA
        super.setSize(800, 600); // TAMAÑO "MINIMIZADO"
//        super.setExtendedState(JFrame.MAXIMIZED_BOTH);
        super.setJMenuBar(menu); // BARRA DE MENU
        super.setLocationRelativeTo(null); // CENTRAR
        super.setDefaultCloseOperation(EXIT_ON_CLOSE); // CERRAR CON X
        super.setVisible(true); // VISIBILIZA     

    } // FIN CONSTRUCTOR
}