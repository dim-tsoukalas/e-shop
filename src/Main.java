// Exercise 1
// AM: 3212018232 Name: Τσουκαλάς Δημήτριος

public class Main {
    public static void main(String[] args) {
        eShop s1 = new eShop("www.shop.com", 2103990, "shop@shop.com");
        // Add Product
        Product p1 = s1.addProduct("book23", "yes", 12);
        Product p2 = s1.addProduct("book", "no", 11);
        
        //Display Shop Info
        System.out.println("--Shop Info--");
        System.out.println(s1.shopInfo());
        
        // Change Product State
        s1.changeState(p2, "yes");
        
        
        //Display all products from selected category
        System.out.println("\n--Get all products from category=book--");
        System.out.println(s1.getSameCategoryProducts("book"));
        
        //Display all products from selected caegory and costLimit
        System.out.println("\n--Category with costLimit=13 and category=book23--");
        System.out.println(s1.getSmallLimitValue("book23", 13));
        
        //Display available products
        System.out.println("\n--Get Available Products--");
        System.out.println(s1.getAvailabeProducts());
        
        //Display cheapest Products per Category
        System.out.println("\n--cheapest Products per Category--");
        System.out.println(s1.getCheapestProducts());
    }
}