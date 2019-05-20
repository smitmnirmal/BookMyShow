<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="newpackage.DAL" %>
<!DOCTYPE html>
<html>
    <title>Select Your Ticket</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="http://www.goocode.net/demo/img/style.css">
<script type="text/javascript" src="http://www.goocode.net/demo/img/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="http://www.goocode.net/demo/seat/jquery.seat-charts.min.js"></script>

        
        <style type="text/css">
            .front{width: 300px;margin: 5px 32px 45px 32px;background-color: #f0f0f0; color: #666;text-align: center;padding: 3px;border-radius: 5px;} 
            .booking-details {margin-top:10px; float:right; position:relative; width:400px;height:100%; } 
            .booking-details h3 {margin: 5px 5px 0 0;font-size: 16px;} 
            .booking-details p{line-height:26px; font-size:16px; color:#999} 
            .booking-details p span{color:#666} 
            div.seatCharts-cell {color: #182C4E;height: 25px;width: 25px;line-height: 25px;margin: 3px;float: left;text-align: center;outline: none;font-size: 13px;} 
            div.seatCharts-seat {color: #fff;cursor: pointer;-webkit-border-radius:5px;-moz-border-radius:5px;border-radius: 5px;} 
            div.seatCharts-row {height: 35px;} 
            div.seatCharts-seat.available {background-color: #B9DEA0;} 
            div.seatCharts-seat.focused {background-color: #76B474;border: none;} 
            div.seatCharts-seat.selected {background-color: #E6CAC4;} 
            div.seatCharts-seat.unavailable {background-color: #472B34;cursor: not-allowed;} 
            div.seatCharts-container {border-right: 1px dotted #adadad;width: 400px;padding: 20px;float: left;} 
            div.seatCharts-legend {padding-left: 0px;position: absolute;bottom: 16px;} 
            ul.seatCharts-legendList {padding-left: 0px;} 
            .seatCharts-legendItem{float:left; width:90px;margin-top: 10px;line-height: 2;} 
            span.seatCharts-legendDescription {margin-left: 5px;line-height: 30px;} 
            .checkout-button {display: block;width:80px; height:24px; line-height:20px;margin: 10px auto;border:1px solid #999;font-size: 14px; cursor:pointer} 
            #selected-seats {max-height: 150px;overflow-y: auto;overflow-x: none;width: 200px;} 
            #selected-seats li{float:left; width:72px; height:26px; line-height:26px; border:1px solid #d3d3d3; background:#f7f7f7; margin:6px; font-size:14px; font-weight:bold; text-align:center}
       </style>    
        
    </head>
    <body>
        <%
            String pname=request.getParameter("pname");  
        %>
        <div class="demo">
   		<div id="seat-map">
			<div class="front">SCREEN</div>					
		</div>
		<div class="booking-details">
                    Movie:<p><%=pname%></p>
                    
                    Date:<p id="date"></p> 

                    Time:<p>
                             <label> 9 PM </label>
                    </p>
			<p>Seat: </p>
			<ul id="selected-seats"></ul>
			<p>Tickets: <span id="counter">0</span></p>
			<p>Total: <b>₹<span id="total">0</span></b></p>		
                        <button class="checkout-button" onclick="buy()" type="submit">BUY</button>
                        
                        <button class="checkout-button" onclick="silver()">SILVER</button>
                        <button class="checkout-button" onclick="gold()">GOLD</button>
                        <button class="checkout-button" onclick="platinum()">PLATINUM</button>
                        
                        
                        <!--    <form action="insertticket" method="post">
                                <button type="submit">OK</button>
                            </form>    
			<div id="legend"></div> -->
		</div>
<!--		<div style="clear:both"></div>  -->
        </div>
        
        <script type="text/javascript">
            var price = 100; //price
            var total = 0; //total
            
            var seats=[];
            var res=[];
            var pseatsa=[];
            var sc;
            var $cart;
            //var dt=moment().format('ddd, ll');

    n =  new Date();
    y = n.getFullYear();
    m = n.getMonth() + 1;
    d = n.getDate();
    var pdate=d+"/"+m+"/"+y;
    document.getElementById("date").innerHTML = d + "/" + m + "/" + y;
    
    
    
$(document).ready(function() {
	$cart = $('#selected-seats'), //Sitting Area
	$counter = $('#counter'), //Votes
	$total = $('#total'); //Total money
	
        pseatsa=localStorage.getItem("<%=pname%>"+d);
        res=[];
        if(pseatsa!=null)
        {
        res=pseatsa.split(",");
        //res.splice(-1,1);
        }
        console.log(Array.isArray(res));
        console.log(res);
        
	sc = $('#seat-map').seatCharts({
		map: [  //Seating chart
			'aaaaaaaaa',
                        'aaaaaaaaa',
                        '_________',
                        'aaaaaaa__',
                        'aaaaaaaaa',
                        'aaaaaaaaa',
			'aaaaaaaaa',
			'aaaaaaaaa',
			'aaaaaaaaa'
		],
		naming : {
			top : false,
			getLabel : function (character, row, column) {
				return column;
			}
		},
		legend : { //Definition legend
			node : $('#legend'),
			items : [
				[ 'a', 'available',   'Option' ],
				[ 'a', 'unavailable', 'Sold']
			]					
		},
		click: function () { //Click event
			if (this.status() == 'available') { //optional seat
				$('<li>R'+(this.settings.row+1)+' S'+this.settings.label+'</li>')
					.attr('id', 'cart-item-'+this.settings.id)
					.data('seatId', this.settings.id)
					.appendTo($cart);

				$counter.text(sc.find('selected').length+1);
				$total.text(recalculateTotal(sc)+price);
                                 seats=[];
                                
            //console.log($cart[0]);
            $("ul li").each(function(){seats.push(this.id.slice(10,13));});
            //console.log($("ul li").attr('id'));
            //console.log(seats);
				return 'selected';
                                
			} else if (this.status() == 'selected') { //Checked
					//Update Number
					$counter.text(sc.find('selected').length-1);
					//update totalnum
					$total.text(recalculateTotal(sc)-price);
						
					//Delete reservation
					$('#cart-item-'+this.settings.id).remove();
					//optional
					return 'available';
			} else if (this.status() == 'unavailable') { //sold
				return 'unavailable';
			} else {
				return this.style();
			}
		}
	});
        
        //$date1.text(dt);
        
        if(res!=null)
        {
            sc.get(res).status('unavailable');
        }
        //
//sold seat
        //sc.get().status('unavailable');
	//sc.get(['1_2', '4_4','4_5','6_6','6_7','8_5','8_6','8_7','8_8', '10_1', '10_2']).status('unavailable');
});
//sum total money
function recalculateTotal(sc) {
	total = 0;
	sc.find('selected').each(function () {
		total += price;
	});
	//console.log($cart);		
	return total;
}

function silver() {
	total = 0;
	sc.find('selected').each(function () {
		total += 150;
	});
	//console.log($cart);		
	$total.text(total);
}

function gold() {
	total = 0;
	sc.find('selected').each(function () {
		total += 200;
	});
	//console.log($cart);		
	$total.text(total);
}

function platinum() {
	total = 0;
	sc.find('selected').each(function () {
		total += 300;
	});
	//console.log($cart);		
	$total.text(total);
}

function buy()
{
    var moviename="<%=pname%>";
    var pseats=localStorage.getItem("<%=pname%>"+d);
    
    
    
    
    var cookieseats=seats.join("|");
    var ckseat = cookieseats.toString();
    document.cookie="pname="+moviename;
    document.cookie="seats="+ckseat;
    document.cookie="date="+pdate;
    document.cookie="total="+total;
    
    if(pseats!=null)
    {
        seats=seats.concat(pseats);
    }
    localStorage.setItem("<%=pname%>"+d,seats);
    
    
    sc.get(seats).status('unavailable');
    
    //$cart=[];
    window.location.replace('http://localhost:8084/BookMyShow/insertticket')
}
  
        </script>    
        
    </body>
</html>
