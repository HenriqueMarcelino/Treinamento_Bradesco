 create database bdseis;
  use bdseis;
 
    drop table tarefa_funcionario;
  drop table funcionario;
  drop table tarefa;

 create table funcionario(
 idFuncionario int primary key auto_increment,
  nomeFuncionario varchar (50)
 );
 
 
 create table tarefa(
 idTarefa int primary key auto_increment,
  nomeTarefa varchar (50),
  dataCriacao date);
  
  
  #chave composta
  #tabela relacional
  #ManyToMany
  create table tarefa_funcionario(id_Tarefa int, 
                                  id_funcionario int,
                                  primary key(id_tarefa, id_funcionario),
                        foreign key(id_Tarefa) references  Tarefa(idTarefa),
                       foreign key(id_funcionario) references  funcionario(idFuncionario) );
                                  
  insert into funcionario values (10,'lu');
  insert into funcionario values (11,'belem'); 
  insert into funcionario values (12,'rafael');
  
   insert into tarefa values (200,'programa de login','2021-06-30');
   insert into tarefa values (201,'telas de login','2021-06-30');
   
    
    insert into tarefa_funcionario values (200, 11);
    insert into tarefa_funcionario values (200, 12);
   
  
  
     insert into tarefa_funcionario values (201, 11);
      insert into tarefa_funcionario values (201, 10);
      
      select * from funcionario;
      select * from tarefa;
      select * from tarefa_funcionario;
      
      select t.nomeTarefa, f.nomeFuncionario, t.dataCriacao from tarefa_funcionario tf
          inner join tarefa t 
           on  t.idTarefa =  tf.id_tarefa
           inner join funcionario f
           on  f.idfuncionario = tf.id_funcionario;
           
           
           
      
      