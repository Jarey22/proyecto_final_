package co.edu.uniquindio.empresatransporte.proyecto_final_daniel_morales_sebastian_vargas.model;

import java.time.LocalDate;

public class Envio {
    private String idEnvio;
    private double peso;
    private double volumen;
    private double costo;
    private boolean estadoEnvio;
    private LocalDate fechaCreacion;
    private LocalDate fechaEntrega;

    public String getIdEnvio() {
        return this.idEnvio;
    }

    public void setIdEnvio(String idEnvio) {
        this.idEnvio = idEnvio;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVolumen() {
        return this.volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getCosto() {
        return this.costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isEstadoEnvio() {
        return this.estadoEnvio;
    }

    public boolean getEstadoEnvio() {
        return this.estadoEnvio;
    }

    public void setEstadoEnvio(boolean estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    public LocalDate getFechaCreacion() {
        return this.fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaEntrega() {
        return this.fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }


    public Envio(String idEnvio, double peso, double volumen, double costo, boolean estadoEnvio, LocalDate fechaCreacion, LocalDate fechaEntrega) {
        this.idEnvio = idEnvio;
        this.peso = peso;
        this.volumen = volumen;
        this.costo = costo;
        this.estadoEnvio = estadoEnvio;
        this.fechaCreacion = fechaCreacion;
        this.fechaEntrega = fechaEntrega;
    }
}