package com.CARCx00015319;

public class Elixir extends HealthItem {
    private int Amount;
    private int time;

    public Elixir(int reuseTime, String level, String type, int amount, int time) {
        super(reuseTime, level, type);
        Amount = amount;
        this.time = time;
    }

    public Elixir(String name, int weight, String description, int reuseTime, String level, String type, int amount, int time) {
        super(name, weight, description, reuseTime, level, type);
        Amount = amount;
        this.time = time;
    }

    public int getAmount() {
        return Amount;
    }

    public int getTime() {
        return time;
    }

    public void drink(){

    }

}