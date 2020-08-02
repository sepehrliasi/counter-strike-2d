package ir.ac.kntu.objects;

import java.io.Serializable;

public class BrownBox extends MyObjects implements Serializable {
    public BrownBox(double x, double y, double width, double length){
        super(x, y, width, length, false, "./src/main/java/resources/map/brownbox.png");
    }
}
