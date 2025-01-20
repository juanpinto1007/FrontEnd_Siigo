#language: es
Característica: Creacion de clientes en el aplicativo siigo
  Yo como usuario del aplicativo
  Quiero crear un cliente
  Para probar el flujo de creacion

  @CrearClienteExitoso
  Escenario: Creacion de cliente exitoso
    Dado que se ingresa al login del aplicativo
    Cuando Juan digita el usuario retoautomationsiigo@yopmail.com y la clave T4b4ck0ff1c3P455w0rd658*
    Y el usuario guarde la informacion del cliente
    Entonces el puede observar que la creacion es exitosa
