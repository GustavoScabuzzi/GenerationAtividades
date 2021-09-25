create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe (						-- drop table tb_classe
	id_classe BIGINT NOT NULL PRIMARY KEY,
    classe varchar(30) NOT NULL,
    vida BIGINT NOT NULL,
    ferramenta VARCHAR(20) NOT NULL
);

create table tb_personagem (						-- drop table tb_personagem
	id_personagem BIGINT NOT NULL PRIMARY KEY auto_increment,
    nome VARCHAR(30) NOT NULL,
    idade INT NOT NULL,
    poderDefesa BIGINT NOT NULL,
    poderAtaque BIGINT NOT NULL,
    nivel BIGINT NOT NULL,
    id_classe BIGINT NOT NULL,
    FOREIGN KEY(id_classe) REFERENCES tb_classe(id_classe)
);

insert into tb_classe (id_classe, classe, vida, ferramenta)
	values
    (1, "Guerreiro", 10000, "Espada e Escudo"),
    (2, "Mago", 4000, "Cajado e Livro"),
    (3, "Arqueiro", 7000, "Arco e Flecha");
    
insert into tb_personagem (nome, idade, poderAtaque, poderDefesa, nivel, id_classe)
	values
    ("John Snow", 35, 6000, 4000, 75, 1),
    ("Conhaque", 33, 7000, 3000, 38, 1),
    ("Lancer", 27, 6300, 3500, 45, 1),
    ("Escudeiro", 38, 4000, 7000, 36, 1),
    
    ("Mage God", 62, 5500, 2000, 48, 2),
    ("Gandolf", 150, 7000, 1500, 80, 2),
    ("Curry", 23, 4500, 3500, 35, 2),
    ("Ronaldinho", 42, 6500, 4800, 50, 2),
    
    ("Valquiria", 27, 5000, 4000, 65, 3),
    ("Legolas", 120, 8000, 1500, 75, 3),
    ("Gaviao", 37, 5000, 2500, 56, 3),
    ("Atirador", 40, 3500, 5000, 35, 3);
    
select tb_classe.classe, tb_personagem.nome, tb_personagem.poderAtaque, tb_personagem.poderDefesa, tb_personagem.nivel, tb_classe.vida, tb_classe.ferramenta
	from tb_personagem inner join tb_classe on tb_personagem.id_classe = tb_classe.id_classe 
    where tb_personagem.poderAtaque > 2000;

select tb_classe.classe, tb_personagem.nome, tb_personagem.poderAtaque, tb_personagem.poderDefesa, tb_personagem.nivel, tb_classe.vida, tb_classe.ferramenta
	from tb_personagem inner join tb_classe on tb_personagem.id_classe = tb_classe.id_classe 
    where tb_personagem.poderDefesa > 1000 AND tb_personagem.poderDefesa < 2000;

select tb_classe.classe, tb_personagem.nome, tb_personagem.poderAtaque, tb_personagem.poderDefesa, tb_personagem.nivel, tb_classe.vida, tb_classe.ferramenta
	from tb_personagem inner join tb_classe on tb_personagem.id_classe = tb_classe.id_classe 
    where tb_personagem.nome like "C%";

select * from tb_personagem inner join tb_classe on tb_personagem.id_classe = tb_classe.id_classe;

select * from tb_personagem inner join tb_classe on tb_personagem.id_classe = tb_classe.id_classe
	where tb_classe.classe = "Arqueiro";
