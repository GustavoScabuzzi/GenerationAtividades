create database db_ecommerce;

create table tb_produtos (
	id int auto_increment,
    nome varchar(30),
    tipo varchar(10),
    valor decimal,
    fisico boolean,
    
    primary key (id)
    );
    
insert into tb_produtos(nome, tipo, valor, fisico) values ("Musicas Michael Jackson", "CD", 75.00, true);
insert into tb_produtos(nome, tipo, valor, fisico) values ("Aulas Java", "EAD", 350.00, false);
insert into tb_produtos(nome, tipo, valor, fisico) values ("Carrinho de Nenem", "brinquedos", 55.99, true);
insert into tb_produtos(nome, tipo, valor, fisico) values ("Peruca Loira", "Beleza", 99.99, true);
insert into tb_produtos(nome, tipo, valor, fisico) values ("Assassins Creed", "Jogo", 150.00, false);
insert into tb_produtos(nome, tipo, valor, fisico) values ("Fifa 2021", "Jogo", 200.00, true);
insert into tb_produtos(nome, tipo, valor, fisico) values ("Iphone 12", "Celular", 5000.00, true);
insert into tb_produtos(nome, tipo, valor, fisico) values ("Computador gamer", "computador", 11000.00, true);

select * from tb_produtos where valor > 500;

select * from tb_produtos where valor < 500;