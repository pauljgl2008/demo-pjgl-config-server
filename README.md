# demo-pjgl-config-server
demo-pjgl-config-server


# Docker:
- Para usar host.docker.internal en linux se debe añadir el siguiente comando si usamos docker run
 $ --add-host=host.docker.internal:host-gateway
o añadir en el docker-compose el siguiente atributo:
-     my-service:
        extra_hosts:
           "host.docker.internal:host-gateway"

- $ docker buildx build -t pguevarl/config-server:latest --load .
- $ docker buildx build -t config-server .
- $ docker buildx build -t pguevarl/config-server:0.0.1 .
- $ docker push pguevarl/config-server:0.0.1
- docker run -p 8085:8085 0.0.1

Correr la imagen de RabbitMQ antes de iniciar el micro:
- $ docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.12-management

# PUSH A DOCKER HUB:
- $ docker login
- $ docker tag pjgl-config-server pguevarl/demo-pjgl-docker-hub-repository:pjgl-config-server
- $ docker push pguevarl/demo-pjgl-docker-hub-repository:pjgl-config-server

kubectl port-forward service/pjgl-config-server 8085:8085

# Git Semantic Version:
https://github.com/marketplace/actions/git-semantic-version

# Explorar que tiene mi imagen docker:
  $ docker container run -d pguevarl/config-server
  bd50b418618ba2fa816d82c9fb437ae6446d0878fde165e7b884bd31bfe1db93
  $ docker exec -it bd5 /bin/sh
  $ ls
  pjgl-config-server.jar
  $ exit

# Listar arquitecturas de docker que construye nuestras imagenes
# https://docs.docker.com/build/building/multi-platform/#getting-started
  $ docker buildx ls
    NAME/NODE DRIVER/ENDPOINT STATUS  BUILDKIT             PLATFORMS
    default * docker
      default default         running v0.11.6+0a15675913b7 linux/amd64, linux/amd64/v2, linux/amd64/v3, linux/386
# Descargamos la imagen:
  - $ docker buildx create --name mybuilder --bootstrap --use

# Verificamos que se haya descargado y seleccionado el build de "mybuilder":
  - $ docker buildx ls

        NAME/NODE    DRIVER/ENDPOINT             STATUS  BUILDKIT             PLATFORMS
        mybuilder *  docker-container
          mybuilder0 unix:///var/run/docker.sock running v0.12.5              linux/amd64, linux/amd64/v2, linux/amd64/v3, linux/386
        default      docker
          default    default                     running v0.11.6+0a15675913b7 linux/amd64, linux/amd64/v2, linux/amd64/v3, linux/386
# En caso no esté seleccionado, usamos el diguiente comando:
  - $ docker buildx use mybuilder

# Dockerizar y pushear a DockerHub:
  - $ docker buildx build --platform linux/amd64,linux/arm64,linux/arm/v7 -t <username>/<image>:latest --push .
  Ejemplo:
  - $ docker buildx build --platform linux/amd64,linux/arm64,linux/arm/v7 -t pguevarl/config-server:latest --push .
