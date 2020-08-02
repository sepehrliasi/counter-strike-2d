package ir.ac.kntu.objects;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.io.File;
import java.io.Serializable;
import java.net.MalformedURLException;

public class MyObjects implements Serializable {
    private transient javafx.scene.shape.Rectangle shape = null;
    private transient Circle pool = null;
    private double x;
    private double y;
    private double width;
    private double length;
    private double radius;
    private boolean shotPass;
    private String path;

    public MyObjects(double x, double y, double width, double length, boolean shotPass, String path){
        this.x = x;
        this.y = y;
        this.width = width;
        this.length = length;
        this.shotPass = shotPass;
        this.path = path;
        Image image = null;
        try {
            image = new Image(new File(path).toURI().toURL().toExternalForm());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        shape = new javafx.scene.shape.Rectangle(x,y,width,length);
        shape.setFill(new ImagePattern(image));
    }

    public MyObjects(double x, double y, double radius, boolean shotPass, String path){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.shotPass = shotPass;
        this.path = path;
        Image image = null;
        try {
            image = new Image(new File(path).toURI().toURL().toExternalForm());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        pool = new Circle(x,y,radius);
        pool.setFill(new ImagePattern(image));
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public Rectangle getShape(){
        return shape;
    }

    public void setShape(){
        Image image = null;
        try {
            image = new Image(new File(path).toURI().toURL().toExternalForm());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        shape = new javafx.scene.shape.Rectangle(x,y,width,length);
        shape.setFill(new ImagePattern(image));
    }

    public boolean isShotPass(){
        return shotPass;
    }

    public void setShotPass(boolean shotPass){
        this.shotPass = shotPass;
    }

    public Circle getPool(){
        return pool;
    }

    public void setPool(){
        Image image = null;
        try {
            image = new Image(new File(path).toURI().toURL().toExternalForm());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        pool = new Circle(x,y,radius);
        pool.setFill(new ImagePattern(image));
    }
}
