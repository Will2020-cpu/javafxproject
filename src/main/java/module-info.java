module com.inventario.inventario {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.inventario.inventario to javafx.fxml;
    exports com.inventario.inventario.controller;
    exports com.inventario.inventario;
}