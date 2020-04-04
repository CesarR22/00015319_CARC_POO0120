package com.CARCx00015319;

abstract class Item{
    protected int id;
    protected String name;
    protected int weight;
    protected String description;

    public Item(){
    }

    public Item(String name, int weight, String description){
        this.id = IdGenerator.newId();
        this.name = name;
        this.weight = weight;
        this.description = description;
    }


    public int getId() {
        return id;
    }
}