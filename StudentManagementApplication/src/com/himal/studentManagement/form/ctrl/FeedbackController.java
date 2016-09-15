package com.himal.studentManagement.form.ctrl;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Himal Acharya on 2016-09-04.
 */
public class FeedbackController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public Button submit;
    public TextArea writeArea;

    public void submitAction() throws Exception {


        FileWriter fos = null;
        BufferedWriter bfout = null;
        StringBuilder s = new StringBuilder();



        try {
            fos = new FileWriter("E:/studentmanagement.txt");

            bfout = new BufferedWriter(fos);


            //System.out.println(writeArea.getText());
            if (writeArea.getText() != null) {
              //  String[] ss = writeArea.getText().split("[\r\n]+");
                String[] ss = writeArea.getText().split("\n");
                for (int i = 0; i < ss.length; i++) {
                    String a=ss[i];

                    System.out.println(a);
                  bfout.write(a);


                    bfout.newLine();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            bfout.close();
            fos.close();


        }




    }
}
