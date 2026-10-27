package com.mycompany.veterinaria;
import java.awt.event.ActionEvent;     // PROGRAMAR EL BOTON
import java.awt.event.ActionListener;  // ESCUCHAR EL BOTON (CLICK)
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
        modelo.setNombre(vista.getNombre());
        JOptionPane.showMessageDialog(vista,"Datos guardados correctamente...", 
                                      "DATOS GRABADOS",JOptionPane.INFORMATION_MESSAGE); // 0: Alerta 1: Información
        // vista.dispose(); //  CON ESTO CIERRO LA VENTANA LUEGO DE GRABAR
        vista.setCedula(""); // LIMPIO LOS CAMPOS LUEGO DE GRABAR
        vista.setNombre("");
    }
 }