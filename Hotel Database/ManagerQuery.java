import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class ManagerQuery {
    //1. insert 
    public int insert(int mid, String name, double salary, String shift)
    {
        int row_insert = 0;
        try
        {
            Connection con = HotelDBConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "insert into Manager(mid,Name,Salary,shift) values("+mid+" , '"+name+"' , "+salary+" , '"+shift+")";
            
            row_insert = stmt.executeUpdate(qry);
             
        }
        catch(Exception ex)
        {
            System.out.println("Insert Error :"+ex);
        }
        
        return row_insert;
    }
    
    //2. update 
    public int update(int mid , double up_salary)
    {
        int row_update = 0;
        try
        {
            Connection con = HotelDBConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "update Manager set Salary="+up_salary+" where mid="+mid;;
            
            row_update = stmt.executeUpdate(qry);
        }
        catch(Exception ex)
        {
            System.out.println("Update Error :"+ex);
        }
        
        return row_update;
    }
    
    //3. delete 
    public int delete(int mid)
    {
        int row_delete = 0;
        try
        {
            Connection con = HotelDBConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "delete from Manager where mid="+mid;
            
            row_delete = stmt.executeUpdate(qry);
        }
        catch(Exception ex)
        {
            System.out.println("Delete Error :"+ex);
        }
        
        return row_delete;
    }
    
    //4. select 
    public void display()
    {
        try
        {
            Connection con = HotelDBConnection.connect();
            Statement stmt = con.createStatement();
            
            String qry = "select * from Manager";
            
            ResultSet rs = stmt.executeQuery(qry);
            
            
            while(rs.next())
            {
             
       
            int i = rs.getInt("mid");
            String f = rs.getString("name");
            double l = rs.getDouble("salary");
            String s = rs.getString("shift");
                
                System.out.println("Manager ID: "+i);
                System.out.println("Manager Name: "+f);
                System.out.println("Manager Salary: "+l);
                System.out.println("Manager Shift: "+s);
                
                System.out.println("========================");
                
            }//while ends
            
        }//try ends
        catch(Exception ex)
        {
            System.out.println("Display Error :"+ex);
        }//catch ends
    }//display ends
    
    
}//class ends
