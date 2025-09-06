/**
 * Module 6 Assignment
 * Daniel Graham
 * 09/06/2025
 */

public class Fan {

    // Step 1: Define constants (public so others can use them)
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Step 2: Private fields (data hiding)
    private int speed;      // holds speed value (0–3)
    private boolean on;     // true = fan is on, false = fan is off
    private double radius;  // radius of the fan
    private String color;   // color of the fan

    // Step 3: No-argument constructor (sets default values)
    public Fan() {
        this.speed = STOPPED;   // default speed
        this.on = false;        // default is off
        this.radius = 6;        // default radius
        this.color = "white";   // default color
    }

    // Step 4: Constructor with arguments (lets user choose values)
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Step 5: Getters and Setters for each field
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Step 6: toString method to describe fan's state
    @Override
    public String toString() {
        String state;
        if (on) {
            state = "Fan is ON | Speed: " + speed + " | Radius: " + radius + " | Color: " + color;
        } else {
            state = "Fan is OFF | Radius: " + radius + " | Color: " + color;
        }
        return state;
    }

    // Step 7: Test the Fan class
    public static void main(String[] args) {
        // Fan using default constructor
        Fan defaultFan = new Fan();
        System.out.println("Default Fan: " + defaultFan);

        // Fan using argument constructor
        Fan customFan = new Fan(Fan.FAST, true, 10, "blue");
        System.out.println("Custom Fan: " + customFan);

        // Show changing values with setters
        defaultFan.setOn(true);
        defaultFan.setSpeed(Fan.MEDIUM);
        defaultFan.setRadius(8);
        defaultFan.setColor("black");

        System.out.println("Updated Default Fan: " + defaultFan);
    }
}
