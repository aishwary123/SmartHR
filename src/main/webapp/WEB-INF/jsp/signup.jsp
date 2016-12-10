<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib  uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<title>Sign Up Page</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
                rel="stylesheet">
</head>
<body>
<div class="container">
<H1>Sign Up Page</H1>
<div class="container">
<form:form method="post" commandName="signup" action="/signup" >
<fieldset class="form-group">
<form:label path="jobSeekerLoginKey.panNumber">PAN NUMBER</form:label>
<form:input path="jobSeekerLoginKey.panNumber" type="text" name="panNumber" class="form-control" required="required"/>
<form:errors path="jobSeekerLoginKey.panNumber" cssClass="text-warning"></form:errors>
</fieldset>
<br>
<fieldset>
<form:label path="jobSeekerLoginKey.emailId" >EMAIL ID</form:label>
<form:input path="jobSeekerLoginKey.emailId" type="text"  class="form-control"/>
<form:errors path="jobSeekerLoginKey.emailId"></form:errors>
</fieldset> 
<br>
<input class="btn btn-success" type="submit" value="submit"/>
</form:form>
</div>
 <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</div>
</body>
</html>