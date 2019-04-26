<!-- 
/**
* @author Sravanth Yajamanam/Sowmya Ramakrishnan
*/


/*
* Page to list reviews
*/
-->

<%@ include file="commonCode/header.jspf"%>
<%@ include file="commonCode/navigation.jspf"%>

<div class="container">
	<table class="table table-striped">
		<caption>Your Old Reviews</caption>
		<thead>
			<tr>
				<th>Description</th>
				<th>Date</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${reviews}" var="reviews">
				<tr>
					<td>${reviews.desc}</td>
					<td><fmt:formatDate pattern="dd/MM/yyyy"
							value="${reviews.targetDate}" /></td>
					<td><a type="button" class="btn btn-primary"
						href="/update-reviews?id=${reviews.id}">Edit</a> <a type="button"
						class="btn btn-warning" href="/delete-reviews?id=${reviews.id}">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div>
		<a type="button" class="btn btn-success" href="/add-reviews">Add</a>
	</div>
</div>
<style CSS>
body {
  background: url("http://thekitemap.com/images/feedback-img.jpg");
  background-repeat: no-repeat;
  background-size: cover;
}

</style>
<%@ include file="commonCode/footer.jspf"%>
