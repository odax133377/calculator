package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    private static boolean isOperationPlusClickFlag;

    private static double result;

    private static char operation = '0';

    private static boolean clear;

    @FXML
    public TextField textField;


    public void printOne(ActionEvent actionEvent) {
        if(clear == false) {
            textField.setText(textField.getText() + "1");
        }
        else {
            textField.setText("1");
            clear = false;
        }
        ;
    }

    public void getResult(ActionEvent actionEvent) {
        switch(operation){
            case '+':
                textField.setText
                        (String.valueOf
                                (Double.parseDouble(textField.getText()) + result));
                break;
        }


    }

    public void plusNumbers(ActionEvent actionEvent) {
        operation = '+';
        clear = true;
        result = Double.parseDouble(textField.getText());

    }
}
