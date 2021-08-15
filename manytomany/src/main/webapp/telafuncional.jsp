<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Many To Many</title>

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">

</head>
<body>

	<div class="containner">
		<div class="bg-dark p-5">
			<h1>Relacionamento Many To Many</h1>
			<h4>Funcionario x Tarefas</h4>
		</div>

		<form action="#" method="post">

			<div class="row mt-5">

				<h5 class="pd-2 ">Selecione Funcionário e sua respectiva
					Tarefa.</h5>


				<div class="col-md-4">
					<select class="form-select" aria-label="Select de funcionário">
						<option Selectd>Selecione o Funcionário</option>
						<option value="10">Lu</option>
						<option value="11">Gi</option>
					</select>
				</div>

				<div class="col-md-4">
					<select class="form-select" aria-label="Select de funcionário">
						<option Selectd>Selecione a tarefa</option>
						<option value="10">Colocar usabilidade na tela</option>
						<option value="11">Icrementar com icones</option>
					</select>
				</div>

				<div class="col-md-4">
					<button type="submit" class="btn btn-success">Gravar</button>
				</div>
			</div>
	</div>

	</form>

	<table class="table table-bordered table-houver table-striped mt-5">

		<thead>
			<tr class="text-uppercase text-center">
				<th>Código</th>
				<th>Nome</th>
				<th>Tarefa</th>
				<th>Data de Criação</th>
			</tr>
		</thead>

		<tbody>
			<tr>
				<td>10</td>
				<td>Lu</td>
				<td>Telas de Login</td>
				<td>2021-08-15</td>
				<td>
					<a class="btn btn-alt-line-danger" title="Clique para Apagar"><i class="fa fa-trash"></i></a>
					<a class="btn btn-alt-line-info" title="Clique para Editar"><i class="fa fa-pencil-alt"></i></a>
					<a class="btn btn-alt-line-dark" title="Clique para Detalhes"><i class="fa fa-search"></i></a>
				</td>
			</tr>
		</tbody>



	</table>


</body>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.2/js/bootstrap.min.js"></script>

</html>