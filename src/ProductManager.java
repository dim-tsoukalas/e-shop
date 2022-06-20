// Exercise 1
// AM: 3212018232 Name: Τσουκαλάς Δημήτριος

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;

public class ProductManager{
    LinkedList<Product> productList = new LinkedList();

    // Add product to linkedList 
    public void addToArray(Product p) {
        this.productList.add(p);
    }

    /* --Function to search Ctaegory--
    We create a new list and we add the Products from the same
    category
    */
    public LinkedList<Product> searchCategory(String category) {
        LinkedList<Product> list = new LinkedList();
        for (Product p : this.productList) {
            if (p.isCategory(category)) {
                list.add(p);
            }
        }

        return list;
    }
    
    /*
    --Overloading Function to search Products 
    with cost smaller than costLimit--
    */
    public LinkedList<Product> searchCategory(String category, int costLimit) {
        LinkedList<Product> categoryList = this.searchCategory(category);
        LinkedList<Product> accList = new LinkedList();
        for(Product p: categoryList) {
            if(p.getCost() < costLimit) {
                accList.add(p);
                
            }
        }
        return accList;
    }
    /*--Function that returns the available Products--*/
    public LinkedList<Product> availableProducts() {
        LinkedList<Product> list = new LinkedList();
        Iterator var2 = this.productList.iterator();

        while(var2.hasNext()) {
            Product p = (Product)var2.next();
            if (p.getAvailable().equals("yes")) {
                list.add(p);
            }
        }

        return list;
    }

    /*Function to return the cheapest Products
    Don't finished it!
    */
    public HashMap<String, Set<Product>> cheapestProducts() {
        HashMap<String, Set<Product>> hash = new HashMap();

        this.productList.forEach((p) -> {
            if(!hash.containsKey(p.getCategory())) {
                Set<Product> s = new HashSet<>();
                s.add(p);
                hash.put(p.getCategory(), s);
            } else {
                hash.get(p.getCategory()).add(p); 
            }
        });
        //didnt work
        /*for (var h : hash.values()) {
            Collections.sort(h);
        }*/
        return hash;
    }
// Return all the categories
    public String[] getCategoriesArray() {
        int i = 0;
        String[] categories = null;

        for(Iterator var3 = this.productList.iterator(); var3.hasNext(); ++i) {
            Product p = (Product)var3.next();
            ((Object[])categories)[i] = p.getCategory();
        }

        return (String[])categories;
    }
    
    /*public TreeMap<String, Product> sortedList() {
        TreeMap<String, LinkedList<Product>> t = new TreeMap<>(organizeProducts());
        for (var tree : t.values()) {
            Collections.sort(tree);
        }
        
        
    }*/
}