package testing;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private TextField nameField;
    @FXML private Label messageLabel;

    @FXML
    private void sayHello() {
        String name = nameField.getText();
        messageLabel.setText("Hello, " + name + "!");
    }
}