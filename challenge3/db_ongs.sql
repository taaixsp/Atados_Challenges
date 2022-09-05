create database ongs;
use ongs;
create table organizations(
id int not null auto_increment,
channel_id int,
slug varchar (30),
name varchar (30),
primary key (id)
);

describe organizations;
