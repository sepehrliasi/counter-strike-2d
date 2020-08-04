package ir.ac.kntu.graphic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main1 extends Application {
    @Override
    public void start(Stage stage) throws Exception{
        Pane pane = new Pane();
        Scene scene = new Scene(pane,800,500);
        stage.setScene(scene);
        stage.setTitle("CS-2D");
        stage.setResizable(false);
        stage.show();

        Rectangle rectangle = new Rectangle(0,0,4,500);
        pane.getChildren().add(rectangle);
    }
}
