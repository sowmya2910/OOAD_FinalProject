<%@ include file="commonCode/header.jspf"%>
<%@ include file="commonCode/navigation.jspf"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
 <p><h2>Yayy! Your order is Confirmed!</br></h2></p>
 <p>You ordered Veggie Burger: ${Quantity1}<br><p>
 <p>You ordered Veggie Pesto Panini: ${Quantity2}<br><p>
 <p>You ordered Tofu Sandwich: ${Quantity3}<br><p>
 <p>You ordered Meatloaf Sandwich: ${Quantity4}<br><p>
 <p>You ordered Turkey Bacon Sandwich: ${Quantity5}<br><p>
 <p>You ordered BLT Burger: ${Quantity6}<br><p>
 <p>You ordered Mashed Potatoes: ${Quantity7}<br><p>
 <p>You ordered Steak Burger: ${Quantity8}<br><p>
 <p>You ordered Classic Fries: ${Quantity9}<br><p>
 <p>You ordered Jalapeno Fries: ${Quantity10}<br><p>
 <p>You ordered Nachos: ${Quantity11}<br><p>
 <p>You ordered Onion Rings: ${Quantity12}<br><p>

 <a href="/getBill" class="btn btn-success" role="button">Get the bill</a>
 </div>
</body>
</html>

<%@ include file="commonCode/footer.jspf"%>