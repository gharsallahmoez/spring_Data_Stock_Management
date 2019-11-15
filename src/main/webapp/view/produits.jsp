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
<c:set var="cxt" value="${pageContext.request.contextPath}" />

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Liste des produits</h1>
<table>
<th>
<td>Id</td>
<td>Description</td>
<td>DateAjout</td>
<td>Quanitite</td>
<td>Prix Achat</td>

</th>

<c:forEach items="${listeProduit}" var="d">
<tr>
<td> ${d.id}</td>
<td> ${d.description}</td>
<td> ${d.dateEnregistrement}</td>

<td> ${d.quantiteStock}</td>
<td> ${d.prixAchat}</td>
</tr>
</c:forEach>
</table>
<a href='${cxt}/produit'>Ajouter un produit</a>


</body>
</html>