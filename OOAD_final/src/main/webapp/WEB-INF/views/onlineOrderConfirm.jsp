<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="commonCode/header.jspf"%>
<%@ include file="commonCode/navigation.jspf"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yayy!</title>
</head>
<body>
<div class="container active">
 	<h3>Stay tuned <b>${name}</b> "the foodie". </h3></h3><br/> 
 	<h3>Your food is being prepared and will be delivered shortly to the address: <b>${address}</b> </h3>
 </div>
</body>
</html>

<style CSS>
body {
  background: url("https://cdn.shopify.com/s/files/1/0065/4917/6438/products/a-delivery-man-delivering-a-large-box-and-a-suburban-street-background_1200x1200.jpg?v=1538460471");
  background-repeat: no-repeat;
  background-size: cover;
  color: white;
}

</style>


<%@ include file="commonCode/footer.jspf"%>