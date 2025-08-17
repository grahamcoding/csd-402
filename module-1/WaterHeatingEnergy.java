/*
 * Daniel Graham
 * CSD402-H307 Java for Programmers
 * 8/17/2025
 */

import java.util.Scanner;

public class WaterHeatingEnergy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for inputs
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature (°C): ");
        double initialTemp = input.nextDouble();

        System.out.print("Enter the final temperature (°C): ");
        double finalTemp = input.nextDouble();

        // Calculate energy needed
        double Q = waterMass * (finalTemp - initialTemp) * 4184;

        // Display result
        System.out.println("The energy needed is " + Q + " Joules.");

        input.close();
    }
}
