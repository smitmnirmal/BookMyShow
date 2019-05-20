package newpackage;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "validate", urlPatterns = {"/validate"})
public class validate extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String mail=request.getParameter("email");
        String pass=request.getParameter("pass");
        
        DAL d1=new DAL();
        int a=d1.search(mail,pass);
        String name=d1.searchname(mail);
        
        HttpSession session=request.getSession();
        session.setAttribute("username", name);
        session.setAttribute("email", mail);
        
        if(a==1)
        {
            RequestDispatcher rd=request.getRequestDispatcher("dashboard.jsp");
            rd.include(request, response);
        }
        else if(a!=1)
        {
            RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
            rd.include(request, response);
        }   
    }
}
