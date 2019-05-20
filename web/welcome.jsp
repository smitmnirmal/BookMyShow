<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="newpackage.DAL"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html>
<%
        String name,mail;
        HttpSession sessionsa = request.getSession(false);
        name = (String) sessionsa.getAttribute("username");                 
        mail = (String) sessionsa.getAttribute("mail");
%>

<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title><% out.print(name); %>,Your Booked Tickets</title>
    </head>
    <body>
        <div class="container">
            <h2>Booked Tickets</h2>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Picture Name</th>
                        <th>Date</th>
                        <th>Show Time</th>
                        <th>Seat Numbers</th>
                        <th>Total Amount</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        out.println(mail);
                        DAL d = new DAL();
                        Connection cn = d.connection();
                        Statement st = null;
                        st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                        String query = "select * from SMIT.BOOKEDTICKETS where email='" + mail + "'";
                        ResultSet rs;
                        rs = st.executeQuery(query);
                        while (rs.next()) {
                            String picture = rs.getString("picture");
                            String ticket = rs.getString("ticket");
                            String date = rs.getString("date");
                            int total=rs.getInt("total");
                    %>
                    <tr>
                        <td>
                            <%
                                out.println(picture);
                            %>
                        </td>
                        <td>
                            <%
                                out.println(date);
                            %>
                        </td>
                        <td>
                            9:00 PM
                        </td>
                        <td>
                            <%
                                out.println(ticket);
                            %>
                        </td>
                        <td>
                            <%
                                out.println(total);
                            %>
                        </td>
                    </tr>
                    <%
                        }
                        rs.close();
                    %>
                </tbody>
            </table>
        </div>

    </body>
</html>
