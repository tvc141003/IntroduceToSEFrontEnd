module org.openjfx.testFX {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.desktop;

    opens org.openjfx.testFX to javafx.fxml;
    exports org.openjfx.testFX;
}
