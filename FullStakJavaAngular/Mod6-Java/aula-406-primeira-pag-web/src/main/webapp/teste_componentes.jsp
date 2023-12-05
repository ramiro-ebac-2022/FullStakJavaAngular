<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teste Componentes</title>
</head>
<body>
	<form action="http://localhost:8080/aula-406-primeira-pag-web/banco_de_dados" method="GET">	
			<br>
			<p>Digite o número de registro para alterar : </p>
			<input type="text" name="codigo_altera">
			<br>
			<p>Digite o novo nome : </p>
			<input type="text" name="nome_altera">
			<br>
			<input type="submit" value="Enviar Dados">
		</form>
</body>
</html>