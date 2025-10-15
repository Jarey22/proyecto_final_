package co.edu.uniquindio.empresatransporte.proyecto_final_daniel_morales_sebastian_vargas.model;

import java.time.LocalDate;

public class Incidencia {
    String idincidencia;
    String descripcion;
    String estado;
    LocalDate fechaReporte;
    LocalDate fechaResolucion;
    String solucion;

    public Incidencia(String idincidencia, String descripcion, String estado, LocalDate fechaReporte, LocalDate fechaResolucion, String solucion) {
        this.idincidencia = idincidencia;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaReporte = fechaReporte;
        this.fechaResolucion = fechaResolucion;
        this.solucion = solucion;
    }

    public String getIdincidencia() {
        return idincidencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDate getFechaReporte() {
        return fechaReporte;
    }

    public LocalDate getFechaResolucion() {
        return fechaResolucion;
    }

    public String getSolucion() {
        return solucion;
    }

    @Override
    public String toString() {
        return "Incidencia{" + "idincidencia=" + idincidencia + '}'
                + "descripcion=" + descripcion + '}'
                + "estado=" + estado + '}'
                + "fechaReporte=" + fechaReporte + '}'
                + "fechaResolucion=" + fechaResolucion + '}'
                + "solucion=" + solucion
                ;
    }
}
