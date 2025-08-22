/*
 * Daniel Graham
 * CSD402-H307 Java for Programmers
 * Module 2 Assignment: Rock Paper Scissors
 * 8/21/2025
 */

 import java.util.Scanner;
 import java.util.Random;
 
 public class RockPaperScissors {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Random rand = new Random();
 
         // Computer randomly chooses 1, 2, or 3
         int computerChoice = rand.nextInt(3) + 1;
 
         // Ask the user for their choice
         System.out.println("Welcome to Rock Paper Scissors by Daniel Graham!");
         System.out.println("Please enter your choice to play: 1 = Rock, 2 = Paper, 3 = Scissors");
         int userChoice = input.nextInt();
 
         // Show what the computer chose
         if (computerChoice == 1) {
             System.out.println("The Computer chose Rock");
         } else if (computerChoice == 2) {
             System.out.println("The Computer chose Paper");
         } else {
             System.out.println("The Computer chose Scissors");
         }
 
         // Show what the user chose
         if (userChoice == 1) {
             System.out.println("You chose Rock");
         } else if (userChoice == 2) {
             System.out.println("You chose Paper");
         } else if (userChoice == 3) {
             System.out.println("You chose Scissors");
         } else {
             System.out.println("Numbers only Please!");
         }
 
         // Decide the winner
         if (computerChoice == userChoice) {
             System.out.println("It's a tie!");
         } else if ((userChoice == 1 && computerChoice == 3) ||
                    (userChoice == 2 && computerChoice == 1) ||
                    (userChoice == 3 && computerChoice == 2)) {
             System.out.println("You win!");
         } else {
             System.out.println("Computer wins!");
         }
 
         input.close();
     }
 }