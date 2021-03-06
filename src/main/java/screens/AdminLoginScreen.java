package screens;

import Utils.LoginUtils;
import Utils.User;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.fxml.Initializable;
public class AdminLoginScreen {
    String user = "J";
    String pw = "password";
    String checkUser, checkPw;

    LoginUtils loginUtils = new LoginUtils();

    public Scene getScene(Stage primaryStage) {
        BorderPane bp = new BorderPane();
        bp.setPadding(new Insets(10,50,50,50));

        //Adding HBox
        HBox hb = new HBox();
        hb.setPadding(new Insets(20,20,20,30));

        //Adding GridPane
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20,20,20,20));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        //Implementing Nodes for GridPane
        Label lblUserName = new Label("מספר אישי");
        final TextField txtUserName = new TextField();
        Label lblPassword = new Label("סיסמא");
        final PasswordField pf = new PasswordField();
        Button btnLogin = new Button("התחברות");
        final Label lblMessage = new Label();

        gridPane.add(lblUserName, 2, 0);
        GridPane.setHalignment(lblUserName, HPos.RIGHT);
        gridPane.add(txtUserName, 1, 0);
        gridPane.add(btnLogin, 2, 3);
        gridPane.add(lblPassword, 2, 2);
        gridPane.add(pf, 1,2);
        gridPane.add(lblMessage, 2, 4);

        Text text = new Text("מערכת תורנויות-\nאחראי תורנויות");
        text.setFill(Color.WHITE);
        text.setFont(Font.font("Tahoma", FontWeight.BOLD, 28));

        hb.getChildren().add(text);

        bp.setId("bp");
        lblUserName.setId("usrName");
        gridPane.setId("root");
        btnLogin.setId("btnLogin");
        txtUserName.setId("txtField");
        pf.setId("txtPassword");
        lblPassword.setId("password");
        text.setId("text");

        btnLogin.setOnAction((EventHandler) event -> {
            checkUser = txtUserName.getText().toString();
            checkPw = pf.getText().toString();
            if(checkUser.equals(user)){
                lblMessage.setText("Congratulations!");
                lblMessage.setTextFill(Color.GREEN);
                User.getInstacne().setPersonalNumber(checkUser);
                User.getInstacne().setAdmin(true);
                loginUtils.moveToHomePage(primaryStage);
            }
            else{
                lblMessage.setText("Incorrect user or pw.");
                lblMessage.setTextFill(Color.RED);
            }
            txtUserName.setText("");
        });

        bp.setTop(hb);
        bp.setCenter(gridPane);

        Scene scene = new Scene(bp);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("login.css").toExternalForm());
        return scene;
    }
}