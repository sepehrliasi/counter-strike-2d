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

import java.io.*;
import java.net.MalformedURLException;
import java.util.ArrayList;

public class ReadMap extends Application {
    ArrayList<CreamWall> creamWalls = new ArrayList<>();
    ArrayList<GreyBox> greyBoxes = new ArrayList<>();
    ArrayList<OrangeWall> orangeWalls = new ArrayList<>();
    ArrayList<BrownBox> brownBoxes = new ArrayList<>();
    ArrayList<Pool> pools = new ArrayList<>();
    private Scene mapScene;

    public void Read(){
        CreateMap createMap = new CreateMap();
        createMap.createFile();
        try {
            FileInputStream fileInputStream = new FileInputStream("./src/main/java/resources/map/cream.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            creamWalls = (ArrayList<CreamWall>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream("./src/main/java/resources/map/grey.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            greyBoxes = (ArrayList<GreyBox>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream("./src/main/java/resources/map/orange.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            orangeWalls = (ArrayList<OrangeWall>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream("./src/main/java/resources/map/brown.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            brownBoxes = (ArrayList<BrownBox>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream("./src/main/java/resources/map/pool.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            pools = (ArrayList<Pool>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (GreyBox greyBox : greyBoxes) {
            greyBox.setShape();
        }
        for (OrangeWall orangeWall : orangeWalls) {
            orangeWall.setShape();
        }
        for (BrownBox brownBox : brownBoxes) {
            brownBox.setShape();
        }
        for (CreamWall creamWall : creamWalls) {
            creamWall.setShape();
        }
        for (Pool pool : pools) {
            pool.setPool();
        }
    }

    @Override
    public void start(Stage stage) throws Exception{
        Read();
        Pane pane = new Pane();
        mapScene = new Scene(pane,800,500);
        stage.setScene(mapScene);
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

        Circle[] poolCir = new Circle[pools.size()];
        for (int i = 0; i < pools.size();i++){
            poolCir[i] = pools.get(i).getPool();
            pane.getChildren().add(poolCir[i]);
        }
    }

    public Scene getMapScene(){
        return mapScene;
    }
}
