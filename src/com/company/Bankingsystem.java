/*
Write a Menu driven program in java to implement simple banking applications.
Application should read the customer name, account number, initial balance,
rate of interest, contact number and address field etc.
Application should have following methods.
1. createAccount()
2. deposit()
3. withdraw()
4. computeInterest()
5. displayBalance()
 */
package com.company;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Bankingsystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int input;
        float p, r, t, si;
        boolean quit = false;
        float balance = 0f;

        do {
            System.out.println("1. Deposit money");

            System.out.println("2. Withdraw money");

            System.out.println("3. Check balance");

            System.out.println("4. Compute Interest");

            System.out.println("5. display amount");
            System.out.print("Your choice,0 to quit:");

            input = in.nextInt();

            switch (input) {
                case 1:

                    float amount;

                    System.out.print("Amount to deposit: ");

                    amount = in.nextFloat();

                    balance += amount;

                    break;

                case 2:

                    System.out.print("Amount to withdraw: ");

                    amount = in.nextFloat();

                    balance -= amount;

                    break;

                case 3:

                    System.out.println("Your balance: $" + balance);

                    break;

                case 4:
                    p = in.nextFloat();
                    r = in.nextFloat();
                    t = in.nextFloat();


                    si = (p * r * t) / 100;

                    System.out.println("Simple Interest is: " + si);
                case 5:
                    System.out.print("Amount to deposit: ");

                case 0:

                    quit = true;

                    break;

                default:

                    System.out.println("Wrong choice.");

                    break;

            }
            System.out.println();

        } while (!quit);
        System.out.println("over");
    }
}