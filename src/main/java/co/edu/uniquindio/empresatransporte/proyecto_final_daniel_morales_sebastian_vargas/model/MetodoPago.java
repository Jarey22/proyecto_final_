package co.edu.uniquindio.empresatransporte.proyecto_final_daniel_morales_sebastian_vargas.model;

public class MetodoPago {
    private String tipo;
    private String referencia;

    public MetodoPago(String tipo, String referencia){
        this.tipo = tipo;
        this.referencia = referencia;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
