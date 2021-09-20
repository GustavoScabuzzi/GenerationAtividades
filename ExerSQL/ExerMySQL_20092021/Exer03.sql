create database db_escola;

use db_escola;

create table tb_estudante (
	id int auto_increment,
    nome varchar(30),
    idade int,
    anoEstudantil int,
    notas decimal(2,1),
    
    primary key (id)
    );
    
insert into tb_estudante (nome, idade, anoEstudantil, notas) values ("Gustavo", 13, 5, 5.5);
insert into tb_estudante (nome, idade, anoEstudantil, notas) values ("Joao", 15, 7, 7.0);
insert into tb_estudante (nome, idade, anoEstudantil, notas) values ("Amanda", 16, 6, 3.5);
insert into tb_estudante (nome, idade, anoEstudantil, notas) values ("Lucas", 17, 8, 8.5);
insert into tb_estudante (nome, idade, anoEstudantil, notas) values ("Pablo", 18, 8, 9.0);
insert into tb_estudante (nome, idade, anoEstudantil, notas) values ("Caique", 12, 4, 6.0);
insert into tb_estudante (nome, idade, anoEstudantil, notas) values ("Kali", 13, 4, 7.5);
insert into tb_estudante (nome, idade, anoEstudantil, notas) values ("Edson", 16, 6, 8.5);

select * from tb_estudante where notas > 7;

select * from tb_estudante where notas < 7;