package ir.ac.kntu.map;

import ir.ac.kntu.objects.BrownBox;
import ir.ac.kntu.objects.CreamWall;
import ir.ac.kntu.objects.GreyBox;
import ir.ac.kntu.objects.OrangeWall;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;

public class CreateMap extends Application {
    ArrayList<CreamWall> creamWalls = new ArrayList<>();
    ArrayList<GreyBox> greyBoxes = new ArrayList<>();
    ArrayList<OrangeWall> orangeWalls = new ArrayList<>();
    ArrayList<BrownBox> brownBoxes = new ArrayList<>();
    public CreateMap(){
        CreamWall creamWall = new CreamWall(0,0,8,500);
        creamWalls.add(creamWall);
        CreamWall creamWall1 = new CreamWall(0,0,800,8);
        creamWalls.add(creamWall1);
        CreamWall creamWall2 = new CreamWall(0,492,800,8);
        creamWalls.add(creamWall2);
        CreamWall creamWall3 = new CreamWall(792,0,8,500);
        creamWalls.add(creamWall3);
    }

    @Override
    public void start(Stage stage) throws Exception{
        Pane pane = new Pane();
        Scene scene = new Scene(pane,800,500);
        stage.setScene(scene);
        stage.setTitle("CS-2D");
        stage.setResizable(false);
        stage.show();

        Rectangle[] creamrects = new Rectangle[creamWalls.size()];
        for (int i = 0; i < creamWalls.size();i++){
            creamrects[i] = creamWalls.get(i).getShape();
            pane.getChildren().add(creamrects[i]);
        }
    }
}
