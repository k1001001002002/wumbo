package cse216;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Expense {
    
    private double amount;
    private Date time;
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    int eid;
    private String category;

    public Expense() {
    }

    public Expense(double amount, String category, Date time) {
        this.amount = amount;
        this.category = category;
        this.time = time;
    }
    
    public Expense(int amount, String category){
        this(amount,category,new Date());
        //this.amount = amount;
        //this.time = time;
        //this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public DateFormat getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
 
    public String toString() {
	return "Cost was " + this.amount + ", and the category is " + this.category + ", and the recorded time is " + dateFormat.format(this.time);
    }
        
}


