<%-- 
    Document   : profile
    Created on : 23 Jun 2021, 15:10:35
    Author     : naqash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Profile</title>
    </head>
    <body>
   
    <%
    
        //get current session
        HttpSession se = request.getSession(false);
    
        
        String myuser = se.getAttribute("myuser").toString();// Object -> String
        /*
        true -> will create a new session
        false -> will use the current session
        */
    
    if(myuser == null|| myuser.equals("")|| myuser.equals(null))
    {
        out.print("You need to login first");
        request.getRequestDispatcher("login.jsp").include(request, response);
    }
    else
    {
     %>
    
     <center>
        <h1>Your Journey has begun</h1>
    </center>
    <hr/>
    <p>
        Begin your journey with a nice refreshing drink of MONSTER ENERGY.
    </p>
        
    <hr/>    
    
    <form action="logout">
        
        <input type="submit" value="Log Out"/>
        
        
    </form>
        
        <% 
    }
    %>
    
    
    
    
    

</body>
</html>
