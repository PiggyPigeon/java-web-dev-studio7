package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD cd = new CD("CD Example", 700, "CD-R", 350);
        DVD dvd = new DVD("DVD Example", 4700, "DVD-R", 1450);

        cd.spinDisc();
        dvd.spinDisc();

        cd.readData();
        dvd.readData();


        System.out.println(cd.writeData(275));
        System.out.println(dvd.writeData(8000));

        System.out.println(cd.diskInfo());
        System.out.println(dvd.diskInfo());
    }

}

//experiment with:
//standard break points (then step into, step over, step out)
//conditional break points (for example, we want an accumulater to stop the program once a certain amount is reached
//exception breakpoints. When run normally and an exception is thrown, copy the error text, click 'view breakpoints', hit add "java exception breakpoint,
//... and paste the error text. now debugger will stop right before that error is thrown.

//adding a watch expression. In variables pane, right click and  hit "new watch", enter name of varaible, step through code until value shows whatever bug