<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="com.service.AuctionItemsService" %>
           <%@ page import="java.lang.String" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% AuctionItemsService item=new AuctionItemsService();
  for(int i=0;i<item.userTemp.size();i++){
	  String username;
    out.println(item.userTemp.get(i).getName());
    out.println(item.userTemp.get(i).getUserName());
    username=item.userTemp.get(i).getUserName();%>
    <a href="AdminApprove1.htm?username=<%=username%>">Approve</a>
    <a href="Reject.jsp">Reject</a><br><br><% 
}%>

  
</body>
</html>  --%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PockMoney</title>
</head>
<body>
<h1>Temp List</h1>
<c:forEach var="user" items="${userTemp}">
<c:out value="${user.userName}" /><a href="AdminApprove1.htm?username=${user.userName}">Approve</a> <a href="DenyUser.htm?username=${user.userName}">Deny</a><br>
</c:forEach>
<h1>Bid List</h1>
<c:forEach var="prod" items="${ProdList}">
<c:out value="${prod.productName}" /><c:out value="${prod.currBid}" /><c:out value="${prod.ownerName}" /><c:out value="${prod.currBidName}" /><a href="BidApprove/${prod.productName}.htm">Approve</a> <a href="DenyUser.htm?username=${prod.productName}">Deny</a><br>
</c:forEach>








