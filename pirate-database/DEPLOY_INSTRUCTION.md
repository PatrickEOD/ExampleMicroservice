# Deploy local instance

### via docker compose

Go to directory with docker.compose.yml and hit command:

> docker-compose -f docker-compose.yml up

### manually

Go to directory with Dockerfile and hit command:

> docker built -t {postgres_image_name} .

> docker run -rm --name {postgres_instance_name} -e POSGRES_PASSWORD={password} 5432:5432 -it {postgres_image_name}