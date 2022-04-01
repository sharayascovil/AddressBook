package com.tss.addressbook;

import java.util.Scanner;

public class AddressBook {

    public static void main(String[] args){
        displayMenu();
    }

    public static void callContact(String firstName){
        System.out.println("Calling " + firstName);
    }

    public static void saveContact(String firstName, long phoneNumber) {
        System.out.println("Saving contact " + firstName + " : " + phoneNumber);
    }

    public static void findPhoneNumber(String firstName) {
        System.out.println("Could not find " + firstName);
    }

    public static void findEmailAddress(String emailAddress) {
        System.out.println("Could not find " + emailAddress);
    }

    public static void findHomeAddress(String homeAddress) {
        System.out.println("Could not find " + homeAddress);
    }

    public static void displayMenu() {

        Scanner input = new Scanner(System.in);
        String firstName;


        System.out.println("What would you like to do? (1, 2, 3......etc)");
        System.out.println("1. Call Contact.");
        System.out.println("2. Save Contact.");
        System.out.println("3. Find Number.");
        System.out.println("4. Find Address.");
        System.out.println("5. Find email.");


        //Break this later
        int choice = input.nextInt();
        input.nextLine();

        switch(choice) {
            case 1:
                System.out.println("\nWho would you like to call? (Firstname Lastname )");
                firstName = input.nextLine();

                callContact(firstName);
                break;

            case 2:
                System.out.println("\nWhat is the name of the person you would like to save? (Firstname Lastname )");
                firstName = input.nextLine();

                System.out.println("\nWhat is the phone number of the person you are saving? (6149725658)");
                long phoneNumber = input.nextLong();

                saveContact(firstName, phoneNumber);
                break;

            case 3:
                System.out.println("\nWhat is the name of the person whose phone number you are searching for? (Firstname Lastname )");
                findPhoneNumber(input.nextLine());

                break;

            case 4:
                System.out.println("\nWhat is the name of the person whose email you are searching for? (firstname Lastname)");
                findEmailAddress(input.next());

                break;

            case 5:
                System.out.println("\nWhose is the name of the person whose home address you are looking for? (firstname Lastname)");
                findHomeAddress(input.nextLine());
                break;

            default:

                break;

        }
    }
}
