package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name");
        String n = input.next();
        System.out.println("Hi, " + n + " What score did you get on your last math test?");
        int test = input.nextInt();
        System.out.println("Okay, " + n + " How much did you pay for breakfast today?");
        float price = input.nextFloat();
        System.out.println( n + " Scored an " + test + " on the last test and paid " + price + " for breakfast today" );

    }
}
