package ir.ac.kntu.weapon.rifle;

import ir.ac.kntu.weapon.Gun;

public class Rifle extends Gun {
    ACCESSIBILITY accessibility;

    public Rifle(String name, int price, int damage, int MFA, double STR, int magazineCapacity, ACCESSIBILITY accessibility){
        super(name, price, damage, MFA, STR, magazineCapacity);
        this.accessibility = accessibility;
    }

    public ACCESSIBILITY getAccessibility(){
        return accessibility;
    }
}
