package ir.ac.kntu;
import javafx.scene.paint.Color;

public class Wall {
    private int x;
    private int y;
    private int speed;
    private Color color;

    public Wall(int x, int y, int speed,Color color){
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.color = color;
    }

    public int getY(){
        return y;
    }

    public int getSpeed(){
        return speed;
    }

    public Color getColor(){
        return color;
    }
}
