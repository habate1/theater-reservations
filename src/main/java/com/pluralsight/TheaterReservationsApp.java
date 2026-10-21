package com.pluralsight;

import java.util.Scanner;

public class TheaterReservationsApp {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.print("Please enter your full name: ");
        String fullName = myscanner.nextLine();
        System.out.println("What date will you be coming (MM/dd/yyyy):");
        String date = myscanner.nextLine();
        System.out.println("How many tickets would you like?");
        int numTickets = myscanner.nextInt();




    }
}
