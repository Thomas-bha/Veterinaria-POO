package com.mycompany.veterinaria;

import javax.swing.*; // COMPONENTES GRAFICOS
import java.awt.*;    // LAYOUT
import java.awt.event.ActionListener; // CLICK DE LOS BOTONES

public class VCliente extends JFrame 
{
    private JTextField txtCedula = new JTextField();
    private JTextField txtNombre = new JTextField();
    private JButton btnGrabar = new JButton("Grabar");
    private JButton btnCerrar = new JButton("Cerrar");

    public VCliente() 
    {
        // Configuración de la ventana
        super.setTitle("Ingreso Clientes"); // TITULO
        super.setSize(500, 150); // TAMAÑO
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // FUNCIONA LA X DEL FRAME
        super.setLayout(new GridLayout(3, 2)); // DEFINO LAYOUT
        super.setLocationRelativeTo(null); // CENTRADA
        
        // Agregar componentes
        /* OTRA FORMA DE INSTANCIAR Y AÑADIR UNA ETIQUETA
        JLabel labCedula;
        labCedula=new JLabel("Cedula:");
        add (labCedula);*/
               
        add(new JLabel("Cédula:")); // ETIQUETA
        add(txtCedula);
        add(new JLabel("Nombre:"));
        add(txtNombre);
        add(btnGrabar);
        add(btnCerrar);
        
        // Hacer visible la ventana
        setVisible(true);
    }

    public String getCedula() // TOMO EL VALOR DEL CAMPO CEDULA 
    {
        return txtCedula.getText();
    }

    public String getNombre() // TOMO VALOR CAMPO NOMBRE
    {
        return txtNombre.getText();
    }
    
    public void setCedula(String cad)
    {
        txtCedula.setText(cad);
    }
    
    public void setNombre(String cad)
    {
        txtNombre.setText(cad);
    }

    public void clickBotonGrabar(ActionListener listener) // ACTIVO ESCUCHADOR DEL CLICK
    {                                                               // GRABAR
        btnGrabar.addActionListener(listener);
    }

    public void clickBotonCerrar(ActionListener listener) // ACTIVO ESCUCHADOR CLICK
    {                                                               // CERRAR
        btnCerrar.addActionListener(listener);
    }
}