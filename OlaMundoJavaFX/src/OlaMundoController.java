import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class OlaMundoController {

    @FXML
    private Button btnClick;

    @FXML
    private Label lblMsg;

    @FXML
    void clicouBotao(ActionEvent event) {
        lblMsg.setText("Olá, Mundo!");
    }

}

