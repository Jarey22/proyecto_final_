package co.edu.uniquindio.empresatransporte.proyecto_final_daniel_morales_sebastian_vargas.model;

import java.time.LocalDate;

public class Pago {
    private String idPago;
    private double monto;
    private LocalDate fecha;
    private boolean aprovado;

    public Pago(String idPago, double monto, LocalDate fecha, boolean aprovado) {
        this.idPago = idPago;
        this.monto = monto;
        this.fecha = fecha;
        this.aprovado = aprovado;
    }

    public String getIdPago() {
        return idPago;
    }

    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
