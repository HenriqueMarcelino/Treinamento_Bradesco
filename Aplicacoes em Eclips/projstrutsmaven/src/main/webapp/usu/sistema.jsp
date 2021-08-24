<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro Cliente</title>

<%@ taglib prefix="s" uri="/struts-tags"%>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="style.css">


</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Struts CRUD</a>

			<div class="navbar-collapse">
				<ul class="navbar-nav me-alto mb-1">
					<li class="nav-item"><a href="sistema.jsp"
						class="nav-link active">Home</a></li>
					<li class="nav-item"><a href="#" class="nav-link">Cadastro</a>
					</li>
					<li class="nav-item"><a href="#" class="nav-link">Listar</a></li>
				</ul>
			</div>
		</div>
	</nav>

<div class="container mt-5">
	<div class="jumbotron">
		<h3 class="text-center">Cadastro de Cliente</h3>
	</div>

		<div class="col-md-6 offset-md-3">
			<div class="card">
				<s:form method="cadastrar" action="usuario.cadastrar">
					<div class="card-body">
						<label class="form-label">Entre com os dados do Cliente</label>

						<div class="input-group mb-3">
							<span class="input-group-text"> 
								<i class="fas fa-user-plus"></i>
							</span>
							
							<input type="text" name="usuario.nome" id="usuario.nome" class="form-control" 
							placeholder="Digite seu nome">
						</div>
						
						<div class="input-group mb-3">
							<span class="input-group-text"> 
								<i class="fa fa-envelope"></i>
							</span>
							
							<input type="email" name="usuario.email" id="usuario.email" class="form-control" 
							placeholder="Digite o email">
						</div>
					</div>
						
					<div class="card-footer">
					<button type="submit" Class="btn btn-success">Gravar</button>
					
					<br>
					${msg}
					</div>
				</s:form>
				
			</div>
		</div>
	</div>
	
</body>

<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.2/js/mdb.min.js"></script>

</html>