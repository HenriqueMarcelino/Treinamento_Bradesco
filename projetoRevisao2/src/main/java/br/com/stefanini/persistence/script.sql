create database Bddois;

user Bddois;

create table produto(id int primary key auto_increment,
	nome varchar (50) not null,
	preco double not null);
	
create table item (IdItem int primary key auto_increment,
	quantidade int null,
	id_produto int unique,
	foreign key(id_produto) references produto(id) on delete cascade);
	
	
	insert into produto values (null,'arroz', 10);
	insert into produto values (null,'feijão', 15);
	insert into produto values (null,'Macarao', 12);
	
	insert into item values (null,'30', 1);
	insert into item values (null,'40', 2);
	insert into item values (null,'10', 3);
	
	create view displayProduto as select p.id , p.nome , i.quantidade 
	from produto p inner join item i
	on p.id = i.id_produto;
	
	
	select * from displayProduto;