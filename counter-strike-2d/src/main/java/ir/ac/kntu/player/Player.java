package ir.ac.kntu.player;

import ir.ac.kntu.weapon.Gun;
import ir.ac.kntu.weapon.colt.Colt;
import ir.ac.kntu.weapon.colt.Glock;
import ir.ac.kntu.weapon.colt.USP;
import ir.ac.kntu.weapon.rifle.Rifle;
import javafx.scene.shape.Circle;

import java.util.Random;

public class Player {
    private Circle player = null;
    private double x;
    private double y;
    private String name;
    private int money = 800;
    private int heart = 100;
    private Colt colt;
    private Rifle rifle;
    private Gun currentGun;
    private TEAM team;
    private boolean armor = false;

    public Player(String name, TEAM team){
        this.name = name;
        this.team = team;
        if (team == TEAM.T) {
            colt = (Colt) new Glock();
        } else {
            colt = (Colt) new USP();
        }
        currentGun = colt;
        player = new Circle();
    }

    public void setMoney(int money){
        this.money = money;
    }

    public void setHeart(int change){
        heart += change;
    }

    public void setColt(Colt colt){
        this.colt = colt;
    }

    public void setRifle(Rifle rifle){
        this.rifle = rifle;
    }

    public void setCurrentGun(int input){
        switch (input) {
            case 2:
                currentGun = colt;
                break;
            case 3:
                currentGun = rifle;
                break;
        }
    }

    public void setArmor(boolean armor){
        if (money >= 1000) {
            this.armor = armor;
            heart += 80;
        } else {
            System.out.println("Not enough money");
        }
    }

    public String getName(){
        return name;
    }

    public int getMoney(){
        return money;
    }

    public int getHeart(){
        return heart;
    }

    public Colt getColt(){
        return colt;
    }

    public Rifle getRifle(){
        return rifle;
    }

    public Gun getCurrentGun(){
        return currentGun;
    }

    public TEAM getTeam(){
        return team;
    }
}