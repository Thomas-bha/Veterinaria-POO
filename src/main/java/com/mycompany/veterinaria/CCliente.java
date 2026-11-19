package com.mycompany.veterinaria;
import java.awt.event.ActionEvent;     // PROGRAMAR EL BOTON
import java.awt.event.ActionListener;  // ESCUCHAR EL BOTON (CLICK)
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
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
                int resultado = modelo.validarCedula(vista.getCedula());
                boolean datosValidos = true;
                if (resultado != 0) {
                    vista.mostrarMensaje(resultado, "Validación", JOptionPane.ERROR_MESSAGE);
                    datosValidos = false;
                }

                int idPersona = 0;
                try {
                    idPersona = vista.getId();
                } catch (NumberFormatException ex) {
                    vista.mostrarMensaje("El ID debe ser un número entero", "Validación", JOptionPane.ERROR_MESSAGE);
                    datosValidos = false;
                }

                LocalDate fechaRegistro = null;
                try {
                    fechaRegistro = vista.getRegistro();
                } catch (DateTimeParseException ex) {
                    vista.mostrarMensaje("Fecha inválida. Use el formato AAAA-MM-DD", "Validación", JOptionPane.ERROR_MESSAGE);
                    datosValidos = false;
                }

                if (datosValidos) {
                    grabarDatos(idPersona, fechaRegistro);
                    vista.mostrarMensaje(0, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    vista.dispose();
                }
                
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

    private void grabarDatos(int idPersona, LocalDate fechaRegistro)
    {
        modelo.setIdPersona(idPersona);
        modelo.setFechaRegistro(fechaRegistro);
        modelo.setCedula(vista.getCedula());
        
            modelo.setNombre(vista.getNombre());
            modelo.setDireccion(vista.getDireccion());
            modelo.setCorreo(vista.getCorreo());
            modelo.setTelefono(vista.getTelefono());
            vista.setCedula(""); // LIMPIO LOS CAMPOS LUEGO DE GRABAR
            vista.setNombre("");
            vista.setDireccion("");
            vista.setCorreo("");
            vista.setTelefono("");
            vista.setRegistro("");
            vista.setId("");
        

        }
    }
 