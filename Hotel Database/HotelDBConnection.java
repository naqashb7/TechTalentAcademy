//only DB connection

import java.sql.Connection;
import java.sql.DriverManager;


public class HotelDBConnection {
    public static Connection connect()
    {
        Connection con =null;
        try
        {
       String URL = "jdbc:mysql://localhost:3306/tta";//DB location
       String user = "root";//DB user name
       String pwd = "";//DB password
       con = DriverManager.getConnection(URL , user , pwd);
        }//try ends
        catch (Exception ex)
        {
                    System.out.println("DB ERROR: " +ex);
        }//catch ends
        
        return con;
    }//main ends
    
    
    
}//class ends
