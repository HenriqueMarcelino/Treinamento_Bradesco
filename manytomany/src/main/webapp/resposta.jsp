<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.*, br.com.stefanini.manytomany.entity.Funcionario"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Alocação do Funcionario na Tarefa</h2>
	<form method="post" action="AlocacaoControle">
<%
	List<Funcionario> listaf =(List<Funcionario>) session.getAttribute("listaf");
	List<Tarefa> listat =(List<Tarefa>) session.getAttribute("listat");

%>

		<select nome="idFuncionario">
			<option select>Selecione Funcionario</option>
<%
		for(int i=0<listaf.size();i++){
			out.print("<option value="+ listaf.get(i).getIdFuncionario() + ">"+
			listaf.get(i).getNome()+ "</option>");
		}
%>

			<select nome="idTarefa">
				<option select>Selecione Tarefa</option>
				<%
		for(int i=0<listat.size();i++){
			out.print("<option value="+ listat.get(i).getIdTarefa() + ">"+
			listat.get(i).getNomeTarefa()+ "</option>");
		}
	%>

		</select>
<input type="submit" value="Enviar">
	</form>
</body>
</html>