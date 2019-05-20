package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
@WebServlet(name = "welcome", urlPatterns = {"/welcome"})
public class welcome extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String name,mail,pic,date,ticket;
            Exception e;
            HttpSession sessionsa = request.getSession(false);
            name=(String)sessionsa.getAttribute("username");
            mail=(String)sessionsa.getAttribute("email");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"utf-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">");
            out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>");
            out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>");
            
            out.println("<title>Welcome ");
            out.println(name);
            out.println("</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
            out.println("<div class=\"container\">");
            out.println("<h2>Booked Tickets</h2>");
            out.println("<table class=\"table table-striped\">");
            out.println("<thead>");
            out.println("<tr>\n" +
"        <th>Picture name</th>\n" +
"        <th>Date</th>\n" +
"        <th>Seat number</th>\n" +
"      </tr>\n" +
"    </thead>\n" +
"    <tbody>");
            
            try 
                    {
                    DAL d=new DAL();
                    Connection cn= d.connection();
                    
                    PreparedStatement pst;
                    String sql ="select * from SMIT.BOOKEDTICKETS where email=?";
                    pst = cn.prepareStatement(sql);
                    pst.setString(1, mail);
                    
                    ResultSet rs = pst.executeQuery();

                    while(rs.next())
                    {
            
            out.println("<tr> <td>");
                
                    pic=rs.getString(2).toString();
                    out.println(pic);
                    
            out.println("</td><td>");
            
            out.println("</td><td>");
            
                    ticket=rs.getString(3).toString();
                    out.println(ticket);
                    
            out.println("</td></tr>");
                    }
                    rs.close();
                                }
                                catch (SQLException ex) 
                                {   
                                    out.println(ex);
                                }            
           
            out.println("</body>");
            out.println("</html>");
        }
    }
}
