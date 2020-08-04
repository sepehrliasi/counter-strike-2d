package ir.ac.kntu.objects.area;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Spawn {
    private Rectangle area = null;
    private double x;
    private double y;
    private double width;
    private double length;
    private Color color;

    public Spawn(double x, double y, double width, double length, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.length = length;
        this.color = color;
        area = new Rectangle(x,y,width,length);
        area.setFill(color);
    }

    public Rectangle getArea(){
        return area;
    }

    public void setArea(Rectangle area){
        this.area = area;
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
}
