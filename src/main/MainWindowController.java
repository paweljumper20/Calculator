package main;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {
    Float data = 0f;
    int operation = 0;
    @FXML
    private Button button2;

    @FXML
    private Button button1;

    @FXML
    private Button button3;

    @FXML
    private Button buttonplus;

    @FXML
    private Button buttonminus;

    @FXML
    private Button button6;

    @FXML
    private Button button5;

    @FXML
    private Button button4;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button buttondiv;

    @FXML
    private Button button0;

    @FXML
    private Button buttoneq;

    @FXML
    private Button buttoncanc;

    @FXML
    private Button buttonmult;

    @FXML
    private TextField display;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if (event.getSource() == button1) {
            display.setText(display.getText() + 1);
        } else if (event.getSource() == button2) {
            display.setText(display.getText() + 2);
        } else if (event.getSource() == button3) {
            display.setText(display.getText() + 3);
        } else if (event.getSource() == button4) {
            display.setText(display.getText() + 4);
        } else if (event.getSource() == button5) {
            display.setText(display.getText() + 5);
        } else if (event.getSource() == button6) {
            display.setText(display.getText() + 6);
        } else if (event.getSource() == button7) {
            display.setText(display.getText() + 7);
        } else if (event.getSource() == button8) {
            display.setText(display.getText() + 8);
        } else if (event.getSource() == button9) {
            display.setText(display.getText() + 9);
        } else if (event.getSource() == button0) {
            display.setText(display.getText() + 0);
        } else if (event.getSource() == buttonplus)
        {
            data = Float.parseFloat(display.getText());
            operation = 1; //dodawanie
            display.setText("");
        } else if(event.getSource() == buttonminus){
            data = Float.parseFloat(display.getText());
            operation = 2; // odejmowanie
            display.setText("");
        } else if(event.getSource() == buttonmult){
            data = Float.parseFloat(display.getText());
            operation = 3; // mnozenie
            display.setText("");
        } else if(event.getSource() == buttondiv){
            data = Float.parseFloat(display.getText());
            operation = 4; //dzielenie
            display.setText("");

        } else if (event.getSource() == buttoneq){
            Float secondOp = Float.parseFloat(display.getText());
            switch (operation)
            {
                case 1: // dodawanie
                    float ans = data + secondOp;
                    display.setText(String.valueOf(ans)); break;
                case 2: //odejmowanie
                     ans = data - secondOp;
                    display.setText(String.valueOf(ans)); break;
                case 3: //mnozenie
                     ans = data * secondOp;
                    display.setText(String.valueOf(ans)); break;
                case 4: //dzielenie
                    ans = 0f;
                    try{
                        ans = data / secondOp;
                    } catch (Exception e){display.setText("Nie tak");}
                    display.setText(String.valueOf(ans)); break;

            }
        }
        else if (event.getSource() == buttoncanc){
            display.setText("");
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }

    public void zamknijProgram(ActionEvent actionEvent) {
        Platform.exit();
    }

}

