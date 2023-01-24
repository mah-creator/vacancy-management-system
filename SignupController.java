import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class SignupController extends MainController implements Initializable{
    @FXML
    GridPane infoGrid;

    @FXML
    Rectangle rectangle;

    @FXML
    HBox root;

    @FXML
	Button registerButton;

    @FXML
    Text loginPageButton;

    @FXML
    TextField nameField, idField, emailField;

    @FXML
    PasswordField passwordField;

    @FXML
    DatePicker birthDateFDatePicker;
    
    @Override
    public void initialize(URL location, ResourceBundle resources){
        try {
            root.setBackground(new Background(new BackgroundImage(new Image((new File(".\\img\\bg.png")).toURI().toURL().toString()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT)));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        registerButton.setCursor(Cursor.HAND);

        infoGrid.setBackground(new Background(new BackgroundFill(Color.rgb(184, 202, 221, .2), new CornerRadii(50), null)));

        rectangle.heightProperty().bind(infoGrid.heightProperty().multiply(2));
        rectangle.setFill(Color.rgb(0, 55, 106, .3));

        loginPageButton.underlineProperty().bind(loginPageButton.hoverProperty());
        loginPageButton.setCursor(Cursor.HAND);
    }
}