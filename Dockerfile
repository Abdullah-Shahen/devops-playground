# Here we are defening the Base image we want to build our image on
FROM public.ecr.aws/docker/library/amazoncorretto:17.0.7-alpine

# Defining a Working directory
WORKDIR /app

# Copying the Application source code to the docker image
COPY build/libs/playground-0.0.1-SNAPSHOT.jar pets-api

# Expose the port 8080 on the host where container is running
EXPOSE 8080

# Start the application
ENTRYPOINT ["java", "-jar", "pets-api"]