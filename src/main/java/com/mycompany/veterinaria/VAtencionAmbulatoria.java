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
        String id = txtIdAtencion.getText().trim();
        if (id == null || id.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(id);
    }

    public LocalDate getFecha() {
        String fecha = txtFecha.getText().trim();
        if (fecha == null || fecha.isEmpty()) {
            return null;
        }
        return LocalDate.parse(fecha);
    }

    public String getIdMascota() {
        return txtIdMascota.getText().trim();
    }

    public int getIdVeterinario() {
        String id = txtIdVeterinario.getText().trim();
        if (id == null || id.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(id);
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
        String costo = txtCosto.getText().trim();
        if (costo == null || costo.isEmpty()) {
            return 0.0;
        }
        return Double.parseDouble(costo);
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