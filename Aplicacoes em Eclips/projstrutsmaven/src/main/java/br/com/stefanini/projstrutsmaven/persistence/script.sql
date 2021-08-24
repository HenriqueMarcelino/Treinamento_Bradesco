create database bancologin;

use bancologin;

create table usuario(
	idUsuario int primary key auto_increment, 
	email varchar(100) unique,
	senha varchar(150),
	perfil varchar (3)
);

insert into usuario values (1, 'henrique@gmail.com', '123456', 'adm');
insert into usuario values (2, 'carlos@gmail.com', '123456', 'usu');

select*from usuario;