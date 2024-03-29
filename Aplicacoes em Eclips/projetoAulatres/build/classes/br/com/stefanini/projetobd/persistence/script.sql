create database bdUm;
use bdUm;

	create table usuario(idUsuario int primary key auto_increment, 
		nome varchar (50), email varchar (100) unique, senha varchar(255),
		uuid varchar (50));

	create table endereco(idEndereco int primary key auto_increment,
		bairro varchar(50), cidade varchar(50),
		id_usuario int unique, 
		foreign key(id_usuario) references usuario(idUsuario)
		on delete cascade
		); 
		
		desc usuario;
		desc enderceo;
		
		show tables;
		
		set @chave=10;
		insert into usuario values(@chave,'Joao','joao@gmail.com',null,null);
		insert into endereco value(null,'Diadema','S�o Paulo',@chave);
		
		select * from usuario;
		select * from endereco;
		
		select u.nome, u.mail, e.bairro, e.cidade from usuario u, endereco e
		where u idUsuario = e.id_usuario;
		
	delete from usuario where idUsuario=10;
		