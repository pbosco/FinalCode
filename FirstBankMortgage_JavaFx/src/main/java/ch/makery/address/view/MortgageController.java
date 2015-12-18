package ch.makery.address.view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.awt.TextField;
import java.util.UUID;

import base.RateDAL;
import ch.makery.address.MainApp;
import ch.makery.address.model.Rate;


public class MortgageController {
	
    @FXML
    TextField txtIncome;
    
    @FXML
    TextField txtCreditScore;
    
    @FXML
    TextField txtExpenses;
    
    @FXML
    TextField txtHouseCost;
    
    @FXML
    Label lblMortgagePayment;
    
    @FXML
    ComboBox cmbTerm;


    // Reference to the main application.
    private MainApp mainApp;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public MortgageController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {

    }

    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
        
        
    }
    
    @FXML
    public Double Income(){
    	double income = new Double(txtIncome.getText());
    	
    	return income;
    }
    
    @FXML
    public Double Expenses(){
    	double expenses = new Double(txtExpenses.getText());
    	
    	return expenses;
    }
    
    @FXML
    public Double CreditScore(){
    	double creditScore = new Double(txtCreditScore.getText());
    	
    	return creditScore;
    }
    
    @FXML
    public Double HouseCost(){
    	double houseCost = new Double(txtHouseCost.getText());
    	
    	return houseCost;
    }
    
    @FXML
    public Double MortgagePayment(){
    	double mortgagePayment = new Double(lblMortgagePayment.getText());
    	
    	return mortgagePayment;
    }
    
    @FXML
    public Double Term(){
    	double term = new Double(cmbTerm.getPromptText());
    	
    	return term;
    }
    

    
    
    
    
   
}