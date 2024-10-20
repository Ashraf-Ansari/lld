package com.example.lld.Command;

public class VolumeAdjusted implements CommandInterface{

    Sterio sterio;

    VolumeAdjusted(Sterio sterio){
        this.sterio=sterio;
    }

    @Override
    public void execute() {
        sterio.adjustVolume();
    }
}
