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
 You ordered Dish 1: ${Quantity1}<br>
 You ordered Dish 2: ${Quantity2}<br>
 You ordered Dish 3: ${Quantity3}<br>
 You ordered Dish 4: ${Quantity4}<br>
 You ordered Dish 5: ${Quantity5}<br>
 You ordered Dish 6: ${Quantity6}<br>
 You ordered Dish 7: ${Quantity7}<br>
 You ordered Dish 8: ${Quantity8}<br>
 You ordered Dish 9: ${Quantity9}<br>
 You ordered Dish 10: ${Quantity10}<br>
 You ordered Dish 11: ${Quantity11}<br>
 You ordered Dish 12: ${Quantity12}<br>
 <a href="/getBill" class="btn btn-lg btn-success btn-block" role="button">Get the bill</a>
</body>
</html>

<%@ include file="commonCode/footer.jspf"%>