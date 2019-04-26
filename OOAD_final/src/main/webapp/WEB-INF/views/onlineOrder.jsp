<!-- 
/**
* @author Sravanth Yajamanam/Sowmya Ramakrishnan
*/


/*
* Page to enable online order for home delivery
*/
-->

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="commonCode/header.jspf"%>
<%@ include file="commonCode/navigation.jspf"%>


<c:set var="contextPath" value=""/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Make a move food lover.</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>

<body>

<div class="container">

    <form method="POST" action="/onlineOrder" class="form-inline">
        <h2 class="form-heading">Add your details here.</h2>

        <div class="form-group ">
            <span></span>
            <input name="name" type="text" class="form-control" placeholder="Name" autofocus="true"/>
            <input name="address" type="text" class="form-control" placeholder="Address"/>
            <span></span>
            <br>
            	<label class="my-1 mr-2" for="inlineFormCustomSelectPref">Veggie Burger - $6 </label>
            <span></span>
            <input name="Quantity1" type="text" class="form-control" placeholder="Quantity" autofocus="true", value="0"/>
            <span></span>
       </p>
	  <p>
	  <label class="my-1 mr-2" for="inlineFormCustomSelectPref">Veggie Pesto Panini - $6 </label>
            <span></span>
            <input name="Quantity2" type="text" class="form-control" placeholder="Quantity" autofocus="true", value="0"/>
            <span></span>
       </p>
	  <p>
	  <label class="my-1 mr-2" for="inlineFormCustomSelectPref">Tofu Sandwich - $7 </label>
            <span></span>
            <input name="Quantity3" type="text" class="form-control" placeholder="Quantity" autofocus="true", value="0"/>
            <span></span>
       </p>
	  <p>
	  <label class="my-1 mr-2" for="inlineFormCustomSelectPref">Meatloaf Sandwich - $8 </label>
            <span></span>
            <input name="Quantity4" type="text" class="form-control" placeholder="Quantity" autofocus="true", value="0"/>
            <span></span>
       </p>
	  <p>
	  <label class="my-1 mr-2" for="inlineFormCustomSelectPref">Turkey Bacon Sandwich - $8 </label>
            <span></span>
            <input name="Quantity5" type="text" class="form-control" placeholder="Quantity" autofocus="true", value="0"/>
            <span></span>
       </p>
	  <p>
	  <label class="my-1 mr-2" for="inlineFormCustomSelectPref">BLT Burger - $9 </label>
            <span></span>
            <input name="Quantity6" type="text" class="form-control" placeholder="Quantity" autofocus="true", value="0"/>
            <span></span>
       </p>
	  <p>
	  <label class="my-1 mr-2" for="inlineFormCustomSelectPref">Mashed Potatoes - $5 </label>
            <span></span>
            <input name="Quantity7" type="text" class="form-control" placeholder="Quantity" autofocus="true", value="0"/>
            <span></span>
       </p>
	  <p>
	  <label class="my-1 mr-2" for="inlineFormCustomSelectPref">Steak Burger - $8 </label>
            <span></span>
            <input name="Quantity8" type="text" class="form-control" placeholder="Quantity" autofocus="true", value="0"/>
            <span></span>
       </p>
	  <p>
	  <label class="my-1 mr-2" for="inlineFormCustomSelectPref">Classic Fries - $4 </label>
            <span></span>
            <input name="Quantity9" type="text" class="form-control" placeholder="Quantity" autofocus="true", value="0"/>
            <span></span>
       </p>
	  <p>
	  <label class="my-1 mr-2" for="inlineFormCustomSelectPref">Jalapeno Fries - $6 </label>
            <span></span>
            <input name="Quantity10" type="text" class="form-control" placeholder="Quantity" autofocus="true", value="0"/>
            <span></span>
       </p>
	  <p>
	  <label class="my-1 mr-2" for="inlineFormCustomSelectPref">Nachos - $5 </label>
            <span></span>
            <input name="Quantity11" type="text" class="form-control" placeholder="Quantity" autofocus="true", value="0"/>
            <span></span>
       </p>
	  <p>
	  <label class="my-1 mr-2" for="inlineFormCustomSelectPref">Onion Rings - $4 </label>
            <span></span>
            <input name="Quantity12" type="text" class="form-control" placeholder="Quantity" autofocus="true", value="0"/>
            <span></span>
       </p>
       <p>     
	  <button type="submit" class="btn btn-success my-1">Submit</button>
        </div>

    </form>

</div>


<!-- /container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
<style CSS>
body {
  background: url("https://background-tiles.com/overview/white/patterns/large/1025.png");
  background-repeat: no-repeat;
  background-size: cover;
  color: black;
}

</style>


<%@ include file="commonCode/footer.jspf"%>
</html>
<%@ include file="commonCode/footer.jspf"%>
</html>
