import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class calculatorController {

    @FXML
    private Button btnCalc;

    @FXML
    private Label lblIdade;

    @FXML
    private TextField txtAn;

    @FXML
    void btnClick(ActionEvent event) {
        int anoNasc = Integer.parseInt(txtAn.getText());
        int anoAtual = 2025;
        String idade = Integer.toString(anoAtual - anoNasc);
        lblIdade.setText(idade);
    }
}
