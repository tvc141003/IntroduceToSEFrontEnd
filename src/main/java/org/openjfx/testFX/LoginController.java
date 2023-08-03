package org.openjfx.testFX;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class LoginController {

    @FXML
    private ImageView ig;
    private Button mybtn;
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
