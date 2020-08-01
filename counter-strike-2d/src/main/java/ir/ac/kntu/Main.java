package ir.ac.kntu;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author Sepehr Ghaseminejad
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        Group root = new Group();
        Scene scene = new Scene(root, 800, 500, Color.WHEAT);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Pong");
        primaryStage.setResizable(false);
        primaryStage.show();

        int scoreA = 0;
        Text text1 = new Text("Player A: " + scoreA);
        text1.setX(220);
        text1.setY(15);
        text1.setFont(new Font(15));
        text1.setStroke(Color.BURLYWOOD);
        text1.setFill(Color.BURLYWOOD);
        Text textA = new Text("Use space to change your wall");
        textA.setX(0);
        textA.setY(15);
        textA.setFont(new Font(15));
        textA.setFill(Color.CYAN);
        textA.setStroke(Color.CYAN);
        final int[] scoreB = {0};
        Text text2 = new Text("Player B: " + scoreB[0]);
        text2.setX(500);
        text2.setY(15);
        text2.setFont(new Font(15));
        text2.setStroke(Color.BURLYWOOD);
        text2.setFill(Color.BURLYWOOD);
        Text textB = new Text("Use shift to change your wall");
        textB.setX(600);
        textB.setY(15);
        textB.setFont(new Font(15));
        textB.setStroke(Color.CYAN);
        textB.setFill(Color.CYAN);
        Line line1 = new Line(0,20,800,20);
        line1.setStroke(Color.WHITE);
        Line line2 = new Line(400,20,400,500);
        line2.setStroke(Color.WHITE);
        Line line3 = new Line(0,500,800,500);
        line3.setStroke(Color.WHITE);
        Circle circle1 = new Circle(50,Color.WHITE);
        circle1.setCenterX(400);
        circle1.setCenterY(260);
        Rectangle rectangleA = new Rectangle(10,50,Color.YELLOW);
        rectangleA.setX(0);
        rectangleA.setY(230);
        Rectangle rectangleB = new Rectangle(10,50,Color.YELLOW);
        rectangleB.setX(790);
        rectangleB.setY(230);
        Circle ball = new Circle(10,Ball.RED.getColor());
        if(Math.random() < 0.5) {
            ball.setFill(Ball.PURPLE.getColor());
        }
        ball.setCenterX(400);
        ball.setCenterY(260);
        final int[] t = {0};
        final Wall[] wallA = {new YellowWall()};
        final Wall[] wallB = {new YellowWall()};

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent){
                YellowWall yellowWall = new YellowWall();
                BlueWall blueWall = new BlueWall();
                if(keyEvent.getCode() == KeyCode.S){
                    if(rectangleA.getY() < 450) {
                        rectangleA.setY(rectangleA.getY() + wallA[0].getSpeed());
                    }
                }else if(keyEvent.getCode() == KeyCode.W){
                    if(rectangleA.getY() > 20) {
                        rectangleA.setY(rectangleA.getY() - wallA[0].getSpeed());
                    }
                }
                if(keyEvent.getCode() == KeyCode.DOWN){
                    if(rectangleB.getY() < 450) {
                        rectangleB.setY(rectangleB.getY() + wallB[0].getSpeed());
                    }
                }else if(keyEvent.getCode() == KeyCode.UP){
                    if(rectangleB.getY() > 20) {
                        rectangleB.setY(rectangleB.getY() - wallB[0].getSpeed());
                    }
                }else if(keyEvent.getCode() == KeyCode.SPACE){
                    if(wallA[0].getColor() == Color.YELLOW){
                        wallA[0] = blueWall;
                    }else{
                        wallA[0] = yellowWall;
                    }
                    rectangleA.setHeight(wallA[0].getY());
                    rectangleA.setFill(wallA[0].getColor());
                }else if(keyEvent.getCode() == KeyCode.SHIFT){
                    if(wallB[0].getColor() == Color.YELLOW){
                        wallB[0] = blueWall;
                    }else{
                        wallB[0] = yellowWall;
                    }
                    rectangleB.setHeight(wallB[0].getY());
                    rectangleB.setFill(wallB[0].getColor());
                }
            }
        });

        int k;
        if(ball.getFill() == Color.RED){
            k = Ball.RED.getvX();
        }else{
            k = Ball.PURPLE.getvX();
        }
        new AnimationTimer() {
            private int valueX = k;
            private int valueY = 3;
            private boolean goal = false;
            private int sA = 0;
            private  int sB = 0;

            @Override
            public void handle(long l) {
                if (ball.getCenterY() > 20 && ball.getCenterY() < 490) {
                    if(ball.getCenterX() < 10){
                        if(rectangleA.getY() > ball.getCenterY() || rectangleA.getY() + rectangleA.getHeight() < ball.getCenterY()){
                            goal = true;
                            sB += 1;
                            text2.setText("Player B: " + sB);
                        }else{
                            valueX *= -1;
                        }
                    }else if(ball.getCenterX() > 790){
                        if(rectangleB.getY() > ball.getCenterY() || rectangleB.getY() + rectangleB.getHeight() < ball.getCenterY()){
                            goal = true;
                            sA += 1;
                            text1.setText("Player A: " + sA);
                        }else{
                            valueX *= -1;
                        }
                    }
                }else{
                    valueY *= -1;
                }
                if(goal){
                    ball.setCenterY(260);
                    ball.setCenterX(400);
                    valueX *= -1;
                }else {
                    ball.setCenterY(ball.getCenterY() + valueY);
                    ball.setCenterX(ball.getCenterX() + valueX);
                }
                goal = false;
                scene.setFill(Color.rgb(57,125,10));
            }
        }.start();

        root.getChildren().add(text1);
        root.getChildren().add(text2);
        root.getChildren().add(textA);
        root.getChildren().add(textB);
        root.getChildren().add(rectangleA);
        root.getChildren().add(rectangleB);
        root.getChildren().add(line1);
        root.getChildren().add(line2);
        root.getChildren().add(line3);
        root.getChildren().add(circle1);
        root.getChildren().add(ball);

    }

    @Override
    public void init() {
        System.out.println("Initializing...");
    }

    @Override
    public void stop() {
        System.out.println("Closing....");
    }

    public static void main(String[] args) {
        launch(args);
    }
}