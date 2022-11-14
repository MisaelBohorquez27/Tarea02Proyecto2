module com.mycompany.proyecto2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.proyecto2 to javafx.fxml;
    exports com.mycompany.proyecto2;
}
