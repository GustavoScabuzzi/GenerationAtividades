create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_classe(
	id_classe BIGINT NOT NULL auto_increment PRIMARY KEY,
    tipoCarne VARCHAR(30) NOT NULL,							-- Bovino, Suino, Ave
    criacao VARCHAR(20) NOT NULL,							-- Fazenda, Criadouro
    ehPeca boolean NOT NULL
);

create table tb_carne(
	id_carne BIGINT NOT NULL auto_increment PRIMARY KEY,
    nomeCarne VARCHAR(30) NOT NULL,
    preco decimal NOT NULL,
    pesoKG decimal NOT NULL,
    qualidade VARCHAR(10),
    fk_classe BIGINT NOT NULL,
    
    FOREIGN KEY(fk_classe) REFERENCES tb_classe(id_classe)
);

insert into tb_classe(tipoCarne, criacao, ehPeca)
values
("Bovino", "Fazenda", true),
("Bovino", "Fazenda", false),
("Bovino", "Criadouro", true),
("Bovino", "Criadouro", false),

("Suino", "Fazenda", true),
("Suino", "Fazenda", false),
("Suino", "Criadouro", true),
("Suino", "Criadouro", false),

("Ave", "Fazenda", true),
("Ave", "Fazenda", false),
("Ave", "Criadouro", true),
("Ave", "Criadouro", false);

insert into tb_carne(nomeCarne, preco, pesoKG, qualidade, fk_classe)
values
("Peito de frango", 20.00, 1, "Primeira", 9),
("Peito de frango", 20.00, 1, "Primeira", 10),
("Picanha", 50.00, 1, "Primeira", 1),
("Picanha", 50.00, 1, "Primeira", 3),
("Salsicha", 12.00, 1, "Primeira", 4),
("Salsicha", 10.00, 1, "Segunda", 4),
("Carne Moida", 25.00, 1, "Primeira", 4),
("Carne Moida", 20.00, 1, "Segunda", 4),
("Bacon", 45.00, 1, "Primeira", 5),
("Bacon", 38.00, 1, "Segunda", 6);

select * from tb_carne where preco > 50.00;

select * from tb_carne where preco between 3 and 60;

select * from tb_carne where nomeCarne like "C%";

select * from tb_carne inner join tb_classe on tb_classe.id_classe = tb_carne.fk_classe;

select * from tb_carne inner join tb_classe on tb_classe.id_classe = tb_carne.fk_classe
where tb_classe.tipoCarne = "Ave";