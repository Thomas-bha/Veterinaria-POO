package com.mycompany.veterinaria;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VAtencionAmbulatoria extends JFrame {

    private final JCheckBox cbEstetica =
            new JCheckBox("Atención estética");
    private final JCheckBox cbSalud =
            new JCheckBox("Atención por salud");

    private final JButton btnGrabar = new JButton("Grabar");
    private final JButton btnCerrar = new JButton("Cerrar");

    public VAtencionAmbulatoria() {
        super("Motivo de consulta");

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(350, 180);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(8, 8));

        JPanel panelMotivos = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelMotivos.add(cbEstetica);
        panelMotivos.add(cbSalud);

        JPanel panelBotones = new JPanel(new FlowLayout());
        panelBotones.add(btnGrabar);
        panelBotones.add(btnCerrar);

        add(new JLabel("Seleccione uno o más motivos:"), BorderLayout.NORTH);
        add(panelMotivos, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);

        setVisible(true);
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

    public void clickBotonGrabar(ActionListener listener) {
        btnGrabar.addActionListener(listener);
    }

    public void clickBotonCerrar(ActionListener listener) {
        btnCerrar.addActionListener(listener);
    }
    
        public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(() -> new VAtencionAmbulatoria());
}
}