/**
 * Author: M. Fatih Pirim
 *
 * 1. vending machine offers 5 products:
 *  Coke(), Pepsi(), Sprite(), Water(), Gatorade()
 *
 * 2. accepts: coins [111 --> 4 quarters, 1 dime, 1 penny], AND, $1 and $5 [1.00 --> 4 quarters, 5.00 -- 20 quarters]
 *  Coke(10 cents, 1 dollars)
 *      - convert all currency to cents
 *      - Example: Coke(10 cents, 1 dollars) ==> 110 cents
 * 3. Change is given in cents
 *      - CentsConverter()
 *
 * 4. Enter money
 *      - repeating prompt (while loop)
 *      - put in values
 *      - totalBalance = totalBalance + (every new value)
 *      - enter 0 to end the loop
 *
 * 5. Interface: coke = 1, pepsi = 2, sprite = 3, water = 4, gatorade = 5
 *  - "Hello select your item(s)"
 *  - select up to (5 items) as long as balance Covers it (while loop)
 *  - if user enters "0" selection ends and money is refunded in COINS
 *  - if user enters "6" with less than 4 items, the items are bought

 *      required functions:
 *          1. addBalance() =>
 *              initialize balance;
 *              input = scanner
 *              "enter ([p]penny, [n]nickel, [d]dime, quarter, [1d]1dollars, [5d]5dollars)"
 *
 *              while(input != 0):
 *                  if (input = p):
 *                                  add 1 cents to balance
 *                  if (input = n):
 *                                  add 5 cents to balance
 *                  if (input = d):
 *                                  add 10 cents to balance
 *                  if (input = q):
 *                                  add 25 cents to balance
 *                  if (input = 1d):
 *                                  add 100 cents to balance
 *                  if (input = 5d):
 *                                  add 500 cents to balance
 *
 *
 *              return balance;
 *
 *           2. purchaseItems()
 *          chose items similarly to choosing which currency to add
 *          each item chosen subtracts from the balance
 *
 *              3. calcChange()
 *          calculates change from remaining balance
 *
 */

package com.company;
import java.util.Scanner;
public class Mod1_Problem2 {

    public static void main(String[] args) {
        double bal = addBalance(); // add money to balance
        double final_bal = purchaseItems(bal); //purchase items and calculate remaining bal
        String change = calcChange(final_bal); //calculate change in coins
        System.out.println(change);

    }

    public static double addBalance() {
        //initialize
        Scanner myScan = new Scanner(System.in);
        boolean done = false;
        double balance = 0;


        //instructions
        System.out.println("[TO ADD TO BALANCE:]");
        System.out.println("Enter [p]penny - [n]nickle - [d]dime - [q]quarter) - [1d]dollar - [5d]5dollars - [0]CONTINUE");

        //enter money
        while (!done) {
            String input =myScan.nextLine();
            switch (input) {
                case "p" :
                    balance += .01;
                    System.out.println("Added 1 penny");
                    break;
                case "n" :
                    balance += .05;
                    System.out.println("Added 1 nickel");
                    break;
                case "d" :
                    balance += .10;
                    System.out.println("Added 1 dime");
                    break;
                case "q" :
                    balance += .25;
                    System.out.println("Added 1 quarter");
                    break;
                case "1d" :
                    balance += 1.00;
                    System.out.println("Added 1 dollar");
                    break;
                case "5d" :
                    balance += 5.00;
                    System.out.println("Added 5 dollars");
                    break;
                case "0":
                    done = true;
                    break;
                default:
                    System.out.println("error");

            }
            System.out.println("[Total Balance: " + (Math.round(balance * 100.0) / 100.0)+"]");
        }
        return Math.round(balance * 100.0) / 100.0;
    }


    public static double purchaseItems(double balance) {
        // initialize
        double total_Bal = balance;
        double initial_Bal = balance;
        int num_of_Items = 0;
        String yourItems = "Your items: ";
        boolean done = false;
        Scanner myScan = new Scanner(System.in);

        // select items
        System.out.println("[VENDING MACHINE: SELECT YOUR DRINK! SELECT UP TO 4.]");
        System.out.printf("[1]COLA $1.99 - [2]PEPSI $1.49 - [3]SPRITE $2.49 - [4]WATER $2.99 - [5]GATORADE $0.99 - [0] CANCEL - [6] BUY");
        System.out.println("");
        while (!done) {
            if (num_of_Items < 4) {
                String input = myScan.nextLine();
                switch (input) {
                    case "1" :
                        if (total_Bal >= 1.99) {
                            num_of_Items = num_of_Items + 1;
                            total_Bal = total_Bal - 1.99;
                            System.out.println("ADDED ONE COLA");
                            break;
                        } else {
                            System.out.println("NOT ENOUGH IN BALANCE!");
                            break;
                        }
                    case "2" :
                        if (total_Bal >= 1.49) {
                            num_of_Items = num_of_Items + 1;
                            total_Bal = total_Bal - 1.49;
                            System.out.println("ADDED ONE PEPSI");
                            break;
                        } else {
                            System.out.println("NOT ENOUGH IN BALANCE!");
                            break;
                        }
                    case "3" :
                        if (total_Bal >= 2.49) {
                            num_of_Items = num_of_Items + 1;
                            total_Bal = total_Bal - 2.49;
                            System.out.println("ADDED ONE SPRITE");
                            break;
                        }else {
                            System.out.println("NOT ENOUGH IN BALANCE!");
                            break;
                        }
                    case "4" :
                        if (total_Bal >= 2.99) {
                            num_of_Items = num_of_Items + 1;
                            total_Bal = total_Bal - 2.99;
                            System.out.println("ADDED ONE WATER");
                            break;
                        } else {
                            System.out.println("NOT ENOUGH IN BALANCE!");
                            break;
                        }
                    case "5" :
                        if (total_Bal >= 0.99) {
                            num_of_Items = num_of_Items + 1;
                            total_Bal = total_Bal - 0.99;
                            System.out.println("ADDED ONE GATORADE");
                            break;
                        } else {
                            System.out.println("NOT ENOUGH IN BALANCE!");
                            break;
                        }
                    case "0":
                        done = true;
                        System.out.println("YOUR FULL BALANCE HAS BE REFUNDED IN COINS");
                        return initial_Bal;
                    case "6":
                        done = true;
                        break;
                    default:
                        System.out.println("error");

                }
                System.out.println("number of items: " + num_of_Items);
                System.out.println("[Total Balance: " + (Math.round(total_Bal * 100.0) / 100.0)+"]");
            } else {
                System.out.println("YOUR ITEMS HAVE BEEN PURCHASED. YOUR CHANGE IN COINS IS: ");
                return total_Bal;
            }

        }
        System.out.println("YOUR ITEMS HAVE BEEN PURCHASED. YOUR CHANGE IN COINS IS: ");
        return total_Bal;
    }

    public static String calcChange(double change) {
        double cents = 100*change;
        int NumberOfQuarters = (int)(cents/25);
        cents = cents - 25 * NumberOfQuarters;

        int NumberOfDimes = (int)(cents/10);
        cents = cents - 10 * NumberOfDimes;

        int NumberOfNickels = (int)(cents/5);
        cents = cents - 5 * NumberOfNickels;
        int NumberOfPennies = (int)Math.round(cents);
        //cents = cents - NumberOfPennies;


        String myChange = "Your change: " + NumberOfQuarters + " quarters, " + NumberOfDimes + " dimes, " +
                NumberOfNickels + " nickels, and " + NumberOfPennies + " pennies."  ;
        return myChange;
    }
}
