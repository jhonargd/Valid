<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTROS</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>

	<div class="container mt-4">
		<a href="/add" class='btn btn-success'>AGREGAR REGISTRO</a>
	</div>

	<div class="container mt-4">
		<form action="/registros" method="POST">
				<div class="card">
					<div class="card-header">
						<h4>LISTA DE REGISTROS</h4>
					</div>
					<div class="card-body">
						<table class="table">
							<thead>
								<tr>
									<th>PROCESADO</th>
									<th>ID</th>
									<th>NOMBRE</th>
									<th>APELLIDO</th>
								</tr>	
							</thead>
							<tbody>
								<c:forEach var="registro" items="${registros}">
								<tr>
								
									<c:choose>
									    <c:when test="${registro.procesado==true}">
									        <td><input disabled="disabled" checked="checked"  type="checkbox" name="unselected" value="${registro.id}">  </td>
									    </c:when>    
									    <c:otherwise>
									        <td><input type="checkbox" name="selected" value="${registro.id}">  </td>
									    </c:otherwise>
									</c:choose>
									
									<td>${registro.id}</td>
									<td>${registro.nombre}</td>
									<td>${registro.apellido}</td>
									
								</tr>
								</c:forEach>
								
							</tbody>
						</table>
					</div>
					<div class="card-footer">
						<input type="submit" value="PROCESAR" class="btn btn-info"/>
					</div>
				</div>
			</form>
			
			
	</div>
</body>
</html>