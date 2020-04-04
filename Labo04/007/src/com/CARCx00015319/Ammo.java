package com.CARCx00015319;

public class Ammo extends ReusableItem {

    private boolean equiped;


    public Ammo(int remainingUses, boolean equiped) {
        super(remainingUses);
        this.equiped = equiped;
    }

    public Ammo(String name, int weight, String description, int remainingUses, boolean equiped) {
        super(name, weight, description, remainingUses);
        this.equiped = equiped;
    }



    public void equiped(){

    }

}
