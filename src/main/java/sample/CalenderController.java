package sample;

import com.calendarfx.model.Calendar;
import com.calendarfx.model.CalendarSource;
import com.calendarfx.view.CalendarView;
import com.calendarfx.view.DateControl;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;

import static java.util.Objects.requireNonNull;

public class CalenderController {
//
//    @FXML
//    AnchorPane buttonBox;
//
//    @FXML
//    protected void initialize() {
//        buttonBox.getChildren().add(getPanel());
//    }
//
//
//
//    public Node getPanel() {
//        Node control = createCalender();
//        requireNonNull(control, "missing date control");
//        return wrap(control);
//    }
//
//    protected Node wrap(Node node) {
//        StackPane stackPane = new StackPane();
//        stackPane.setStyle("-fx-background-color: white; -fx-border-color: gray; -fx-border-width: .25px; -fx-padding: 20px;");
//        stackPane.getChildren().add(node);
//
//        HBox box = new HBox();
//        box.setAlignment(Pos.CENTER);
//        box.setFillHeight(false);
//        box.getChildren().add(stackPane);
//
//        return box;
//    }
//
//
//    public DateControl createCalender(){
//        CalendarView calendarView = new CalendarView();
//
//        Calendar mission = new Calendar("mission");
//
//        mission.setStyle(Calendar.Style.STYLE3);
//        mission.setReadOnly(true);
//
//        CalendarSource myCalendarSource = new CalendarSource("My Calendars");
//
//        myCalendarSource.getCalendars().addAll(mission);
//        calendarView.getCalendarSources().addAll(myCalendarSource);
//
//        calendarView.setRequestedTime(LocalTime.now());
////        calendarView.setShowAddCalendarButton(false);
////        calendarView.setShowPageToolBarControls(false);
////        calendarView.setShowSearchField(false);
////        calendarView.setShowPrintButton(false);
////        calendarView.setShowAddCalendarButton(false);
//        calendarView.setShowToolBar(false);
//        calendarView.showMonthPage();
//
//        Thread updateTimeThread = new Thread("Calendar: Update Time Thread") {
//            @Override
//            public void run() {
//                while (true) {
//                    Platform.runLater(() -> {
//                        calendarView.setToday(LocalDate.now());
//                        calendarView.setTime(LocalTime.now());
//                    });
//
//                    try {
//                        // update every 10 seconds
//                        sleep(10000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            };
//        };
//
//        updateTimeThread.setPriority(Thread.MIN_PRIORITY);
//        updateTimeThread.setDaemon(true);
//        updateTimeThread.start();
//        return calendarView;
//    }

}
