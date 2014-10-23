package cse216;

public class Expense {
    
    public int amount;
    public String category;

    public Expense() {
    }
    
    public Expense(int amount, String category) {
        this.amount = amount;
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

    public void setCategory(String category) {
        this.category = category;
    }
}