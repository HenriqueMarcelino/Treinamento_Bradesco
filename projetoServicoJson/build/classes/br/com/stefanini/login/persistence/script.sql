create database bdoito;

use bdoito;

 
		
		 create table usuario(idUsuario int primary key auto_increment,
		  nome varchar (100) not null,
		  uuid varchar (100),
		  email varchar (100) unique not null,
		  senha varchar (250),
		  status varchar (100));
		  