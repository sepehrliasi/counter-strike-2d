package ir.ac.kntu.objects;

import java.io.Serializable;

public class GreyBox extends MyObjects implements Serializable {
    public GreyBox(double x, double y, double width, double length){
        super(x, y, width, length, true, "./src/main/java/resources/map/greybox.png");
    }
}
