package ir.ac.kntu.map;

import ir.ac.kntu.objects.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.File;
import java.net.MalformedURLException;
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
        CreamWall creamWall4 = new CreamWall(396,0,8,200);
        creamWalls.add(creamWall4);
        CreamWall creamWall5 = new CreamWall(396,400,8,100);
        creamWalls.add(creamWall5);
        CreamWall creamWall6 = new CreamWall(100,0,8,90);
        creamWalls.add(creamWall6);
        CreamWall creamWall7 = new CreamWall(100,82,50,8);
        creamWalls.add(creamWall7);
        CreamWall creamWall8 = new CreamWall(190,82,60,8);
        creamWalls.add(creamWall8);
        CreamWall creamWall9 = new CreamWall(250,40,8,50);
        creamWalls.add(creamWall9);
        CreamWall creamWall10 = new CreamWall(8,150,60,150);
        creamWalls.add(creamWall10);
        CreamWall creamWall11 = new CreamWall(100,150,8,180);
        creamWalls.add(creamWall11);
        CreamWall creamWall12 = new CreamWall(100,150,50,8);
        creamWalls.add(creamWall12);
        CreamWall creamWall13 = new CreamWall(200,150,150,8);
        creamWalls.add(creamWall13);
        CreamWall creamWall14 = new CreamWall(50,330,90,8);
        creamWalls.add(creamWall14);
        CreamWall creamWall15 = new CreamWall(50,330,8,100);
        creamWalls.add(creamWall15);
        CreamWall creamWall16 = new CreamWall(58,380,60,8);
        creamWalls.add(creamWall16);
        CreamWall creamWall17 = new CreamWall(190,380,120,8);
        creamWalls.add(creamWall17);
        CreamWall creamWall18 = new CreamWall(700,150,8,210);
        creamWalls.add(creamWall18);
        CreamWall creamWall19 = new CreamWall(310,240,8,148);
        creamWalls.add(creamWall19);
        CreamWall creamWall20 = new CreamWall(490,0,8,80);
        creamWalls.add(creamWall20);
        CreamWall creamWall21 = new CreamWall(450,72,40,8);
        creamWalls.add(creamWall21);
        CreamWall creamWall22 = new CreamWall(500,280,150,8);
        creamWalls.add(creamWall22);
        CreamWall creamWall23 = new CreamWall(700,0,8,90);
        creamWalls.add(creamWall23);
        CreamWall creamWall24 = new CreamWall(630,82,80,8);
        creamWalls.add(creamWall24);

        OrangeWall orangeWall = new OrangeWall(150,150,50,8);
        orangeWalls.add(orangeWall);
        OrangeWall orangeWall1 = new OrangeWall(318,280,100,8);
        orangeWalls.add(orangeWall1);

        BrownBox brownBox = new BrownBox(200,440,30,30);
        brownBoxes.add(brownBox);
        BrownBox brownBox1 = new BrownBox(430,320,30,30);
        brownBoxes.add(brownBox1);
        BrownBox brownBox2 = new BrownBox(600,430,62,62);
        brownBoxes.add(brownBox2);
        BrownBox brownBox3 = new BrownBox(700,430,32,30);
        brownBoxes.add(brownBox3);
        BrownBox brownBox4 = new BrownBox(345,200,20,20);
        brownBoxes.add(brownBox4);

        GreyBox greyBox = new GreyBox(360,350,20,20);
        greyBoxes.add(greyBox);
        GreyBox greyBox1 = new GreyBox(700,460,32,32);
        greyBoxes.add(greyBox1);
        GreyBox greyBox2 = new GreyBox(300,50,20,20);
        greyBoxes.add(greyBox2);
    }

    @Override
    public void start(Stage stage) throws Exception{
        Pane pane = new Pane();
        Scene scene = new Scene(pane,800,500);
        stage.setScene(scene);
        stage.setTitle("CS-2D");
        stage.setResizable(false);
        stage.show();

        Rectangle grass = new Rectangle(0,0,800,500);
        Image image = null;
        try {
            image = new Image(new File("./src/main/java/resources/map/grass2.png").toURI().toURL().toExternalForm());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        grass.setFill(new ImagePattern(image));
        pane.getChildren().add(grass);
        Rectangle[] creamRects = new Rectangle[creamWalls.size()];
        for (int i = 0; i < creamWalls.size();i++){
            creamRects[i] = creamWalls.get(i).getShape();
            pane.getChildren().add(creamRects[i]);
        }

        Rectangle[] orangeRects = new Rectangle[orangeWalls.size()];
        for (int i = 0; i < orangeWalls.size();i++){
            orangeRects[i] = orangeWalls.get(i).getShape();
            pane.getChildren().add(orangeRects[i]);
        }

        Rectangle[] brownRects = new Rectangle[brownBoxes.size()];
        for (int i = 0; i < brownBoxes.size();i++){
            brownRects[i] = brownBoxes.get(i).getShape();
            pane.getChildren().add(brownRects[i]);
        }

        Rectangle[] greyRects = new Rectangle[greyBoxes.size()];
        for (int i = 0; i < greyBoxes.size();i++){
            greyRects[i] = greyBoxes.get(i).getShape();
            pane.getChildren().add(greyRects[i]);
        }

        Pool pool = new Pool(200,250,50);
        Circle circle = pool.getPool();
        pane.getChildren().add(circle);
        Pool pool1 = new Pool(550,180,50);
        Circle circle1 = pool1.getPool();
        pane.getChildren().add(circle1);
    }
}
