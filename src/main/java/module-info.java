module com.mycompany.proyecto_ajedrez {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.proyecto_ajedrez to javafx.fxml;
    exports com.mycompany.proyecto_ajedrez;
}
