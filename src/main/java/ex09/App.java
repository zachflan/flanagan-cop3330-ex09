/*
 *  UCF COP3330 Summer 2021 Assignment 9 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex09;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("What is the length of the ceiling? ");
        String lengthS = in.nextLine();
        int lengthI = Integer.parseInt(lengthS);

        Scanner in2 = new Scanner(System.in);
        System.out.print("What is the width of the ceiling? ");
        String widthS = in2.nextLine();
        int widthI = Integer.parseInt(widthS);

        int sqft = widthI * lengthI;
        final int paintNeeded = sqft / 350;
        int extraPaint = sqft % 350;

        int totalPaint = paintNeeded;

        if(extraPaint > 0){
            totalPaint = paintNeeded + 1;
        }

        String outputString = "You will need to purchase " + totalPaint + " gallons of paint to cover " + sqft + " square feet.";
        System.out.println(outputString);
    }
}