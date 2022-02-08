public class Item {

    // MEMBER VARIABLES
    private String name;
    private double price;

    // CONSTRUCTOR
    // Takes a name and price as arguments
    // and sets them accordingly
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    // GETTERS & SETTERS - for name and price
    // Item name getter
    public String getItemName(){
        return name;
    }

    // Item name setter
    public void setItemName(String name){
        this.name = name;
    }

    // Item price getter
    public double getItemPrice(){
        return price;
    }

    // Item price setter
    public void setItemPrice(double price){
        this.price = price;
    }
}
