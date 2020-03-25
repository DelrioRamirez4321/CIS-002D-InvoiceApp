package edu.whccd.dramirez;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(
                "Please enter test scores that range from 0 to 100.");
        System.out.println("To end the program enter 999.");
        System.out.println(); // print a blank line
        // initialize variables and create a Scanner object
        double scoreTotal = 0.0;
        int scoreCount = 0;
        int testScore = 0;
        Scanner sc = new Scanner(System.in);
        // get a series of test scores from the user
        while (testScore <= 100)
        {
            // get the input from the user
            System.out.print("Enter score: ");
            testScore = sc.nextInt();
            // accumulate score count and score total
            if (testScore <= 100)
            {
                scoreCount = scoreCount + 1;
                scoreTotal = scoreTotal + testScore;
            }
        }
        // display the score count, score total, and average score
        double averageScore = scoreTotal / scoreCount;
        String message = "\n"
                + "Score count: " + scoreCount + "\n"
                + "Score total: " + scoreTotal + "\n"
                + "Average score: " + averageScore + "\n";
        System.out.println(message);
    }
}