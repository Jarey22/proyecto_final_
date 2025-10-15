package co.edu.uniquindio.empresatransporte.proyecto_final_daniel_morales_sebastian_vargas.model;

import co.edu.uniquindio.empresatransporte.proyecto_final_daniel_morales_sebastian_vargas.builder.UsuarioBuilder;

public class Usuario {

    private  String nombre;
    private  String identificacion;
    private  String telefono;
    private  String correo;

    public Usuario(UsuarioBuilder builder) {
        this.nombre = builder.nombre;
        this.identificacion = builder.idUsuario;
        this.telefono = builder.telefono;
        this.correo = builder.correo;
    }

    public Usuario(){
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

}