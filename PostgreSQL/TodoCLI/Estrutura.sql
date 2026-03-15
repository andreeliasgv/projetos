create table clientes (
cod_cli integer not null,
cpf integer not null,
nome varchar (50), 
endereco varchar (50),
cidade varchar(50),
estado varchar(02),
salario integer ,
idade integer, 
CONSTRAINT PK_CPFcliente PRIMARY KEY (cpf));


create table veiculos (
chassi varchar ( 50) not null,
placa varchar (10) not null, 
cor varchar (20),
modelo varchar(20),
marca varchar(20),
ano_fabricacao integer,
preco_compra integer,
preco_venda integer,
motor integer,
cpf_cli integer not null, 
constraint pk_placa primary key (placa));
Alter table veiculos add constraint fk_cpf_cli foreign key (cpf_cli) references clientes (cpf);