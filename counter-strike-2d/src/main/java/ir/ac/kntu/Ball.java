package ir.ac.kntu;

import javafx.scene.paint.Color;

public enum Ball {
    RED(4,Color.RED),PURPLE(6,Color.PURPLE);

    private int vX;
    private Color color;

    Ball(int vX, Color color){
        this.vX = vX;
        this.color = color;
    }

    public int getvX(){
        return vX;
    }

    public Color getColor(){
        return color;
    }
}
