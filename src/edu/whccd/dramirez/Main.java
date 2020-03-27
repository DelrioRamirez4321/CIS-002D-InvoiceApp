package edu.whccd.dramirez;

import java.time.Year;
import java.util.Scanner;
/*
the purpose of this application is to replicate the code in figure 2-17 chapter 2
author: Delrio Ramirez
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Invoice Total calculaotr");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("enter Subtotal: ");
            double subtotal = sc.nextDouble();

            double discountPercent;
            if (subtotal >= 200) {
                discountPercent = .2;
            } else if (subtotal >= 100) {
                discountPercent = .1;
            } else {
                discountPercent = 0.0;
            }

            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;

            String message = "Discount percent:" + discountPercent + "\n"
             + "Discount amount: " + discountAmount + "\n"
                    + "Invoice total: " + total + "\n";
            System.out.println(message);

            System.out.print("continue? y/n: ");
            choice = sc.next();
            System.out.println();
        }

    }
}
