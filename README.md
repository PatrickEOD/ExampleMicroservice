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
    - [Module: pirate database](#Module:-pirate-database)

## Scope of project

- [ ] microservice architecture
    - [ ] versions in main pom.xml
    - [ ] dockerize microservice 
- [ ] REST API for basic operations (CrazyCucumberAPI)
    - [x] connect Database
    - [ ] dockerize module
    - [x] add mappers for Data Object
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

| Endpoint | Controller | Operation | Return object | Parameters | Request body | Description |
|----------|------------|-----------|---------------|------------|--------------|-------------|
|getAllCrews()|CrazyCucumberController|GET|Crew List|none|none|Retrieve all crews from db. (temporary endpoint)|
|getCrewById()|CrazyCucumberController|GET|Crew|String id|none|Retireve specific crew by provided id|


## Deployment

### Module: pirate database

#### Deploy local instance

##### via docker compose

Go to directory with docker.compose.yml and hit command:

> docker-compose -f docker-compose.yml up

##### manually

Go to directory with Dockerfile and hit command:

> docker built -t {postgres_image_name} .

> docker run -rm --name {postgres_instance_name} -e POSTGRES_PASSWORD={password} -p 9900:5432 -it {postgres_image_name}