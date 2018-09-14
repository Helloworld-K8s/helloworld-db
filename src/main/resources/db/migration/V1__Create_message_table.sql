create table T_MSG (
    id SERIAL UNIQUE,
    language varchar(32) not null,
    body varchar(1024) not null
);

insert into T_MSG (language, body) values ('French', 'Bonjour tout le monde !');
insert into T_MSG (language, body) values ('English', 'Hello World !');