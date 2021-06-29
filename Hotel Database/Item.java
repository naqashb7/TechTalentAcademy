//Item class for Hotel database (will be linked to SQL)





public class Item {
    String itemid;
    String dish;
    double price;
    String category;
    
    
   
    //default constructor

    public Item() {
        this.itemid="n/a";
        this.dish="n/a";
        this.price=0.00;
        this.category="n/a";
    }
 
    
    //parameterised constructor

    public Item(String itemid, String dish, double price, String category) {
        this.itemid = itemid;
        this.dish = dish;
        this.price = price;
        this.category = category;
    }
    
    //getter and setter

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    
    
    
    
    
    
    
    
    
}
