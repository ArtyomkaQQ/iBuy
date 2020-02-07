create table product (
id bigint not null auto_increment,
description varchar(255),
price double precision,
quantity integer,
primary key (id)) engine=InnoDB;

create table user (
id bigint not null auto_increment,
email varchar(255),
password varchar(255),
username varchar(255) UNIQUE,
primary key (id)) engine=InnoDB;
