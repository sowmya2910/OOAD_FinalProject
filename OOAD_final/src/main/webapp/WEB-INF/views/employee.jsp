<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="commonCode/header.jspf"%>
<%@ include file="commonCode/navigation.jspf"%>
<!DOCTYPE html>
<style><%@ include file = "Critics.css"%></style>

<div id="form-main">
  <div id="form-div">
    <form method="POST" class="form" action="/employee" id="form1">
      
      <p class="name">
        <input name="name" type="text" class="validate[required,custom[onlyLetter],length[0,100]] feedback-input" placeholder="Hello Mr. Montgomery" id="name" />
      </p>
      
      <p class="my-1 mr-2">
        <input name="Rating" type="text" class="validate[required,custom[email]] feedback-input" id="rating" placeholder="Rating out of 10." />
      </p>
      
      <p class="text">
        <textarea name="text" class="validate[required,length[6,300]] feedback-input" id="comment" placeholder="Comment"></textarea>
      </p>
      
      
      <div class="submit">
        <input type="submit" value="SEND" id="button-blue"/>
        <div class="ease"></div>
      </div>
    </form>
  </div>
  </div>
<%@ include file="commonCode/footer.jspf"%>