# CREATE TABLE IF NOT EXISTS tb_cadastro
# (
#     codigo     bigint       NOT NULL AUTO_INCREMENT,
#     cpf        varchar(11)  NOT NULL,
#     data       date         NOT NULL,
#     email      varchar(200) DEFAULT NULL,
#     cod_pais   bigint       NOT NULL,
#     cod_estado bigint       NOT NULL,
#     nome       varchar(100) NOT NULL,
#     sexo       char(1)      DEFAULT NULL,
#     PRIMARY KEY (codigo),
#     UNIQUE KEY tb_cadastro_cpf_uindex (cpf),
#     KEY fk_pais (cod_pais),
#     KEY fk_estado (cod_estado),
#     CONSTRAINT fk_estado FOREIGN KEY (cod_estado) REFERENCES tb_estado (codigo),
#     CONSTRAINT fk_pais FOREIGN KEY (cod_pais) REFERENCES tb_pais (codigo),
#     CONSTRAINT ck_sexo CHECK ((sexo in (_utf8mb4'M', _utf8mb4'F')))
# ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
#
# INSERT INTO tb_cadastro (cpf, `data`, email, cod_pais, cod_estado, nome, sexo)
# VALUES ('02030145106', '1987-10-29', 'thieles@gmail.com', 33, 26, 'Thieles', 'M'),
#        ('58643603090', '1987-10-23', 'ricardo@gmail.com', 33, 26, 'Ricardo', 'M'),
#        ('89801554096', '1987-10-20', 'jessica@gmail.com', 33, 26, 'Jessica', 'F'),
#        ('057613.37010', '1987-10-18', 'manuela@gmail.com', 33, 26, 'Manuela', 'F'),
#        ('97472712060', '1987-10-21', 'carlos@gmail.com', 33, 26, 'Carlos', 'M');