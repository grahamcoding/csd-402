/*
 * Daniel Graham
 * CSD402-H307 Java for Programmers
 * Module 3 Assignment: Pyramid Loop Program
 * 8/21/2025
 */

 public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 7; // total number of lines
        
        // figure out how wide the pyramid gets at the bottom
        int maxWidth = (rows * 2 + 1) * 2;
        
        for (int i = 0; i < rows; i++) {
            
            // 1. Print spaces (left side of pyramid)
            for (int s = rows - i; s > 0; s--) {
                System.out.print("  "); // two spaces
            }
            
            // 2. Print numbers going up
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num *= 2; // multiply by 2 each time
            }
            
            // 3. Print numbers going down
            num /= 2; // step back one power
            for (int j = i - 1; j >= 0; j--) {
                num /= 2;
                System.out.print(num + " ");
            }
            
            // 4. Calculate spaces needed to push the @ symbols into a vertical column
            int currentLength = (rows - i) * 2                    
                              + (i + 1) * 2                       
                              + i * 2;                           
            int spacesToAdd = maxWidth - currentLength;
            
            for (int k = 0; k < spacesToAdd; k++) {
                System.out.print(" ");
            }
            
            // 5. Print @ at the same spot for all rows
            System.out.println("@");
        }
    }
}