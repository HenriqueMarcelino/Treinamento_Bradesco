create database BDQuatro;

drop table telefone;
drop table cliente;
user BRQuatro;

create table cliente(id int primary key auto_increment,
	nome, varchar(50) not null,
	email varchar (50) unique not null,
	senha varchar (50),
	datacriacao date);
	
create table telefone(idTelefone int primary key auto_increment,
	numero varchar (50) not null,
	id_cliente int,
	foreign key (id_cliente) references cliente(id) on delete cascade);
	
	insert into cliente values (100,'Henrique', 'Henrique@gmail.com','md5(12345)','2021-08-09');
	
	select * from cliente;
	
	insert into telefone values (5,'962324070',100);
	insert into telefone values (6'999999999',100);
	
	select c.nome, c.email, t.numero from cliente c 
	inner join telefone t
	on c.id = t.id_cliente;