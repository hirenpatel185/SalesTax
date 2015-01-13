/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author c0651609
 */
public class SalesTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double purchasePrice, totalPurchasePrice, purchaseTax;

        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Enter Purchase Price:");
        purchasePrice = keyBoard.nextDouble();
        System.out.println(" Enter Purchase Tax:");
        purchaseTax = keyBoard.nextFloat();
        purchaseTax = purchasePrice * purchaseTax / 100;
        totalPurchasePrice = purchasePrice + purchaseTax;
        System.out.println("Total Purchase Price:\t" + totalPurchasePrice);
    }

}
