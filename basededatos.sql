drop database db_programadeclientes;
create database db_programadeclientes;

use db_programadeclientes;

create table tabla_usuarios (
usuario varchar(15) primary key,
clave blob
);

