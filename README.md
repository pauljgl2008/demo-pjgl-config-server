# demo-pjgl-config-server
demo-pjgl-config-server


# Docker:
- Para usar host.docker.internal en linux se debe añadir el siguiente comando si usamos docker run
 $ --add-host=host.docker.internal:host-gateway
o añadir en el docker-compose el siguiente atributo:
-     my-service:
        extra_hosts:
           "host.docker.internal:host-gateway"

- $ docker buildx build -t pjgl-config-server .

Correr la imagen de RabbitMQ antes de iniciar el micro:
- $ docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.12-management
