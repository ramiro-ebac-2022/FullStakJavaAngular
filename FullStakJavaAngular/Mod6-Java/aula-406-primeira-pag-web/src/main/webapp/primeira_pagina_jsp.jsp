<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Primeira pagna JSP</title>
</head>
<body>
	<p>Aqui vai o conteúdo da página </p>
	<% 
	String nome = "Ramiro";	
	out.println("Digitando comandos em java. Nome = " + nome); 
	%>

</body>
</html>