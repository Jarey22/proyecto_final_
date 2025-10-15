package co.edu.uniquindio.empresatransporte.proyecto_final_daniel_morales_sebastian_vargas.model;

public class Direccion {
    private String IdDireccion;
    private int alias;
    private String calle;
    private String ciudad;
    private String coordenadas;

    public Direccion(String idDireccion, int alias, String calle, String ciudad, String coordenadas) {
        this.IdDireccion = idDireccion;
        this.alias = alias;
        this.calle = calle;
        this.ciudad = ciudad;
        this.coordenadas = coordenadas;
    }

    public String getIdDireccion() {
        return IdDireccion;
    }

    public int getAlias() {
        return alias;
    }

    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setIdDireccion(String idDireccion) {
        IdDireccion = idDireccion;
    }

    public void setAlias(int alias) {
        this.alias = alias;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }
}
