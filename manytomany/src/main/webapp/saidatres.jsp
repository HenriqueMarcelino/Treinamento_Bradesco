<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% page import="java.util.*, br.com.stefanini.manytomany.controller.*,br.com.stefanini.manytomany.controller.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Saida Mockada</h2>
<%
	List<funcionario> resposta =(List<Funcionario>) request.getAttribute("lista");
	
out.print("<ul>");
	for(Funcionario f : resposta)
	out.print("<li>" + f.getNomeFuncionario()+"</li>");

out.print("</ul>");
%>
<form method = "get" action="TarefaFuncionarioController?">
Codigo</br>

<input type="number" name="code" value="0"/>
<br/> Nome</br>

<input type="text" name="nome" value=""/>
<input type="hidden" name="flag" value="add"/>
</br>
<input type="submit value="enviar" />

</form>
</body>
</html>