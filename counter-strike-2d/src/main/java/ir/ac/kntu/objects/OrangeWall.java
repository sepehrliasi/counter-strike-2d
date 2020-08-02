package ir.ac.kntu.objects;

import java.io.Serializable;

public class OrangeWall extends MyObjects implements Serializable {
    public OrangeWall(double x, double y, double width, double length){
        super(x, y, width, length, true, "./src/main/java/resources/map/wall1.jpg");
    }
}
