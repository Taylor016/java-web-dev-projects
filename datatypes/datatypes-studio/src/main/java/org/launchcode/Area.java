package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


//        Basic Solution
//        System.out.println("Please enter a radius: ");
//        double radius = input.nextDouble();
//        double area = Circle.getArea(radius);
//        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);

        //Bonus Mission 1
//        System.out.println("Please enter a radius: ");
//
//        if(input.hasNextDouble()) {
//            double radius = input.nextDouble();
//
//            if(radius > 0) {
//                double area = Circle.getArea(radius);
//                System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
//
//            } else {
//                System.out.println("Sorry, the radius must be a positive number.");
//            }
//        } else {
//            System.out.println("Sorry, that was not a valid number.");
//        }

        //Bonus Mission 2
        double radius;

        do {
            System.out.println("Please enter a positive number for the radius: ");

            while(!input.hasNextDouble()) {
                System.out.println("The radius must be a number! Try again!");
                input.next();
            }
            radius = input.nextDouble();

        } while (radius <= 0);

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);


        input.close();
    }
}
