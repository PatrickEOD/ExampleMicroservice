-- CREATE DATABASE pirate-database;
-- CREATE USER devUser WITH PASSWORD 'dev&USER@.'
GRANT ALL PRIVILEGES ON DATABASE pirate-database TO devUser;

\connect pirate-database;

CREATE SCHEMA AUTHORIZATION devUser;

CREATE TABLE crew (
    id varchar(25) primary key not null unique,
    members varchar(20),
    combinedFirePower varchar(20),
    morale varchar(100)
);