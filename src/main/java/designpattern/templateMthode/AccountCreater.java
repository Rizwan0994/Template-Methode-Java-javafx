package designpattern.templateMthode;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public abstract class AccountCreater extends Pane {

	public void verifyApplicationDetails() {
		this.getChildren().add(new Label("Verify Account details!"));

	}

	public void verifyIdentificationDetails() {
		Label l = new Label("Verify the Identification Details!");
		l.setLayoutY(20);
		this.getChildren().add(l);

	}

	public void receivePayment(int payment) {
		Label l = new Label("Payment Received=" + payment + "$");
		l.setLayoutY(40);
		this.getChildren().add(l);

	}

	// This methods will be implemented by its subclass
	public abstract String generateAccountNumber();

	public void sendATMCard() {
		Label l = new Label("ATM Card dispatched!");
		l.setLayoutY(60);
		this.getChildren().add(l);

	}

	public void sendATMPin() {
		Label l = new Label("ATM Pin dispatched!");
		l.setLayoutY(80);
		this.getChildren().add(l);

	}

	public void setNewScene(Stage stage) {
		// setting new scene
		this.setStyle("-fx-background-color: #B0CDD5;");
		var scene = new Scene(this, 640, 480);
		stage.setScene(scene);
		stage.setTitle("Create Account");
		stage.show();
	}

	// Template method
	public void createAccount(Stage stage) {

		setNewScene(stage);

		this.verifyApplicationDetails();
		this.verifyIdentificationDetails();
		this.receivePayment(10);
		var s = this.generateAccountNumber();
		this.sendATMCard();
		this.sendATMPin();

		// set Abstract class function returned Data to the pane
		Label l = new Label();
		l.setLayoutY(100);
		this.getChildren().addAll(l);
		l.setText(s);
	}
}
