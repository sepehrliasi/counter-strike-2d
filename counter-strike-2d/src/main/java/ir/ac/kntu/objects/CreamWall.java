package ir.ac.kntu.objects;

import java.io.Serializable;

public class CreamWall extends MyObjects implements Serializable {

    public CreamWall(double x, double y, double width, double length){
        super(x, y, width, length, false, "./src/main/java/resources/map/wall2.JPG");
    }
}
