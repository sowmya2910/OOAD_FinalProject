<%@ include file="commonCode/header.jspf"%>
<%@ include file="commonCode/navigation.jspf"%>
<div class="container">
	<form:form method="post" commandName="reviews">
		<form:hidden path="id" />
		<fieldset class="form-group">
			<form:label path="desc">Review</form:label>
			<form:input path="desc" type="text" class="form-control"
				required="required" />
			<form:errors path="desc" cssClass="text-warning" />
		</fieldset>
		<fieldset class="form-group">
			<form:label path="targetDate">Today's Date</form:label>
			<form:input path="targetDate" type="text" class="form-control"
				required="required" />
			<form:errors path="targetDate" cssClass="text-warning" />
		</fieldset>
		<button type="submit" class="btn btn-success">Submit</button>
	</form:form>
</div>

<%@ include file="commonCode/footer.jspf"%>

<script>
	$('#targetDate').datepicker({
		format : 'dd/mm/yyyy'
	});
</script>
<style CSS>
body {
  background: url("http://thekitemap.com/images/feedback-img.jpg");
  background-repeat: no-repeat;
  background-size: cover;
}

</style>