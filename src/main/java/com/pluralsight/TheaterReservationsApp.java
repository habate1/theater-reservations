package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservationsApp {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        DateTimeFormatter formatter;

        // ask and store theater ticket reservation information from user
        System.out.print("Please enter your full name: ");
        String fullName = myscanner.nextLine();
        System.out.println("What date will you be coming (MM/dd/yyyy):");
        String date = myscanner.nextLine();
        System.out.println("How many tickets would you like?");
        int numTickets = myscanner.nextInt();

        // formatter described the format of the date the user entered
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        // converts the text/string into a date and uses formatter to read the string
        LocalDate calendarDate = LocalDate.parse(date, formatter);

        // store user's full name into string array by separating by the space
        // then split into first and last name
        String[] namePieces = fullName.split(" ");
        String firstName = namePieces[0], lastName = namePieces[1];

        // if else statement based on number of tickets reserved.
        // determined if the printed word ticket should be plural or singular
        if (numTickets == 1) {
            System.out.println(numTickets + " ticket reserved for " + calendarDate +
                    " under " + lastName + ", " + firstName);
        } else {
            System.out.println(numTickets + " tickets reserved for " + calendarDate +
                    " under " + lastName + ", " + firstName);
        }


    }
}
