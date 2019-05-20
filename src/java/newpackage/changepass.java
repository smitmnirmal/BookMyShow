/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dell
 */
@WebServlet(name = "changepass", urlPatterns = {"/changepass"})
public class changepass extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String email,pass,repass;
        
        HttpSession sessionsa = request.getSession(false);
            email=(String)sessionsa.getAttribute("forgotname");
            
            pass=request.getParameter("pass");
            repass=request.getParameter("repass");
            
            if(pass.equals(repass))
            {
                DAL d=new DAL();
                d.changepass(email,pass);
                response.sendRedirect("login.html");
            }
            else
            {
                out.println("<html><body><script>alert('Re-entered password must be same as password');</script></body></html>");
                response.sendRedirect("changepass.html");
            }
    }

}
