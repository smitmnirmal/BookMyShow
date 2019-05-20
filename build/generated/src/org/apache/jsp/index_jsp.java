package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


        String name;
        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            HttpSession sessionsa = request.getSession(false);
            
            try
            {
            name=(String)sessionsa.getAttribute("username");
            
                if(name!=null)
                {
                    RequestDispatcher rd=request.getRequestDispatcher("dashboard.jsp");
                    rd.forward(request, response);
                }
            }
            catch(Exception ex)
            {
            }

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TicketBooker|Book Tickets</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("            <style>\n");
      out.write("            body {\n");
      out.write("                position: relative; \n");
      out.write("            }\n");
      out.write("            .affix {\n");
      out.write("                top:0;\n");
      out.write("                width: 100%;\n");
      out.write("                z-index: 9999 !important;\n");
      out.write("            }\n");
      out.write("            .navbar {\n");
      out.write("                margin-bottom: 0px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .affix ~ .container-fluid {\n");
      out.write("               position: relative;\n");
      out.write("               top: 50px;\n");
      out.write("            }\n");
      out.write("            .carousel-control {\n");
      out.write("                margin-top: 50px;\n");
      out.write("            }\n");
      out.write("            .carousel-inner > .item > img,\n");
      out.write("            .carousel-inner > .item > a > img {\n");
      out.write("            width: 100%;\n");
      out.write("            margin-top: 0px;\n");
      out.write("            }\n");
      out.write("            #section1 {margin-top:10px;margin-bottom:10px;padding-top:50px;color:#fff;background-color:#1E88E5;}\n");
      out.write("            #section2 {padding-top:50px;color: #fff; background-color: #673ab7;}\n");
      out.write("            #section3 {padding-top:50px;color: #fff; background-color: #ff9800;}\n");
      out.write("            #section41 {padding-top:50px;color: #fff; background-color: #00bcd4;}\n");
      out.write("            #section42 {padding-top:50px;color: #fff; background-color: #009688;}\n");
      out.write("            </style>\n");
      out.write("      </head>\n");
      out.write("      <body data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">\n");
      out.write("\n");
      out.write("<!--        <div class=\"container-fluid\" style=\"background-color:#F44336;color:#fff;height:200px;\">\n");
      out.write("          <h1>Scrollspy & Affix Example</h1>\n");
      out.write("          <h3>Fixed navbar on scroll</h3>\n");
      out.write("          <p>Scroll this page to see how the navbar behaves with data-spy=\"affix\" and data-spy=\"scrollspy\".</p>\n");
      out.write("          <p>The navbar is attached to the top of the page after you have scrolled a specified amount of pixels, and the links in the navbar are automatically updated based on scroll position.</p>\n");
      out.write("        </div>  -->\n");
      out.write("\n");
      out.write("      <nav class=\"navbar navbar-inverse\" data-spy=\"affix\" data-offset-top=\"197\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <div class=\"navbar-header\">\n");
      out.write("              <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">TicketBooker</a>\n");
      out.write("          </div>\n");
      out.write("          <div>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("              <ul class=\"nav navbar-nav\">\n");
      out.write("                <li><a href=\"#section1\">Movies</a></li>\n");
      out.write("                <li><a href=\"#section2\">Events</a></li>\n");
      out.write("         <!--       <li><a href=\"#section3\">NULL</a></li>   -->\n");
      out.write("      <!--          <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Movies<span class=\"caret\"></span></a>\n");
      out.write("                  <ul class=\"dropdown-menu\">\n");
      out.write("                    <li><a href=\"#section1\">Hindi</a></li>\n");
      out.write("                    <li><a href=\"#section22\">English</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </li> -->\n");
      out.write("              </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a href=\"signup.html\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("                    <li><a href=\"login.html\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </nav>    \n");
      out.write("\n");
      out.write("      <div class=\"container\">\n");
      out.write("  <br>\n");
      out.write("  <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("    <!-- Indicators -->\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("    <!--  <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li> -->\n");
      out.write("    </ol>\n");
      out.write("\n");
      out.write("    <!-- Wrapper for slides -->\n");
      out.write("    <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("\n");
      out.write("      <div class=\"item active\">\n");
      out.write("          <a href=\"login.html\"><img src=\"img\\Kaabil.jpg\" alt=\"Kaabil\" width=\"600\" height=\"400\" align=\"centre\"></a>>\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("          <h3>Kaabil</h3>\n");
      out.write("          <p>The mind sees all.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("          <a href=\"login.html\"><img src=\"img\\Raees.jpg\" alt=\"Raees\" width=\"460\" height=\"345\"></a>\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("          <h3>Raees</h3>\n");
      out.write("          <p>Baniye ka dimag aur miyanbhai ki daring.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("      <div class=\"item\">\n");
      out.write("        <a href=\"login.html\"><img src=\"img\\Dangal.jpg\" alt=\"Flower\" width=\"460\" height=\"345\"></a>\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("          <h3>Dangal</h3>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("<!--      <div class=\"item\">\n");
      out.write("        <img src=\"img_flower2.jpg\" alt=\"Flower\" width=\"460\" height=\"345\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("          <h3>Flowers</h3>\n");
      out.write("          <p>Beautiful flowers in Kolymbari, Crete.</p>\n");
      out.write("        </div>  -->\n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Left and right controls -->\n");
      out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"sr-only\">Previous</span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"sr-only\">Next</span>\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("<!--</div>-->\n");
      out.write("        \n");
      out.write("      <div id=\"section1\" class=\"row\">\n");
      out.write("        <div class=\"col-sm-3 col-md-6 col-lg-4\" style=\"background-color:#cb7ddb; padding:30px;\">\n");
      out.write("            <a href='login.html'><img src=\"img/Kaabil.jpg\" alt=\"Flower\" width=\"400\" height=\"200\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-3 col-md-6 col-lg-4\" style=\"background-color:#91831d; padding:30px\">\n");
      out.write("            <a href='login.html'><img src=\"img/Raees.jpg\" alt=\"Flower\" width=\"400\" height=\"200\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-3 col-md-6 col-lg-4\" style=\"background-color:#7aef89; padding:30px\">\n");
      out.write("            <a href='login.html'><img src=\"img/Dangal.jpg\" alt=\"Flower\" width=\"400\" height=\"200\"></a>\n");
      out.write("        </div>\n");
      out.write("          <div class=\"col-sm-3 col-md-6 col-lg-4\" style=\"background-color:#f28321; padding:30px;\">\n");
      out.write("            <a href='login.html'><img src=\"img/Kaabil.jpg\" alt=\"Flower\" width=\"400\" height=\"200\"></a>\n");
      out.write("          </div>\n");
      out.write("        <div class=\"col-sm-3 col-md-6 col-lg-4\" style=\"background-color:#d9f76f; padding:30px\">\n");
      out.write("            <a href='login.html'><img src=\"img/Raees.jpg\" alt=\"Flower\" width=\"400\" height=\"200\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-3 col-md-6 col-lg-4\" style=\"background-color:#88a3ce; padding:30px\">\n");
      out.write("            <a href=\"login.html\"><img src=\"img/Dangal.jpg\" alt=\"Flower\" width=\"400\" height=\"200\"></a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"section2\" class=\"container-fluid\">\n");
      out.write("        <div class=\"col-sm-3 col-md-6 col-lg-4\" style=\"background-color:#cb7ddb; padding:30px;\">\n");
      out.write("            <a href='login.html'><img src=\"img/Kaabil.jpg\" alt=\"Flower\" width=\"400\" height=\"200\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-3 col-md-6 col-lg-4\" style=\"background-color:#91831d; padding:30px\">\n");
      out.write("            <a href='login.html'><img src=\"img/Kaabil.jpg\" alt=\"Flower\" width=\"400\" height=\"200\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-3 col-md-6 col-lg-4\" style=\"background-color:#7aef89; padding:30px\">\n");
      out.write("            <a href='login.html'><img src=\"img/Kaabil.jpg\" alt=\"Flower\" width=\"400\" height=\"200\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-3 col-md-6 col-lg-4\" style=\"background-color:#f28321; padding:30px;\">\n");
      out.write("            <a href='login.html'><img src=\"img/Kaabil.jpg\" alt=\"Flower\" width=\"400\" height=\"200\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-3 col-md-6 col-lg-4\" style=\"background-color:#d9f76f; padding:30px\">\n");
      out.write("            <a href='login.html'><img src=\"img/Kaabil.jpg\" alt=\"Flower\" width=\"400\" height=\"200\"></a>\n");
      out.write("        </div>\n");
      out.write("          <div class=\"col-sm-3 col-md-6 col-lg-4\" style=\"background-color:#88a3ce; padding:30px\">\n");
      out.write("            <a href='login.html'><img src=\"img/Kaabil.jpg\" alt=\"Flower\" width=\"400\" height=\"200\"></a>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write(" <!--     <div id=\"section3\" class=\"container-fluid\">\n");
      out.write("        <h1>Section 3</h1>\n");
      out.write("        <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>\n");
      out.write("        <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"section41\" class=\"container-fluid\">\n");
      out.write("        <h1>Section 4 Submenu 1</h1>\n");
      out.write("        <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>\n");
      out.write("        <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"section42\" class=\"container-fluid\">\n");
      out.write("        <h1>Section 4 Submenu 2</h1>\n");
      out.write("        <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>\n");
      out.write("        <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>\n");
      out.write("      </div>\n");
      out.write("    -->\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
