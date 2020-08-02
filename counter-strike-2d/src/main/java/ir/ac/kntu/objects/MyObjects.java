package ir.ac.kntu.objects;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MyObjects {
    private javafx.scene.shape.Rectangle shape;
    private double x;
    private double y;
    private double width;
    private double length;
    private Color color;
    private boolean shotPass;

    public MyObjects(double x, double y, double width, double length, Color color, boolean shotPass){
        this.x = x;
        this.y = y;
        this.width = width;
        this.length = length;
        this.color = color;
        this.shotPass = shotPass;
        shape = new javafx.scene.shape.Rectangle(x,y,width,length);
        shape.setFill(color);
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

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public Rectangle getShape(){
        return shape;
    }

    public void setShape(Rectangle shape){
        this.shape = shape;
    }

    public boolean isShotPass(){
        return shotPass;
    }

    public void setShotPass(boolean shotPass){
        this.shotPass = shotPass;
    }
}
