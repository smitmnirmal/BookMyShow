package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import newpackage.DAL;

public final class tecketselection_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <title>Select Your Ticket</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://www.goocode.net/demo/img/style.css\">\n");
      out.write("<script type=\"text/javascript\" src=\"http://www.goocode.net/demo/img/jquery-1.11.0.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"http://www.goocode.net/demo/seat/jquery.seat-charts.min.js\"></script>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .front{width: 300px;margin: 5px 32px 45px 32px;background-color: #f0f0f0; color: #666;text-align: center;padding: 3px;border-radius: 5px;} \n");
      out.write("            .booking-details {margin-top:10px; float:right; position:relative; width:400px;height:100%; } \n");
      out.write("            .booking-details h3 {margin: 5px 5px 0 0;font-size: 16px;} \n");
      out.write("            .booking-details p{line-height:26px; font-size:16px; color:#999} \n");
      out.write("            .booking-details p span{color:#666} \n");
      out.write("            div.seatCharts-cell {color: #182C4E;height: 25px;width: 25px;line-height: 25px;margin: 3px;float: left;text-align: center;outline: none;font-size: 13px;} \n");
      out.write("            div.seatCharts-seat {color: #fff;cursor: pointer;-webkit-border-radius:5px;-moz-border-radius:5px;border-radius: 5px;} \n");
      out.write("            div.seatCharts-row {height: 35px;} \n");
      out.write("            div.seatCharts-seat.available {background-color: #B9DEA0;} \n");
      out.write("            div.seatCharts-seat.focused {background-color: #76B474;border: none;} \n");
      out.write("            div.seatCharts-seat.selected {background-color: #E6CAC4;} \n");
      out.write("            div.seatCharts-seat.unavailable {background-color: #472B34;cursor: not-allowed;} \n");
      out.write("            div.seatCharts-container {border-right: 1px dotted #adadad;width: 400px;padding: 20px;float: left;} \n");
      out.write("            div.seatCharts-legend {padding-left: 0px;position: absolute;bottom: 16px;} \n");
      out.write("            ul.seatCharts-legendList {padding-left: 0px;} \n");
      out.write("            .seatCharts-legendItem{float:left; width:90px;margin-top: 10px;line-height: 2;} \n");
      out.write("            span.seatCharts-legendDescription {margin-left: 5px;line-height: 30px;} \n");
      out.write("            .checkout-button {display: block;width:80px; height:24px; line-height:20px;margin: 10px auto;border:1px solid #999;font-size: 14px; cursor:pointer} \n");
      out.write("            #selected-seats {max-height: 150px;overflow-y: auto;overflow-x: none;width: 200px;} \n");
      out.write("            #selected-seats li{float:left; width:72px; height:26px; line-height:26px; border:1px solid #d3d3d3; background:#f7f7f7; margin:6px; font-size:14px; font-weight:bold; text-align:center}\n");
      out.write("       </style>    \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String pname=request.getParameter("pname");  
        
      out.write("\n");
      out.write("        <div class=\"demo\">\n");
      out.write("   \t\t<div id=\"seat-map\">\n");
      out.write("\t\t\t<div class=\"front\">SCREEN</div>\t\t\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"booking-details\">\n");
      out.write("                    <p>Movie: <span>");
      out.print(pname);
      out.write("</span></p>\n");
      out.write("\t\t\t<p>Time: <span id=\"date1\"></span></p>\n");
      out.write("\t\t\t<p>Seat: </p>\n");
      out.write("\t\t\t<ul id=\"selected-seats\"></ul>\n");
      out.write("\t\t\t<p>Tickets: <span id=\"counter\">0</span></p>\n");
      out.write("\t\t\t<p>Total: <b>₹<span id=\"total\">0</span></b></p>\n");
      out.write("                        <!--<form action=\"insertticket\" method=\"post\">  -->\t\t\n");
      out.write("                            <button class=\"checkout-button\" onclick=\"buy()\" type=\"submit\">BUY</button>\n");
      out.write("                            \n");
      out.write("                            <form action=\"insertticket\" method=\"post\">\n");
      out.write("                                <button type=\"submit\">OK</button>\n");
      out.write("                            </form>    \n");
      out.write("\t\t\t<!--<div id=\"legend\"></div> -->\n");
      out.write("\t\t</div>\n");
      out.write("<!--\t\t<div style=\"clear:both\"></div>  -->\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var price = 100; //price\n");
      out.write("            var seats=[];\n");
      out.write("            var res=[];\n");
      out.write("            var pseatsa=[];\n");
      out.write("            var sc;\n");
      out.write("            var $cart;\n");
      out.write("            //var dt=moment().format('ddd, ll');\n");
      out.write("            \n");
      out.write("$(document).ready(function() {\n");
      out.write("\t $cart = $('#selected-seats'), //Sitting Area\n");
      out.write("\t$counter = $('#counter'), //Votes\n");
      out.write("\t$total = $('#total'); //Total money\n");
      out.write("\t\n");
      out.write("        pseatsa=localStorage.getItem(\"");
      out.print(pname);
      out.write("\");\n");
      out.write("        res=[];\n");
      out.write("        if(pseatsa!=null)\n");
      out.write("        {\n");
      out.write("        res=pseatsa.split(\",\");\n");
      out.write("        res.splice(-1,1);\n");
      out.write("        }\n");
      out.write("        console.log(Array.isArray(res));\n");
      out.write("        console.log(res);\n");
      out.write("        \n");
      out.write("\tsc = $('#seat-map').seatCharts({\n");
      out.write("\t\tmap: [  //Seating chart\n");
      out.write("\t\t\t'aaaaaaaaa',\n");
      out.write("                        'aaaaaaaaa',\n");
      out.write("                        '_________',\n");
      out.write("                        'aaaaaaa__',\n");
      out.write("                        'aaaaaaaaa',\n");
      out.write("                        'aaaaaaaaa',\n");
      out.write("\t\t\t'aaaaaaaaa',\n");
      out.write("\t\t\t'aaaaaaaaa',\n");
      out.write("\t\t\t'aaaaaaaaa'\n");
      out.write("\t\t],\n");
      out.write("\t\tnaming : {\n");
      out.write("\t\t\ttop : false,\n");
      out.write("\t\t\tgetLabel : function (character, row, column) {\n");
      out.write("\t\t\t\treturn column;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t},\n");
      out.write("\t\tlegend : { //Definition legend\n");
      out.write("\t\t\tnode : $('#legend'),\n");
      out.write("\t\t\titems : [\n");
      out.write("\t\t\t\t[ 'a', 'available',   'Option' ],\n");
      out.write("\t\t\t\t[ 'a', 'unavailable', 'Sold']\n");
      out.write("\t\t\t]\t\t\t\t\t\n");
      out.write("\t\t},\n");
      out.write("\t\tclick: function () { //Click event\n");
      out.write("\t\t\tif (this.status() == 'available') { //optional seat\n");
      out.write("\t\t\t\t$('<li>R'+(this.settings.row+1)+' S'+this.settings.label+'</li>')\n");
      out.write("\t\t\t\t\t.attr('id', 'cart-item-'+this.settings.id)\n");
      out.write("\t\t\t\t\t.data('seatId', this.settings.id)\n");
      out.write("\t\t\t\t\t.appendTo($cart);\n");
      out.write("\n");
      out.write("\t\t\t\t$counter.text(sc.find('selected').length+1);\n");
      out.write("\t\t\t\t$total.text(recalculateTotal(sc)+price);\n");
      out.write("                                 seats=[];\n");
      out.write("                                \n");
      out.write("            //console.log($cart[0]);\n");
      out.write("            $(\"ul li\").each(function(){seats.push(this.id.slice(10,13));});\n");
      out.write("            //console.log($(\"ul li\").attr('id'));\n");
      out.write("            //console.log(seats);\n");
      out.write("\t\t\t\treturn 'selected';\n");
      out.write("                                \n");
      out.write("\t\t\t} else if (this.status() == 'selected') { //Checked\n");
      out.write("\t\t\t\t\t//Update Number\n");
      out.write("\t\t\t\t\t$counter.text(sc.find('selected').length-1);\n");
      out.write("\t\t\t\t\t//update totalnum\n");
      out.write("\t\t\t\t\t$total.text(recalculateTotal(sc)-price);\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t//Delete reservation\n");
      out.write("\t\t\t\t\t$('#cart-item-'+this.settings.id).remove();\n");
      out.write("\t\t\t\t\t//optional\n");
      out.write("\t\t\t\t\treturn 'available';\n");
      out.write("\t\t\t} else if (this.status() == 'unavailable') { //sold\n");
      out.write("\t\t\t\treturn 'unavailable';\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\treturn this.style();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("        \n");
      out.write("        //$date1.text(dt);\n");
      out.write("        \n");
      out.write("        if(res!=null)\n");
      out.write("        {\n");
      out.write("            sc.get(res).status('unavailable');\n");
      out.write("        }\n");
      out.write("        //\n");
      out.write("//sold seat\n");
      out.write("        //sc.get().status('unavailable');\n");
      out.write("\t//sc.get(['1_2', '4_4','4_5','6_6','6_7','8_5','8_6','8_7','8_8', '10_1', '10_2']).status('unavailable');\n");
      out.write("});\n");
      out.write("//sum total money\n");
      out.write("function recalculateTotal(sc) {\n");
      out.write("\tvar total = 0;\n");
      out.write("\tsc.find('selected').each(function () {\n");
      out.write("\t\ttotal += price;\n");
      out.write("\t});\n");
      out.write("\t//console.log($cart);\t\t\n");
      out.write("\treturn total;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function buy()\n");
      out.write("{\n");
      out.write("    var pseats=localStorage.getItem(\"");
      out.print(pname);
      out.write("\");\n");
      out.write("    \n");
      out.write("    document.cookie=\"pname=\"+");
      out.print(pname);
      out.write("+\"\";\n");
      out.write("    document.cookie=\"seats=\"+String(seats)+\"\";\n");
      out.write("    \n");
      out.write("    seats=seats.concat(pseats);\n");
      out.write("    localStorage.setItem(\"");
      out.print(pname);
      out.write("\",seats);\n");
      out.write("    \n");
      out.write("    sc.get(seats).status('unavailable');\n");
      out.write("    \n");
      out.write("    //$cart=[];\n");
      out.write("    //window.location.replace('http://localhost:8084/BookMyShow/ticket')\n");
      out.write("}\n");
      out.write("  \n");
      out.write("        </script>    \n");
      out.write("        \n");
      out.write("    </body>\n");
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
