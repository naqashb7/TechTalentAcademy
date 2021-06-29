// COrder class for Hotel database (will be linked to SQL)




public class COrder {
    int orderid;
    String cname;
    String phone;
    String address;
    String itemid;
    int qty;
    double total;
    String date;
    
//default constructor

    public COrder() {
        
        this.orderid = 0;
        this.cname = "n/a";
        this.phone = "n/a";
        this.address = "n/a";
        this.itemid = "n/a";
        this.qty = 0;
        this.total = 0;
        this.date = "n/a";
    }

   
 //parameterised constructor
    
    public COrder(int orderid, String cname, String phone, String address, String itemid, int qty, double total, String date) {
        this.orderid = orderid;
        this.cname = cname;
        this.phone = phone;
        this.address = address;
        this.itemid = itemid;
        this.qty = qty;
        this.total = total;
        this.date = date;
    }

    
    //getter and setter
    
    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    
    
    
    
    
    
    
    
}
