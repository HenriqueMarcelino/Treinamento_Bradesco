<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Struts</title>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.2/css/mdb.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css">
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="style.css">

</head>
<body>
	<div class="container login_container">
		<div class="row">
<!-- 		LADO ESQUERDO -->
			<div class="col-md-6 brand">
				<h1>
					<span class="title1">Projeto Struts</span><br>
					<span class="title2"> Stefanini</span>
				</h1>
				<img src="https://brasscom.org.br/wp-content/uploads/2020/05/Logo-Stefanini.png" 
				width="75%" class="brand_img">
			</div>
			
			
<!-- 			LADO DIREITO -->
			<div class="col-md-6 login_form">
				<div >
					<img class="profile_img" 
					src="https://cdn4.iconfinder.com/data/icons/general13/png/256/administrator.png">
				</div>
				
				<h3>Login</h3>
				
				<form class="form" action="#" method="post">
					<div class="form-group">
						<input type="email" name="email" placeholder="Digite o email"
						class="form-control" />
					</div>
					
					<div class="form-group">
						<input type="password" name="senha" placeholder="Digite a senha"
						class="form-control" />
					</div>
					
					<div class="form-group">
						<button value="Logar" class="btn btn_login">Logar</button>
					</div>
					
				</form>
			</div>
		</div>
	
	</div>




</body>
<script type="text/java" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/java" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/js/bootstrap.min.js"></script>
<script type="text/java" src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.2/js/mdb.min.js"></script>
</html>