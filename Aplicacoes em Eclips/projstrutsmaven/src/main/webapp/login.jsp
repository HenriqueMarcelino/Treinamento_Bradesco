<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>	
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<%@ taglib prefix="s" uri="/struts-tags" %>

</head>
<body>

<h1>Login com Perfil</h1>
<hr>

<s:form id="form1" action="usuarioaction.login" method="post">
	<s:textfield type="email" name="email" label="Digite seu email"></s:textfield>
	<s:textfield type="password" name="senha" label="Digite a senha"></s:textfield>
	<s:submit value="Logar"></s:submit>
	<div>${msg}</div>
</s:form>

</body>
</html>