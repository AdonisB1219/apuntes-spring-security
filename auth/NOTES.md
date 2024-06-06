# SPRING SECURITY

Se definió un authorization provider, en el que se cambio la autorizacion y ahora es por medio del nombre de usuario. Al definirlo ya no se usa el DaoAuthProvider, entonces se pudo borrar el CustomerDetails ya que al retornar un objeto UserDetails hacía la autenticación mediante el DaoAuthProvider.