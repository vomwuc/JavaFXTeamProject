package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        final double APPLICATION_SCALE = 5/6.0;

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/addMission.fxml"));
        primaryStage.setTitle("Roster");
        primaryStage.setScene(new Scene(root,
                Screen.getPrimary().getBounds().getWidth() * APPLICATION_SCALE ,
                Screen.getPrimary().getBounds().getHeight() * APPLICATION_SCALE,
                Color.grayRgb(25)));
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
