package com.CARCx00015319;

public class Weapon extends ReusableItem {
    private String type;
    private double speed;
    private double damage;
    private String wieldType;
    private int level;

    public Weapon(int remainingUses, String type, double speed, double damage, String wieldType, int level) {
        super(remainingUses);
        this.type = type;
        this.speed = speed;
        this.damage = damage;
        this.wieldType = wieldType;
        this.level = level;
    }

    public Weapon(String name, int weight, String description, int remainingUses, String type, double speed, double damage, String wieldType, String level) {
        super(name, weight, description, remainingUses);
        this.type = type;
        this.speed = speed;
        this.damage = damage;
        this.wieldType = wieldType;
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDamage() {
        return damage;
    }

    public String getWieldType() {
        return wieldType;
    }

    public int getLevel() {
        return level;
    }

    public void upgrade(){

    }

}
