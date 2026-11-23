package com.mycompany.veterinaria;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VProducto extends JFrame {

    private final JTextField txtIdProducto = new JTextField();
    private final JTextField txtNombre = new JTextField();
    private final JTextField txtDescripcion = new JTextField();
    private final JTextField txtCategoria = new JTextField();
    private final JTextField txtPrecio = new JTextField();
    private final JTextField txtStock = new JTextField();
    private final JButton btnFoto = new JButton("Foto");
    private final JButton btnGrabar = new JButton("Grabar");
    private final JButton btnCerrar = new JButton("Cerrar");
    private final JLabel lblImagen = new JLabel("Sin imagen", SwingConstants.CENTER);

    public VProducto() {
        super("Registro de Productos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout(12, 12));
        setSize(800, 600);
        setMinimumSize(new Dimension(820, 620));
        setLocationRelativeTo(null);

        JPanel panelCampos = new JPanel(new GridLayout(6, 2, 10, 10));
        panelCampos.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
        panelCampos.add(new JLabel("ID Producto:"));
        panelCampos.add(txtIdProducto);
        panelCampos.add(new JLabel("Nombre:"));
        panelCampos.add(txtNombre);
        panelCampos.add(new JLabel("Descripción:"));
        panelCampos.add(txtDescripcion);
        panelCampos.add(new JLabel("Categoría:"));
        panelCampos.add(txtCategoria);
        panelCampos.add(new JLabel("Precio:"));
        panelCampos.add(txtPrecio);
        panelCampos.add(new JLabel("Stock:"));
        panelCampos.add(txtStock);

        lblImagen.setOpaque(true);
        lblImagen.setBackground(Color.WHITE);
        lblImagen.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        lblImagen.setPreferredSize(new Dimension(260, 560));

        JPanel panelContenido = new JPanel(new BorderLayout(16, 0));
        panelContenido.setBorder(BorderFactory.createEmptyBorder(12, 12, 0, 12));
        panelContenido.add(panelCampos, BorderLayout.CENTER);
        panelContenido.add(lblImagen, BorderLayout.EAST);

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 12, 8));
        panelBotones.add(btnFoto);
        panelBotones.add(btnGrabar);
        panelBotones.add(btnCerrar);

        add(panelContenido, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);
        setVisible(true);
    }

    public String getIdProducto() {
        return txtIdProducto.getText().trim();
    }

    public String getNombre() {
        return txtNombre.getText().trim();
    }

    public String getDescripcion() {
        return txtDescripcion.getText().trim();
    }

    public String getCategoria() {
        return txtCategoria.getText().trim();
    }

    public String getPrecio() {
        return txtPrecio.getText().trim();
    }

    public String getStock() {
        return txtStock.getText().trim();
    }

    public void seleccionarFoto() {
        JFileChooser exploradorArchivos = new JFileChooser();
        exploradorArchivos.setFileFilter(
                new FileNameExtensionFilter("Imágenes JPG y PNG", "jpg", "png"));

        if (exploradorArchivos.showOpenDialog(this) != JFileChooser.APPROVE_OPTION) {
            return;
        }

        File archivo = exploradorArchivos.getSelectedFile();
        try {
            BufferedImage imagen = ImageIO.read(archivo);
            if (imagen == null) {
                mostrarMensaje("El archivo seleccionado no es una imagen compatible.",
                        "Imagen no válida", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Dimension espacio = lblImagen.getSize();
            if (espacio.width <= 0 || espacio.height <= 0) {
                espacio = lblImagen.getPreferredSize();
            }
            double escala = Math.min(
                    (double) espacio.width / imagen.getWidth(),
                    (double) espacio.height / imagen.getHeight());
            int ancho = Math.max(1, (int) (imagen.getWidth() * escala));
            int alto = Math.max(1, (int) (imagen.getHeight() * escala));
            Image imagenEscalada = imagen.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
            lblImagen.setText(null);
            lblImagen.setIcon(new javax.swing.ImageIcon(imagenEscalada));
        } catch (IOException ex) {
            mostrarMensaje("No se pudo cargar la imagen seleccionada.",
                    "Error al cargar imagen", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarMensaje(String mensaje, String titulo, int tipo) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, tipo);
    }

    public void clickBotonFoto(ActionListener listener) {
        btnFoto.addActionListener(listener);
    }

    public void clickBotonGrabar(ActionListener listener) {
        btnGrabar.addActionListener(listener);
    }

    public void clickBotonCerrar(ActionListener listener) {
        btnCerrar.addActionListener(listener);
    }
}
