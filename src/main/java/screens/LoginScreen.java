package screens;

import Utils.LoginUtils;
import Utils.User;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class LoginScreen extends Application {
    String user = "JavaFX2";
    String checkUser;

    LoginUtils loginUtils = new LoginUtils();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("מערכת לוח תורנויות");

        BorderPane bp = new BorderPane();
        bp.setPadding(new Insets(10, 50, 50, 50));

        //Adding HBox
        HBox hb = new HBox();
        hb.setPadding(new Insets(20, 20, 20, 30));

        //Adding GridPane
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20, 20, 20, 20));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        //Implementing Nodes for GridPane
        Label lblUserName = new Label("מספר אישי");
        final TextField txtUserName = new TextField();
        Button btnLogin = new Button("התחברות");
        final Label lblMessage = new Label();
        Button btnAdminLogin = new Button("אחראי תורנויות? לחץ כאן");

        gridPane.add(lblUserName, 2, 0);
        GridPane.setHalignment(lblUserName, HPos.RIGHT);
        gridPane.add(txtUserName, 1, 0);

        gridPane.add(btnLogin, 2, 2);
        gridPane.add(lblMessage, 2, 4);
        gridPane.add(btnAdminLogin, 2, 3);

        Text text = new Text("מערכת תורנויות");
        text.setFill(Color.WHITE);
        text.setFont(Font.font("Tahoma", FontWeight.BOLD, 28));

        hb.getChildren().add(text);

        bp.setId("bp");
        lblUserName.setId("usrName");
        gridPane.setId("root");
        btnLogin.setId("btnLogin");
        txtUserName.setId("txtField");
        btnAdminLogin.setId("btnAdminLogin");
        text.setId("text");

        btnLogin.setOnAction((EventHandler) event -> {
            checkUser = txtUserName.getText().toString();
//            checkPw = pf.getText().toString();
            if (checkUser.equals(user)) {
                lblMessage.setText("Congratulations!");
                lblMessage.setTextFill(Color.GREEN);
//                User.getInstacne().setPersonalNumber(checkUser);
                loginUtils.moveToHomePage(primaryStage);
            } else {
                lblMessage.setText("Incorrect user or pw.");
                lblMessage.setTextFill(Color.RED);
            }
            txtUserName.setText("");
        });

        Stage window = new Stage();


        btnAdminLogin.setOnAction((EventHandler) event -> {
            AdminLoginScreen a = new AdminLoginScreen();
            primaryStage.setScene(a.getScene(primaryStage));
            primaryStage.show();

        });

        bp.setTop(hb);
        bp.setCenter(gridPane);

        bp.setNodeOrientation(NodeOrientation.LEFT_TO_RIGHT);

        Scene scene = new Scene(bp);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("login.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.titleProperty().bind(
                scene.widthProperty().asString().
                        concat(" : ").
                        concat(scene.heightProperty().asString()));
        primaryStage.show();
    }
}