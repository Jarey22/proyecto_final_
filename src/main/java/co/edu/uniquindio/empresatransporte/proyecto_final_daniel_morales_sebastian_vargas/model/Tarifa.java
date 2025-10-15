package co.edu.uniquindio.empresatransporte.proyecto_final_daniel_morales_sebastian_vargas.model;

import java.time.LocalDate;

public class Tarifa {
    private String idTarifa;
    private double tarifaBase;
    private double costoKilometro;
    private double costoMetroCubico;
    private double factorPrioridad;
    private LocalDate fechaVigencia;
    private Boolean activo;

    public String getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(String idTarifa) {
        this.idTarifa = idTarifa;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double getCostoKilometro() {
        return costoKilometro;
    }

    public void setCostoKilometro(double costoKilometro) {
        this.costoKilometro = costoKilometro;
    }

    public double getCostoMetroCubico() {
        return costoMetroCubico;
    }

    public void setCostoMetroCubico(double costoMetroCubico) {
        this.costoMetroCubico = costoMetroCubico;
    }

    public double getFactorPrioridad() {
        return factorPrioridad;
    }

    public void setFactorPrioridad(double factorPrioridad) {
        this.factorPrioridad = factorPrioridad;
    }

    public LocalDate getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(LocalDate fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Tarifa(String idTarifa, double tarifaBase, double costoKilometro, double costoMetroCubico, double factorPrioridad, LocalDate fechaVigencia, Boolean activo) {
        this.idTarifa = idTarifa;
        this.tarifaBase = tarifaBase;
        this.costoKilometro = costoKilometro;
        this.costoMetroCubico = costoMetroCubico;
        this.factorPrioridad = factorPrioridad;
        this.fechaVigencia = fechaVigencia;
        this.activo = activo;


    }

}
