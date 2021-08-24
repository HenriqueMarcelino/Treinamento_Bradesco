<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Many To Many</title>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">

</head>
<body>
<div class="container">
	<div class="bg-dark p-5 text-white text-center">
		<h1>Relacionamento Many To Many</h1>
		<h4>Funcionario x Tarefas</h4>
	</div>
	
	<form  action="#" method="post">
	
	<div class="row mt-5">
	
	<h5 class="pb-2">Selecione o Funcionário e sua respectiva Tarefa.	</h5>
	
	
		<div class="col-md-4">
			<select class="form-select" aria-label="select de funcionário" class="form-control">
				
				<option selected>Selecione o Funcionário</option>
				<option value="10">Luciana</option>
				<option value="11">Belem</option>
			</select>	
		</div>
	
		<div class="col-md-4">
			<select class="form-select" aria-label="select de tarefas" class="form-control">
				<option selected>Selecione a Tarefa</option>
				<option value="10">Colocar usabilidade na tela</option>
				<option value="11">Incrementar com icones</option>
			</select>	
		</div>
	
		<div class="col-md-3">
			<button type="submit" class="btn btn-success">Gravar</button>
		</div>
		
	</div>
	</form>
	
	
	<table class="table table-bordered table-hover table-striped mt-5">
		<thead>
			<tr class="text-uppercase text-center ">
				<th>Codigo</th>
				<th>Nome</th>
				<th>Tarefa</th>
				<th>Data de Criacao</th>
				<th>Ações</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>10</td>
				<td>Lu</td>
				<td>telas de login</td>
				<td>2021-06-30</td>
				<td>
					<a class="btn btn-outline-danger" title="Clique para apagar"><i class="fa fa-trash"></i></a>
					<a class="btn btn-outline-info" title="Clique para editar"><i class="fa fa-pencil-alt"></i></a>
					<a class="btn btn-outline-dark" title="Clique para detalhes"><i class="fa fa-search"></i></a>
				</td>
			</tr>
		</tbody>
	
	</table>
	
	
	
</div>





</body>

<script type="text/javascript" 
	src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.2/js/bootstrap.min.js"></script>

</html>