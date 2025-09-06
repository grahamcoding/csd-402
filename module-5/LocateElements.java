/**
 * Module 5 Assignment
 * Daniel Graham
 * 09/06/2025
 */

 public class LocateElements {

    // Method to find the location of the largest element in a 2D double array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0}; // start with the first element
        double max = arrayParam[0][0]; 

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i; // row index
                    location[1] = j; // column index
                }
            }
        }
        return location;
    }

    // Method to find the location of the largest element in a 2D int array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to find the location of the smallest element in a 2D double array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to find the location of the smallest element in a 2D int array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Main method to test
    public static void main(String[] args) {
        // Example int array for testing
        int[][] intArray = {
            {3, 5, 7},
            {1, 9, 4},
            {8, 6, 2}
        };

        // Example double array for testing
        double[][] doubleArray = {
            {3.2, 5.5, 7.1},
            {1.9, 9.8, 4.3},
            {8.6, 6.7, 2.4}
        };

        // Test largest for int array
        int[] largestInt = locateLargest(intArray);
        System.out.println("Largest int at: row " + largestInt[0] + ", col " + largestInt[1]);

        // Test smallest for int array
        int[] smallestInt = locateSmallest(intArray);
        System.out.println("Smallest int at: row " + smallestInt[0] + ", col " + smallestInt[1]);

        // Test largest for double array
        int[] largestDouble = locateLargest(doubleArray);
        System.out.println("Largest double at: row " + largestDouble[0] + ", col " + largestDouble[1]);

        // Test smallest for double array
        int[] smallestDouble = locateSmallest(doubleArray);
        System.out.println("Smallest double at: row " + smallestDouble[0] + ", col " + smallestDouble[1]);
    }
}
