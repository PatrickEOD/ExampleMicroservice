-- CREATE DATABASE piratedb;
-- CREATE USER devuser WITH PASSWORD 'dev&USER@.'
GRANT ALL PRIVILEGES ON DATABASE piratedb TO devuser;

\connect piratedb;

CREATE SCHEMA AUTHORIZATION devuser;

------------------------------------------------------------------------------------------------------------------------
drop table captain cascade;
drop table ship cascade;
drop table crew;

select * from ship;
select * from captain;
select * from crew;
------------------------------------------------------------------------------------------------------------------------
CREATE TABLE captain (
    id varchar(25) primary key not null unique,
    name varchar(120) not null unique,
    account varchar(20) not null unique,
    crews varchar(100) unique,
    ships varchar(100) unique
);
------------------------------------------------------------------------------------------------------------------------
CREATE TABLE ship (
    id varchar(25) primary key not null unique,
    name varchar(100) not null,
    captain varchar(100),
    crew_id varchar(20) unique,
    type varchar(50) not null,
    cannons varchar(20),
    sails varchar(20) not null,
    speed varchar(20) not null,
    max_sails varchar(20) not null,
    constraint fk_ship_captain foreign key (captain) references captain(ships)
);
------------------------------------------------------------------------------------------------------------------------
CREATE TABLE crew (
    id varchar(25) primary key not null unique,
    crew_name varchar(100) not null unique,
    pirates varchar(20),
    pirates_amount varchar(20) not null,
    men_fire_power varchar(20) not null,
    morale varchar(20) not null,
    captain varchar(100) not null,
    ship_id varchar(20),
    constraint fk_crew_captain foreign key (captain) references captain(crews),
    constraint fk_crew_ship foreign key (ship_id) references ship(crew_id)
);
------------------------------------------------------------------------------------------------------------------------
CREATE TABLE pirate (
    id varchar(25) primary key not null unique,
    grade varchar(20) not null,
    man_power varchar(20) not null,
    morale varchar(20) not null
);
------------------------------------------------------------------------------------------------------------------------
CREATE TABLE crew_pirate (
    crew_id varchar(25) not null,
    pirate_id varchar(25) not null,
    constraint pk_pirate_team primary key (crew_id, pirate_id),
    constraint fk_crewpirate_crew foreign key (crew_id) references crew(id) on update cascade,
    constraint fk_crewpirate_pirate foreign key (pirate_id) references pirate(id) on update cascade
);
------------------------------------------------------------------------------------------------------------------------
-- CREATE TABLE captain (
--     id varchar(25) primary key not null unique,
--     name varchar(120) not null,
--     crews varchar(100),
--     ships varchar(100)
-- );
------------------------------------------------------------------------------------------------------------------------
-- CREATE TABLE crew (
--     id varchar(25) primary key not null unique,
--     pirates varchar(20) not null,
--     pirates_amount varchar(20) not null,
--     men_fire_power varchar(20) not null,
--     morale varchar(20) not null,
--     captain varchar(100) not null unique,
--     ship varchar(25) not null unique,
--     constraint fk_captain foreign key (captain) references captain(crews),
--     constraint fk_ship foreign key (ship) references ship(id)
-- );

-- insert into crew (id, members, men_fire_power, morale) values ('1', '2', '5', 'AVERAGE');
-- insert into crew (id, members, men_fire_power, morale) values ('2', '2', '4', 'HIGH');
------------------------------------------------------------------------------------------------------------------------
-- CREATE TABLE crew_pirate {
--     crew_id varchar(25) not null,
--     pirate_id varchar(25) not null,
--     constraint pirates_team primary key (crew_id, pirate_id),
--     foreign key (crew_id) references crew(id),
--     foreign key (pirate_id) references pirate(id)
-- };
------------------------------------------------------------------------------------------------------------------------
-- CREATE TABLE pirate {
--     id varchar(25) primary key not null unique,
--     grade varchar(20) not null,
--     man_power varchar(20) not null,
--     morale varchar(20),
--     foreign key (id) references crew(pirates)
-- };
------------------------------------------------------------------------------------------------------------------------
-- CREATE TABLE ship (
--     id varchar(25) not null primary key not null unique,
--     name varchar(100) not null unique,
--     captain varchar(100),
--     crew varchar(25),
--     type varchar(50) not null,
--     cannons varchar(20) not null,
--     sails varchar(20) not null,
--     speed varchar(20) not null,
--     foreign key (captain) references captain(ships),
--     foreign key (crew) references crew(id)
-- );
------------------------------------------------------------------------------------------------------------------------
