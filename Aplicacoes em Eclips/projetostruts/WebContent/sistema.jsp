<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>

<%@ taglib uri="/struts-tags" prefix="s" %>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.2/css/mdb.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css">
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="jumbotron" >
	<h1 class="animated zoomIn  h1-responsive  font-bold">
	Gravar Pessoa</h1>
</div>



<br>

 <div class="col-md-6 offset-md-3">
 	<div class="card animated tada">
 		<div class="card-body">
 		<div class="card-title">
 		<h3>Preencha os dados da Pessoa</h3>
 		</div>
			<s:form id="form2" action="pessoaaction.gravar" method="post">
				<s:textfield  name="pessoa.nome" id="nome" label="Digite o nome da pessoa"
				required="true" cssClass="form-control"/>
				
				<s:textfield  name="pessoa.idade" id="idade" label="Digite a idade"
				required="true" cssClass="form-control"></s:textfield>
				
				<s:submit value="Gravar os Dados" cssClass="btn blue-gradient"/>
			</s:form>
 		</div>
 	</div>
 </div>



</body>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.2/js/mdb.min.js"></script>
</html>