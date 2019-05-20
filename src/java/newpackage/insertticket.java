package newpackage;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "insertticket", urlPatterns = {"/insertticket"})
public class insertticket extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            doPost(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String picture=null,tickets=null,date=null;
        int total=0;
        
        HttpSession ses=request.getSession(false);
        
        //String user=request.getAttribute("username").toString();
        String mail=ses.getAttribute("mail").toString();
        
        Cookie ck[]=request.getCookies();
        if(ck!=null)
        {
            for(Cookie ck1 : ck)
            {
                if (ck1.getName().equals("pname")) {
                    picture=(String)ck1.getValue();
                }
                if (ck1.getName().equals("seats")) {
                    tickets=(String)ck1.getValue();
                }
                if (ck1.getName().equals("date")) {
                    date=(String)ck1.getValue();
                }
                if (ck1.getName().equals("total")) {
                    total=Integer.parseInt(ck1.getValue());
                }
            }
        }
        if(picture!=null && tickets!=null && mail!=null && date!=null)
        {
            DAL d=new DAL();
            d.insertticket(mail, picture, tickets, date, total+100);
            
            RequestDispatcher rd=request.getRequestDispatcher("dashboard.jsp");
            rd.forward(request, response);
        }
        else
        {
            RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
            rd.forward(request, response);
        
        }
    }
}
