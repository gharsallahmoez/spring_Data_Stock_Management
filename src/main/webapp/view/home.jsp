<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.util.Vector" %>
<%@ page import="stock.management.model.*" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Liste des magasins</h1>
<table>
<th>
<td>Id</td>
<td>Nom</td>
<td>Lieu</td>
<td></td>
</th>

<c:forEach items="${listeMagasin}" var="d">
<tr>
<td> ${d.id}</td>
<td> ${d.nom}</td>
<td> ${d.lieu}</td>
<td><a href='produits/${d.id}'>Liste des produits</a></td>
</tr>
</c:forEach>
</table>


</body>
</html>