/**
 * Module 7 Assignment (UseFans)
 * Daniel Graham
 * 09/13/2025
 */

 import java.util.ArrayList;

 public class UseFans {
 
     // method to display one fan
     public static void showFan(Fan f) {
         System.out.print("Fan - ");
         if (f.isOn()) {
             System.out.println("ON, Speed: " + f.getSpeed() +
                                ", Radius: " + f.getRadius() +
                                ", Color: " + f.getColor());
         } else {
             System.out.println("OFF, Radius: " + f.getRadius() +
                                ", Color: " + f.getColor());
         }
     }
 
     // method to display all fans
     public static void showAllFans(ArrayList<Fan> fans) {
         for (int i = 0; i < fans.size(); i++) {
             System.out.print("Fan #" + (i + 1) + ": ");
             showFan(fans.get(i));
         }
     }
 
     // test code
     public static void main(String[] args) {
         ArrayList<Fan> myFans = new ArrayList<>();
 
         // add some fans
         myFans.add(new Fan());  // default
         myFans.add(new Fan(Fan.FAST, true, 10, "blue"));
         myFans.add(new Fan(Fan.SLOW, true, 8, "red"));
 
         // show all fans
         showAllFans(myFans);
 
         // show one fan directly
         System.out.println("\nShowing just one Fan, Fan #2:");
         showFan(myFans.get(1));
     }
 }
 