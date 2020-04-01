package screens;

import javafx.scene.layout.BorderPane;

import java.io.IOException;

import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBasicCloseTransition;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ResizableBorderPane extends BorderPane {
    @FXML
    private BorderPane root;

    @FXML
    private AnchorPane topAnchor;

    @FXML
    private AnchorPane rightAnchor;

    @FXML
    private AnchorPane centerAnchor;

    @FXML
    private AnchorPane leftAnchor;

    @FXML
    private AnchorPane bottomAnchor;

    @FXML
    private JFXHamburger hamburger;

    private Stage stage;

    public ResizableBorderPane(){

        try {
            FXMLLoader loader = new FXMLLoader(getClass()
                    .getResource("/fxml/home.fxml"));
            loader.setController(this);
            loader.setRoot(this);
            loader.load();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize() {
//       pAnchor.setPrefHeight( rightAnchor.setPrefWidth(200);
//        rightAnchor.setTranslateX(-150);
//        setMargin(rightAnchor, new Insets(0, 0, 0, rightAnchor.translateXProperty().doubleValue()));
//
//        to50);
//        bottomAnchor.setPrefHeight(50);
//        leftAnchor.setPrefWidth(50);
//
//        final TranslateTransition translateLeftAnchor =
//                new TranslateTransition(Duration.millis(500), rightAnchor);
//
//        HamburgerBasicCloseTransition burgerTask = new HamburgerBasicCloseTransition(hamburger);
//        burgerTask.setRate(-1);
//
//        hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED,(e)->{
//
//            if (burgerTask.getRate() == -1){
//                burgerTask.setRate(burgerTask.getRate()*-1);
//                burgerTask.play();
//
//                translateLeftAnchor.setFromX(0);
//                translateLeftAnchor.setToX(100 + 50);
//
//                translateLeftAnchor.play();
//
//            } else {
//
//                burgerTask.setRate(burgerTask.getRate()*-1);
//                burgerTask.play();
//
//                translateLeftAnchor.setFromX(100 + 50);
//                translateLeftAnchor.setToX(0);
//
//                translateLeftAnchor.play();
//            }
//        });
//
//        rightAnchor.translateXProperty().addListener(e -> {
//          //  setMargin(rightAnchor, new Insets(0, rightAnchor.translateXProperty().doubleValue(), 0, 0));
//        });
    }

    // =========== GETTERS AND SETTERS ===========

    public Stage getStage(){
        return (Stage) root.getScene().getWindow();
    }

    public BorderPane getRoot() {
        return root;
    }

    public AnchorPane getTopAnchor() {
        return topAnchor;
    }

    public AnchorPane getRightAnchor() {
        return rightAnchor;
    }

    public AnchorPane getCenterAnchor() {
        return centerAnchor;
    }

    public AnchorPane getLeftAnchor() {
        return leftAnchor;
    }

    public AnchorPane getBottomAnchor() {
        return bottomAnchor;
    }
}
