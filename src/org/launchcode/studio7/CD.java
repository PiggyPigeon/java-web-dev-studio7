package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {
    public CD(String name, Integer capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    @Override
    public void spin() {
        System.out.print("wow, look at that CD gooooo!\n");
    }

    @Override
    public void storeData() {
        System.out.print("wow, look at that CD store!\n");
    }

    @Override
    public void returnData() {
        System.out.println("boop boop boop");
    }


    @Override
    public void writeData() {
        System.out.println("whrr whrr whrr");
    }

    @Override
    public void readData() {
        System.out.println("zzzz zzzzz");
    }


}
