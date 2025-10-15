package co.edu.uniquindio.empresatransporte.proyecto_final_daniel_morales_sebastian_vargas.model;

public class Administrador extends Usuario{
    private String idAdministrador;

    public Administrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }
}
