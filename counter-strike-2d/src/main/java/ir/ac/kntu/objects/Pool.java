package ir.ac.kntu.objects;

import java.io.Serializable;

public class Pool extends MyObjects implements Serializable {
    public Pool(double x, double y, double radius){
        super(x, y, radius, true, "./src/main/java/resources/map/pool2.jpg");
    }
}
