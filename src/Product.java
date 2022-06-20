// Exercise 1
// AM: 3212018232 Name: Τσουκαλάς Δημήτριος

import java.util.UUID;

//Class Product 
public class Product {
    private String category;
    private String available;
    private String uniqueID;
    private int cost;

    /* Default Constructor
     initializes values */
    public Product() {
        this.category = null;
        this.available = null;
        this.uniqueID = null;
    }
// Constructor
    public Product(String category, String available, int cost) {
        this.category = category;
        this.available = available;
        this.uniqueID = UUID.randomUUID().toString();
        this.cost = cost;
    }

    public void setAvailable() {
        this.available = "yes";
    }

    public void setNotAvailable() {
        this.available = "no";
    }

    public String getAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "Category: " + this.category + "\nAvalable: " + this.available + 
                "\nID: " + this.uniqueID + "\nCost: " + this.cost;
    }
    
    public String getCategory() {
        return category;
    }
    
    public boolean isCategory(String cat) {
        return this.category.equalsIgnoreCase(cat);
    }
    
    public int getCost() {
        return cost;
    }
    
}