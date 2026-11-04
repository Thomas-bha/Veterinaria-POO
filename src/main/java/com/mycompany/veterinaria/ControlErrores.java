package com.mycompany.veterinaria;

public class ControlErrores 
{
    public String getMensajeError(int numError)
    // METODO QUE DEVUELVE UNA CADENA QUE ESPECIFICA EL ERROR
    {
        String mensaje = "null";

        switch (numError)
        {
            case 0:
                mensaje = "Datos guardados correctamente...";
                break;
            case 1:
                mensaje = "Cédula no tiene 10 dígitos";
                break;
            case 2:
                mensaje = "Cédula no es numérica";
                break;
            case 3:
                mensaje = "Cédula inválida";
                break;
            default:
                break;
        }

        return mensaje;
    }
}