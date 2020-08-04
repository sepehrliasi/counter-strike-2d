package ir.ac.kntu.weapon;

public class Gun {
    private String name;
    private int price;
    private int damage;
    private int MFA;
    private double STR;
    private int magazineCapacity;

    public Gun(String name, int price, int damage, int MFA, double STR, int magazineCapacity){
        this.name = name;
        this.price = price;
        this.damage = damage;
        this.MFA = MFA;
        this.STR = STR;
        this.magazineCapacity = magazineCapacity;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public int getDamage(){
        return damage;
    }

    public int getMFA(){
        return MFA;
    }

    public double getSTR(){
        return STR;
    }

    public int getMagazineCapacity(){
        return magazineCapacity;
    }
}
