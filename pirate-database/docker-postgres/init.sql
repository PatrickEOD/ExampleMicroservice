-- CREATE DATABASE piratedb;
-- CREATE USER devuser WITH PASSWORD 'dev&USER@.'
GRANT ALL PRIVILEGES ON DATABASE piratedb TO devuser;

\connect piratedb;

CREATE SCHEMA AUTHORIZATION devuser;

CREATE TABLE crew (
    id varchar(25) primary key not null unique,
    members varchar(20),
    combinedFirePower varchar(20),
    morale varchar(100)
);