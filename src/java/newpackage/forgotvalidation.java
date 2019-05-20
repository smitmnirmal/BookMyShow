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
 * @author Smit
 */
@WebServlet(name = "forgotvalidation", urlPatterns = {"/forgotvalidation"})
public class forgotvalidation extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        
        String email=request.getParameter("email");
        String secque=request.getParameter("questions");
        String answer=request.getParameter("answer");
        
        DAL d=new DAL();
        int flag=d.forgot(email, secque, answer);
        
        if(flag==1)
        {
            HttpSession session=request.getSession();
            session.setAttribute("forgotname", email);
            response.sendRedirect("changepass.html");
        }
        else
        {
            out.println("<html><body><script>alert('Enter Right Answer of security question');</script></body></html>");
            response.sendRedirect("forgot.html");
        }
    }
}
