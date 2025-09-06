/*
    Daniel Graham
    Module 4 Assignment - Arrays and Overloaded Methods
    Date: 08/30/2025
*/

public class AverageTest {

    // Method for short array
    public static short average(short[] array) {
        int sum = 0; 
        for (short num : array) {
            sum += num;
        }
        return (short)(sum / array.length);
    }

    // Method for int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method for long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method for double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Test program
    public static void main(String[] args) {
        short[] shortArray = {2, 4, 6};
        int[] intArray = {10, 20, 30, 40};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5};

        System.out.print("Short array: ");
        for (short num : shortArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage: " + average(shortArray));

        System.out.print("\nInt array: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage: " + average(intArray));

        System.out.print("\nLong array: ");
        for (long num : longArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage: " + average(longArray));

        System.out.print("\nDouble array: ");
        for (double num : doubleArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage: " + average(doubleArray));
    }
}