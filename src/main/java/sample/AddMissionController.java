package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddMissionController implements Initializable {

    @FXML
    public Button search;
    @FXML
    public Button message;
    @FXML
    public Button clear;
    @FXML
    public Button save;
    @FXML
    public Button addMission;
    @FXML
    public Button editMission;

    @FXML
    private Button home;

    @FXML
    private AnchorPane rootPane;

    Stage stage = null;

    @FXML
    public void display(ActionEvent event) throws IOException {
//        stage = (Stage) rootPane.getScene().getWindow();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/userScreens/calender.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void searchPage(ActionEvent event) throws IOException {
//        stage = (Stage) rootPane.getScene().getWindow();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/userScreens/search.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void messagePage(ActionEvent event) throws IOException {
//        stage = (Stage) rootPane.getScene().getWindow();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/userScreens/messages.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void addConstraintPage(ActionEvent event) throws IOException {
//        stage = (Stage) rootPane.getScene().getWindow();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/userScreens/addConstraint.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void editConstraintPage(ActionEvent event) throws IOException {
//        stage = (Stage) rootPane.getScene().getWindow();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/userScreens/addConstraint.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void addMissionPage(ActionEvent event) throws IOException {
//        stage = (Stage) rootPane.getScene().getWindow();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/userScreens/addMission.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void editMissionPage(ActionEvent event) throws IOException {
//        stage = (Stage) rootPane.getScene().getWindow();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/userScreens/editMission.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}
