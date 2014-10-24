/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cse216;
import java.text.*;
/**
 *
 * @author April
 */
public class CSE216 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //Expense transaction = new Expense(500, "Grocery");
        //System.out.println(transaction.getDateFormat().format(transaction.getTime()));
        DateFormat dF = new SimpleDateFormat("yyyy/MM/dd");
        Expense expense1 = new Expense(300.00, "food");
        Expense expense2 = new Expense(250.00, "drinks",dF.parse("2014/10/23"));
        System.out.println(expense1);
        System.out.println(expense2);
    }
    
}
