package com.himal.studentManagement.form.ctrl;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {

    public Button cancel;
    public Button signup;
    public Button login;
    public Button feedback;

    public TextField userNameTextField;
    public PasswordField passwordTextField;




    public void cancelAction(){
        Stage stage= (Stage) cancel.getScene().getWindow();
        stage.close();
    }

    public void signupAction() throws Exception {
        Stage stage= (Stage) signup.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../view/userCreate.fxml"));
        stage.setTitle("Sign Up Form");
        stage.setScene(new Scene(root));
        stage.show();

    }

    public void loginAction() throws Exception {
        Stage stage = (Stage) login.getScene().getWindow();
        if(userNameTextField.getText().equals("admin")&& passwordTextField.getText().equals("admin")) {


            Parent root = FXMLLoader.load(getClass().getResource("../view/userDetails.fxml"));
            stage.setTitle("User Details Form");

            stage.setScene(new Scene(root));
            stage.show();
        }else{
            new SampleFx().start(stage);
        }

    }

    public void feedbackAction() throws Exception{
        Stage stage= (Stage) feedback.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../view/feedback.fxml"));
        stage.setTitle("Feedback Form");
        stage.setScene(new Scene(root));
        stage.show();
    }

}
