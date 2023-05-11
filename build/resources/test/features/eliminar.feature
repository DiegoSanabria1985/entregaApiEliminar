#language: es

Característica:  eliminar usuario de dummy restapiexample

  Escenario: Eliminar usuario api exitoso
    Cuando envia la siguiente informacion de usuario al servicio "https://dummy.restapiexample.com/api/v1/delete/2"
      | status   | message    |
      | success | successfully! deleted Records  |

    Entonces el usuario valida el codigo de estatus sea 405
