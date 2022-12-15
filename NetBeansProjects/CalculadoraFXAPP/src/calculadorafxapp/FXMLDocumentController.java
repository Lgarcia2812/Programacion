/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafxapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Diurno
 */
public class FXMLDocumentController implements Initializable {

    String operador1;
    String operador2;
    String operacion;

    private Label lSaluda;
    @FXML
    private TextField tfPantalla;
    @FXML
    private Button bAtras;
    @FXML
    private Button bCE;
    @FXML
    private Button bC;
    @FXML
    private Button bDivide;
    @FXML
    private Button bSiete;
    @FXML
    private Button bOcho;
    @FXML
    private Button bNueve;
    @FXML
    private Button bMultiplica;
    @FXML
    private Button bCuatro;
    @FXML
    private Button bCinco;
    @FXML
    private Button bSeis;
    @FXML
    private Button bMenos;
    @FXML
    private Button bUno;
    @FXML
    private Button bDos;
    @FXML
    private Button bTres;
    @FXML
    private Button bMas;
    @FXML
    private Button bMasMenos;
    @FXML
    private Button bCero;
    @FXML
    private Button bComa;
    @FXML
    private Button bIgual;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    private void hacerClick(ActionEvent event) {
        System.out.println("¿Has echo click!");
        lSaluda.setText("Hola Mundo!!!");
    }

    @FXML
    private void dAtrasClic(ActionEvent event) {
        String result = tfPantalla.getText();
        result = result.substring(0, result.length() -1);
        if (result.equals("")){
            result = "0";
        }
        tfPantalla.setText(result);
    }

    @FXML
    private void bCEClic(ActionEvent event) {
        tfPantalla.setText("0");
    }

    @FXML
    private void bCClic(ActionEvent event) {
        tfPantalla.setText("0");
        operador1 = "";
        operador2= "";
        operacion = "";
    }

    @FXML
    private void bDivideClic(ActionEvent event) {
        operador1 = tfPantalla.getText();
        operacion = "/";
    }

    @FXML
    private void bSieteClic(ActionEvent event) {
        if (!tfPantalla.getText().equals("0")) {
            tfPantalla.setText(tfPantalla.getText() + "7");
        } else {
            tfPantalla.setText("7");
        }
    }

    @FXML
    private void bOchoClic(ActionEvent event) {
        if (!tfPantalla.getText().equals("0")) {
            tfPantalla.setText(tfPantalla.getText() + "8");
        } else {
            tfPantalla.setText("8");
        }
    }

    @FXML
    private void bNueveClic(ActionEvent event) {
        if (!tfPantalla.getText().equals("0")) {
            tfPantalla.setText(tfPantalla.getText() + "9");
        } else {
            tfPantalla.setText("9");
        }
    }

    @FXML
    private void bMultiplicaClic(ActionEvent event) {
        operador1 = tfPantalla.getText();
        tfPantalla.setText("0");
        operacion = "*";
    }

    @FXML
    private void bCuatroClic(ActionEvent event) {
        if (!tfPantalla.getText().equals("0")) {
            tfPantalla.setText(tfPantalla.getText() + "4");
        } else {
            tfPantalla.setText("4");
        }
    }

    @FXML
    private void bCincoClic(ActionEvent event) {
        if (!tfPantalla.getText().equals("0")) {
            tfPantalla.setText(tfPantalla.getText() + "5");
        } else {
            tfPantalla.setText("5");
        }
    }

    @FXML
    private void bSeisClic(ActionEvent event) {
        if (!tfPantalla.getText().equals("0")) {
            tfPantalla.setText(tfPantalla.getText() + "6");
        } else {
            tfPantalla.setText("6");
        }
    }

    @FXML
    private void bMenosClic(ActionEvent event) {
        operador1 = tfPantalla.getText();
        tfPantalla.setText("0");
        operacion = "-";
    }

    @FXML
    private void bUnoClic(ActionEvent event) {
        if (!tfPantalla.getText().equals("0")) {
            tfPantalla.setText(tfPantalla.getText() + "1");
        } else {
            tfPantalla.setText("1");
        }
    }

    @FXML
    private void bDosClic(ActionEvent event) {
        if (!tfPantalla.getText().equals("0")) {
            tfPantalla.setText(tfPantalla.getText() + "2");
        } else {
            tfPantalla.setText("2");
        }
    }

    @FXML
    private void bTresClic(ActionEvent event) {
        if (!tfPantalla.getText().equals("0")) {
            tfPantalla.setText(tfPantalla.getText() + "3");
        } else {
            tfPantalla.setText("3");
        }
    }

    @FXML
    private void bMasClic(ActionEvent event) {
        operador1 = tfPantalla.getText();
        tfPantalla.setText("0");
        operacion = "+";
    }

    @FXML
    private void bMasMenosClic(ActionEvent event) {
        if (tfPantalla.getText().charAt(0)=='-'){
            tfPantalla.setText(tfPantalla.getText().substring(1));            
        }else{
            tfPantalla.setText("-" + tfPantalla.getText());
        }
        
    }

    @FXML
    private void bCeroClic(ActionEvent event) {
        if (!tfPantalla.getText().equals("0")) {
            tfPantalla.setText(tfPantalla.getText() + "0");
        }
    }

    @FXML
    private void bComaClic(ActionEvent event) {
        if(!tfPantalla.getText().contains(".")){
            tfPantalla.setText(tfPantalla.getText() + ".");
        }
    }

    @FXML
    private void bIgualClic(ActionEvent event) {
        operador2 = tfPantalla.getText();
        double op1 = Double.parseDouble(operador1);
        double op2 = Double.parseDouble(operador2);
        double resultado = 0;

        switch (operacion) {
            case "+":
                resultado = op1 + op2;
                break;

            case "-":
                resultado = op1 - op2;
                break;

            case "*":
                resultado = op1 * op2;
                break;

            case "/":
                resultado = op1 / op2;
                break;

        }
        String result = resultado + "";
        if(result.endsWith(".0")){
            result = result.substring(0, result.length()-2);
        }
        tfPantalla.setText(result);

    }

}
