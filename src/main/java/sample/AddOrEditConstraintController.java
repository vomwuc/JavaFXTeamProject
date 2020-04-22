package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddOrEditConstraintController implements Initializable {

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
    public DatePicker missionStartDate;
    @FXML
    public DatePicker missionEndDate;
    @FXML
    public ComboBox mission;
    @FXML
    public ComboBox reserve;
    @FXML
    public ComboBox constraint;
    @FXML
    public ComboBox constraintNumber;
    @FXML
    public DatePicker constraintStartDate;
    @FXML
    public DatePicker constraintEndDate;
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
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/userScreens/messages.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void clear(ActionEvent event) {
        constraintStartDate.getEditor().clear();
        constraintEndDate.getEditor().clear();
        constraint.setValue(null);
        constraintNumber.setValue(null);
    }

    public void delete(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}
