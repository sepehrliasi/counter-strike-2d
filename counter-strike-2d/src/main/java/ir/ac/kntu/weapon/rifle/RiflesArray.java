package ir.ac.kntu.weapon.rifle;

import java.util.ArrayList;

public class RiflesArray {
    ArrayList<Rifle> rifles = new ArrayList<>();

    public ArrayList<Rifle> getRifles(){
        return rifles;
    }

    public RiflesArray(){
        rifles.add(new MP5());
        rifles.add(new AK47());
        rifles.add(new Galil());
        rifles.add(new Famas());
        rifles.add(new P90());
        rifles.add(new M4A1());
    }
}
