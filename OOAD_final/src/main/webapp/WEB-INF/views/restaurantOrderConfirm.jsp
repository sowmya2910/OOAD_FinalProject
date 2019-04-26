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
 Yayy! Your order is Confirmed!</br>
 You ordered Veggie Burger: ${Quantity1}<br>
 You ordered Veggie Pesto Panini: ${Quantity2}<br>
 You ordered Tofu Sandwich: ${Quantity3}<br>
 You ordered Meatloaf Sandwich: ${Quantity4}<br>
 You ordered Turkey Bacon Sandwich: ${Quantity5}<br>
 You ordered BLT Burger: ${Quantity6}<br>
 You ordered Mashed Potatoes: ${Quantity7}<br>
 You ordered Steak Burger: ${Quantity8}<br>
 You ordered Classic Fries: ${Quantity9}<br>
 You ordered Jalapeno Fries: ${Quantity10}<br>
 You ordered Nachos: ${Quantity11}<br>
 You ordered Onion Rings: ${Quantity12}<br>
 <a href="/getBill" class="btn btn-lg btn-success btn-block" role="button">Get the bill</a>
</body>
</html>

<%@ include file="commonCode/footer.jspf"%>