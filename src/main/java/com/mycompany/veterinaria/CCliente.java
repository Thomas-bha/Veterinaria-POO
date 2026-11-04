package com.mycompany.veterinaria;
import java.awt.event.ActionEvent;     // PROGRAMAR EL BOTON
import java.awt.event.ActionListener;  // ESCUCHAR EL BOTON (CLICK)
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class CCliente 
{
    private MCliente modelo;
    private VCliente vista;

    public CCliente (MCliente modelo, VCliente vista) 
    {
        this.modelo = modelo; // RECUPERO EL PARAMETRO DE ENTRADA EN EL ATRIBUTO DE LA CLASE
        this.vista = vista;

        // Agregar listeners a los botones
        this.vista.clickBotonGrabar(new ActionListener() 
        {
            @Override // ANTICIPAR QUE SOBREESCRIBIRE UN METODO DE UNA CLASE
            public void actionPerformed(ActionEvent e) 
            {
                // VALIDAR DATOS
                
                // SI ESTA TODO BIEN, PASAR LOS DATOS DE LA
                // VISTA AL MODELO
                grabarDatos();
            }
        });

        this.vista.clickBotonCerrar(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                vista.dispose(); // CERRAR VENTANA
            }
        });
    }

    private void grabarDatos() 
    {
        modelo.setCedula(vista.getCedula());
        int resultado = modelo.validarCedula();

        if (resultado == 0)
        {
            modelo.setNombre(vista.getNombre());
            modelo.setDireccion(vista.getDireccion());
            modelo.setCorreo(vista.getCorreo());
            modelo.setTelefono(vista.getTelefono());
            // modelo.setFechaRegistro(LocalDate.parse(vista.getFechaRegistro()));
            // modelo.setIdPersona(Integer.parseInt(vista.getId()));

            vista.mostrarMensaje(0, 1, "DATOS GRABADOS"); // 0: SIN ERROR, 1: ICONO INFORMACION
            vista.setCedula(""); // LIMPIO LOS CAMPOS LUEGO DE GRABAR
            vista.setNombre("");
            vista.setDireccion("");
            vista.setCorreo("");
            vista.setTelefono("");
            vista.setRegistro("");
            vista.setId("");
        }
        else
        {
            vista.mostrarMensaje(resultado, 2, "ERROR EN CÉDULA"); // 2: ICONO ADVERTENCIA
        }
    }
 }