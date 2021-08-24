
  create database bdprojeto;
    use bdprojeto;
   
   
     create table usuario(id int primary key auto_increment,
                         nome varchar (80),
                         email varchar (80) unique,
                         uuid varchar (50) unique,
                         senha varchar (255),
                          dataCadastro date);
                          
                          
delimiter $$
drop procedure if exists gravar; $$
create procedure gravar(in vnome  varchar(80) ,in vemail varchar(80),in  vuuid   varchar(50),in vsenha  varchar(255),in  vdataCadastro  date)
 begin
	 
	  insert  into usuario (nome, email, uuid, senha, datacadastro)  values (vnome, vemail, vuuid, vsenha, vdataCadastro);
	 
	   select concat('primary_key:',    LAST_INSERT_ID() );
	 
	 
 end;
$$
delimiter ;


call gravar('belem', 'belem6@gmail.com', '12121211216', '123456', now());
    
      

select * from usuario;

 