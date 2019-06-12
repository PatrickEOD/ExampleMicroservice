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
    - [ ] connect Database
    - [ ] dockerize module
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
### Module: pirate-database

#### Deploy local instance

##### via docker compose

Go to directory with docker.compose.yml and hit command:

> docker-compose -f docker-compose.yml up

##### manually

Go to directory with Dockerfile and hit command:

> docker built -t {postgres_image_name} .

> docker run -rm --name {postgres_instance_name} -e POSGRES_PASSWORD={password} 5432:5432 -it {postgres_image_name}