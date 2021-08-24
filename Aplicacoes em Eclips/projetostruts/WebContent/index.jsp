<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>

<%@ taglib uri="/struts-tags" prefix="s" %>

</head>
<body>

<h1>Cadastro de Pessoa</h1>
<hr>
<h3>Preencha os dados da Pessoa</h3>
<br>

<s:form id="form1" action="pessoaaction" method="post">
	<s:textfield  name="pessoa.nome" id="nome" label="Digite o nome da pessoa"
	required="true" />
	
	<s:textfield  name="pessoa.idade" id="idade" label="Digite a idade"
	required="true" ></s:textfield>
	
	<s:submit value="Teste de Envio" />
</s:form>

<br/>

 
</body>
</html>