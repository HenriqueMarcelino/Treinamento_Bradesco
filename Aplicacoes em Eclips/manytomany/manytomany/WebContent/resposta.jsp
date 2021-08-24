<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, br.com.stefanini.manytomany.entity.*" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Alocacao do Funcionario na Tarefa</h2>
<form method="post" action="AlocaoController">
<%
 //view e banco jamais ...
 
	List<Funcionario> listaf = (List<Funcionario>) session.getAttribute("listaf");
    List<Tarefa>     listat = (List<Tarefa>) session.getAttribute("listat");
%>

<select name="idFuncionario"> 
                <option selected>Selecione Funcionario</option>
<% 			
  for(int i=0;i<listaf.size();i++) {
	 out.print("<option value="+ listaf.get(i).getIdFuncionario() +">"+ 
                      listaf.get(i).getNomeFuncionario() + "</option>");
	  }
%>

</select>

<select name="idTarefa"> 
                <option selected>Selecione Tarefa</option>
<% 			
  for(int i=0;i<listat.size();i++) {
	 out.print("<option value="+ listat.get(i).getIdTarefa() +">"+ 
                      listat.get(i).getNomeTarefa() + "</option>");
	  }
%>

</select>
<input type="submit"  value="Enviar">
</form>
</body>
</html>