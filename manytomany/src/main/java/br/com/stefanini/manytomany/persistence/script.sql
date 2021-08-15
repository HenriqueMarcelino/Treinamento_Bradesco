create database bdseis;

user bdseis;

create table funcionaro(idFuncionario int primary key auto_increment,
						nomeFuncionario varchar (50));
						
create table tarefa (idTarefa int primary key auto_increment,
					 nomeTarefa varchar(50),
					 dataCriacao date);
					 
	#Chave composto
	#Tabela relacional
	#ManyToMany
create table tarefa_funcionario(id_Tarefa int,
								id_funcionario int,
								primary key(id_tarefa, id_funcionario),
								foreign key (id_Tarefa) references Tarefa(idTarefa),
								foreign key (id_funcionario) references funcionario(idFuncionario));

								
insert into funcionario(10, 'Lu');
insert into funcionario(11,'Gi');
insert into funcionario(12,'Henrique');

insert into tarefa values (200,'Proogramador de Login','2021-08-15');
insert into tarefa values (201,'Login de telas','2021-08-15');

insert into tarefa_funcionario values (200,11);
insert into tarefa_funcionario values (200,12);


insert into tarefa_funcionario values (201,11);
insert into tarefa_funcionario values (200,10);

select * from funcionario;
select * from tarefa;
select * from tarefa_funcionario;

	select t.nomeTarefa, f.nomeFuncionario, t.dataCriacao from tarefa_funcionario
	inner join tarefa tf 
	on t.idTarefa = tf.id_tarefa
	inner join funcionario f 
	on f.idfuncionario = tf.id_funcionario;



 
