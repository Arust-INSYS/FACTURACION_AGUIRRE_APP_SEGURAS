# Imagen base
FROM openjdk:17-jdk-slim

# Directorio de trabajo
WORKDIR /app

# Copiar el JAR
COPY target/facturacion_ariel_aguirre-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto en el que se ejecuta la aplicación
EXPOSE 8080

# Variables de entorno para la base de datos
ENV DB_HOST=mysql
ENV DB_PORT=3306
ENV DB_NAME=facturacion_db
ENV DB_USERNAME=root
ENV DB_PASSWORD=admin

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]

