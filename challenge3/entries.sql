use ongs;
insert into organizations values
(null, "1", "atados", "Atados"),
("2", "1", "associaco-keralty", "Associação Keralty"),
("3", "2", "solidariacao", "Solidariação");

select name from organizations where channel_id = "1";
