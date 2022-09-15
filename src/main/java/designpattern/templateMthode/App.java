package designpattern.templateMthode;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	@Override
	public void start(Stage stage) {

		// screen widgets set on pane
		var label = new Label("Template Method Design Pattern");
		label.setLayoutX(200);
		label.setLayoutY(30);

		var label1 = new Label("Bank Account Creater");
		label1.setLayoutX(200);
		label1.setLayoutY(150);

		var btnPrivate = new Button(" Create Private Account");
		btnPrivate.setLayoutX(100);
		btnPrivate.setLayoutY(200);
		var btnBussines = new Button("Create Bussines Account");
		btnBussines.setLayoutX(300);
		btnBussines.setLayoutY(200);

		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {

				AccountCreater pac = new PrivateAccountCreator();

				pac.createAccount(stage);

			}
		};
		btnPrivate.setOnAction(event);

		EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {

				AccountCreater  bac = new BusinessAccountCreator();
				bac.createAccount(stage);

			}
		};
		btnBussines.setOnAction(event2);

		// setting Main scene
		Pane pane = new Pane();
		pane.getChildren().addAll(label, btnPrivate, btnBussines, label1);
		pane.setStyle("-fx-background-color: #B0CDD5;");
		var scene = new Scene(pane, 640, 480);
		stage.setScene(scene);
		stage.setTitle("Template Method");
		stage.show();
	}

	public static void main(String[] args) {

		launch();
	}

}