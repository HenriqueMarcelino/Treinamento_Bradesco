<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="/struts-tags" prefix="s" %>

</head>
<body>
<h2>Buscar os Dados de Um CSV</h2>
<s:form id="form2" action="pessoaaction.lerArquivo" method="post">
  <s:submit value="Buscar os  Dados do CSV"  />
</s:form>
</body>
</html>