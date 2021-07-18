
public class CorderMain {

    public static void main(String[] args) {
        
        COrder c1 = new COrder();
        
        System.out.println("COrder New");
        
        c1.setOrderid(007);
        c1.setCname("John");
        c1.setPhone("01214873944");
        c1.setAddress("Birmingham");
        c1.setItemid("645");
        c1.setQty(1);
        c1.setTotal(200.00);
        c1.setDate("July 2021");
        
        System.out.println("Order ID: " + c1.getOrderid());
        System.out.println("Cnname: " + c1.getCname());
        System.out.println("Phone: " + c1.getPhone());
        System.out.println("Address: " + c1.getAddress());
        System.out.println("Item ID: " + c1.getItemid());
        System.out.println("Quantity: " + c1.getQty());
        System.out.println("Total Charge: " + c1.getTotal());
        System.out.println("Date: " + c1.getDate());
    }// main ends
}// class ends
