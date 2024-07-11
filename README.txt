Para ejecutarse correctamente en local y que no hayan errores de CORS se tiene que utilizar el profile local

Para conectarse a la base de datos en memoria H2 se usan las credenciales
agregadas en la application-local.properties

Para agregar un par de ejemplos a la base de datos se puede usar en Postman el siguiente método POST

POST http://localhost:8080/api/exporters

Con los siguientes Bodys
Ejemplo1:
{
    "identification": "12348576",
    "identificationType": "A",
    "name": "Empresa de Prueba",
    "acceptance": "2024-07-15",
    "expiration": "2025-07-15",
    "email": "empresa@example.com",
    "province": 1,
    "canton": 2,
    "district": 3,
    "sector": "TECH",
    "status": "T"
}

Ejemplo2:
{
    "identification": "12345678932",
    "identificationType": "B",
    "name": "Empresa de Prueba2",
    "acceptance": "2024-07-15",
    "expiration": "2025-07-15",
    "email": "empresa2@example2.com",
    "province": 1,
    "canton": 2,
    "district": 3,
    "sector": "TECH",
    "status": "T"
}
