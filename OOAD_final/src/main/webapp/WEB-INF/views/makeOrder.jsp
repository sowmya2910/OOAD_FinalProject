<%@ include file="commonCode/header.jspf"%>
<%@ include file="commonCode/navigation.jspf"%>

<div class="container group-header">
  
	<form method="POST" action="/makeOrder" class="form-inline">
	  <p>
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
       </p>
       </form>
 </div>
 <style CSS>
body {
  background: url("https://images.pexels.com/photos/349610/pexels-photo-349610.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
  background-repeat: no-repeat;
  background-size: cover;
}

</style>


<%@ include file="commonCode/footer.jspf"%>