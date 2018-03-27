/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1V3;

public class Customer {

    public String name;
    public int[] itemValues;

    public void printDetails(){

        System.out.println("Name: " + name);

        int iTotal = 0;

        for(int x=0; x < itemValues.length; x++){
            System.out.println("Item #" + (x + 1) + ": " + itemValues[x]);

            iTotal += itemValues[x];
        }

        System.out.println("Total: " + iTotal);
    }
}
