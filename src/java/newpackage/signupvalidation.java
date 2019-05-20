/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
@WebServlet(name = "signupvalidation", urlPatterns = {"/signupvalidation"})
public class signupvalidation extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        PrintWriter out=response.getWriter();
        
        String name=request.getParameter("name");
        String pass=request.getParameter("pass");
        String repass=request.getParameter("repass");
        String mail=request.getParameter("email");
        String username=request.getParameter("username");
        String secque=request.getParameter("questions");
        String answer=request.getParameter("answer");
        
        if(pass!="NULL" && pass.equals(repass) && name!="NULL" && mail.length()>5 && username!="NULL" && pass.length()>7 && answer!=null)
        {
            DAL d=new DAL();
            d.insert(name,mail,pass,username,secque,answer);
            
            RequestDispatcher rd=request.getRequestDispatcher("login.html");
            rd.forward(request, response);
        }
        else
        {
            if(name.length()==0)
            {
                out.println("<html><body><script>alert('Enter Name');</script></body></html>");
            }
            else if(username.length()==0)
            {
                out.println("<html><body><script>alert('Enter User Name');</script></body></html>");
            }
            else if(pass.length()==0)
            {
                out.println("<html><body><script>alert('Enter password!');</script></body></html>");
            }
            else if(!pass.equals(repass))
            {
                out.println("<html><body><script>alert('Check your re-entered password!');</script></body></html>");
            }
            else if(mail.length()<5)
            {
                out.println("<html><body><script>alert('Enter Proper emaill address!');</script></body></html>");
            }
            else if(pass.length()<8)
            {
                out.println("<html><body><script>alert('Enter Password of length 8 or more.');</script></body></html>");
            }
            if(answer.length()==0)
            {
                out.println("<html><body><script>alert('Enter Answer of security question');</script></body></html>");
            }
            RequestDispatcher rd=request.getRequestDispatcher("signup.html");
            rd.include(request, response);
        }
    }
}
