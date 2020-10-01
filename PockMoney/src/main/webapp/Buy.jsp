<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Product List</h2>
<c:forEach var="prod1" items="${prodList}">
<div ${currUser!=prod1.ownerName ? '' : 'hidden'}>
<c:out value="${prod1.productName}" />
<c:out value="${prod1.currBid}" />
<form action="buyController.htm">
<input type="text" name="name" value="${prod1.productName}" hidden>
<input type="number" name="bidchange" >
<input type="submit" name="submit1" value="submit bid amount"><br>
</form>
</div>
</c:forEach>
</body>
</html>