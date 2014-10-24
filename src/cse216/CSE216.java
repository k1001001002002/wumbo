/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cse216;

/**
 *
 * @author April
 */
public class CSE216 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Expense transaction = new Expense(500, "Grocery");
        System.out.println(transaction.getDateFormat().format(transaction.getTime()));
    }
    
}
