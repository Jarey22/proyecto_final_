package co.edu.uniquindio.empresatransporte.proyecto_final_daniel_morales_sebastian_vargas.model;

public class Repartidor extends Usuario{
    private String  idRepatidor;
    private int zonaCobertura;
    private String disponibilidad;
    private boolean estadoDisponibilidad;


    public Repartidor(String idRepatidor, int zonaCobertura, String disponibilidad, boolean estadoDisponibilidad) {
        this.idRepatidor = idRepatidor;
        this.zonaCobertura = zonaCobertura;
        this.disponibilidad = disponibilidad;
        this.estadoDisponibilidad = estadoDisponibilidad;

    }

    public String getIdRepatidor() {
        return this.idRepatidor;
    }

    public void setIdRepatidor(String idRepatidor) {
        this.idRepatidor = idRepatidor;
    }

    public int getZonaCobertura() {
        return this.zonaCobertura;
    }

    public void setZonaCobertura(int zonaCobertura) {
        this.zonaCobertura = zonaCobertura;
    }

    public String getDisponibilidad() {
        return this.disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public boolean isEstadoDisponibilidad() {
        return this.estadoDisponibilidad;
    }

    public boolean getEstadoDisponibilidad() {
        return this.estadoDisponibilidad;
    }

    public void setEstadoDisponibilidad(boolean estadoDisponibilidad) {
        this.estadoDisponibilidad = estadoDisponibilidad;
    }
}