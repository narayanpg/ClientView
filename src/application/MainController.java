package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {
	@FXML
	private Label lblMessage;
	@FXML
	private TextField txtboxAccountNumber;
	@FXML
	private TextField txtboxPassword;
	@FXML
	private Label lblSignUpAlert;
	@FXML
	private TextField tboxUsername;
	@FXML
	private TextField tboxPwd;
	@FXML
	private Label lblAccount;
	@FXML
	private TextField tboxAmount;
	@FXML
	private Label lblTransactionNotice;

	//private static List<Account> accounts;

	public void logIn(ActionEvent event) throws Exception {

//		accounts = new ArrayList<Account>();
//		Account ac = new Account();
//		ac.setAccountNumber("123");
//		ac.setPassword("pass");
//		ac.setAmount(100);
//		accounts.add(ac);

		if (txtboxAccountNumber.getText().equals("123") && txtboxPassword.getText().equals("pass")) {

			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/UserView.fxml"));
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} else {
			lblMessage.setText("Login failed");
		}

	}

	public void addAmount(ActionEvent event) throws Exception {

//		double am = Double.parseDouble(tboxAmount.getText());
//		Account ac = new Account();
//		ac.setAmount(am);
		lblTransactionNotice.setText("You deposited " + tboxAmount.getText());

	}
	
	public void withdrawAmount(ActionEvent event) throws Exception {

//		double am = Double.parseDouble(tboxAmount.getText());
//		Account ac = new Account();
//		ac.setAmount(am);
		lblTransactionNotice.setText("You withdrew " + tboxAmount.getText());

	}

}
