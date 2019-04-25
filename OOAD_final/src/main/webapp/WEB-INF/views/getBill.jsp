<%@ include file="commonCode/header.jspf"%>
<%@ include file="commonCode/navigation.jspf"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Bill is here.</title>
</head>
<body>
<div class="container">
<div class="col-lg-10 mx-auto col-12 text-center mb-3">
            <h1 class="mt-0 text-primary">Your total is: $${total}</h1>
 <br>
	<a href="/payBill" class="btn btn-default" role="button">Pay the bill</a>
	</div>
</body>
</html>

<%@ include file="commonCode/footer.jspf"%>
<style CSS>
body {
  background: url("https://assets.dmagstatic.com/wp-content/uploads/2010/06/restaurant-check1.jpg");
  background-repeat: no-repeat;
  background-size: auto;
}

</style>