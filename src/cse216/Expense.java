package cse216;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Expense {
    
    public int amount;
    Date time;
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    int eid;
    String category;

    public Expense() {
    }

    public Expense(int amount, String category) {
        this.amount = amount;
        this.category = category;
        this.time = new Date();
    }
    
    public Expense(int amount, Date time, String category){
        this.amount = amount;
        this.time = time;
        this.category = category;

    }

    public int getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public void setAmount(int amount) {
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
    
}


