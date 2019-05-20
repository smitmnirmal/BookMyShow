<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" session="false"%>

<html>
    <head>
        <title>TicketBooker|Book Tickets</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
            <style>
            body {
                position: relative; 
            }
            .affix {
                top:0;
                width: 100%;
                z-index: 9999 !important;
            }
            .navbar {
                margin-bottom: 0px;
            }

            .affix ~ .container-fluid {
               position: relative;
               top: 50px;
            }
            .carousel-control {
                margin-top: 50px;
            }
            .carousel-inner > .item > img,
            .carousel-inner > .item > a > img {
            width: 100%;
            margin-top: 0px;
            }
            #section1 {margin-top:10px;margin-bottom:10px;padding-top:50px;color:#fff;background-color:#1E88E5;}
            #section2 {padding-top:50px;color: #fff; background-color: #673ab7;}
            #section3 {padding-top:50px;color: #fff; background-color: #ff9800;}
            #section41 {padding-top:50px;color: #fff; background-color: #00bcd4;}
            #section42 {padding-top:50px;color: #fff; background-color: #009688;}
            </style>
      </head>
      <body data-spy="scroll" data-target=".navbar" data-offset="50">
        <%!
            String name;      
        %>
        <%
            HttpSession sessionsa = request.getSession(false);
            name=(String)sessionsa.getAttribute("username");
        %>

      <nav class="navbar navbar-inverse" data-spy="affix" data-offset-top="197">
        <div class="container-fluid">
          <div class="navbar-header">
              <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">TicketBooker</a>
          </div>
          <div>
            <div class="collapse navbar-collapse" id="myNavbar">
              <ul class="nav navbar-nav">
                <li><a href="#section1">Movies</a></li>
                <li><a href="#section2">Events</a></li>
              </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">Hello <%=name%></a></li>
                    <li><a href="welcome.jsp">Dashboard</a></li>
                    <li><a href="logout">Logout</a></li>
                    </ul>
            </div>
          </div>
        </div>
      </nav>    

      <div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
   </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">

      <div class="item active">
          <a href="tecketselection.jsp?pname=Bahubali2"><img src="img/bahubali2.jpg" alt="Kaabil" width="600" height="400" align="centre"></a>>
        <div class="carousel-caption">
          <h3>Bahubali 2</h3>
          <p></p>
        </div>
      </div>

      <div class="item">
          <a href="tecketselection.jsp?pname=FF8"><img src="img/ff8.jpg" alt="Raees" width="460" height="345"></a>
        <div class="carousel-caption">
          <h3>Fast & Furious 8</h3>
          <p></p>
        </div>
      </div>
    
      <div class="item">
        <a href="tecketselection.jsp?pname=Wrong Side Raju"><img src="img/wrongsideraju.jpg" alt="Flower" width="460" height="345"></a>
        <div class="carousel-caption">
          <h3>Wrong Side Raju</h3>
        </div>
      </div>

      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
<!--</div>-->
        
      <div id="section1" class="row">
        <div class="col-sm-3 col-md-6 col-lg-4" style="background-color:#cb7ddb; padding:30px;">
            <a href='tecketselection.jsp?pname=Bahubali2'><img src="img/bahubali2.jpg" alt="Flower" width="400" height="200"></a>
        </div>
        <div class="col-sm-3 col-md-6 col-lg-4" style="background-color:#91831d; padding:30px">
            <a href='tecketselection.jsp?pname=Begum Jaan'><img src="img/begumjaan.jpg" alt="Flower" width="400" height="200"></a>
        </div>
        <div class="col-sm-3 col-md-6 col-lg-4" style="background-color:#7aef89; padding:30px">
            <a href='tecketselection.jsp?pname=FF8'><img src="img/ff8.jpg" alt="Flower" width="400" height="200"></a>
        </div>
          <div class="col-sm-3 col-md-6 col-lg-4" style="background-color:#88a3ce; padding:30px">
            <a href="tecketselection.jsp?pname=Noor"><img src="img/noor.jpg" alt="Flower" width="400" height="200"></a>
        </div>
          <div class="col-sm-3 col-md-6 col-lg-4" style="background-color:#f28321; padding:30px;">
            <a href='tecketselection.jsp?pname=Kaabil'><img src="img/Kaabil.jpg" alt="Flower" width="400" height="200"></a>
          </div>
        <div class="col-sm-3 col-md-6 col-lg-4" style="background-color:#d9f76f; padding:30px">
            <a href='tecketselection.jsp?pname=Raees'><img src="img/Raees.jpg" alt="Flower" width="400" height="200"></a>
        </div>
        <div class="col-sm-3 col-md-6 col-lg-4" style="background-color:#88a3ce; padding:30px">
            <a href="tecketselection.jsp?pname=Dangal"><img src="img/Dangal.jpg" alt="Flower" width="400" height="200"></a>
        </div>
          <div class="col-sm-3 col-md-6 col-lg-4" style="background-color:#88a3ce; padding:30px">
            <a href="tecketselection.jsp?pname=Wrong Side Raju"><img src="img/wrongsideraju.jpg" alt="Flower" width="400" height="200"></a>
        </div>
      </div>
 <!--     <div id="section2" class="container-fluid">
        <div class="col-sm-3 col-md-6 col-lg-4" style="background-color:#cb7ddb; padding:30px;">
            <a href='tecketselection.jsp?pname=Kaabil'><img src="img/Kaabil.jpg" alt="Flower" width="400" height="200"></a>
        </div>
        <div class="col-sm-3 col-md-6 col-lg-4" style="background-color:#91831d; padding:30px">
            <a href='tecketselection.jsp?pname=Kaabil'><img src="img/Kaabil.jpg" alt="Flower" width="400" height="200"></a>
        </div>
        <div class="col-sm-3 col-md-6 col-lg-4" style="background-color:#7aef89; padding:30px">
            <a href='tecketselection.jsp?pname=Kaabil'><img src="img/Kaabil.jpg" alt="Flower" width="400" height="200"></a>
        </div>
        <div class="col-sm-3 col-md-6 col-lg-4" style="background-color:#f28321; padding:30px;">
            <a href='tecketselection.jsp?pname=Kaabil'><img src="img/Kaabil.jpg" alt="Flower" width="400" height="200"></a>
        </div>
        <div class="col-sm-3 col-md-6 col-lg-4" style="background-color:#d9f76f; padding:30px">
            <a href='tecketselection.jsp?pname=Kaabil'><img src="img/Kaabil.jpg" alt="Flower" width="400" height="200"></a>
        </div>
          <div class="col-sm-3 col-md-6 col-lg-4" style="background-color:#88a3ce; padding:30px">
            <a href='tecketselection.jsp?pname=Kaabil'><img src="img/Kaabil.jpg" alt="Flower" width="400" height="200"></a>
          </div>
      </div>
-->
</body>
</html>

