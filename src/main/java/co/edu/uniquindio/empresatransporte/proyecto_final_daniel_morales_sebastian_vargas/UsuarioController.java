package co.edu.uniquindio.empresatransporte.proyecto_final_daniel_morales_sebastian_vargas;

import co.edu.uniquindio.empresatransporte.proyecto_final_daniel_morales_sebastian_vargas.builder.UsuarioBuilder;
import co.edu.uniquindio.empresatransporte.proyecto_final_daniel_morales_sebastian_vargas.model.Usuario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class UsuarioController {

    @FXML private TextField txtNombre;
    @FXML private TextField txtIdentificacion;
    @FXML private TextField txtTelefono;
    @FXML private TextField txtCorreo;

    @FXML private TableView<Usuario> tablaUsuarios;
    @FXML private TableColumn<Usuario, String> colNombre;
    @FXML private TableColumn<Usuario, String> colIdentificacion;
    @FXML private TableColumn<Usuario, String> colTelefono;
    @FXML private TableColumn<Usuario, String> colCorreo;

    private final ObservableList<Usuario> listaUsuarios = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        colNombre.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getNombre()));
        colIdentificacion.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getIdentificacion()));
        colTelefono.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getTelefono()));
        colCorreo.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getCorreo()));

        listaUsuarios.addAll(
                new UsuarioBuilder()
                        .nombre("Juan Pérez")
                        .identificacion("123")
                        .telefono("3001112233")
                        .correo("juan@correo.com")
                        .build(),
                new UsuarioBuilder()
                        .nombre("Ana Gómez")
                        .identificacion("456")
                        .telefono("3015558899")
                        .correo("ana@correo.com")
                        .build()
        );

        tablaUsuarios.setItems(listaUsuarios);
        tablaUsuarios.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldSel, newSel) -> mostrarDetallesUsuario(newSel)
        );
    }

    private void mostrarDetallesUsuario(Usuario usuario) {
        if (usuario != null) {
            txtNombre.setText(usuario.getNombre());
            txtIdentificacion.setText(usuario.getIdentificacion());
            txtTelefono.setText(usuario.getTelefono());
            txtCorreo.setText(usuario.getCorreo());
        }
    }

    @FXML
    private void agregarUsuario() {
        Usuario nuevo = new UsuarioBuilder()
                .nombre(txtNombre.getText())
                .identificacion(txtIdentificacion.getText())
                .telefono(txtTelefono.getText())
                .correo(txtCorreo.getText())
                .build();

        listaUsuarios.add(nuevo);
        limpiarCampos();
    }

    @FXML
    private void actualizarUsuario() {
        int index = tablaUsuarios.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            Usuario actualizado = new UsuarioBuilder()
                    .nombre(txtNombre.getText())
                    .identificacion(txtIdentificacion.getText())
                    .telefono(txtTelefono.getText())
                    .correo(txtCorreo.getText())
                    .build();

            listaUsuarios.set(index, actualizado);
            limpiarCampos();
        } else {
            mostrarAlerta("Seleccione un usuario para actualizar");
        }
    }

    @FXML
    private void eliminarUsuario() {
        Usuario seleccionado = tablaUsuarios.getSelectionModel().getSelectedItem();
        if (seleccionado != null) {
            listaUsuarios.remove(seleccionado);
            limpiarCampos();
        } else {
            mostrarAlerta("Seleccione un usuario para eliminar");
        }
    }

    private void limpiarCampos() {
        txtNombre.clear();
        txtIdentificacion.clear();
        txtTelefono.clear();
        txtCorreo.clear();
    }

    private void mostrarAlerta(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Atención");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
