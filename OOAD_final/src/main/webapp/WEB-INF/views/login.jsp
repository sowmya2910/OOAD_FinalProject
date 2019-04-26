<!-- 
/**
* @author Sravanth Yajamanam/Sowmya Ramakrishnan
*/


/*
* Login page
*/
-->

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
    	<h2 style="color:red;" class="form-heading">${warning}</h2>
        <h2 class="form-heading">${name}${comma} Log in to restaurant to place an order/view and pay bills.</h2>
		<div>
        <div class="form-label-group">
     
            <input name="username" type="text" class="form-control" placeholder="Username"
                   autofocus="true"/>
        </div>
        <div class="form-label-group">
            <input name="password" type="password" class="form-control" placeholder="Password"/>
     	</div>

           <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Sign in</button>
           
        </div>
        
    </form>
    <a href="/signup" class="btn btn-primary btn-block text-uppercase" role="button">Sign Up</a>

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
