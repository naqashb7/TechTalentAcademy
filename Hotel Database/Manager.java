// Manager class for Hotel database (will be linked to SQL)


public class Manager {
    String name;
    String shift;
    double salary;
    int mid;
    
    
    //default constructor
    
    public Manager()
            {
    this.name = "n/a";
    this.shift = "n/a";
    this.salary = 0.00;
    this.mid = 0;
    
}
    
    
    //parameterised constructor
    
    public Manager (String name, String shift, double salary, int mid)
    {
        this.name =name;
        this.shift = shift;
        this.salary = salary;
        this.mid= mid;
    }

    //getter and setter
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
