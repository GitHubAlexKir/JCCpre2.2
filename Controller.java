package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class Controller implements Initializable{
    @FXML
    private void handleButtonAction(ActionEvent event) {

    }

    @FXML
    private void exitCalculator(){
        System.exit(1);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
