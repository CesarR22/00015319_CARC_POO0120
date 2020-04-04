package com.CARCx00015319;

public class Potion extends HealthItem {
    private int Amount;

    public Potion(int reuseTime, String level, String type, int amount) {
        super(reuseTime, level, type);
        Amount = amount;
    }

    public Potion(String name, int weight, String description, int reuseTime, String level, String type, int amount) {
        super(name, weight, description, reuseTime, level, type);
        Amount = amount;
    }

    public int getAmount() {
        return Amount;
    }

    public void drink(){

    }

}