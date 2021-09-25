create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria (
	id_categoria BIGINT NOT NULL auto_increment primary key,
    tarja VARCHAR(20) NOT NULL,		-- Amarela ou Vermelha ou preta
    categoria VARCHAR(10)			-- Marca ou genereico ou similar
);

create table tb_produto(
	id_produto BIGINT NOT NULL auto_increment primary key,
    nome VARCHAR(30) NOT NULL,
    preco decimal not null,
    comprimido boolean NOT NULL,				-- em comprimidos ou xarope
    funcionalidade VARCHAR(30) NOT NULL,		-- Antibiotico, Analgésico, Anti-inflamatorios, Psiquiatricos
    qntCartela INT,								-- comprimidos ou ml do xarope
    fk_categoria BIGINT,
    
    FOREIGN KEY(fk_categoria) REFERENCES tb_categoria(id_categoria)
);

insert into tb_categoria (tarja, categoria)
values
("Preta", "Marca"),
("Preta", "Generico"),
("Preta", "Similar"),
("Vermelha", "Marca"),
("Vermelha", "Generico"),
("Vermelha", "Similar"),
("Amarela", "Marca"),
("Amarela", "Generico"),
("Amarela", "Similar");

insert into tb_produto(nome, preco, comprimido, funcionalidade, qntCartela, fk_categoria)
VALUES
("Amoxicilina", 32.00, true, "Antibiotico", 10, 4),
("Amoxicilina", 27.00, true, "Antibiotico", 10, 5),
("Cefotaxima", 45.00, false, "Antibiotico", 8, 4),
("Azitromicina", 45.00, true, "Analgésico", 15, 7),
("Azitromicina", 38.00, true, "Analgésico", 15, 8),
("Azitromicina", 30.00, true, "Analgésico", 15, 9),
("Oxicodona", 85.00, true, "Psiquiatricos", 8, 1),
("Oxicodona", 70.00, true, "Psiquiatricos", 8, 2),
("Diazepam", 90.00, true, "Psiquiatricos", 8, 1),
("Diazepam", 80.00, true, "Psiquiatricos", 8, 2);

select * from tb_produto where preco > 50.00;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where nome LIKE "A%";

select * from tb_categoria inner join tb_produto;

select * from tb_categoria inner join tb_produto on tb_categoria.id_categoria = tb_produto.fk_categoria
where tb_categoria.tarja = "Preta";


