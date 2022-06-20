// Exercise 1
// AM: 3212018232 Name: Τσουκαλάς Δημήτριος

import java.util.Locale;
//Class e-Shop
public class eShop {
    private String link;
    private int phone;
    private String email;
    
    private ProductManager c = new ProductManager();
/* Default Constructor
     initializes values */
    public eShop() {
        this.link = null;
        this.phone = 0;
        this.email = null;
    }
// Constructor
    public eShop(String link, int phone, String email) {
        this.link = link;
        this.phone = phone;
        this.email = email;
    }

    public String shopInfo() {
        return "Link: " + this.link + "\nPhone: " + this.phone + "\nEmail: " + this.email;
    }
    /*
    Function to add Product from eShop
    */
    public Product addProduct(String category, String available, int cost) {
        Product p = new Product(category.toLowerCase(Locale.ROOT), available.toLowerCase(Locale.ROOT), cost);
        this.c.addToArray(p);
        return p;
    }
    /*
    Change Product State
    */
    public void changeState(Product p, String available) {
        if ("yes".equals(available)) {
            p.setAvailable();
        } else if ("no".equals(available)) {
            p.setNotAvailable();
        }

    }
// Call functions from Product Manager
    public String getSameCategoryProducts(String category) {
        return this.c.searchCategory(category).toString();
    }

    public String getSmallLimitValue(String category, int costLimit) {
        return this.c.searchCategory(category, costLimit).toString();
    }

    public String getAvailabeProducts() {
        return this.c.availableProducts().toString();
    }
    
    public String getCheapestProducts() {
        return this.c.cheapestProducts().toString();
    }
}