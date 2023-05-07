package PharmaGest;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class loginControlleur implements Initializable {
    @FXML
    private Button cancelButton;

    @FXML
    private Label loginMessage;
    @FXML
    private ImageView brandingImageView;
    @FXML
    private ImageView lockImage;
    @FXML
    private TextField usernameTextfield;
    @FXML
    private PasswordField enterPasswordField;

    /*/@Override
    public void intialize (URL url, ResourceBundle resourceBundle){
        File brandingFile = new File("image/undraw_Private_data_re_4eab.png");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        brandingImageView.setImage(brandingImage);

        File lockFile = new File("image/serrure.png");
        Image lockImage = new Image(lockFile.toURI().toString());
        lockImage.setImage(lockImage);
    }*/

    public void loginButtonAction(ActionEvent event) {

        if (usernameTextfield.getText().isBlank() == false && enterPasswordField.getText().isBlank() == false) {
            validateLogin();
        } else {
            loginMessage.setText("Veuillez entrer le login et le mot de passe");
        }
    }
    public void cancelButtonAction (ActionEvent event){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize (URL url, ResourceBundle resourceBundle){

    }

    public void validateLogin () {

    }

}