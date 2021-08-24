<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Gravar o Usuário</h2>
<form method="post" action="UsuarioController">
 <br/>Nome<br/>
 <input type="text" name="nome" value=""  />
 <br/>Email<br/>
 <input type="text" name="email" value=""  />
 <br/>Senha<br/>
 <input type="password" name="senha" value=""  /><br/>
 <input type="hidden"  name="flag" value="gravar"/>
 <br/> 
 <input type="submit" value="Gravar" />
<br/>
</form>
<br/>
${msg} 

<h2>Logar o Usuário</h2>
<form method="post" action="UsuarioController">
  <br/>Email<br/>
 <input type="text" name="email" value=""  />
 <br/>Senha<br/>
 <input type="password" name="senha" value=""  />
 <br/>
 <br/>
 <input type="hidden"  name="flag" value="logar"/>
 <input type="submit" value="Logar" />
<br/>
</form>
</body>
</html>