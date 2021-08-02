<%-- 
    Document   : login
    Created on : 23 Jun 2021, 14:17:49
    Author     : naqash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login page</title>
    </head>
    <body>
    <center>
        <h1>The Commuter</h1>

        <hr/> 

        <h2>User Login</h2>

        <form action="check" method="POST">
        <table border="1" cellpadding="10">
           
                <tr>
                    <td>User Name</td>
                    <td><input type="text" name="uname" value="" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td> <input type="password" name="upass" value="" /> </td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login" /></td>
                    <td><input type="reset" value="Clear" /></td>
                </tr>            
        </table>       
        
    </form>
    </center>
</body>
</html>
