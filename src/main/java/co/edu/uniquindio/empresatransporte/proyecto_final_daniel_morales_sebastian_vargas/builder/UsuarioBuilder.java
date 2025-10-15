package co.edu.uniquindio.empresatransporte.proyecto_final_daniel_morales_sebastian_vargas.builder;

import co.edu.uniquindio.empresatransporte.proyecto_final_daniel_morales_sebastian_vargas.model.Usuario;

public class UsuarioBuilder {

    public String nombre;
    public String idUsuario;
    public String telefono;
    public String correo;

    public UsuarioBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public UsuarioBuilder identificacion(String identificacion) {
        this.idUsuario = identificacion;
        return this;
    }

    public UsuarioBuilder telefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public UsuarioBuilder correo(String correo) {
        this.correo = correo;
        return this;
    }

    public Usuario build() {
        return new Usuario(this);
    }
}
