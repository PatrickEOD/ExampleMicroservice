-- CREATE DATABASE piratedb;
-- CREATE USER devuser WITH PASSWORD 'dev&USER@.'
GRANT ALL PRIVILEGES ON DATABASE piratedb TO devuser;

\connect piratedb;

CREATE SCHEMA AUTHORIZATION devuser;

========================================================================================================================
CREATE TABLE crew (
    id varchar(25) primary key not null unique,
    members varchar(20),
    combined_fire_power varchar(20),
    morale varchar(100)
);

insert into crew (id, members, combined_fire_power, morale) values ('1', '2', '5', 'AVERAGE');
insert into crew (id, members, combined_fire_power, morale) values ('2', '2', '4', 'HIGH');
========================================================================================================================
