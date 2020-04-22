package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        final double APPLICATION_SCALE = 5/6.0;

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/userScreens/addConstraint.fxml"));
        primaryStage.setTitle("Missions");
        primaryStage.setScene(new Scene(root,
                Screen.getPrimary().getBounds().getWidth() * APPLICATION_SCALE ,
                Screen.getPrimary().getBounds().getHeight() * APPLICATION_SCALE,
                Color.grayRgb(25)));
        primaryStage.show();

        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8500/user"))
                .POST(HttpRequest.BodyPublishers.ofString(""))
//                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());


    }


    public static void main(String[] args) {
        launch(args);
    }
}
