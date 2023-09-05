module espol.edu.ec.intentos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens espol.edu.ec.intentos to javafx.fxml;
    exports espol.edu.ec.intentos;
}
