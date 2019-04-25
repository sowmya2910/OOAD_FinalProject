<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="commonCode/header.jspf"%>
<%@ include file="commonCode/navigation.jspf"%>


<c:set var="contextPath" value=""/>

<style><%@ include file = "login.css"%></style>
<!DOCTYPE html>
<html lang="en">
<body>

<div class="container">

    <form method="POST" action="/login" class="form-signin">
        <h2 class="form-heading">Welcome to Double Roti! </h2>
		<div>

           <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Sign Up</button>
        </div>
        		<div>

           <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Log In</button>
        </div>

    </form>

</div>
<!-- /container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>

<%@ include file="commonCode/footer.jspf"%>
</html>
<%@ include file="commonCode/footer.jspf"%>

<style>
	signin-fo {
		max-width: 330px;
		color:black;
	}
</style>