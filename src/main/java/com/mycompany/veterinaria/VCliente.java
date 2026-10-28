package com.mycompany.veterinaria;

import javax.swing.*; // COMPONENTES GRAFICOS
import java.awt.*;    // LAYOUT
import java.awt.event.ActionListener; // CLICK DE LOS BOTONES
import java.time.LocalDate;

public class VCliente extends JFrame 
{
    private JTextField txtId = new JTextField();
    private JTextField txtCedula = new JTextField();
    private JTextField txtRegistro = new JTextField();
    private JTextField txtNombre = new JTextField();
    private JTextField txtTelefono = new JTextField();
    private JTextField txtCorreo = new JTextField();
    private JTextField txtDireccion = new JTextField();
    private JButton btnGrabar = new JButton("Grabar");
    private JButton btnCerrar = new JButton("Cerrar");

    public VCliente() 
    {
        // Configuración de la ventana
        super.setTitle("Ingreso Clientes"); // TITULO
        super.setSize(500, 150); // TAMAÑO
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // FUNCIONA LA X DEL FRAME
        super.setLayout(new GridLayout(0, 4)); // DEFINO LAYOUT
        super.setLocationRelativeTo(null); // CENTRADA
        
        // Agregar componentes
        /* OTRA FORMA DE INSTANCIAR Y AÑADIR UNA ETIQUETA
        JLabel labCedula;
        labCedula=new JLabel("Cedula:");
        add (labCedula);*/
               
        add(new JLabel("Id:")); // ETIQUETA
        add(txtId);
        add(new JLabel("Fecha de registro:")); 
        add(txtRegistro);
        add(new JLabel("Cédula:")); 
        add(txtCedula);
        add(new JLabel("Nombre:"));
        add(txtNombre);
        add(new JLabel("Telefono:")); 
        add(txtTelefono);
        add(new JLabel("Correo:"));
        add(txtCorreo);
        add(new JLabel("Direccion:"));
        add(txtDireccion);
        add(btnGrabar);
        add(btnCerrar);
        
        // Hacer visible la ventana
        setVisible(true);
    }

    public int getId() // TOMO EL VALOR DEL CAMPO CEDULA 
    {
        return Integer.parseInt(txtId.getText());
    }
    public String getCedula() 
    {
        return txtCedula.getText();
    }
    public LocalDate getRegistro() 
    {
        return LocalDate.parse(txtRegistro.getText());
    }

    public String getNombre() // TOMO VALOR CAMPO NOMBRE
    {
        return txtNombre.getText();
    }
    public String getTelefono()
    {
        return txtTelefono.getText();
    }
    public String getCorreo()
    {
        return txtCorreo.getText();
    }
    public String getDireccion()
    {
        return txtDireccion.getText();
    }
    
    
    public void setId(String cad) 
    {
        txtId.setText(cad);
    }
    public void setRegistro(String cad) 
    {
        txtRegistro.setText(cad);
    }
    
    public void setCedula(String cad)
    {
        txtCedula.setText(cad);
    }
    
    public void setNombre(String cad)
    {
        txtNombre.setText(cad);
    }
    public void setTelefono(String cad)
    {
        txtTelefono.setText(cad);
    }
    public void setCorreo(String cad)
    {
        txtCorreo.setText(cad);
    }
    public void setDireccion(String cad)
    {
        txtDireccion.setText(cad);
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