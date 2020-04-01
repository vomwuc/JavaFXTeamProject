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

public class Controller implements Initializable {

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
    public Button adminSearch;
    @FXML
    public Button adminMessages;

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

    public void adminSearchPage(ActionEvent event) throws IOException {
//        stage = (Stage) rootPane.getScene().getWindow();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/adminScreens/adminSearch.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void messagePage(ActionEvent event) throws IOException {
//        stage = (Stage) rootPane.getScene().getWindow();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/userScreens/messages.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void adminMessagePage(ActionEvent event) throws IOException {
//        stage = (Stage) rootPane.getScene().getWindow();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/adminScreens/adminMessages.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void addConstraintPage(ActionEvent event) throws IOException {
//        stage = (Stage) rootPane.getScene().getWindow();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/userScreens/addConstraint.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void editConstraintPage(ActionEvent event) throws IOException {
//        stage = (Stage) rootPane.getScene().getWindow();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/userScreens/editConstraint.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void addMissionPage(ActionEvent event) throws IOException {
//        stage = (Stage) rootPane.getScene().getWindow();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/adminScreens/addMission.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void editMissionPage(ActionEvent event) throws IOException {
//        stage = (Stage) rootPane.getScene().getWindow();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/adminScreens/editMission.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}
