import java.util.ArrayList;

public class TestOrdersAndItems {
    public static void main(String[] args){

        // Create 2 orders unspecified
        Order order1 = new Order();
        Order order2 = new Order();

        // Create 3 orders using overloaded constructor
        Order order3 = new Order("Nate");
        Order order4 = new Order("Maria");
        Order order5 = new Order("Toribio");
        // System.out.println(order3);
        // System.out.println(order4);
        // System.out.println(order5);

        // Created items
        Item item1 = new Item("capuccino", 5.0);
        Item item2 = new Item("mocha", 4.5);
        Item item3 = new Item("latte", 4.0);
        Item item4 = new Item("drip coffee", 3.5);

        // Add items or order
        order1.addItem(item1);
        order2.addItem(item2);

        // Set orders to true or false to determine if it's ready or not
        order1.setIsReady(true);
        order2.setIsReady(false);

        // Printing the status of the ready or not order
        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());

        // Printing total of order1
        System.out.println(order1.getOrderTotal());

        // Calling display method for order1
        order1.display();
    }
}
