<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AGERGAR REGISTROS</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
	<div class="container mt-4">
		<form action="/add" method="POST">
			<div class="card">
				<div class="card-header">
					<h4>REGISTRAR PERSONA</h4>
				</div>
				<div class="card-body">
					<div class="form-group">
						<label>NOMBRE</label>
						<input type="text" name="nombre" class="form-control">
					</div>
					<div class="form-group">
						<label>APELLIDO</label>
						<input type="text" name="apellido" class="form-control">
					</div>
				</div>
				<div class="card-footer">
					<input type="submit" value="GUARDAR" class="btn btn-info"/>
					<a href="/registros" class="btn btn-link">REGRESAR</a>
				</div>
			</div>
		</form>
	</div>
</body>
</html>