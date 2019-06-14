# ExampleMicroservice
ExampleMicroservice for testing solutions and new ideas

## Index
- **[Scope of project](#Scope-of-project)**
- **[Concept](#Concept)**
- **[Architecture](#Architecture)**
- **[Data Source](#Data-Source)**
- **[API](#API)**
    - [CrazyCucumberAPI](#CrazyCucumberAPI)
- **[Deployment](#Deployment)**
    - [Module: pirate-database](#Module:-pirate-database)

## Scope of project

- [ ] microservice architecture
    - [ ] versions in main pom.xml
    - [ ] dockerize microservice 
- [ ] REST API for basic operations (CrazyCucumberAPI)
    - [x] connect Database
    - [ ] dockerize module
    - [ ] add mappers for Data Object
- [ ] Database for REST API to store data
    - [x] choose technology
    - [x] dockerize module
    - [ ] prepare data model
    - [ ] prepare init sql

## Concept

## Architecture

## Data Source
Database of choice is Postgresql 11

## API
### CrazyCucumberAPI

## Deployment
### Module: pirate database

#### Deploy local instance

##### via docker compose

Go to directory with docker.compose.yml and hit command:

> docker-compose -f docker-compose.yml up

##### manually

Go to directory with Dockerfile and hit command:

> docker built -t {postgres_image_name} .

> docker run -rm --name {postgres_instance_name} -e POSTGRES_PASSWORD={password} -p 5432:5432 -it {postgres_image_name}