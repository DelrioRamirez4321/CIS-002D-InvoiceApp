package edu.whccd.dramirez;

import java.util.Scanner;
import java.text.NumberFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

/*
the purpose of this application is to replicate the code in figure 3-17 chapter 3
author: Delrio Ramirez
 */
public class Main {
    public static void main(String[] args) {
       final BigDecimal SALES_TAX_PCT = new BigDecimal("0.05");

       Scanner sc = new Scanner(System.in);
       String choice = "y";
       while (choice.equalsIgnoreCase("y")) {
           System.out.print("Enter subtotal: ");
           String subtotalString = sc.next();

           BigDecimal subtotal = new BigDecimal(subtotalString);
           BigDecimal discountPercent;
           if (subtotal.doubleValue() >= 100 ){
               discountPercent = new BigDecimal("0.1");
           } else {
               discountPercent = new BigDecimal("0.0");
           }

           BigDecimal discountAmount = subtotal.multiply(discountPercent)
                   .setScale(2, RoundingMode.HALF_UP);
           BigDecimal totalBeforeTax = subtotal.subtract(discountAmount);
           BigDecimal saleTax = SALES_TAX_PCT.multiply(totalBeforeTax)
                   .setScale(2, RoundingMode.HALF_UP);
           BigDecimal total = totalBeforeTax.add(saleTax);

           NumberFormat currency = NumberFormat.getCurrencyInstance();
           NumberFormat percent = NumberFormat.getPercentInstance();
           String message =
                   "Discount Percent:  " + percent.format(discountPercent) + "\n"
                           + "Discount amount: " + currency.format(discountAmount) + "\n"
                           + "Total before tax: " + currency.format(totalBeforeTax) + "\n"
                           + "Sales tax: " + currency.format(saleTax) + "\n"
                           + "Invoice total: " + currency.format(total) + "\n";
           System.out.println(message);

           System.out.print("Continue (y/n): ");
           choice = sc.next();
           System.out.println();
       }
    }
}
