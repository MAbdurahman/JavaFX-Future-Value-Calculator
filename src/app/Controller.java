package app;

import com.mahdi_abdurrahman.utilities.Calculator;
import com.mahdi_abdurrahman.utilities.Validator;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.text.NumberFormat;

public class Controller {

    @FXML private TextField investmentField;
    @FXML private TextField interestRateField;
    @FXML private TextField numberYearsField;
    @FXML private TextField futureValueField;

    @FXML
    protected void calculateButtonClicked() {

        Validator validation = new Validator();
        String errorMsg = "";
        errorMsg += validation.isDouble(investmentField.getText(), "Monthly Investment");
        errorMsg += validation.isDouble(interestRateField.getText(), "Yearly Interest Rate");
        errorMsg += validation.isInteger(numberYearsField.getText(), "Number of Years");

        if (errorMsg.isEmpty()) {
            double investment = Double.parseDouble(investmentField.getText());
            double interest = Double.parseDouble(interestRateField.getText());
            int years = Integer.parseInt(numberYearsField.getText());

            double  futureValue = Calculator.calculateFutureValue(investment, interest, years);

            NumberFormat currency = NumberFormat.getCurrencyInstance();
            futureValueField.setText(currency.format(futureValue));

        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Invalid Data");
            alert.setContentText(errorMsg);
            alert.showAndWait();
        }

    }//end of the calculateButtonClicked Method

    @FXML
    protected void terminateButtonClicked() {
        Platform.exit();

    }//end of the terminatedButtonClicked Method

    public void resetButtonClicked() {
        investmentField.setText("");
        interestRateField.setText("");
        numberYearsField.setText("");
        futureValueField.setText("");

    }//end of the resetButtonClicked Method
}//end of the Controller Class
