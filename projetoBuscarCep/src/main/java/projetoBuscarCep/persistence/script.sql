create database ControleDeCEP;

create table cliente(idCliente int primary key auto_increment,
  					 nome varchar(50), not null,
					 email varchar(50) unique not null,
					 endereco varchar(50));
					
	create table cep(cep varchar(50), 
					 logradouro varchar (50),
					 numero integer(50),
					 complemento varchar(50),
					 bairro varchar(50),
					 cidade varchar(50),
					 estado varchar(50) foreign key (idCliente)
					 references cliente(id) on delete cascade);