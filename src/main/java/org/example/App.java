/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tim Phung
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        //input
        System.out.print("Enter a 1 if you are a male or a 2 if you are a female: ");
        int gender = scan.nextInt();

        float r = (float) 0.73;
        if (gender == 2) r = (float) 0.66;

        System.out.print("How many ounces of alcohol did you have? ");
        int alcohol = scan.nextInt();

        System.out.print("What is your weight in pounds? ");
        int weight = scan.nextInt();

        System.out.print("How many hours has it been since your last drink? ");
        int time = scan.nextInt();

        //processing
        float bac = (float) (((alcohol*5.14/weight) * r) - (0.015*time));

        //output
        System.out.println("Your BAC is " +bac);

        if (bac < 0.08)
            System.out.println("It is legal for you to drive.");
        else
            System.out.println("It is not legal for you to drive.");


    }
}
