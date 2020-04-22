package sample2;

import Utils.User;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public AnchorPane pnlAddMission;
    @FXML
    public AnchorPane pnlAddConstraint;
    @FXML
    public StackPane stackPane;

    @FXML
    private VBox pnItems = null;
    @FXML
    private Button btnOverview;

    @FXML
    private Button btnConst;

    @FXML
    private Button btnSearch;

    @FXML
    private Button btnMessages;

    @FXML
    private Button btnAdminAddMission;

    @FXML
    private Button btnAdminEditMission;

    @FXML
    private Button btnAdminSearch;

    @FXML
    private Button btnAdminMessages;
    @FXML
    private VBox vboxUser;

    @FXML
    private VBox vboxAdmin;

    @FXML
    private Button btnSignout;


    @FXML
    private Pane pnlCustomer;

    @FXML
    private Pane pnlOrders;

    @FXML
    private Pane pnlOverview;

    @FXML
    private Pane pnlMenus;


    private Parent homePage = null;
    private Parent editConst = null;
    private Parent messagesPage = null;
    private Parent searchPage = null;
    private Parent adminEditMissionPage = null;
    private Parent adminAddMissionPage = null;
    private Parent adminSearchPage = null;
    private Parent adminMessagesPage = null;

    private User user;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            user = User.getInstacne();
            if(user.getAdmin()) {
                vboxAdmin.setVisible(true);
                vboxUser.setVisible(false);
                vboxAdmin.toFront();
                vboxUser.toBack();
            } else {
                vboxAdmin.setVisible(false);
                vboxUser.setVisible(true);
                vboxAdmin.toBack();
                vboxUser.toFront();
            }
            homePage = FXMLLoader.load(getClass().getResource("/fxml/homePage.fxml"));
            messagesPage = FXMLLoader.load(getClass().getResource("/fxml/userScreens/messages.fxml"));
            searchPage = FXMLLoader.load(getClass().getResource("/fxml/userScreens/search.fxml"));
            adminAddMissionPage = FXMLLoader.load(getClass().getResource("/fxml/adminScreens/addMission.fxml"));
            adminEditMissionPage = FXMLLoader.load(getClass().getResource("/fxml/adminScreens/editMission.fxml"));
            editConst = FXMLLoader.load(getClass().getResource("/fxml/userScreens/editConstraint.fxml"));
            adminMessagesPage = FXMLLoader.load(getClass().getResource("/fxml/adminScreens/adminMessages.fxml"));
            adminSearchPage = FXMLLoader.load(getClass().getResource("/fxml/adminScreens/adminSearch.fxml"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        stackPane.getChildren().add(homePage);
        StackPane.setAlignment(homePage, Pos.TOP_CENTER);
    }


    public void handleClicks(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btnConst) {
            stackPane.getChildren().clear();
            stackPane.getChildren().add(editConst);
            StackPane.setAlignment(editConst, Pos.TOP_CENTER);
        }
        if (actionEvent.getSource() == btnMessages) {
            stackPane.getChildren().clear();
            stackPane.getChildren().add(messagesPage);
            StackPane.setAlignment(messagesPage, Pos.TOP_CENTER);
        }
        if (actionEvent.getSource() == btnOverview) {
            stackPane.getChildren().clear();
            stackPane.getChildren().add(homePage);
            StackPane.setAlignment(homePage, Pos.TOP_CENTER);
        }
        if (actionEvent.getSource() == btnSearch) {
            stackPane.getChildren().clear();
            stackPane.getChildren().add(searchPage);
            StackPane.setAlignment(stackPane, Pos.TOP_CENTER);
        }
        if(actionEvent.getSource() == btnAdminAddMission) {
            stackPane.getChildren().clear();
            stackPane.getChildren().add(adminAddMissionPage);
            StackPane.setAlignment(stackPane, Pos.TOP_CENTER);
        }
        if(actionEvent.getSource() == btnAdminEditMission) {
            stackPane.getChildren().clear();
            stackPane.getChildren().add(adminEditMissionPage);
            StackPane.setAlignment(stackPane, Pos.TOP_CENTER);
        }
        if(actionEvent.getSource() == btnAdminMessages) {
            stackPane.getChildren().clear();
            stackPane.getChildren().add(adminMessagesPage);
            StackPane.setAlignment(stackPane, Pos.TOP_CENTER);
        }
        if(actionEvent.getSource() == btnAdminSearch) {
            stackPane.getChildren().clear();
            stackPane.getChildren().add(adminSearchPage);
            StackPane.setAlignment(stackPane, Pos.TOP_CENTER);
        }
    }

    public void close(ActionEvent actionEvent) {
        System.exit(1);
    }
}
