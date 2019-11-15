<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="cxt" value="${pageContext.request.contextPath}" />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Ajouter un Produit</h1>
<form:form  action="saveProduit" modelAttribute="produit" >
    <table>
        <tr>
            <td>Description</td>
            <td><form:input type="text" path="description" /></td>
          </tr>
           <tr>
            <td>Date Ajout</td>
            <td><form:input type="text" path="dateEnregistrement" /></td>
          </tr>
        <tr>
            <td>Quantite</td>
            <td><form:input type="text" path="quantiteStock" /></td>
          </tr>
          
                 <tr>
            <td>Prix Achat</td>
            <td><form:input type="text" path="prixAchat" /></td>
          </tr>
                   <tr>
            <td>Prix Vente</td>
            <td><form:input type="text" path="prixVente" /></td>
          </tr>
          
          
               <tr>
         
            <td>Magasin:</td>
            <td>
            <form:select path="mag.id" items="${magasins}"
            itemValue="id" itemLabel="nom" />
            
       
            </td>
          </tr>

            <td colspan="2">
                  <input class="btn btn-warning" type="submit" value="enregistrer" />
            </td>
          </tr>
    </table>
</form:form>
  </div>
</body>
</html>