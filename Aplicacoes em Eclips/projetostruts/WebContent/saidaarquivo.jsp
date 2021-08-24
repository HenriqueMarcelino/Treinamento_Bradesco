<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*, br.com.stefanini.projetostruts.entity.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

 if (request.getAttribute("lista")!=null){
 out.print("<ul>");
 List<Pessoa> lista =(List<Pessoa>) request.getAttribute("lista");
  for (Pessoa p : lista){
	  out.print ("<li>" + p + "</li>");
}
 }else{
	 out.print("lista vazia");
 }
out.print("</ul>");
%>


</body>
</html>