create database db_pizzaria_legal;

use db_pizzaria_legal;

drop table tb_pizza;
drop table tb_categoria;

create table tb_categoria(			-- drop table tb_categoria
	id_categoria BIGINT NOT NULL PRIMARY KEY auto_increment,
    tipo VARCHAR(20) NOT NULL,
    massa VARCHAR(20) NOT NULL
);		

create table tb_pizza(				-- drop table tb_pizza
	id_pizza BIGINT PRIMARY KEY auto_increment,
    nomePizza VARCHAR(30) NOT NULL,
    preco DECIMAL NOT NULL,
    bordaRecheada boolean NOT NULL,
    tamanho CHAR NOT NULL,
    id_categoria BIGINT NOT NULL,
    
    FOREIGN KEY(id_categoria) REFERENCES tb_categoria(id_categoria)
);

INSERT INTO tb_categoria(tipo, massa)
	VALUES
    ("Salgada", "Pao"),
    ("Salgada", "Folhada"),
    ("Doce", "Pao"),
    ("Doce", "Folhada");
    
insert into tb_pizza(nomePizza, preco, bordaRecheada, tamanho, id_categoria)
	values
    ("Frango", 50.00, false, 'G', 2),
    ("Frango", 30.00, true, 'P', 1),
    ("Frango", 40.00, false, 'M', 2),
    ("Bacon", 40.00, false, 'M', 1),
    ("Bacon", 50.00, true, 'G', 2),
    ("Bacon", 30.00, false, 'P', 1),
    ("Peperoni", 30.00, true, 'P', 2),
    ("Peperoni", 50.00, false, 'G', 1),
    ("Peperoni", 40.00, true, 'M', 2),
    ("Lombo", 30.00, false, 'P', 1),
    ("Lombo", 40.00, true, 'M', 1),
    ("Lombo", 50.00, true, 'G', 2),
    ("Baiana", 40.00, false, 'M', 1),
    ("Baiana", 50.00, true, 'G', 2),
    ("Baiana", 40.00, true, 'M', 1),
    ("Portuguesa", 40.00, true, 'M', 1),
    ("Portuguesa", 40.00, false, 'M', 2),
    ("Portuguesa", 50.00, true, 'G', 2),
    ("Romana", 40.00, false, 'M', 2),
    ("Romana", 50.00, true, 'G', 1),
    ("Romana", 40.00, false, 'M', 1),
    ("Chocolate", 30.00, false, 'P', 4),
    ("Chocolate", 40.00, false, 'M', 3),
    ("Chocolate", 40.00, true, 'M', 3),
    ("Abacaxi com Chocolate", 30.00, true, 'P', 3),
    ("Abacaxi com Chocolate", 40.00, false, 'M', 4),
    ("Abacaxi com Chocolate", 30.00, true, 'P', 3);
    
select * from tb_pizza inner join tb_categoria on tb_categoria.id_categoria = tb_pizza.id_categoria
	where tb_pizza.preco > 45.00;
    
select * from tb_pizza inner join tb_categoria on tb_categoria.id_categoria = tb_pizza.id_categoria
	where tb_pizza.preco > 30 and tb_pizza.preco < 60;
    
select * from tb_pizza inner join tb_categoria on tb_categoria.id_categoria = tb_pizza.id_categoria
	where tb_pizza.nomePizza LIKE "B%";
    
select * from tb_pizza inner join tb_categoria on tb_categoria.id_categoria = tb_pizza.id_categoria;

select * from tb_pizza inner join tb_categoria on tb_categoria.id_categoria = tb_pizza.id_categoria
	where tb_categoria.tipo LIKE "Doce";