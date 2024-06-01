# SPRING SECURITY

Ahora se modificó el almacenamiento de los usuarios, se hará en una base de datos. 

La forma más sencilla es utilizando jdbc, se agregó como dependencia junto con el driver de mysql y se generó la tabla según el esquema incluido en jdbc.sql. Después, en la configuracion de seguridad se instancia otro bean, ahora de UserDetailsService, en donde se retorna un JdbcUserDetailsManager().

También se agregaron propiedades que sirven para conectarse ver el flujo de la interacción con la BD.