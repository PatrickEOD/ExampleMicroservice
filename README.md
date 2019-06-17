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

- [ ] Microservice architecture
    - [ ] [Tech] Versions in main pom.xml
    - [ ] [Tech] Dockerize microservice 
- [ ] REST API for basic operations (CrazyCucumberAPI)
    - [x] [Tech] Connect Database
    - [ ] [Tech] Dockerize module
    - [x] [Tech] Add mappers for Data Object
    - [ ] [Tech] Configure client module
    - [ ] [Story] Default morale for new crew and pirates is "AVERAGE"
    - [ ] [Story] Captain object starts with no crew and no ships
    - [ ] [Story] Crew menFirePower is calculated from combined fire power from references pirates in Pirate object
    - [ ] [Story] Crew piratesAmount is calculated from sum of referenced pirates in Pirate object
    - [ ] [Story] Ship start with 0 cannons
    - [ ] [Story] Ship has speed factor dependent on type of ship
    - [ ] [Story] Ship's amount of sails cannot exceed by value of field max_sails
    - [ ] [Story] Create new captain, add crew and ship to captain
- [ ] Database for REST API to store data
    - [x] [Tech] Choose technology
    - [x] [Tech] Dockerize module
    - [ ] [Tech] Prepare data model
    - [ ] [Tech] Prepare init sql
- [ ] ConfigServer to store configurations
    - [ ] [Tech] Add config server
    - [ ] [Tech] Dockerize module
- [ ] REST API (PiratePlotAPI) - Feign Client to store events and missions
    - [ ] [Tech] Add client module
    - [ ] [Tech] Dockerize module
    - [ ] [Story] Enable client to share random in size and random in values list of available pirates
    - [ ] [Story] Enable client to share random in size and random in values list fo available ships

## Concept
Simple API game placed in Pirates world.

## Architecture

     piratePlotAPI ----- crazyCucumberAPI ---------- ConfigServer
         |                   |
         |                  /
         |                 /
         |                /
      plotDB          pirateDB
           \            /
            \          /
             Postgres DB server

## Data Source
Database of choice is Postgresql 11.
Is storing data about Captain, its inventory and crew.
In separate db will be stored data necessary for PiratPlotAPI

## API

### CrazyCucumberAPI
Used as:
* Base API for user to play on;
* Takes events and missions for PiratePlotAPI
* Has logic to create objects with refences to other objects

| Endpoint | Controller | Operation | Return object | Parameters | Request body | Description |
|----------|------------|-----------|---------------|------------|--------------|-------------|
|getAllCrews()|CrazyCucumberController|GET|Crew List|none|none|Retrieve all crews from db. (temporary endpoint)|
|getCrewById()|CrazyCucumberController|GET|Crew|String id|none|Retrieve specific crew by provided id|


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