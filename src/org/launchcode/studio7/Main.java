package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
       CD newCD = new CD("Smashing Pumpkins", 16, "Today, Rat in a Cage, Landslide\n", "flat & shiny");
       DVD newDVD = new DVD("George of the Jungle", 64, "Watch out for that tree!\n", "flat and shiny");

       newDVD.spin();
       newCD.spin();
       newDVD.readData();
       newCD.readData();
       newDVD.returnData();
       newCD.returnData();
       newDVD.reportData();
       newCD.reportData();
       System.out.print(newDVD.contents);

        System.out.print(newCD.contents);





        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
