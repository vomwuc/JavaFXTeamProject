package Utils;

import javafx.fxml.FXMLLoader;
import javafx.geometry.NodeOrientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class LoginUtils {
    Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    double width = screenSize.getWidth();
    double height = screenSize.getHeight();

    final double APPLICATION_SCALE = 5/6.0;

    public void moveToHomePage(Stage primaryStage) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/fxml/home.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
//        primaryStage.setTitle("Missions");

        primaryStage.setScene(new Scene(root,
                width,
                height,
                Color.grayRgb(25)));
        primaryStage.setX(0);
        primaryStage.setY(0);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
