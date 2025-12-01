# Instrucciones

- Para el proyecto *BancoMexicano* es necesario realizar la descarga del driver de conexión de MySQL:  
  [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/)

- Realizar la instalación con Maven en el entorno local con el siguiente comando:

```shell
mvn install:install-file \
  -Dfile="[Ruta-jar-driver-MySQL]" \
  -DgroupId=com.mysql \
  -DartifactId=mysql-connector-local \
  -Dversion=1.0 \
  -Dpackaging=jar
