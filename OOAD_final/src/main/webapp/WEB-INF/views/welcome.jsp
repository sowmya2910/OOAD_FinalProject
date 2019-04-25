<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="commonCode/header.jspf"%>
<%@ include file="commonCode/navigation.jspf"%>

<c:set var="contextPath" value=""/>
<!DOCTYPE html>
<body>
 

<div class="container">
	<h2>Welcome <b>${name}</b>, to our foodie heaven! Order, Binge and Enjoy! </h2>

	<a href="/makeOrder" class="btn btn-default" role="button">Place an order</a>
	<a href="/getBill" class="btn btn-default" role="button">Get the bill</a>
	<!-- <button class="btn btn-lg btn-success btn-block" href="/payBill" type="submit">Pay the bill</button>  -->
</div>
</div>


<%@ include file="commonCode/footer.jspf"%>

</body>
</html>
<style CSS>
body {
  background: url("https://images.unsplash.com/photo-1521017432531-fbd92d768814?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80");
  background-repeat: no-repeat;
  background-size: cover;
  color: white;
}

</style>

