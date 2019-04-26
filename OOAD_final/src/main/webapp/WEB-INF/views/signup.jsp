<!-- 
/**
* @author Sravanth Yajamanam/Sowmya Ramakrishnan
*/


/*
* Sign Up
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

    <form method="POST" action="/signup" class="form-signin">
        <h2 class="form-heading">Create an account to get started.</h2>
 
                    <input type="text" name="email" value="" class="form-control input-lg" placeholder="Username"  />
                    <input type="password" name="password" value="" class="form-control input-lg" placeholder="Password"  />
                    <input type="password" name="confirm_password" value="" class="form-control input-lg" placeholder="Confirm Password"  />

           <!-- <a href="/login" class="btn btn-primary btn-block text-uppercase" role="button">Sign Up</a> -->
           <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Sign Up</button>
    </form>
    </div>

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
