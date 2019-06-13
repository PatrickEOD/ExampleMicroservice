# Deploy local instance

### via docker compose

Go to directory with docker.compose.yml and hit command:

> docker-compose -f docker-compose.yml up

### manually

Go to directory with Dockerfile and hit command:

> docker built -t cucumberpostgresimage .

> docker run -rm --name cucumberpostgresinstance -e POSTGRES_PASSWORD={password} -p 9900:5432 -it cucumberpostgresinstance