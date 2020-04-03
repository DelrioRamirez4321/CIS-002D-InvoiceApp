package edu.whccd.dramirez;

import java.util.Scanner;
import java.text.NumberFormat;

/*
the purpose of this application is to replicate the code in figure 3-13 chapter 3
author: Delrio Ramirez
 */
public class Main {
    public static void main(String[] args) {
       final double SALES_TAX_PCT = 0.5;

       Scanner sc = new Scanner(System.in);
       String choice = "y";
       while (choice.equalsIgnoreCase("y")) {
           System.out.print("Enter subtotal: ");
           double subtotal = sc.nextDouble();

           double discountPercent = 0.0;
           if (subtotal >= 100) {
               discountPercent = 0.1;

           } else {
               discountPercent = 0.0;
           }

           double discountAmount = subtotal * discountPercent;
           double totalBeforeTax = subtotal - discountAmount;
           double saleTax = totalBeforeTax * SALES_TAX_PCT;
           double total = totalBeforeTax + saleTax;

           NumberFormat currency = NumberFormat.getCurrencyInstance();
           NumberFormat percent = NumberFormat.getPercentInstance();
           String message =
                   "Discount Percent:  " + percent.format(discountPercent) + "\n"
                           + "Discount amount: " + currency.format(discountAmount) + "\n"
                           + "Total before tax" + currency.format(totalBeforeTax) + "\n"
                           + "Sales tax" + currency.format(saleTax) + "\n"
                           + "Invoice total: " + currency.format(total) + "\n";
           System.out.println(message);

           System.out.print("Continue (y/n): ");
           choice = sc.next();
           System.out.println();
       }
    }
}
