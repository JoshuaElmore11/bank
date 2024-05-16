package com.cogent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loggedIn = false;
        boolean flag = true;



        while (flag) {

            //--------------------------------------Not logged in-------------------------------------
            while(!loggedIn) {
                System.out.println("******************************************************");
                System.out.println("*****************Choose an Option*********************");
                System.out.println("******************************************************");
                System.out.println("1: Register");
                System.out.println("2: Login");
                System.out.println("3: Exit");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1: {
                        System.out.println("Enter username");
                        System.out.println("Enter password");
                        System.out.println("Verify password");
                    }
                    case 2: {
                        System.out.println("Enter username");
                        System.out.println("Enter password");
                        loggedIn = true;
                    }
                    case 3: {
                        // exit
                        System.out.println("Thank you");
                        System.out.println("Exiting...");
                        flag = false;
                        break;
                    }
                    default: {
                        System.out.println("Please Choose between 1 - 3");
                    }
                }
            }

            //-----------------------------------Logged in------------------------------------------------------//

            while(loggedIn) {
                System.out.println("******************************************************");
                System.out.println("*****************Choose an Option*********************");
                System.out.println("******************************************************");
                System.out.println("1: Check Balance");
                System.out.println("2: Deposit Funds");
                System.out.println("3: Withdraw Funds");
                System.out.println("4: Logout");
                System.out.println("5: Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();

                switch (choice){
                    case 1: {

                    }
                    case 2: {

                    }
                    case 3: {

                    }
                    case 4: {
                        // exit
                        System.out.println("Thank you");
                        System.out.println("Logging out...");
                        loggedIn = false;
                        break;
                    }
                    case 5: {
                        // exit
                        System.out.println("Thank you");
                        System.out.println("Exiting...");
                        flag = false;
                        break;
                    }
                    default: {
                        System.out.println("Please Choose between 1 - 5");
                    }
                }
            }
        }

        sc.close();
    }
}