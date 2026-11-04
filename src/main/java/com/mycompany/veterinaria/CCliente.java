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
                
                int resultado = modelo.validarCedula(vista.getCedula());
                
                if(resultado ==0){
                    vista.mostrarMensaje(resultado, "Mensaje",1);
                    grabarDatos();
                }else{
                    vista.mostrarMensaje(resultado,"Mensaje",0);
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

    private void grabarDatos() 
    {
        modelo.setCedula(vista.getCedula());
        
            modelo.setNombre(vista.getNombre());
            modelo.setDireccion(vista.getDireccion());
            modelo.setCorreo(vista.getCorreo());
            modelo.setTelefono(vista.getTelefono());
            // modelo.setFechaRegistro(LocalDate.parse(vista.getFechaRegistro()));
            // modelo.setIdPersona(Integer.parseInt(vista.getId()));


            vista.setCedula(""); // LIMPIO LOS CAMPOS LUEGO DE GRABAR
            vista.setNombre("");
            vista.setDireccion("");
            vista.setCorreo("");
            vista.setTelefono("");
            vista.setRegistro("");
            vista.setId("");
        

        }
    }
 