package com.mycompany.veterinaria;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class VMascota extends JFrame {

    private final JTextField txtIdMascota = new JTextField();
    private final JTextField txtNombre = new JTextField();
    private final JTextField txtEspecie = new JTextField();
    private final JTextField txtPeso = new JTextField();
    private final JTextField txtFechaNacimiento = new JTextField();
    private final JTextField txtCliente = new JTextField();

    private final JRadioButton rbFrench = new JRadioButton("French");
    private final JRadioButton rbBoxer = new JRadioButton("Boxer");
    private final JRadioButton rbDalmata = new JRadioButton("Dálmata");
    private final JRadioButton rbOtros = new JRadioButton("Otros");
    private final ButtonGroup grupoRaza = new ButtonGroup();

    private final JRadioButton rbFemenino = new JRadioButton("Femenino");
    private final JRadioButton rbMasculino = new JRadioButton("Masculino");
    private final ButtonGroup grupoSexo = new ButtonGroup();

    private final JButton btnGrabar = new JButton("Grabar");
    private final JButton btnCerrar = new JButton("Cerrar");

    public VMascota() {
        super("Ingreso Mascotas");

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 450);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(0, 2, 8, 8));

        add(new JLabel("Id Mascota:"));
        add(txtIdMascota);

        add(new JLabel("Nombre:"));
        add(txtNombre);

        add(new JLabel("Especie:"));
        add(txtEspecie);

        add(new JLabel("Raza:"));
        JPanel panelRaza = new JPanel(new FlowLayout(FlowLayout.LEFT, 4, 0));
        grupoRaza.add(rbFrench);
        grupoRaza.add(rbBoxer);
        grupoRaza.add(rbDalmata);
        grupoRaza.add(rbOtros);
        rbOtros.setSelected(true);
        panelRaza.add(rbFrench);
        panelRaza.add(rbBoxer);
        panelRaza.add(rbDalmata);
        panelRaza.add(rbOtros);
        add(panelRaza);

        add(new JLabel("Sexo:"));
        JPanel panelSexo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        grupoSexo.add(rbFemenino);
        grupoSexo.add(rbMasculino);
        rbMasculino.setSelected(true);
        panelSexo.add(rbFemenino);
        panelSexo.add(rbMasculino);
        add(panelSexo);

        add(new JLabel("Fecha Nacimiento:"));
        add(txtFechaNacimiento);

        add(new JLabel("Peso:"));
        add(txtPeso);

        add(new JLabel("Cliente:"));
        add(txtCliente);

        add(btnGrabar);
        add(btnCerrar);

        setVisible(true);
    }

    public String getIdMascota() {
        return txtIdMascota.getText().trim();
    }

    public String getNombre() {
        return txtNombre.getText().trim();
    }

    public float getPeso() {
        String peso = txtPeso.getText().trim();
        if (peso == null || peso.isEmpty()) {
            return 0f;
        }
        return Float.parseFloat(peso);
    }

    public String getEspecie() {
        return txtEspecie.getText().trim();
    }

    public String getRaza() {
        if (rbFrench.isSelected()) {
            return "French";
        }
        if (rbBoxer.isSelected()) {
            return "Boxer";
        }
        if (rbDalmata.isSelected()) {
            return "Dálmata";
        }
        return "Otros";
    }

    public String getSexo() {
        if (rbFemenino.isSelected()) {
            return "Femenino";
        }
        if (rbMasculino.isSelected()) {
            return "Masculino";
        }
        return "";
    }

    public LocalDate getFechaNacimiento() {
        String fecha = txtFechaNacimiento.getText().trim();
        if (fecha == null || fecha.isEmpty()) {
            return null;
        }
        return LocalDate.parse(fecha);
    }

    public String getNombreCliente() {
        return txtCliente.getText().trim();
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public void clickBotonGrabar(ActionListener listener) {
        btnGrabar.addActionListener(listener);
    }

    public void clickBotonCerrar(ActionListener listener) {
        btnCerrar.addActionListener(listener);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() ->
                new CMascota(new MMascota(), new VMascota()));
    }
}