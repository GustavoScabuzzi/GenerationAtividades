drop database db_rh;

create database db_rh;

use db_rh;

create table tb_funcionaries (
	id bigint auto_increment,
    nome varchar(30),
    idade int,
    cpf bigint,
    salario decimal,
    setor varchar(20),
    
    primary key (id)
    );
    
insert into tb_funcionaries (nome, idade, cpf, salario, setor) values ("Gustavo", 24, 43443293840, 4500.00, "TI");
insert into tb_funcionaries (nome, idade, cpf, salario, setor) values ("Guilherme", 26, 58745963240, 5000.00, "Engenharia");
insert into tb_funcionaries (nome, idade, cpf, salario, setor) values ("Paulo", 50, 25418547962, 1800.00, "Cozinha");
insert into tb_funcionaries (nome, idade, cpf, salario, setor) values ("Larissa", 32, 32145698740, 6000.00, "TI");
insert into tb_funcionaries (nome, idade, cpf, salario, setor) values ("Clara", 27, 58741258960, 5000.00,  "Vendas");

select * from tb_funcionaries where salario > 2000.00;

select * from tb_funcionaries where salario < 2000.00;