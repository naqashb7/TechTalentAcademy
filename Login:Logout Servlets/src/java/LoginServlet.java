
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;//session management

public class LoginServlet extends HttpServlet {

        String uname, upass;
        
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            

        //get request parameters
        uname = request.getParameter("uname");
        upass = request.getParameter("upass");
        
        //validate user from DB
        //user =Admin, password=admin123
        if(uname.equals("Admin") && upass.equals("admin123"))
        {
           
            
            //create session -> HTTPsession
                    
                    HttpSession se =request.getSession();//create new session
            
            //set current user in session
            se.setAttribute("myuser", uname);
            
             out.print("Welcome "+uname);
            request.getRequestDispatcher("profile.jsp").include(request, response);
            
        }//if ends
        else
                {
                    out.print("Sorry Login or Password is incorrect. Please try again.");
                    
                    //Resquest Dispatcher
                    //method 1: forward ()-> forward request to next page
                    //method 2: include()-> include content in same page
                    request.getRequestDispatcher("login.jsp").include(request, response);
                    
                    
                    
                    
                }//else ends
                
        } //try ends
        finally {
            out.close();
        }//finally ends
    }//class ends

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
