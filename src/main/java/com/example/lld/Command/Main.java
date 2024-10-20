package com.example.lld.Command;

public class Main {
//    public static void main(String[] args) {
//        Sterio sterio = new Sterio();
//        TV tv = new TV();
//
//        TurnOn turnOn = new TurnOn(tv);
//        TurnOff turnOff = new TurnOff(tv);
//        TurnOff turnOffStreo = new TurnOff(sterio);
//        VolumeAdjusted volumeAdjusted = new VolumeAdjusted(sterio);
//        ChannelChanged channelChanged = new ChannelChanged(tv);
//
//        Invoker invoker = new Invoker();
//
//        invoker.setCommandInterface(turnOff);
//        invoker.pressButton();
//
//        invoker.setCommandInterface(volumeAdjusted);
//        invoker.pressButton();
//
//        invoker.setCommandInterface(turnOffStreo);
//        invoker.pressButton();
//    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,4,3,2};
        int n = arr.length;
        for(int i=1;i<n-1;i++){
            if(arr[i-1]<=arr[i] && arr[i]>=arr[i+1]){
                System.out.println(i);
                break;
            }
        }
    }
}
