/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1V3;

import java.util.Scanner;

public class Customer_Test {

    public static void main(String[] args) {

        String sAnswer;
        int iItems;
        int[] aiItems;
        Scanner input = new Scanner(System.in);
        Customer oCustomer = new Customer();

        System.out.println("Do you want to create a customer?");
        sAnswer = input.next();

        if(sAnswer.equalsIgnoreCase("y")){
            System.out.println("Ok, what's his/her name?");
            oCustomer.name = input.next();

            System.out.println("How many items is the customer buying?");
            iItems = input.nextInt();
            aiItems = new int[iItems];

            for(int x=0; x < aiItems.length; x++){
                System.out.println("Enter a value for item #" + (x + 1));
                aiItems[x] = input.nextInt();

            }

            oCustomer.itemValues = aiItems;

            System.out.println("Great, here is your customer's purchase details:");
            oCustomer.printDetails();

        }
        else{
            return;
        }
    }

}