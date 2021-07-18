
public class ManagerMain {
    
    public static void main(String[] args) {
        
        Manager m1= new Manager();
        
         System.out.println("New Manager");
        
        m1.setName("Arthur");
        m1.setShift("Breakfast");
        m1.setSalary(35000.00);
        m1.setMid(11);
        
        System.out.println("Name: " + m1.getName());
        System.out.println("Shift: " + m1.getShift());
        System.out.println("Salary: " + m1.getSalary());
        System.out.println("Manager ID: " + m1.getMid());
        
    }
    
}
