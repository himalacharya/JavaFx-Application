package com.himal.studentManagement.form.ctrl;

import com.himal.studentManagement.dao.impl.UserDAOImpl;
import com.himal.studentManagement.dto.UserDTO;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Himal Acharya on 2016-09-03.
 */
public class UserCreateController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public TextField nameTextField;
    public PasswordField passwordTextField;
    public TextField idTextField;
    public TextField contactTextField;

    public Button save;
    public Button reset;

    UserDAOImpl userDAO=new UserDAOImpl();
    UserDTO userDTO=new UserDTO();

    public void saveAction() throws Exception {


        userDTO.setUserName(nameTextField.getText());
        userDTO.setId(Integer.parseInt(idTextField.getText()));
        userDTO.setPassword(passwordTextField.getText());
        userDTO.setContact(contactTextField.getText());

        userDAO.save(userDTO);
        Stage stage= (Stage)save.getScene().getWindow();
        new SampleFx().start(stage);

    }

    public void resetAction(){
        nameTextField.setText("");
        idTextField.setText("");
        passwordTextField.setText("");
        contactTextField.setText("");




    }
}
