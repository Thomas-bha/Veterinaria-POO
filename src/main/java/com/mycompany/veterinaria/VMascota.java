package com.mycompany.veterinaria;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class VMascota extends JFrame {

    private final JTextField txtNombre = new JTextField();
    private final JTextField txtPeso = new JTextField();
    private final JTextField txtEspecie = new JTextField();
    private final JTextField txtFechaNacimiento = new JTextField();

    private final JRadioButton rbHembra = new JRadioButton("Hembra");
    private final JRadioButton rbMacho = new JRadioButton("Macho");

    private final JTextField txtCliente = new JTextField();

    private final JButton btnGrabar = new JButton("Grabar");
    private final JButton btnCerrar = new JButton("Cerrar");

    public VMascota() {
        super("Ingreso de mascota");

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(450, 300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(0, 2, 8, 8));

        add(new JLabel("Nombre:"));
        add(txtNombre);

        add(new JLabel("Peso (kg):"));
        add(txtPeso);

        add(new JLabel("Especie:"));
        add(txtEspecie);

        add(new JLabel("Sexo:"));
        JPanel panelSexo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ButtonGroup grupoSexo = new ButtonGroup();
        grupoSexo.add(rbHembra);
        grupoSexo.add(rbMacho);
        panelSexo.add(rbHembra);
        panelSexo.add(rbMacho);
        add(panelSexo);

        add(new JLabel("Fecha de nacimiento (AAAA-MM-DD):"));
        add(txtFechaNacimiento);

        add(new JLabel("Cliente:"));
        add(txtCliente);

        add(btnGrabar);
        add(btnCerrar);

        setVisible(true);
    }

    public String getNombre() {
        return txtNombre.getText().trim();
    }

    public float getPeso() {
        return Float.parseFloat(txtPeso.getText().trim());
    }

    public String getEspecie() {
        return txtEspecie.getText().trim();
    }

    public String getSexo() {
        if (rbHembra.isSelected()) {
            return "Hembra";
        }
        if (rbMacho.isSelected()) {
            return "Macho";
        }
        return "";
    }

    public LocalDate getFechaNacimiento() {
        return LocalDate.parse(txtFechaNacimiento.getText().trim());
    }

    public String getNombreCliente() {
        return txtCliente.getText().trim();
    }

    public void clickBotonGrabar(ActionListener listener) {
        btnGrabar.addActionListener(listener);
    }

    public void clickBotonCerrar(ActionListener listener) {
        btnCerrar.addActionListener(listener);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(VMascota::new);
    }
}