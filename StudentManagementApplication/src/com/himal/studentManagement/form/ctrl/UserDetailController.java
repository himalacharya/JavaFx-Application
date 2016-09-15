package com.himal.studentManagement.form.ctrl;

;
import com.himal.studentManagement.dao.impl.UserDAOImpl;

import com.himal.studentManagement.dto.UserDTO;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import javafx.stage.Stage;


import java.net.URL;

import java.util.ResourceBundle;

/**
 * Created by Himal Acharya on 2016-09-03.
 */
public class UserDetailController  implements Initializable{

    @FXML TableView<UserDTO> table;


    @FXML TableColumn<UserDTO,Integer> tableID;
    @FXML TableColumn<UserDTO,String> tableUserName;
    @FXML TableColumn<UserDTO,String> tablePassword;
    @FXML TableColumn<UserDTO,String> tableContact;

    UserDAOImpl userdaoimpl=new UserDAOImpl();

   @FXML Button back;
    @FXML Button update;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tableID.setCellValueFactory(new PropertyValueFactory<>("id"));
        tableUserName.setCellValueFactory(new PropertyValueFactory<>("userName"));
        tablePassword.setCellValueFactory(new PropertyValueFactory<>("password"));
        tableContact.setCellValueFactory(new PropertyValueFactory<>("contact"));

        table.setItems(userdaoimpl.getAll());

        tableContact.setCellFactory(TextFieldTableCell.forTableColumn());
        tableUserName.setCellFactory(TextFieldTableCell.forTableColumn());


        tableUserName.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<UserDTO, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<UserDTO, String> event) {

            }
        });

        tableContact.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<UserDTO, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<UserDTO, String> event) {


            }
        });




    }

    public void backAction() throws Exception {
        new SampleFx().start((Stage)back.getScene().getWindow());
    }

    public void updateAction() throws Exception{




    }




}
