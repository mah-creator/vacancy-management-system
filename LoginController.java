import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class LoginController extends MainController implements Initializable{
	@FXML
	TextField userNameField;
	@FXML
	PasswordField passwordField;

	@FXML
	Text createAccountButton;
	@FXML
	Button loginButton;
	
	@FXML
	VBox form;
	@FXML
	VBox root;

	@FXML
	Label wrongCredentialsLabel;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			root.setBackground(new Background(new BackgroundImage(new Image((new File(".\\img\\bg.png")).toURI().toURL().toString()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT)));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		form.setBackground(new Background(new BackgroundFill(Color.rgb(184, 202, 221, .2), new CornerRadii(50), null)));
        form.requestFocus();

		createAccountButton.setCursor(Cursor.HAND);
		loginButton.setCursor(Cursor.HAND);
		
		createAccountButton.underlineProperty().bind(createAccountButton.hoverProperty());
		
        passwordField.setBorder(new Border(new BorderStroke(null, null, Color.valueOf("#8f8c8c"), null, null, null, BorderStrokeStyle.SOLID, null, null, BorderStroke.THIN, null)));
        userNameField.setBorder(new Border(new BorderStroke(null, null, Color.valueOf("#8f8c8c"), null, null, null, BorderStrokeStyle.SOLID, null, null, BorderStroke.THIN, null)));
	}

	@FXML
	void login(){
		try {
			inventorySystem.logUserIn(userNameField.getText(), passwordField.getText());
			System.out.println("Logged in successfully");
			wrongCredentialsLabel.setText("");

			if(inventorySystem.adminIsActive()){
				// load a page for the admin user
			}

			else{
				// load a page for the user
			}

		} catch (WrongUserCredentialsException e) {
			wrongCredentialsLabel.setText(e.getMessage());
		}
	}
}