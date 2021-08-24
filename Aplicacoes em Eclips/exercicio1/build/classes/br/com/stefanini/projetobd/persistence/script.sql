create database dbUsuarioTransacoes;
use dbUsuarioTransacoes;

	create table usuario(idUsuario int primary key auto_increment, 
		nome varchar (50), email varchar (100) unique);

	create table transacao(idtransacao int primary key auto_increment,
		valor double(50), produto string(50), descricao string(50)
		id_usuario int unique, 
		foreign key(id_usuario) references usuario(idUsuario)
		on delete cascade
		); 
		
		desc usuario;
		desc transacao;

		