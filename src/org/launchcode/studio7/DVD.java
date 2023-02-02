package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {


    public DVD(String name, Integer capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    @Override
    public void spin() {
        System.out.print("wow, look at that DVD gooooo!\n");
    }

    @Override
    public void storeData() {
        System.out.print("wow, look at that DVD store!\n");
    }

    @Override
    public void returnData() {
        System.out.println("beep beep beep");
    }


    @Override
    public void writeData() {
        System.out.println("vrr vrr vrr");
    }

    @Override
    public void readData() {
        System.out.println("bzz bzz");
    }


}
