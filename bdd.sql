/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Christian
 * Created: 30 déc. 2023
 */
create database dentiste;
\c dentiste;


create table priorite (
    id serial primary key,
    nom varchar(50)
);
insert into priorite values (default,'beaute');
insert into priorite values (default,'sante');

create table dent (
    numero int
);
insert into dent values 
(1),(2),(3),(4),(5),(6),(7),(8),(9),(10),(11),(12),(13),(14),(15),(16),
(21),(22),(23),(24),(25),(26),(27),(28),(29),(30),(31),(32),(33),(34),(35),(36);

create table ordrepriorite (
    id serial primary key,
    idpriorite int references priorite(id),
    iddent int
);
------------------beaute-----------------------------
insert into ordrepriorite values (default,1,8);
insert into ordrepriorite values (default,1,9);
insert into ordrepriorite values (default,1,10);
insert into ordrepriorite values (default,1,1);
insert into ordrepriorite values (default,1,6);
insert into ordrepriorite values (default,1,5);
insert into ordrepriorite values (default,1,4);
insert into ordrepriorite values (default,1,11);
insert into ordrepriorite values (default,1,12);
insert into ordrepriorite values (default,1,13);
insert into ordrepriorite values (default,1,3);
insert into ordrepriorite values (default,1,2);
insert into ordrepriorite values (default,1,7);
insert into ordrepriorite values (default,1,14);
insert into ordrepriorite values (default,1,15);
insert into ordrepriorite values (default,1,16);

insert into ordrepriorite values (default,1,28);
insert into ordrepriorite values (default,1,29);
insert into ordrepriorite values (default,1,30);
insert into ordrepriorite values (default,1,21);
insert into ordrepriorite values (default,1,26);
insert into ordrepriorite values (default,1,25);
insert into ordrepriorite values (default,1,24);
insert into ordrepriorite values (default,1,31);
insert into ordrepriorite values (default,1,32);
insert into ordrepriorite values (default,1,33);
insert into ordrepriorite values (default,1,34);
insert into ordrepriorite values (default,1,22);
insert into ordrepriorite values (default,1,27);
insert into ordrepriorite values (default,1,23);
insert into ordrepriorite values (default,1,35);
insert into ordrepriorite values (default,1,36);
-----------------------------------------------------
------------------Sante-----------------------------
insert into ordrepriorite values (default,2,1);
insert into ordrepriorite values (default,2,5);
insert into ordrepriorite values (default,2,28);
insert into ordrepriorite values (default,2,8);
insert into ordrepriorite values (default,2,6);
insert into ordrepriorite values (default,2,9);
insert into ordrepriorite values (default,2,4);
insert into ordrepriorite values (default,2,11);
insert into ordrepriorite values (default,2,12);
insert into ordrepriorite values (default,2,13);
insert into ordrepriorite values (default,2,3);
insert into ordrepriorite values (default,2,2);
insert into ordrepriorite values (default,2,7);
insert into ordrepriorite values (default,2,14);
insert into ordrepriorite values (default,2,15);
insert into ordrepriorite values (default,2,16);

insert into ordrepriorite values (default,2,10);
insert into ordrepriorite values (default,2,29);
insert into ordrepriorite values (default,2,30);
insert into ordrepriorite values (default,2,21);
insert into ordrepriorite values (default,2,26);
insert into ordrepriorite values (default,2,25);
insert into ordrepriorite values (default,2,24);
insert into ordrepriorite values (default,2,31);
insert into ordrepriorite values (default,2,32);
insert into ordrepriorite values (default,2,33);
insert into ordrepriorite values (default,2,34);
insert into ordrepriorite values (default,2,22);
insert into ordrepriorite values (default,2,27);
insert into ordrepriorite values (default,2,23);
insert into ordrepriorite values (default,2,35);
insert into ordrepriorite values (default,2,36);

create table traitement(
    id serial primary key,
    nom varchar(50)
);
insert into traitement values (default,'Grande reparation');
insert into traitement values (default,'Reparation');
insert into traitement values (default,'Nettoyage');
insert into traitement values (default,'Remplacement');

create table cout(
    id serial primary key,
    idtraitement int references traitement(id),
    pts_ int,
    _pts int,
    valeur double precision
);
insert into cout values (default,1,1,4,5000);
insert into cout values (default,2,5,7,2000);
insert into cout values (default,3,8,10,1000);
insert into cout values (default,4,0,0,100000);

create table pointdent( --donnee utilisateur
    iddent int,
    pts int
);
--insert into pointdent values (11,5);
--insert into pointdent values (1,5);
--insert into pointdent values (5,5);


