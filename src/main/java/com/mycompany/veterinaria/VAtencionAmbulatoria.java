package com.mycompany.veterinaria;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VAtencionAmbulatoria extends JFrame {

    private final JTextField txtIdAtencion = new JTextField();
    private final JTextField txtFecha = new JTextField();
    private final JTextField txtIdMascota = new JTextField();
    private final JTextField txtIdVeterinario = new JTextField();
    private final JCheckBox cbEstetica = new JCheckBox("Estética");
    private final JCheckBox cbSalud = new JCheckBox("Salud");
    private final JTextField txtDiagnostico = new JTextField();
    private final JTextField txtTratamiento = new JTextField();
    private final JTextField txtCosto = new JTextField();

    private final JButton btnGrabar = new JButton("Grabar");
    private final JButton btnCerrar = new JButton("Cerrar");

    public VAtencionAmbulatoria() {
        super("Registro Atención Ambulatoria");

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(0, 2, 8, 8));

        add(new JLabel("Id Atención:"));
        add(txtIdAtencion);

        add(new JLabel("Fecha (AAAA-MM-DD):"));
        add(txtFecha);

        add(new JLabel("Id Mascota:"));
        add(txtIdMascota);

        add(new JLabel("Id Veterinario:"));
        add(txtIdVeterinario);

        add(new JLabel("Motivo Consulta:"));
        JPanel panelMotivos = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelMotivos.add(cbEstetica);
        panelMotivos.add(cbSalud);
        add(panelMotivos);

        add(new JLabel("Diagnóstico:"));
        add(txtDiagnostico);

        add(new JLabel("Tratamiento:"));
        add(txtTratamiento);

        add(new JLabel("Costo ($):"));
        add(txtCosto);

        add(btnGrabar);
        add(btnCerrar);

        setVisible(true);
    }

    public int getIdAtencion() {
        return Integer.parseInt(txtIdAtencion.getText().trim());
    }

    public LocalDate getFecha() {
        return LocalDate.parse(txtFecha.getText().trim());
    }

    public String getIdMascota() {
        return txtIdMascota.getText().trim();
    }

    public int getIdVeterinario() {
        return Integer.parseInt(txtIdVeterinario.getText().trim());
    }

    public String getMotivoConsulta() {
        List<String> motivos = new ArrayList<>();

        if (cbEstetica.isSelected()) {
            motivos.add("Atención estética");
        }
        if (cbSalud.isSelected()) {
            motivos.add("Atención por salud");
        }

        return String.join(", ", motivos);
    }

    public String getDiagnostico() {
        return txtDiagnostico.getText().trim();
    }

    public String getTratamiento() {
        return txtTratamiento.getText().trim();
    }

    public double getCosto() {
        return Double.parseDouble(txtCosto.getText().trim());
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
        javax.swing.SwingUtilities.invokeLater(() -> {
            MAtencionAmbulatoria modelo = new MAtencionAmbulatoria();
            VAtencionAmbulatoria vista = new VAtencionAmbulatoria();
            new CAtencionAmbulatoria(modelo, vista);
        });
    }
}