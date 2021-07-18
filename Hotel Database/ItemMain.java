
public class ItemMain {
    public static void main(String[] args) {
        
        Item i1 = new Item();
        
        System.out.println("New Item");
        
        i1.setItemid("3465");
        i1.setDish("Chicken Korma");
        i1.setPrice(35.00);
        i1.setCategory("Family Dishes");
        
        System.out.println("Item ID: " + i1.getItemid());
        System.out.println("Dish: " + i1.getDish());
        System.out.println("Price: " + i1.getPrice());
        System.out.println("Category: " + i1.getCategory());
        
    }
    
    
}
