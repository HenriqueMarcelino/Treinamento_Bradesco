<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gravação Cliente</title>

<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.2/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">

</head>
<body>

	<h1 class="bg-dark text-white text-center p-5">Gravação Cliente e Telefone</h1>

	<div class="col-md-4 offset-md-4 mt-5">
		<div class="card">
			<div class="card-body">
				<form class="form" method="post" action="http://http://localhost:8080/projetoWebAula4/ClienteController?cmd=gravar">

					<label><i class="fa fa-user"></i> Nome:</label> <input type:="text" name="nome"
						placeholder="Informe seu nome completo" class="form-control">

					<label class="mt-2"><i class="fa fa-envelope"></i> Email: </label> <input type:="email"
						name="email" placeholder="Informe o email" class="form-control">
						
					<label class="mt-2"><i class="fa fa-lock"></i> Senha:</label> <input type="passWord" name="senha"
						placeholder="Senha de no minimo 6 numeros,apenas numeros"
						class="form-control">
						
					<label class="mt-2"><i class="fa fa-phone-alt fa-spin"></i> Telefone:</label><input type="text" name="Numero"
						placeholder="Digite apenas numeros" class="form-control">
					<br>
					
					<button type="Submit" class="btn btn-success btn-sm">Gravar <i class="fas fa-save"></i></button>
				</form>
				
				<form>
					<label><i class="fa fa-user"></i> IdCliente:</label> <input type:="number" name="codigo"
						placeholder="Informe seu identificado" class="form-control">
				<button type="Submit" class="btn btn-success btn-sm">Buscar <i class="fas fa-save"></i></button>
				</form>
				
				<form class="form" method="get" action="http://localhost:8080/projetoWebAula4/ClienteController">

 					<label><i class="fa fa-user text-info"></i>Buscar pelo IdCliente:</label>
					  <input type="number" name="id" placeholder="Digite o Id" class="form-control">
					  <input type="hidden" name="cmd" value="consulta" class="form-control">
					<br>
				<button type="submit" class="btn btn-success btn-sm">Buscar<i class="fas fa-save"></i></button> 

				</form>		
				

			</div>
		</div>
	</div>
	
<div class="container">
	<table class="mt-5 table table-bordered table-hover">
		<thead>
		<tr class="bg-dark text-white text-center">
			<th>Código</th>
			<th>Nome</th>
			<th>Email</th>
			<th>Data de Criação</th>
			<th>Telefone</th>
			<th>Ações</th>
		</tr>
		</thead>
		
		<tbody>
			<tr>
				<td>1</td>
				<td>Henrique</td>
				<td>henrique@gmail.com</td>
				<td>10/08/2021</td>
				<td>11 962324070</td>
				<td>
					<a href="#" class="btn btn-info" title="Editar"><i class="fas fa-pencil-alt"></i></a>
					<a href="#" class="btn btn-danger" title="Apagar"><i class="fas fa-trash-alt"></i></a>
				</td>
			</tr>
			<tr>
				<td>2</td>
				<td>Carlos</td>
				<td>carlos@gmail.com</td>
				<td>10/08/2021</td>
				<td>11 000000000</td>
				<td>
					<a href="#" class="btn btn-info" title="Editar"><i class="fas fa-pencil-alt"></i></a>
					<a href="#" class="btn btn-danger" title="Apagar"><i class="fas fa-trash-alt"></i></a>
				</td>
			</tr>
		</tbody>		
	</table>
</div>



</body>
</html>