# ISW-PROYECTO-2020-1

# Proyecto Ingeniería de Software 2020-1

## Equipo GachaHell.inc

Link heroku:
https://github.com/xMuramasa/ISW-PROYECTO-2020-1/personal

## API Personal

Para la utilización de esta API son necesarios los siguientes componentes:

- Java jdk 8  o superior
- maven
- PostgreSQL (En este caso se debe modificar el archivo application.properties)

*En  caso de utilizar la versión de heroku para el deploy, no es necesario postgreSQL

## Usando la API

### Personal

get personal: https://github.com/xMuramasa/ISW-PROYECTO-2020-1/personal/
recibe:
            {
                "personalId": <int>
            }
retorna:
            {
                "personalId": <int>,
                "rut": <int>,
                "nombres": <string>,
                "apellidos": <string>,
                "cargo": <string>,
                "telefono": <string>,
                "correo": <string>,
                "ocupado":<int>
            }

    
get todo el personal: https://github.com/xMuramasa/ISW-PROYECTO-2020-1/personal/getAllPersonal
recibe: nada
retorna:
            {
                "personalId": <int>,
                "rut": <int>,
                "nombres": <string>,
                "apellidos": <string>,
                "cargo": <string>,
                "telefono": <string>,
                "correo": <string>,
                "ocupado":<int>
            }


post personal: https://github.com/xMuramasa/ISW-PROYECTO-2020-1/personal/
recibe: (una estructura de personal)
            {
                    "rut": <int>,
                    "nombres": <string>,
                    "apellidos": <string>,
                    "cargo": <string>,
                    "telefono": <string>,
                    "correo": <string>,
                    "ocupado":<int>
            }
retorna:
            {
                    "personalId": <int>,
                    "rut": <int>,
                    "nombres": <string>,
                    "apellidos": <string>,
                    "cargo": <string>,
                    "telefono": <string>,
                    "correo": <string>,
                    "ocupado":<int>
            }


put personal: https://github.com/xMuramasa/ISW-PROYECTO-2020-1/personal/
recibe: (una estructura de personal)
            {
                    "personalId": <int>,
                    "rut": <int>,
                    "nombres": <string>,
                    "apellidos": <string>,
                    "cargo": <string>,
                    "telefono": <string>,
                    "correo": <string>,
                    "ocupado":<int>
            }
retorna:
            {
                    "personalId": <int>,
                    "rut": <int>,
                    "nombres": <string>,
                    "apellidos": <string>,
                    "cargo": <string>,
                    "telefono": <string>,
                    "correo": <string>,
                    "ocupado":<int>
            }


delete personal: https://github.com/xMuramasa/ISW-PROYECTO-2020-1/personal/
recibe:
            {
                "personalId": <int>
            }
retorna:
            {
                "personalId": <int>,
                "rut": <int>,
                "nombres": <string>,
                "apellidos": <string>,
                "cargo": <string>,
                "telefono": <string>,
                "correo": <string>,
                "ocupado":<int>
            }