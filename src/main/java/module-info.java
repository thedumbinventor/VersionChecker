module com.example.versionchecker {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.sun.jna.platform;
    requires com.sun.jna;
    requires org.json;


    opens com.example.versionchecker to javafx.fxml;
    exports com.example.versionchecker;
}