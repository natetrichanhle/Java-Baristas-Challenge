import java.util.ArrayList;

// Here we're creating a new data type called Order
public class Order {

    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null

    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    // ORDER METHODS

    // Most of your code will go here,
    // so implement the getters and setters first!
    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        if(ready){
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal(){
        double total = 0;
        for(int i = 0; i < getItems().size(); i++){
            total += getItems().get(i).getItemPrice();
        }
        return total;
    }

    public void display(){
        System.out.println("Customer Name: " + getName());
        for(int i = 0; i < getItems().size(); i++){
            System.out.println(getItems().get(i).getItemName() + " - $" + getItems().get(i).getItemPrice());
            // String itemName = getItems().get(i).getItemName();
            // double itemPrice = getItems().get(i).getItemPrice();
            // System.out.println(itemName + " - $" + itemPrice);
        }
    }

    // GETTERS & SETTERS
    // String getter
    public String getName(){
        return name;
    }

    // String setter
    public void setName(String name){
        this.name = name;
    }

    // boolean getter
    public boolean getIsReady(){
        return ready;
    }

    // boolean setter
    public void setIsReady(boolean ready){
        this.ready = ready;
    }

    // ArrayList getter
    public ArrayList<Item> getItems(){
        return items;
    }

    // ArrayList setter
    public void setItems(ArrayList<Item> items){
        this.items = items;
    }
}

