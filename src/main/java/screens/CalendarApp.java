package screens;

import com.calendarfx.model.Calendar;
import com.calendarfx.model.CalendarSource;
import com.calendarfx.model.Entry;
import com.calendarfx.view.CalendarView;
import com.calendarfx.view.DateControl;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.LocalTime;

import static java.util.Objects.requireNonNull;

public class CalendarApp extends Application {


    /**
     * TO_SHAKED_STUDY: there are two ways to add the calender, one option is by adding it with annotation to FXML
     * And the other option is to add it with setChildren
     */
    @FXML
    AnchorPane anchorPaneOne;

    private Calendar mission;

    @Override
    public void start(Stage stage) throws Exception {
        final double APPLICATION_SCALE = 5/6.0;

        //Change this motherfucker page
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/calenderApp.fxml"));

        //I need to get to know with the way controller work
//        loader.setController(CalenderController.class);
        Parent root = loader.load();
        stage.setTitle("Roster");
        stage.setScene(new Scene(root,
                Screen.getPrimary().getBounds().getWidth() * APPLICATION_SCALE ,
                Screen.getPrimary().getBounds().getHeight() * APPLICATION_SCALE,
                Color.grayRgb(25)));
        stage.show();

        // now the field is instantiated and can be accessed without NPE
//        anchorPaneOne.getChildren().add(getPanel());

        ((AnchorPane) root).getChildren().add(getPanel());
    }

    public static void main(String[] args) {
        launch(args);
    }


    public void addMissionFullDays(LocalDate startDate, LocalDate endDate, String soldierName, String missionName){
        Entry<String> apointment = new Entry<>();
        apointment.setTitle(soldierName);
        apointment.setLocation(missionName);
        apointment.setInterval(startDate, endDate);
        mission.addEntry(apointment);

    }

    public void addMission(LocalDate startDate, LocalDate endDate, LocalTime startTime, LocalTime endTime, String soldierName, String missionName){
        Entry<String> apointment = new Entry<>();
        apointment.setTitle(soldierName);
        apointment.setLocation(missionName);
        apointment.setInterval(startDate, startTime, endDate, endTime);
        mission.addEntry(apointment);

    }

    private Node getPanel() {
        Node control = createCalender();
        requireNonNull(control, "missing date control");
        return wrap(control);
    }

    private Node wrap(Node node) {
        StackPane stackPane = new StackPane();
        stackPane.setStyle("-fx-background-color:  #2C344B; -fx-border-color:  #2C344B;");
        stackPane.getChildren().add(node);

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.setFillHeight(true);
        box.getChildren().add(stackPane);

        return box;
    }


    private DateControl createCalender(){
        CalendarView calendarView = new CalendarView();

        mission = new Calendar("mission");

        mission.setStyle(Calendar.Style.STYLE3);
        mission.setReadOnly(true);

        CalendarSource myCalendarSource = new CalendarSource("My Calendars");

        myCalendarSource.getCalendars().addAll(mission);
        calendarView.getCalendarSources().addAll(myCalendarSource);
//        calendarView.setDefaultCalendarProvider();

        calendarView.setRequestedTime(LocalTime.now());
//        calendarView.setShowAddCalendarButton(false);
//        calendarView.setShowPageToolBarControls(false);
//        calendarView.setShowSearchField(false);
//        calendarView.setShowPrintButton(false);
//        calendarView.setShowAddCalendarButton(false);
        calendarView.setShowToolBar(false);
        calendarView.showMonthPage();

        Thread updateTimeThread = new Thread("Calendar: Update Time Thread") {
            @Override
            public void run() {
                while (true) {
                    Platform.runLater(() -> {
                        calendarView.setToday(LocalDate.now());
                        calendarView.setTime(LocalTime.now());
                    });

                    try {
                        // update every 10 seconds
                        sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            };
        };

        updateTimeThread.setPriority(Thread.MIN_PRIORITY);
        updateTimeThread.setDaemon(true);
        updateTimeThread.start();
        return calendarView;
    }


}
