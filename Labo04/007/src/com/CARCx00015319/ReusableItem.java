package com.CARCx00015319;

class ReusableItem extends Item {
    protected int remainingUses;

    public ReusableItem(int remainingUses){
        this.remainingUses = remainingUses;
    }

    public ReusableItem(String name, int weight, String description, int remainingUses) {
        super(name, weight, description);
        this.remainingUses = remainingUses;
    }

    public void reduceUse(){

    }

    public boolean use(){

        return false;
    }


}

