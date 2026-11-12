package com.mycompany.veterinaria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VVeterinario extends JFrame {

    private JTextField txtIdPersona;
    private JTextField txtNombre;
    private JTextField txtCedula;
    private JTextField txtTelefono;
    private JTextField txtCorreo;
    private JTextField txtDireccion;
    private JComboBox<String> cbEspecialidad;
    private JTextField txtNumeroLicencia;
    private JCheckBox chkEstado;
    private JButton btnGrabar;
    private JButton btnCerrar;

    public VVeterinario() {
        setTitle("Ingreso de Veterinarios");
        setSize(500, 420);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel panel = new JPanel(new GridLayout(0, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel labIdPersona = new JLabel("ID Persona:");
        JLabel labNombre = new JLabel("Nombre y Apellidos:");
        JLabel labCedula = new JLabel("Cédula:");
        JLabel labTelefono = new JLabel("Teléfono:");
        JLabel labCorreo = new JLabel("Correo:");
        JLabel labDireccion = new JLabel("Dirección:");
        JLabel labEspecialidad = new JLabel("Especialidad:");
        JLabel labNumeroLicencia = new JLabel("Número Licencia:");
        JLabel labEstado = new JLabel("Estado:");

        txtIdPersona = new JTextField();
        txtNombre = new JTextField();
        txtCedula = new JTextField();
        txtTelefono = new JTextField();
        txtCorreo = new JTextField();
        txtDireccion = new JTextField();

        String[] especialidades = {
            "General",
            "Traumatología",
            "Cirugía General",
            "Odontología"
        };
        cbEspecialidad = new JComboBox<>(especialidades);

        txtNumeroLicencia = new JTextField();
        chkEstado = new JCheckBox("Activo");
        chkEstado.setSelected(true);

        btnGrabar = new JButton("Grabar");
        btnCerrar = new JButton("Cerrar");

        panel.add(labIdPersona);
        panel.add(txtIdPersona);

        panel.add(labNombre);
        panel.add(txtNombre);

        panel.add(labCedula);
        panel.add(txtCedula);

        panel.add(labTelefono);
        panel.add(txtTelefono);

        panel.add(labCorreo);
        panel.add(txtCorreo);

        panel.add(labDireccion);
        panel.add(txtDireccion);

        panel.add(labEspecialidad);
        panel.add(cbEspecialidad);

        panel.add(labNumeroLicencia);
        panel.add(txtNumeroLicencia);

        panel.add(labEstado);
        panel.add(chkEstado);

        JPanel panelBotones = new JPanel(new GridLayout(1, 2, 10, 0));
        panelBotones.add(btnGrabar);
        panelBotones.add(btnCerrar);

        add(panel, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);
        setVisible(true);
    }

    public int getIdPersona() {
        String texto = txtIdPersona.getText().trim();
        if (texto == null || texto.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(texto);
    }

    public String getCedula() {
        return txtCedula.getText().trim();
    }

    public String getNombre() {
        return txtNombre.getText().trim();
    }

    public String getTelefono() {
        return txtTelefono.getText().trim();
    }

    public String getCorreo() {
        return txtCorreo.getText().trim();
    }

    public String getDireccion() {
        return txtDireccion.getText().trim();
    }

    public String getEspecialidad() {
        return cbEspecialidad.getSelectedItem().toString();
    }

    public String getNumeroLicencia() {
        return txtNumeroLicencia.getText().trim();
    }

    public boolean isEstado() {
        return chkEstado.isSelected();
    }

    public void clickBotonGrabar(ActionListener listener) {
        btnGrabar.addActionListener(listener);
    }

    public void clickBotonCerrar(ActionListener listener) {
        btnCerrar.addActionListener(listener);
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CVeterinario(new MVeterinario(), new VVeterinario());
            }
        });
    }
}