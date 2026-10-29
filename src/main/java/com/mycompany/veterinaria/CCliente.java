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
        
        switch (resultado){
            case 0 -> {
                
                JOptionPane.showMessageDialog(vista,"Datos guardados correctamente...", 
                                              "DATOS GRABADOS",JOptionPane.INFORMATION_MESSAGE); // 0: Alerta 1: Información
                
                modelo.setIdPersona (vista.getId());
                modelo.setFechaRegistro (LocalDate.now());
                modelo.setNombre(vista.getNombre());
                modelo.setTelefono(vista.getTelefono());
                modelo.setCorreo(vista.getCorreo());
                modelo.setDireccion(vista.getDireccion());
                
                

                // vista.dispose(); //  CON ESTO CIERRO LA VENTANA LUEGO DE GRABAR
                vista.setId(""); // LIMPIO LOS CAMPOS LUEGO DE GRABAR
                vista.setRegistro("");
                vista.setCedula("");
                vista.setNombre("");
                vista.setTelefono("");
                vista.setCorreo("");
                vista.setDireccion("");
            }    
            
            case 1 -> JOptionPane.showMessageDialog(vista,"Error 1: la cedula debe tener 10 digitos", "ERROR DE VALIDACION 1", JOptionPane.ERROR_MESSAGE);
            
            case 2 -> JOptionPane.showMessageDialog(vista,"Error 2: la cedula solo debe tener numeros", "ERROR DE VALIDACION 2", JOptionPane.ERROR_MESSAGE);
            
            case 3 -> JOptionPane.showMessageDialog(vista,"Error 3: la cedula no es valida", "ERROR DE VALIDACION 3", JOptionPane.ERROR_MESSAGE);
            
            
        }
    }
        
 }