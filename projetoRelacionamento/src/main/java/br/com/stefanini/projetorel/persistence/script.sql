create database bdcinco;

use bdcinco;

create table usuaio(id int primary key auto_increment
	nome varchar (50), email varchar (50) not null, senha varchar (250));
	
	create table cliente(idCliente int primary key,
		perfil varchar (50),
		status varchar (50),
		foreign key (idCliente) references usuario(id));
		
		insert into usuario values (100, 'Henrique', 'henrique@gmail.com','345689');
		insert into cliente values (100, 'perfil 1', 'Ativo','345689');
		
		create table vendedor(idVendedor int primary key,
		perfil varchar (50)
		comissao double,
		foreign key (idVendedor) references usuario(id));
		
		insert into vendedor values (101, 'Carlos', 'carlos@gmail.com','897869');
		insert into cliente values (101, 'vendedor', 0.2);
		
		select u.nome, u.email, u.senha, c.status, v.comissao from
			usuario u left join cliente c
			on u.id = c.idCliente
			left join vendedor v
			on u.idVendedor order by 1 asc;