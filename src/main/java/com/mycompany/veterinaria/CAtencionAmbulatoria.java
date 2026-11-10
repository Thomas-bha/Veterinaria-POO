package com.mycompany.veterinaria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CAtencionAmbulatoria {

    private final MAtencionAmbulatoria modelo;
    private final VAtencionAmbulatoria vista;

    public CAtencionAmbulatoria(
            MAtencionAmbulatoria modelo,
            VAtencionAmbulatoria vista) {

        this.modelo = modelo;
        this.vista = vista;

        vista.clickBotonGrabar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                grabarDatos();
            }
        });

        vista.clickBotonCerrar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
            }
        });
    }

    private void grabarDatos() {
        modelo.setIdAtencion(vista.getIdAtencion());
        modelo.setFecha(vista.getFecha());
        modelo.setMotivoConsulta(vista.getMotivoConsulta());
        modelo.setDiagnostico(vista.getDiagnostico());
        modelo.setTratamiento(vista.getTratamiento());
        modelo.setCosto(vista.getCosto());

        MMascota mascota = new MMascota();
        mascota.setIdMascota(vista.getIdMascota());
        modelo.setMascota(mascota);

        MVeterinario veterinario = new MVeterinario(
                "",
                "",
                true,
                vista.getIdVeterinario(),
                "",
                "",
                "",
                "",
                ""
        );
        modelo.setVeterinario(veterinario);

        vista.mostrarMensaje("Guardado correctamente");
    }
}